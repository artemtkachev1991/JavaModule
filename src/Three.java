import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 3};
        System.out.println(Arrays.toString(array));

        int count = countNumberWithoutDuplicate(array);
        System.out.println("Count numbers: " + count);
    }

    static int countNumberWithoutDuplicate(int[] array) {
        int numbers = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count == 0) {
                numbers++;
            }
        }
        return numbers;
    }
}
