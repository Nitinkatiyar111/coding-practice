class LastDuplicateElement {

    static int checkLastDuplicate(int a[], int len)
    {
        int temp=0; 
        for(int i = 0; i < len; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                if (a[i] == a[j])
                {
                    temp = a[i];
                } 
            }

        }
        return temp;
    }
    public static void main(String[] args){
      int a[] = {2,1,3,1,4,2,3};
      int len = a.length;
      System.out.println("Last duplicate element :"+ checkLastDuplicate(a,len));
    }
}