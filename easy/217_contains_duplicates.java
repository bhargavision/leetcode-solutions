package easy;

//using hashset
import java.util.*;

class contains_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(containsDups(nums));
    }

    static boolean containsDups(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
/*
 * input:
 * 4
 * 1 2 3 4
 * 
 * output:
 * false
 * 
 */