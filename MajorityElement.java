import java.util.*;
class MajorityElement {
    static void checkMajority(int a[])
    {

      HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
      for (int i = 0; i < a.length; i++)
      {
      if(h.containsKey(a[i])){
          h.put(a[i],h.get(a[i]) + 1);
      }
      else
        h.put(a[i],1);

      }
       Set<Map.Entry<Integer,Integer>> set = h.entrySet();
       int max = Integer.MIN_VALUE;
       int key=0;
       for(Map.Entry<Integer,Integer> entry : set){
           if(max < entry.getValue()){
               key = entry.getKey();
               max = entry.getValue();
           }
       }
       System.out.println(key+" = "+ max);

    }
    public static void main(String[] args)
    {
     int a[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
     checkMajority(a);

    }
}