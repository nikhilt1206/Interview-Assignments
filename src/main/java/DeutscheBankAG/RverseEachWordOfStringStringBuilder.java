package DeutscheBankAG;

public class RverseEachWordOfStringStringBuilder {
    public static void main(String[] args){
        String data = "Hello World";
        StringBuilder result = new StringBuilder();
        String words[] = data.split(" ");
        for(String word:words){
            StringBuilder sb = new StringBuilder(word);
            result = result.append(sb.reverse().append(" "));
        }
        System.out.println(data);
        System.out.println(result.toString().trim());
    }
}
