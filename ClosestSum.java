import java.util.Scanner;
class ClosestSum{
    static void checkSum(int a[],int len,int x)
    {
        int res_r = 0 ,res_l = 0;
        int l = 0, r = len - 1;
      int min = Integer.MAX_VALUE;

    while (r > l)
    {
        if (Math.abs(a[l] + a[r] - x) < min )
        {
          res_l = l;
          res_r = r;
          min = Math.abs(a[l] + a[r] - x);
        }
           if (a[l] + a[r] > x)
              r--;
         else
              l++;
    }    
      System.out.println("The closest are: "+ a[res_l] + "and"+ a[res_r]);
    }
    public static void main(String[] args)
    {
        int[] a = {2,3,4,5,6,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int len = a.length;
        checkSum(a,len,x);
    }
}       