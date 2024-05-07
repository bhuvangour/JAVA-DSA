package Arrays;

public class Arrays_As_Function {
    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks [] = {89, 32, 43, 98, 56};
        update(marks);
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
