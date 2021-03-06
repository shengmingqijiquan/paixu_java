package com.ctgu.chosesort;

/**
 * Created by shengmingqijiquan on 2017/3/4 0004.
 */
public class HeapSort {
    /*堆排序算法
    * 基本思想：堆排序是一种树形选择排序，是对直接选择排序的有效改进。堆顶元素（即第一个元素）必为最大项（大顶堆）。完全二叉树可以很直观地表示堆的结构。堆顶为根，其它为左子树、右子树。
    * 思想:初始时把要排序的数的序列看作是一棵顺序存储的二叉树，调整它们的存储序，使之成为一个堆，这时堆的根节点的数最大。
    * 然后将根节点与堆的最后一个节点交换。然后对前面(n-1)个数重新调整使之成为堆。依此类推，直到只有两个节点的堆，
    * 并对 它们作交换，最后得到有n个节点的有序序列。从算法描述来看，堆排序需要两个过程，
    * 一是建立堆，二是堆顶与堆的最后一个元素交换位置。所以堆排序有两个函数组成。一是建堆的渗透函数，二是反复调用渗透函数实现排序的函数。
    * 代码思想：【两个方法】
    * 1.建立堆：
    * -----定义一个数组变量data[]和最后一个节点lastIndex，最后一个节点的根节点为第k =（lastIndex-1）/2 个节点，依次比较子树节点与其根节点的大小，若子树节点小，则交换两个数值，继续循环执行，直到最后一个节点变成堆顶
    * 2.交换堆顶与最后一个元素
    * -----
    * */


    /*
    * @data[] 带排序的序列
    * @lastIndex 最后一个节点
    * @k 最后一个节点的父节点
    * @biggerIndex 当前判断的节点k的较大子节点
    * @swap（） 交换两个节点数据
    * */
              //对data数组从0到lastIndex建大顶堆
        public static void buildMaxHeap(int[] data, int lastIndex){
            //从lastIndex处节点（最后一个节点）的父节点开始
            for(int i=(lastIndex-1)/2;i>=0;i--){
                //k保存正在判断的节点
                int k=i;

                //如果当前k节点的子节点存在
                while(k*2+1<=lastIndex){
                    //k节点的左子节点的索引
                    int biggerIndex=2*k+1;
                    //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
                    if(biggerIndex<lastIndex){
                        //若果右子节点的值较大
                        if(data[biggerIndex]<data[biggerIndex+1]){
                            //biggerIndex总是记录较大子节点的索引
                            biggerIndex++;
                        }
                    }
                    //如果k节点的值小于其较大的子节点的值
                    if(data[k]<data[biggerIndex]){
                        //交换他们
                        swap(data,k,biggerIndex);
                        //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
                        k=biggerIndex;
                    }else{
                        break;
                    }
                }
            }
        }
        //交换
        public static void swap(int[] data, int i, int j) {
            int tmp=data[i];
            data[i]=data[j];
            data[j]=tmp;
        }

    }
