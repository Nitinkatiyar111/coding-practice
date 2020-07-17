public class CountingWord{
   
  static int countingWords(String s)
  {
     int count = 0 ;

     String []str = s.split("\\s");

     return str.length;     
  }
    public static void main(String[] args)
    {
     String s = "lets calculate number of words in string";
     System.out.println("Number of words : " + countingWords(s));
    
    }
}