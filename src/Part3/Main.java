package Part3;

import java.util.*;

public class Main {
    public static int maxLengthOfSubarray(List<Long> nums, long P) {
        int maxLength = 0;
        long sum = 0;
        int start = 0;

        for (int end = 0; end < nums.size(); end++) {
            sum += nums.get(end);

            while (sum >= P && start <= end) {
                sum -= nums.get(start);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        List<Long> nums = new LinkedList<>(Arrays.asList(1L, 3L, 5L, 7L, 9L));
        long P = 15;
        int result = maxLengthOfSubarray(nums, P);
        System.out.println("Max length of subarray: " + result);
    }
}
