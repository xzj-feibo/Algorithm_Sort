package 插入排序;

import java.util.Arrays;

/**
 * @author 夏子健
 * @version 1.0
 * @date 2023/4/20 22:07
 */
public class InsertSort {
    public static int[] sort(int[] a) {
        int i,j,temp;
        //从1开始，认为前面的已排好序
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            if (temp < a[i - 1]) {         //当小于前面的一个元素时说明要插入
                for (j = i-1; temp<a[j]&&j>=0; j--){
                    a[j+1]=a[j];
                }
                a[j+1]=temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        int[] a = {3,5,6,22,3,12,4,8,10,21,14,19};
        System.out.println("排序前："+ Arrays.toString(a));
        System.out.println("排序后："+ Arrays.toString(sort(a)));
    }
}
