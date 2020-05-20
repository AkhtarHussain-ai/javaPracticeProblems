package JAVA3_ARRAYS_PROGRAMS;

import java.util.Arrays;

public class MinimumPlatforms55 {
    public static int minPlatform(int[] arr, int[]  dep, int size) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int max_platforms = 1;
        int platform_needed = 1;
        int i=1;
        int j=0;

        while (i< size && j < size){
            if(arr[i] <= dep[j]){
                max_platforms++;
                i++;
                if(max_platforms > platform_needed){
                    platform_needed = max_platforms;
                }

            }
            else {
                max_platforms --;
                j++;
            }
        }
        return platform_needed;

    }

    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        int size = arr.length;

        System.out.println("Minimum number of platforms required: " + minPlatform(arr,dep,size));
    }

}
