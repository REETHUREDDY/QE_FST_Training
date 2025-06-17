package Pratice;

public class Pratice1 {
	
	public static void main(String[] args) {
        int x = 80;
        int y = 10;
        int z = 30;

        if (x == y && y == z) {
            System.out.println("All numbers are equal.");
        } 
        else if (x == y || y == z || x == z) {
            System.out.println("Two numbers are equal.");
        } 
        else {
            System.out.println("All numbers are different.");
        }
    }
}

