import java.util.Scanner;

public class URLify {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
<<<<<<< HEAD
        String ss=sc.nextLine();
        ss.trim();
        sc.close();
        String s=ss.replaceAll("\\s","%20");
=======
        String s=sc.nextLine();
        ss.trim();
        sc.close();
        s=ss.replaceAll("\\s","%20");
>>>>>>> 8b657a99df3c96042f7de8607c6e835b6423a5b7
        
        System.out.println(s);
        }

        
    }
    

