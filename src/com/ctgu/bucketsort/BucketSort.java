package com.ctgu.bucketsort;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	/*桶式排序*/

    public static final int ARRAY_SIZE = 10000;
    public static final int BUCKET_SIZE=10;
    public static void sort(int[] array) {
        ArrayList<ArrayList<Integer>> bucket=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<BUCKET_SIZE;i++)
        {
            bucket.add(new ArrayList<Integer>());
        }
        for(int i=0;i<array.length;i++)
        {
            int k=array[i]/10;
            bucket.get(k).add(array[i]);
        }
        for(ArrayList<Integer> list:bucket)
            Collections.sort(list);
        for(ArrayList<Integer> list:bucket)
            System.out.println(list);
    }

    public static int[] init() {
        int[] array = new int[ARRAY_SIZE];
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader("d:/score.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String string = new String();
        int i = 0;
        try {
            while ((string = br.readLine()) != null) {
                array[i] = Integer.valueOf(string);
                i++;
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return array;
    }


}
