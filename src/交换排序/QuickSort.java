package 交换排序;

import java.util.Arrays;

/**
 * @author 夏子健
 * @version 1.0
 * @date 2023/4/21 21:43
 */
public class QuickSort {
    //划分，返回pivot最终位置的索引
    public static int Partition(int[] a,int low,int high){
        int pivot = a[low];//枢轴
        while (low<high){
            //不能交换顺序
            while (low < high && a[high] >= pivot){
                --high;
            }a[low]=a[high];
            while (low < high && a[low] <= pivot){
                ++low;
            }a[high]=a[low];
        }
        a[low]=pivot;
        return low;
    }
    public static int[] sort(int[] a,int low,int high){
        if (low<high){//递归出口条件
            int i = Partition(a, low, high);
            sort(a,low,i-1);
            sort(a,i+1,high);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a={2,4,3,6,12,4,14,15,7,9};
        System.out.println("排序前："+ Arrays.toString(a));
        System.out.println("排序后："+Arrays.toString(sort(a,0,a.length-1)));
    }
}
