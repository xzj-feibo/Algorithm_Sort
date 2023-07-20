package 交换排序;

import java.util.Arrays;

/**
 * @author 夏子健
 * @version 1.0
 * @date 2023/4/21 21:26
 */
public class BubbleSort {
    public static int[] sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1;j<a.length;j++){
                if (a[i] > a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a={2,4,3,6,12,4,14,15,7,9};
        System.out.println("排序前："+ Arrays.toString(a));
        System.out.println("排序后："+Arrays.toString(sort(a)));
    }
}
