package lesson1;

import java.util.Arrays;

public class Lesson1Task2 {



public static void main(String[] args) {
	int[]array = {-7,-158,-150,-90588,-755,-2,-654};
    findMax(array);
    findMin(array);
}

public static void findMax(int[] array) {
	int max = 0;
    Arrays.sort(array);
    max = array[array.length - 1];
    System.out.println("Maximum " + max);
}

public static void findMin(int[] array) {
    int min = 0;
    Arrays.sort(array);
    min = array[0];
    System.out.println("Minimum " + min);
        }
    
}


