import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        scan.close();
        s=s.trim();
        if(s.trim().isEmpty())
        {
            System.out.println(0);
            return;
        }
        String[] words = s.split("[^A-Za-z]+");
        
         List<String> tokens = new ArrayList<>();
        for (String token : words) {
            if (!token.isEmpty()) {
                tokens.add(token);
            }
        }
        
       
            System.out.println(tokens.size());
            for(String word:tokens)
            {
                System.out.println(word);
            }
        
        
}
}

