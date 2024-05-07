package Arrays;

public class Smallest_Number_In_Array {
    public static int SmallestNumber(int num[]){
        int j = Integer.MAX_VALUE;//+ Infinity
        for(int i = 0; i < num.length; i++){
            if(j > num[i]){
                j = num[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int num[] = {10, 3, 24, 5, 4, 9, 6};
        System.out.println("Smallest Number In The Array is: " + SmallestNumber(num));
    }
}
