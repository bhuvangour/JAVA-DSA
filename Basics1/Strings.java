package Basics1;
public class Strings { 
   public static void main(String[] args) {
    String[] fruits = {"apple","banana","mango","cherry"};   
    System.out.println(fruits[3]);//Access the Elements of an Array
    String[] cars = {"porsche","Bmw","Mercedes","ferrari"};
    cars[1]="Mclaren";//Change an Array Element
    System.out.println(cars[1]);//Array Length
    System.out.println(cars.length);
    String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
    for (int i = 0; i < cars.length; i++) {
    System.out.println(cars2[i]);
      }
   }
}
