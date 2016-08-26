package com.chlsmile.demo.algorithms;

/**
 * Created with: IntelliJ IDEA.
 * Function:二分查找法demo
 * User: chl_smile
 * Date: 2016-08-25 16:02:00
 */
public class BinarySearch {


    public static int binarySearchCommon(int[] arraySrc, int key){

        int index=arraySrc.length/2;
        if(arraySrc[index]==key){
            return index;
        }

        int start=0;
        int end=arraySrc.length-1;
        while (start<=end){
            int tempIndex=(end-start)/2;
            if(arraySrc[tempIndex]==key){
                return tempIndex;
            }
            if(arraySrc[tempIndex]>key){
                start=0;
                end=tempIndex;
            }else{
                start=tempIndex;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(){
        return -1;
    }

    public static int binarySearchJdk(){
        return -1;
    }


    public static void main(String[] args) {
        int[] arraySrc={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("aaaaaaaa");
        System.out.println(binarySearchCommon(arraySrc,13));
        System.out.println("bbbb");
    }
}
