import java.io.*;
import java.util.*;

public class JavaEndoffile {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = 1;
       while(sc.hasNext())
       {
        String line = sc.nextLine();
        System.out.println(n+" " +line);
        n++;
       }
    }
}
