import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int position = 2;
        if (position < 0 || position > originalArray.length) {
            System.out.println("Invalid position to insert element.");
            return;
        }
        int[] newArray = new int[originalArray.length + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[position] = elementToInsert;
        for (int i = position + 1; i < newArray.length; i++) {
            newArray[i] = originalArray[i - 1];
        }
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Element to Insert: " + elementToInsert);
        System.out.println("Position to Insert: " + position);
        System.out.println("Modified Array: " + Arrays.toString(newArray));
    }
}