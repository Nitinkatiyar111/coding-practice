public Class SubStringCount 
{
   static int countString(String s)
    {
        int len = s.length();
        return  n*(n-1) /2;
    }
    public static void main(String[] args)
    {
        String s = "nitin";
        System.out.println("Total count is :" +countString(s));
    }
}