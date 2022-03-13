import java.util.Scanner;

public class URLify {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        s1.trim();
        sc.close();
        String s=s1.replaceAll("\\s","%20");
        
        System.out.println(s);
        }

        
    }
    

