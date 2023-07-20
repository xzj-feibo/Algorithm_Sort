package 选择排序;

import java.util.Arrays;

/**
 * @author 夏子健
 * @version 1.0
 * @date 2023/4/22 10:23
 */
public class SimpleSelectSort {
    /**
     * 从数组第一个元素开始，认为这个元素是最小的，将下标赋给min，并与后面的元素比较。
     * @param a
     * @return
     */
    public static int[] sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            //假设这个即将被排序的元素是最小的
            int min=i;
            for (int j=i+1;j<a.length;j++) {
                if (a[j]<a[min]){
                    min=j;
                }
            }
            if (min!=i){
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;

                System.out.println("hello fix");

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
