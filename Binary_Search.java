import java.util.Arrays;

public class Binary_Search {
  public static void main(String[] args) {
    int arr[] = {11,3,43,5,653,63,63,33,6,6,7,5,54};
    Arrays.sort(arr);
    int n = arr.length;

    System.out.println("Iterative : "+binarySearch(arr, 33));
    System.out.println("Recursive : "+binarySearch(arr,0,n-1,33));
  }

  // Iterative approach (Time complexity : O(logn)  and Auxillary Space : O(1))
  public static int binarySearch(int arr[], int x){
    int n = arr.length;
    int low = 0;
    int high = n-1;
    
    while(low<=high){
      int mid = (low+high)/2;

      if(arr[mid] == x)
        return mid;

      else if(arr[mid]<x)
        low = mid+1;
      
      else 
        high = mid - 1;
    }

    return -1;
  }

  // Recursive Approach (Time complexity : O(longn) and Auxillary Space : O(logn))
  public static int binarySearch(int arr[],int low,int high,int x){
    
   
    if(low>high)
    return -1;

    int mid = (low+high)/2;
    if(arr[mid] == x)
    return mid;

    else if(arr[mid]>x)
    return binarySearch(arr,low,mid-1, x);

    else 
    return binarySearch(arr,mid+1,high,x);


  }
}
