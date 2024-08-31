class Main 
{
  public static void main(String[] args) 
  {
    // WARMUP: Write the following lines of code and answer the questions:

    // 1. Declare an array of type boolean (do not give it a length):
    boolean[] array1;

    // 2. What is the value of each element of this array?
    // Answer: no elements to define

    // 3. Declare an array of 12 doubles:
    double[] array2 = new double[12];

    // 4. What is the value of each item of this array?
    // Answer: 0.0

    // 5. With 1 line of code, declare an array of ints called myArray and initialize it with the numbers from 25 to 30:
    int[] array3 = {25, 26, 27, 28, 29, 30};

    // 6. What is the value of myArray.length?
    // Answer: 6

    // 7. Write a line of code to change the first element of myArray to 40:
    array3[0] = 40;

    // 8. Print the last element of myArray:
    System.out.print(array3[array3.length - 1]);


    // Click ">Run" buttonw. Your code should just print the number 0.
    // END OF WARMUP
    System.out.println(" - " + array2.length + " = " + (array3[array3.length - 1] - array2.length) + ";");
    int[] myArray = {10, 7, 8, 20, 1};
    int[] testArray = {18, 19, 13, 6, 50, 7};
    printArray(myArray);
    System.out.println("\n" + sum67(testArray));
  }    // end of public static void main()

  // Write a method to print the elements of a given int array:
  public static void printArray(int[] myArray)
  {
    System.out.print("{");
    for(int i = 0; i < myArray.length; i++)
    {
      System.out.print(myArray[i]);
      if(i < myArray.length - 1)
      {
        System.out.print(" ");
      }
    }
    System.out.print("}");
  }

  public static int sum67(int[] nums)
  {
  boolean active = true;
  int sum = 0;
  if(nums.length == 0)
  {
    return 0;
  }
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] == 6)
    {
      active = false;
    }
    if(active = true)
    {
      sum += nums[i];
    }
    if(nums[i] == 7)
    {
      active = true;
    }
  }
  return sum;
  }
}      // end of class Main