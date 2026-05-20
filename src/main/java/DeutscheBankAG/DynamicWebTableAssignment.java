package DeutscheBankAG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicWebTableAssignment {
    public static void main(String[] args){

        WebDriver wd = new ChromeDriver();
        wd.get("https://practice.expandtesting.com/dynamic-table");
        wd.manage().window().maximize();
        WebElement tableElement = wd.findElement(By.xpath("//table[contains(@class,'table table-striped')]"));
        List<WebElement> headerList = tableElement.findElements(By.xpath(".//thead/tr/th"));
        Map<String,Integer> headerMap = new HashMap<String,Integer>();
        List<TaskPOJO> taskList;
        for(int index=0;index<headerList.size();index++){
            headerMap.put(headerList.get(index).getText().toLowerCase(),index);
        }
        System.out.println(headerMap);

        taskList = new ArrayList<TaskPOJO>();
        List<WebElement> rowList = tableElement.findElements(By.xpath(".//tbody//tr"));
        for(WebElement row : rowList){
            List<WebElement> dataList = row.findElements(By.xpath(".//td"));
            taskList.add(new TaskPOJO(dataList.get(headerMap.get("name")).getText(),
                    dataList.get(headerMap.get("memory")).getText(),
                    dataList.get(headerMap.get("cpu")).getText(),
                    dataList.get(headerMap.get("network")).getText(),
                    dataList.get(headerMap.get("disk")).getText()
            ));
        }
        for(TaskPOJO task : taskList){
            System.out.println(task);
        }
        List<TaskPOJO> result = taskList.stream().filter(x -> x.getName().contains("Chrome")).toList();
        System.out.println(result);
    }
}
