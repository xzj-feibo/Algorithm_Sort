package 选择排序;

import java.util.Arrays;

/**
 * @author 夏子健
 * @version 1.0
 * @date 2023/7/19 18:40
 */
public class HeapSort {
    /**
     * 堆维护
     * @param arr 数组
     * @param i 第i个结点
     * @param n 堆的长度
     */
    public static void heapify(int[] arr,int i,int n) {
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        if (left < n && arr[largest] < arr[left]){
            largest = left;
        }
        if (right < n && arr[largest] < arr[right]){
            largest = right;
        }
        if (largest != i){
            swap(arr,i,largest);
            heapify(arr,largest,n);
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 堆排序
     * @param arr 待排序数组
     */
    public static void heapSort(int[] arr){
        int n = arr.length;
        //建堆
        for(int i = n / 2 - 1;i >= 0;i--){
            heapify(arr,i,n);
        }
        //排序
        for (int i = n - 1;i > 0;i--){
            swap(arr,i,0);
            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,7,9};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
