package String.Easy;

import java.util.Stack;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "i will do it";
        String rs = "";
        Stack<String> stack = new Stack<>();
        String[] arr = str.trim().split("\\s+");
        // for(int i=arr.length-1;i>=0;i--){
        //     if(i==0){
        //         rs += arr[i];
        //         break;
        //     }
        //     rs += arr[i] + " ";
        // }
        // return rs;

        for(String word : arr){
            stack.push(word);
        }

        while(! stack.isEmpty()) rs += stack.pop() + " ";
        System.out.println(rs.trim());
    }   
}
