// import java.util.*;

// public class LinearSearch {
//   public static int linSearch(int number[], int key) {
//     for (int i = 0; i < number.length; i++) {
//       if (number[i] == key) {
//         return i;
//       }
//     }
//     return -1;
//   }

//   public static void main(String args[]) {
//     int numbers[] = { 2, 4, 5, 6, 8, 10, 12, 14, 16 };
//     int key = 10;
//     int index = linSearch(numbers, key);
//     if (index == -1) {
//       System.out.println("Not found.");
//     } else {
//       System.out.println("Key is at" + index);
//     }
//   }
// }

//Largest number
import java.util.*;

public class LinearSearch {

  public static int getLargest(int numbers[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (largest < numbers[i]) {
        largest = numbers[i];
      }
    }
    return largest;
  }

  public static void main(String args[]) {
    int numbers[] = { 2, 4, 5, 6, 8, 10, 12, 14, 16 };
    System.out.println("largest value is : " + getLargest(numbers));
  }
}