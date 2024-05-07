package Basics2;

public class Count_Number_Of_Digits {
    static int count(int n){
        n = 435;
        int cnt = 0;
        cnt = (int) (Math.log10(n) + 1);
        return cnt;     
    }
    public static void main(String[] args) {
        int N = 329823;
        System.out.println("N: " + N);
        int j = count(N);
        System.out.println("Number of Digits in N: " + j);
    }
}
