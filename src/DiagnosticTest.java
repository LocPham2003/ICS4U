import java.util.ArrayList;

public class DiagnosticTest {

    static int countValues(int[] values, int min_value, int max_value){
        int counts = 0;

        for (int i : values){
            if (i >= min_value && i <= max_value){
                counts++;
            }
        }

        return counts;
    }

    public static void main(String[] args) {
        System.out.println(countValues(new int[]{1, 3, 4, 5, 5, 6, 7, 8, 4, 5, 23, 25, 30},5,24));
    }
}
