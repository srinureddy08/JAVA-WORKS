public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 6};

        int min = arr[0];

        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }

        int operations = 0;

        for (int n : arr) {
            operations += n - min;
        }

        System.out.println("Minimum Operations = " + operations);
    }
}
