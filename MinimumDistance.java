import java.util.Scanner;
class MinimumDistance
    {
      static int checkMinDistance(int[] arr,int len,int a,int b)
    {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++)
      {
        for (int j = i + 1; j < len; j++)
        {
            if ((a == arr[i] && b == arr[j] || b == arr[i] && a == arr[j])
            &&  min > Math.abs(i - j))
            min = Math.abs(i - j);
        }
      }  
      return min;
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,5,8,2,6,1,4,7};
        int len = arr.length;
        System.out.println("enter two numbers for calculating the Distance");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Minimum Distance between the numbers: "+ checkMinDistance(arr,len,a,b));
    }
}