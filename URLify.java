import java.util.Scanner;

public class URLify {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        ss.trim();
        sc.close();
        String s=ss.replaceAll("\\s","%20");
        
        System.out.println(s);
        }

        
    }
    

