package com.chlsmile.demo.algorithms;

import java.util.Arrays;

/**
 * Created with: IntelliJ IDEA.
 * Function:二分查找法demo
 * User: chl_smile
 * Date: 2016-08-25 16:02:00
 */
public class BinarySearch {

    /**
     * binarySearch使用二分搜索法来搜索指定的int型数组,以获得指定的值在数组中的位置,需要确保数组是有序的,如果数组包含多个带有指定值的元素,则无法保证找到的是哪一个.
     *
     *
     * @param arr 待查找的数组
     *
     * @param key 指定值
     *
     * @return 如果指定值包含在数组中,则返回搜索键的索引;否则返回-1
     */
    public static int binarySearch(int[] arr, int key){

        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=(start+end)/2;
            int midVal=arr[mid];
            if(midVal<key){
                start=mid+1;
            }else if(midVal>key){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(){
        return -1;
    }



    public static void main(String[] args) {
        //int[] arraySrc={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //int[] arraySrc={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int aaa=Integer.MAX_VALUE+Integer.MAX_VALUE+Integer.MAX_VALUE+Integer.MAX_VALUE+Integer.MAX_VALUE;
        System.out.println(Integer.MAX_VALUE);
        System.out.println("aaa:"+aaa);

        int[] arr={Integer.MAX_VALUE-3,Integer.MAX_VALUE-2,Integer.MAX_VALUE};
        System.out.println(Arrays.binarySearch(arr,Integer.MAX_VALUE));
    }
}
