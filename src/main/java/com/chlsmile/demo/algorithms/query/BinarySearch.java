package com.chlsmile.demo.algorithms.query;


/**
 * Created with: IntelliJ IDEA.
 * Function:二分查找法demo
 *
 * 1.简介
 *   二分查找又称折半查找,查找过程从数组的中间元素开始,这种查找算法每一次比较都使搜索范围缩小一半,如果数组包含多个带有指定值的元素,则无法保证找到的是哪一个.
 *
 * 2.要求
 *   2.1数据结构必须是数组;
 *   2.2数组中的数据必须有序排列.
 *
 * 3.优点
 *   3.1比较次数少;
 *   3.2查找速度快,平均性能好;
 *
 * 4.缺点
 *   4.1其缺点是要求待查表为有序表,且插入删除困难.
 *
 * 5.复杂度分析
 *   5.1平均时间复杂度 	O(log n)
 *   5.2最差时间复杂度	O(log n)
 *   5.3最优时间复杂度	O(1)
 *
 * 6.应用场景
 *   6.1除直接在一个数组中查找元素外,可用在插入排序中。
 *
 *
 *
 * User: chl_smile
 * Date: 2016-08-25 16:02:00
 */
public class BinarySearch {

    /**
     * binarySearchCommon 这种写法start+end存在溢出的风险,需要进行改进
     *
     * @param arr 待查找的数组
     *
     * @param key 指定值
     *
     * @return 如果指定值包含在数组中,则返回搜索键的索引;否则返回-1
     */
    public static int binarySearchCommon(int[] arr, int key){

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

    /**
     * binarySearch 这种写法不存在溢出的风险
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
            int mid=(start+(end-start))/2;
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


    /**
     * binarySearchRecursion 二分查找法递归实现
     *
     * @param arr  待查找的数组
     *
     * @param key  指定值
     *
     * @param start 数组开始位置
     *
     * @param end 数组结束位置
     *
     * @return 如果指定值包含在数组中,则返回搜索键的索引;否则返回-1
     */
    public static int binarySearchRecursion(int[] arr, int key, int start, int end){

        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (arr[mid] > key){
            return binarySearchRecursion(arr, start, mid - 1, key);
        }else if(arr[mid] < key){
            return binarySearchRecursion(arr, mid + 1, end, key);
        }else{
            return mid;
        }
    }



    public static void main(String[] args) {
        int[] arraySrc={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(binarySearchCommon(arraySrc,20));
    }
}
