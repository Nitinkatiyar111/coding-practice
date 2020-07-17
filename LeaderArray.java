class LeaderArray 
{
   static void printLeaders(int arr[],int n)
    {
        for (int i = 0; i < n; i++)
        {
            int j;
            for ( j = i + 1; j < n; j++)
            {
                if(arr[i] <= arr[j])
                break;
            }
            if (j == n)
             System.out.print(arr[i] + " ");    
        }
    }
    public static void main(String[] args){
        int arr[] = {7,8,3,1,3,5};
        int n = arr.length;
        printLeaders(arr,n);
    }
}