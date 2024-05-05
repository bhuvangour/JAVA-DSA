package Basics1.Patterns;

public class Reverse_Half_Right_Triangle {
    public static void main(String[] args) {
        int n = 5;
        int i;
        for(i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
