package Basics1.Patterns;

public class Square {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
