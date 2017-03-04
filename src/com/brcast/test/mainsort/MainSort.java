package com.brcast.test.mainsort;

import com.ctgu.chosesort.ChoseSort;
import com.ctgu.chosesort.HeapSort;
import com.ctgu.exchangesort.BubbleSort;
import com.ctgu.exchangesort.QuickSort;
import com.ctgu.insertsort.InsertSort;
import com.ctgu.insertsort.ShellSort;

import java.util.Arrays;

/**
 * Created by shengmingqijiquan on 2017/3/4 0004.
 */
public class MainSort {
    public static void main(String[] args){
        /**简单排序测试*/
        int[] shuzu = new int[]{13,15,1,45,100,78,55,62,41,22};
        int[] paixu = ChoseSort.choseSort(shuzu);
        for(int x:paixu)
            //增强for(part1:part2){part3};
            //part2中是一个数组对象,或者是带有泛性的集合.
            //part1定义了一个局部变量,这个局部变量的类型与part2中的对象元素的类型是一致的.
            //part3当然还是循环体.
            System.out.print("简单选择排序："+x+"-");
        /**堆排序测试*/
          //循环建堆
        for(int i=0;i<shuzu.length-1;i++){
            //建堆
            HeapSort.buildMaxHeap(shuzu,shuzu.length-1-i);
            //交换堆顶和最后一个元素
            HeapSort.swap(shuzu,0,shuzu.length-1-i);
            System.out.println("堆排序："+Arrays.toString(shuzu));
        }

        /*插入排序*/
        InsertSort.insertSort(shuzu);
        for(int insert:shuzu)
            System.out.println("插入排序："+insert);
        /*希尔排序*/
        ShellSort.shellSort(shuzu);
            for(int shell:shuzu)
            System.out.println("希尔排序："+shell);
        /*冒泡排序*/
        BubbleSort.bubbleSort(shuzu);
        for(int bubble:shuzu)
            System.out.println("冒泡排序：："+bubble);

        /*快速排序*/
        QuickSort.quick(shuzu);
        for(int quicke:shuzu)
            System.out.println("快速排序："+quicke);
    }
}
