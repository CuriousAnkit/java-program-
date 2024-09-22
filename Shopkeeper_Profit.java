import java.util.ArrayList;
import java.util.Scanner;

/**
 * Shopkeeper_Profit
 */

 //Ram makes a plan for the new year. He decides to sell the products and writes down the price for N days. The prices are denoted by an array V[] of N elements. Looking at the sequence he decides that for the ith product, he is going to get a profit that equals to (Vj - Vi), where j is the minimum index just greater than i and Vj >= Vi. If there is no such j, then his profit will be equal to Vi. Find the total profit of Ram. 
public class Shopkeeper_Profit {

  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of element in arraylist....");
    int n = sc.nextInt();
    while (array.size()<n) {
      int input = sc.nextInt();
      
      array.add(input);
      
    }
    sc.close();
    
    System.out.println(getProfit(array , n));

  }
  public static int getProfit(ArrayList<Integer> arr, int n){
    ArrayList<Integer> profitArr = new ArrayList<>();
    int profit = 0;

    for(int i=0;i<n;i++){
      profit = arr.get(i);

      for(int j=i+1;j<n;j++){
        if(arr.get(i)<arr.get(j)){
          profit = arr.get(j) - arr.get(i);
          break;
        }
      
      }
      
      profitArr.add(profit);
    }
    int totalProfit = 0;
    for(int p:profitArr){
      totalProfit = p + totalProfit;
    }
    System.out.println(profitArr);

    return totalProfit;
  }
}