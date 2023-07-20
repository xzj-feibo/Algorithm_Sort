package 语法练习;

import java.util.*;

/**
 * @author 夏子健
 * @version 1.0
 * @date 2023/7/14 15:44
 */
public class SumOfFourNumbers {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        if (nums == null || nums.length < 4) {
            return list;
        }

        //排序
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0;i<len-3;i++){
            for(int j = i+1;j<len-2;j++){
                int L = j+1;   //左指针
                int R = len-1;   //右指针
                while(L < R){
                    long sum = (long)nums[i]+nums[j]+nums[L]+nums[R];
                    if(sum == target){
                        List<Integer> lst = List.of(nums[i],nums[j],nums[L],nums[R]);
                        set.add(lst);
                        L++;R--;
                    }else if(sum > target){
                        R--;
                    }else{
                        L++;
                    }
                }
            }
        }
        list.addAll(set);
        return list;
    }
    public static void main(String[] args) {
        List<List<Integer>> list = fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296);
        System.out.println("list = " + list);
    }
}
