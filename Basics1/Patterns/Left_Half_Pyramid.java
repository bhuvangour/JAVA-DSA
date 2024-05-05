package Basics1.Patterns;
public class Left_Half_Pyramid {
    public static void main(String[] args) {
            int n = 5;
            int i;
            for(i=1;i<=n;i++){
         for(int j=1;j<=n-i;j++){
System.out.print(" ");
           }for(int j =1;j<=i;j++){
System.out.print("*");
           }
           System.out.println();
    }
   }
}
