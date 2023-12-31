import java.util.List;
public class SimpleArraySum {

//    Given an array of integers, find the sum of its elements.

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }
}
