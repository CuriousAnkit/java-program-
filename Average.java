import java.util.Scanner;

public class Average {
  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("enter no of elements  ");
  //   int n = sc.nextInt();
  //   System.out.println("enter elements of array  ");
  //   int arr[] = new int[n];
  //   int sum = 0;
  //   double avg;
  //   for(int i = 0; i < n; i++){
  //     arr[i] = sc.nextInt();
  //     sum += arr[i];
  //   }
  //   avg = sum/arr.length;
  //   System.out.println("Average is  " + avg);

  //   sc.close();

  // }

  public static void main(String[] args) {
    int arr[] = {92 ,2 ,74, 55, 0, 10 ,-60, 24 ,91, -67, 11};
    double average = posAverage(arr);
    System.out.println(average);

  }

  public static double posAverage(int[] numbers){
    
    
    //Write your code to find average of positive numbers in numbers array
    //return the answer
    int count=0;
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]>=0){
            count++;
        }
    }
    
    int []arr = new int[count];
    int a = 0;
    for(int j = 0;j<numbers.length;j++){
        if(numbers[j]>0){
            arr[a] = numbers[j];
            a++;
        }
    }
    
    int sum = 0;
    double avg = 0.0000000000;
    for(int k=0;k<count;k++){
        sum = sum + arr[k];
        avg = (double)sum/(double)count;
    }
    System.out.println(arr);
    System.out.println(sum);
    
    return avg;
    
}
}
