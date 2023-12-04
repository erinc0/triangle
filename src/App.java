import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter a Character");
        Scanner meow = new Scanner(System.in);
        String hi = meow.next(); 

while(hi.length() > 1){
    System.out.println("Please enter one valid character");  
    hi = meow.next(); 
     meow.close();
}

        System.out.println("Please enter a Height");
        Scanner loaf = new Scanner(System.in);
        int m = loaf.nextInt(); 
        int i=0;
        loaf.close();

        for(i=0; i<m; i++){
            for(int l=0; l<=i; l++){
        System.out.print(hi + " ");
        }
       System.out.println();
    }
}}
 