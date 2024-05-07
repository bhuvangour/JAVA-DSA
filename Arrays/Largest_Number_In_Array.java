package Arrays;

public class Largest_Number_In_Array {
    public static int LargestNumber(int num[]){
        int j = Integer.MIN_VALUE;//- Infinity
        for(int i = 0; i < num.length; i++){
            if(j < num[i]){
                j = num[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int num[] = {10, 3, 24, 5, 4, 9, 6};
        System.out.println("Largest Number In The Array is: " + LargestNumber(num));
    }
}
