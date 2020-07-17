import java.util.Scanner;
class CalculatingAngle {
 
 static int calcAngle(int h, int m) 
 {
   if (h < 0 || m < 0 || h >12 || m > 60)
   System.out.println("Wrong Input");
 
   if (h == 12)
       h = 0;
       if(m == 60)
  {
    m = 0;
    h += 1;
    if(h > 12 )
    h = h % 12; 
  }
   
   int angle_Hour = (int)(0.5 * (h * 60 + m));
   int angle_minute = (int)(6*m);

   int angle = Math.abs(angle_Hour - angle_minute);  
 
 return angle ;
}
   
 
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the hours");
     int h = sc.nextInt();
     System.out.println("enter the minute");
     int m = sc.nextInt();
     System.out.println(calcAngle(h,m));
 }

}