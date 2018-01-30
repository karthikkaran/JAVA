import java.lang.Math;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 3 integers: ");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int z = keyboard.nextInt();
        int max =  Math.max(Math.max(x,y),z);
        System.out.println(x + " " + y + " "+z);
        System.out.println("The max of three is: " + max);
    }
}   
