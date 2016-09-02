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
 *   4.1其缺点是要求待查表为有序表，且插入删除困难
 *
 * 5.复杂度分析
 *
 *
 * 1.二分查找又称折半查找,优点是比较次数少,查找速度快,平均性能好;其缺点是要求待查表为有序表,且插入删除困难。因此,二分查找方法适用于不经常变动而查找频繁的有序列表。
 *
 * 2.算法要求:
 *   必须采用顺序存储结构; 必须按关键字大小有序排列。
 *
 *
 * 3.复杂度分析
 *
 *   3.1时间复杂度:
 *      最优时间复杂度
 *   平均时间复杂度	O(log n)
 *   3.1时间复杂度:折半搜索每次把搜索区域减少一半,时间复杂度为（n代表集合中元素的个数）
 *
 *
 *
 *
 * User: chl_smile
 * Date: 2016-08-25 16:02:00
 */
public class BinarySearch {

    /**
     * binarySearch使用二分搜索法来搜索指定的int型数组,以获得指定的值在数组中的位置,需要确保数组是有序的,如果数组包含多个带有指定值的元素,则无法保证找到的是哪一个.
     *
     * 这个写法与jdk的java.util.Arrays中的binarySearch方法类似,start+end存在溢出的风险
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
        int[] arraySrc={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(binarySearch(arraySrc,20));
    }
}
