package org.数据结构与算法分析.第一章;


import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Author: abel
 * @Date: 2022/10/16 21:49
 * @Description:
 */
public class choose {
    int maxIndex;
    public choose() {
        maxIndex = 1000*1000*100;
    }

    //k=N/2
    public int[] generateArray(int maxIndex){
        int[] ints = new int[maxIndex];
        for (int i = 0; i < maxIndex; i++) {
            ints[i] = (int) (Math.random()*maxIndex);
        }
        return ints;
    }
    public int chooseMax5(int[] arr){
         arr = Arrays.stream(arr).sorted().toArray();
//         Arrays.stream(arr).sorted().toArray();
//        Arrays.stream(arr).peek(s -> System.out.println(s)).count();
//        quickSort(arr,0,arr.length-1);
        return arr[4];
    }
    public static void quickSort(int[] nums, int start, int end){
        if(start>end) return;
        int i,j,base;
        i=start;
        j=end;
        base=nums[start];
        while (i<j){
            while (i<j && nums[j]>=base) j--;
            while (i<j && nums[i]<=base) i++;
            if(i<j){
                swap(nums,i,j);
            }
        }
        swap(nums,start,i);
        quickSort(nums,start,j-1);
        quickSort(nums,j+1,end);
    }
    public static void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        choose choose=new choose();
        int[] ints = choose.generateArray(choose.maxIndex);
//        int[] iss = new int[]{3,2,4,6,7,8,90,324,24,54,10};
        int i = choose.chooseMax5(ints);
        long end = System.currentTimeMillis();
//        Arrays.stream(iss).sorted().peek(s -> System.out.println(s)).count();
//        Arrays.stream(ints).peek(s -> System.out.println(s)).count();
        System.out.println("--------第五大的数是-------" + i + "用时ms:" + (end - start));
//        Arrays.stream(ints).sorted().peek(s -> System.out.println(s)).count();
//        String s = Arrays.stream(ints).toString();
//        System.out.println(s);
    }
}
