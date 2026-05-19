package DeutscheBankAG;

public class ReverseEachWordOfStringTwoPointer {
    public static void main(String[] args){
        String data ="Hello World";
        String words[] = data.split(" ");
        String result = "";
        for(String word :words){
            char characters[] = word.toCharArray();
            int left = 0;
            int right =characters.length-1;
            char temp;
            while(left<right){
                temp=characters[left];
                characters[left]=characters[right];
                characters[right]=temp;
                left++;
                right--;
            }
            result =result+ new String(characters)+" ";
        }
        System.out.println(data);
        System.out.println(result.trim());
    }
}
