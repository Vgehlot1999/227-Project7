package lab7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArrayExample3
{
  public static void main(String[] args)
  {
//    String s = "3 5 7 9 12";
//    int[] result = readNumbers(s);
//    System.out.println(Arrays.toString(result));
    
    int nums[] = new int[6];
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < 6; i++){
    	nums[i] = scan.nextInt();
    }
    
    System.out.println(Arrays.toString(getPositiveNumbers(nums)));
	  
    System.out.println(Arrays.toString(randomExperiment(10, 1000)));
  }
  
  public static int[] readNumbers(String text)
  {
    Scanner scanner = new Scanner(text);
    int count = 0;
    while (scanner.hasNextInt())
    {
      scanner.nextInt();
      count +=1;
    }
    
    int[] nums = new int[count];
    scanner = new Scanner(text);
    int index = 0;
    while (scanner.hasNextInt())
    {
      int num = scanner.nextInt();
      nums[index] = num;
      index += 1;
    }
    return nums;  
  }
  
  public static int[] getPositiveNumbers(int[] numbers){
	  int count = 0;
	  for(int i = 0; i < numbers.length; i++){
		  if(numbers[i] >= 0){
			  count++;
		  }
	  }
	  
	  int posNumbers[] = new int[count];
	  int j = 0;
			  
	  for(int i = 0; i < numbers.length; i++){
		  if(numbers[i] >= 0){
			  posNumbers[j] = numbers[i];
			  j++;
		  }
	  }
	  
	  return posNumbers;
  }
  
  public static int[] randomExperiment(int max, int iters){
	  Random rand = new Random();
	  int counts[] = new int[max];
	  
	  for(int i = 0; i <= iters; i++){
		  int num = rand.nextInt(max);
		  counts[num]++;
	  }
	  return counts;
  }
}
