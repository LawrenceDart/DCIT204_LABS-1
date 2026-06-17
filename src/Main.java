import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.int);

    //  The Array Size
    System.out.print("What is the array size?");
    int size = scanner.nextInt();

    int[] arr = new int[size];


    // The elements for the array
    System.out.println ("Enter the elements:");
    for (int i = 0; i < size; i++){
        System.out.println ("Element" + (i + 1) + ":");
        arr[i] = scanner.nextInt();

    }
    // The target value
    System.out.println ("Enter the target value:");
    int target = scanner.nextInt();

    int linearResult = linearSearch(arr, target);

        System.out.println(" Linear Search Result ");
        if (linearResult != -1) {
            System.out.println("The target was found at index: " + linearResult);
        } else {
            System.out.println("The target was not found.");
        }

        // Sorting the array for binary algorithm
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // The binary search
        int binaryResult = binarySearch(sortedArr, target);

        System.out.println("Binary Search Result");
        System.out.println("The Sorted Array: " + Arrays.toString(sortedArr));

        if (binaryResult != -1) {
            System.out.println("The target was found at index: " + binaryResult + " in the sorted array.");
        } else {
            System.out.println("The target was not found.");
        }

        scanner.close();
    

    }
}
