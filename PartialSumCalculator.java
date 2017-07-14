import java.util.*;
public class PartialSumCalculator{
  public static void main(String[] args){
    System.out.println("Please enter a set of numbers.\n");
    System.out.println("Please choose the size of the set: ");
    Scanner console = new Scanner(System.in);
    int size =console.nextInt();
    int[] numberSet = new int[size];
    for(int i = 0 ; i < numberSet.length; i++){
      System.out.println("Please choose element number " + (i+1));
      numberSet[i] = console.nextInt();
    }
    int[] sumSet = sumSet(numberSet);
    System.out.println("The sums set is " + Arrays.toString(sumSet));
  }
  public static int[] sumSet(int[] numberSet){
    int[] sumSet = new int[numberSet.length];
    int currSum = numberSet[0];
    sumSet[0] = currSum;
    for(int i = 1; i < numberSet.length; i++){
      currSum = currSum + numberSet[i];
      sumSet[i] = currSum;
    }
    return sumSet;
  }
}
