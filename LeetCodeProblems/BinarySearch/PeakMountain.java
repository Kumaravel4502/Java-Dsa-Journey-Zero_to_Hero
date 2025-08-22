//  852. Peak Index in a Mountain Array
//  https://leetcode.com/problems/peak-index-in-a-mountain-array/

class PeakMountain{

    public static int peakIndexInMountainArray(int[] arr){
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=low+(high - low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low; 
    }
public static void main(String[] args) {
    int arr[] = {0, 2, 1, 0};   
    System.out.println(peakIndexInMountainArray(arr));
}
}