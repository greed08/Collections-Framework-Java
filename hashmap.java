import java.util.*;
class hashmap
{
  public static void main(String args[])
  {
    HashMap<Integer,String> m1=new HashMap<Integer,String>();
    //Addiong elements to hashmap
    m1.put(1,"Nagato");
    m1.put(2,"Konan");
    m1.put(3,"Yahiko");
   //HashMap Iterator
   Set set=m1.entrySet();
   Iterator it=set.iterator();
   while(it.hasNext())
   {
     Map.Entry en=(Map.Entry)it.next();
     System.out.print("key is :"+en.getKey()+ " & value is ");
     System.out.println(en.getValue());
   }
   //Remove values
   m1.remove(2);
   //Getting values based on key
   String s1=m1.get(3);
   System.out.println(s1);
   //Sorting values based on keys
   Map<Integer,String> map=new TreeMap<Integer,String>(m1);
   System.out.println("After sorting :");
   Set set2=map.entrySet();
   Iterator it2=set2.iterator();
   while(it2.hasNext())
   {
     Map.Entry m3=(Map.Entry)it2.next();
     System.out.print(m3.getKey() +": ");
     System.out.println(m3.getValue());
   }
  }
}
