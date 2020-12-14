import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {
        int[] arr = new int[0];

        int[] arr1 = {1,2,3,4,5};

        arr = arr1;

        System.out.println(Arrays.toString(arr));

    }
}