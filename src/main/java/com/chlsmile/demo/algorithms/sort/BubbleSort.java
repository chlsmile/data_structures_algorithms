package com.chlsmile.demo.algorithms.sort;

import java.util.Arrays;

/**
 * Created with: IntelliJ IDEA.
 * Function:冒泡排序
 *
 * 1.算法介绍
 *   冒泡排序过程
 *
 * 2.适用场景
 *
 * 3.时间复杂度
 *
 * 4.优点
 *
 * 5.缺点
 *
 * User: chl_smile
 * Date: 2016-09-02 17:11:00
 */
public class BubbleSort {


    public static int[] bubbleSort(int[] arr){

        if(arr.length==0){
            return arr;
        }

        for(int i=0;i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,5,9,2,0,4,45,89,3};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
