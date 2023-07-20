package 语法练习;

import java.util.*;

/**
 * @author 夏子健
 * @version 1.0
 * @date 2023/7/13 15:59
 */
class SumOfThreeNumbers {
    public static List<List<Integer>> threeSum(int[] nums) {
        //排序
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        if (len < 3) {
            return list;
        }
        //右指针
        for (int i = 0; i < len; i++) {
            int L = i + 1;//左指针
            int R = len - 1;//右指针
            while (L < R) {
                if (i != L && i != R) {
                    int y = nums[i] + nums[L] + nums[R];
                    if (y == 0) {
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[L]);
                        res.add(nums[R]);
                        set.add(res);
                        L++;
                    } else if (y > 0) {
                        R--;
                    } else {
                        L++;
                    }
                }
            }
        }
        list.addAll(set);
        return list;
    }

    public static void main(String[] args) {
        int[] t = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(t);
        System.out.println("list = " + list);
    }
}
