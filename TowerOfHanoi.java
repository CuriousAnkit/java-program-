public class TowerOfHanoi {

  // Recursive method to solve Tower of Hanoi problem
  public static void TOH(int n, char fromRod, char toRod, char auxRod) {
      // Base case: if only one disk, move it from fromRod to toRod
      if (n == 1) {
          System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
          return;
      }

      // Recursive case: move n-1 disks from fromRod to auxRod, using toRod as auxiliary
      TOH(n - 1, fromRod, auxRod, toRod);
      
      // Move the nth disk from fromRod to toRod
      System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
      
      // Move the n-1 disks from auxRod to toRod, using fromRod as auxiliary
      TOH(n - 1, auxRod, toRod, fromRod);
  }

  public static void main(String[] args) {
      int n = 2; // Number of disks
      TOH(n, 'A', 'C', 'B'); // A, B and C are names of rods
  }
}
