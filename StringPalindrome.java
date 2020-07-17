import java.util.Scanner;
class StringPalindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String str1 = "";
        int len = str.length();
        for(int i = len-1; i >= 0; i--)
    {
         str1 = str1 + str.charAt(i);
    }

    if(str.equalsIgnoreCase(str1))
    {
        System.out.println("the String is palindrome");
    }
  else
       System.out.println("the string is not palindrome");

    }
}