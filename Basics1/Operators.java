package Basics1;

public class Operators { 
   public static void main(String[] args) {
    //Arithematic operatos
    int x = 23;
    int sum = 12+31;
    int sub = 123-31;
    int mul = 11*31;
    int div = 1313/31;
    int mod = 123%21;
    int inc = ++x;
    int dec = --x;
        System.out.println(sum); 
        System.out.println(sub); 
        System.out.println(mul); 
        System.out.println(div); 
        System.out.println(mod); 
        System.out.println(inc); 
        System.out.println(dec); 
    //Assignment Operators
    System.out.println( x += 5);
    System.out.println( x -= 4);
    System.out.println( x /= 4);
    System.out.println( x %= 4);
    System.out.println( x &= 4);
    //Compariosn Operators
    int a = 5;
    int b = 10;
    System.out.println(a==b);
    System.out.println(a!=b);
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a>=b);
    System.out.println(a<=b);
    //Logical Operators
    System.out.println(a>1 && x<299);//Returns true if both statements are true
    System.out.println(!(a>1 && x<299));//Reverse the result, returns false if the result is true
    System.out.println(a>1 || a<334);//Returns true if one of the statements is true
   }
}
