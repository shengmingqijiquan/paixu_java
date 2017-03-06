package com.ctgu.chosesort;
import java.util.Arrays;
/* Created by shengmingqijiquan on 2017/3/4 0004. */
public class ChoseSort {
    /**
     * 简单排序
     * 基本思想：在未排序序列中找到最小元素，存放到排序序列的起始位置，再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
     * 以此类推，直到所有元素均排序完毕。
     * 代码实现：
     * 1.两次for循环，每循环一次找到一个最小的数放在已排序的序列最后一位，第二次遍历是从后向前遍历。
     * 2.交换两找到的最小数
     */
    public static int[] choseSort(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int k = i;   //待确定的位置，选择出应该在第i个位置的数
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] < numbers[k]) {
                    k = j;
                }
            }
            //交换两个数
            temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }
        return numbers;
    }
}
