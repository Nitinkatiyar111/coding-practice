class BiggerElement{
    static void checkElement(int a[],int len){
        for (int i = 0; i < len-2; i++)
        {
            if (a[i] < a[i+1] )
            System.out.println(a[i+1]+ " ");
        }
        System.out.println(a[a.length-1]);
    }
    public static void main(String[] args)
    {
        int a[] = {3,1,2,4,5};
        int len = a.length;
        checkElement(a,len);
    }
}