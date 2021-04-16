package oop.baitap.StopWatch;

import java.util.Arrays;

public class Time {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        int[] arr = new int[100000];
        for (int i = 0 ; i < arr.length ; i++ ){
            arr[i] = (int) ( Math.random()* 1000) ;
        }
        Arrays.sort(arr);
            stopWatch.stop();
        System.out.println("time " + stopWatch.time());

    }
}
