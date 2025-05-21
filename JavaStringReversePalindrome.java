import java.io.*;
import java.util.*;

public class JavaStringReversePalindrome{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       
        int left =0;
        int right = A.length()-1;
        
        
            if(A.charAt(left)!=A.charAt(right))
            {
                System.out.println("No");}
               
            else{
                System.out.println("Yes");
               
            }
        
            
        
       
    }
}
