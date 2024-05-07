package Arrays;
public class Linear_Search {
    public static int LinearSearch(int num[], int key){
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num [] = {13, 4, 35, 24, 25, 35, 633, 1514, 16};
        int key = 10;
        int index = LinearSearch(num,key);
        if (index == -1) {
            System.out.println("Key not found");
        }else{
            System.out.println("index of key: " + index); 
        }
    }
}
