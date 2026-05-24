package Accenture;

public class CountLengthOfStringWithoutUsingLengthMethod {
    public static void main(String[] args){
        String input = "Hello Wolrd";
        int count = 0;

        char charArray[] = input.toCharArray();
        for(char c : charArray){
            count++;
        }
        System.out.println("Total number of characters in given string is : "+count);
    }
}
