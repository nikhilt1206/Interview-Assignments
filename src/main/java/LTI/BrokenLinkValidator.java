package LTI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinkValidator {
    public static void main(String[] args) {
        WebDriver wd = new ChromeDriver();
        try {
            wd.get("file:///Users/nikhil/IdeaProjects/InterviewPreprationAssignments/src/main/java/LTI/brokenlink_v2.html");
            List<WebElement> links = wd.findElements(By.tagName("a"));
            System.out.println("Total Links Found: " + links.size());
            for (WebElement link : links) {
                String url = link.getAttribute("href");
                if (url != null && !url.isEmpty()) {
                    checkBrokenLink(url);
                }
            }
        } finally {
            wd.quit();
        }
    }

    private static void checkBrokenLink(String url) {
        try {
            URL linkUrl = new URL(url);
            HttpURLConnection connection =
                    (HttpURLConnection) linkUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int statusCode = connection.getResponseCode();
            System.out.println("URL : " + url);
            System.out.println("Status Code : " + statusCode);
            if (statusCode >= 400) {
                System.out.println("❌ Broken Link");
            } else {
                System.out.println("✅ Valid Link");
            }
            System.out.println("--------------------------------");
            connection.disconnect();
        } catch (Exception e) {
            System.out.println("URL : " + url);
            System.out.println("❌ Broken Link");
            System.out.println("Reason : " + e.getMessage());
            System.out.println("--------------------------------");
        }
    }
}