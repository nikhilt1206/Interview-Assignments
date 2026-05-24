package Accenture;

public class CountLengthOfStringWithoutUsingCharacterArray {
    public static void main(String[] args){
        String input = "Hello World";
        int count =0;
        while(true){
            try{
                input.charAt(count);
                count++;
            }
            catch (StringIndexOutOfBoundsException e){
                System.out.println(count);
                break;
            }
        }
    }
}
