public class SwapNumbers {

    public static void main(String[] args) {
        // Swap using call by value
        int a = 5;
        int b = 10;

        System.out.println("Before swapping (call by value):");
        System.out.println("a = " + a + ", b = " + b);

        swapByValue(a, b);

        System.out.println("After swapping (call by value):");
        System.out.println("a = " + a + ", b = " + b);

        // Swap using call by reference (using an array)
        int[] numbers = {5, 10};

        System.out.println("\nBefore swapping (call by reference):");
        System.out.println("numbers[0] = " + numbers[0] + ", numbers[1] = " + numbers[1]);

        swapByReference(numbers);

        System.out.println("After swapping (call by reference):");
        System.out.println("numbers[0] = " + numbers[0] + ", numbers[1] = " + numbers[1]);
    }

    // Call by value: Swaps two numbers (local variables a and b)
    private static void swapByValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nInside swapByValue method:");
        System.out.println("a = " + a + ", b = " + b);
    }

    // Call by reference: Swaps two numbers using an array
    private static void swapByReference(int[] numbers) {
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
        System.out.println("\nInside swapByReference method:");
        System.out.println("numbers[0] = " + numbers[0] + ", numbers[1] = " + numbers[1]);
    }
}
