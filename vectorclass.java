import java.util.*;
class vectorclass
{
    public static void main(String args[])
    {
	Vector<String> vec=new Vector<String>(2);
	vec.addElement("Shikamaru");
	vec.addElement("Inno");
	vec.addElement("Chozi");
	System.out.println("Size is: "+vec.size());
  //Sorting vector
  Collections.sort(vec);
  //Getting sublist froma vector

  List<String> l1=vec.subList(2,3);
  for(int i=0;i<l1.size();i++)
  System.out.println("Sublist contains "+l1.get(i));
  Vector<String> v2=new Vector<String>();
  v2.addElement("Gara");
  v2.addElement("Temari");
//  v2.addElement("Kankuro");
  Collections.copy(vec,v2);
  System.out.println("Vector contains "+vec);
  //Removing elemnts
  vec.remove("Gara");
  vec.clear();
  Iterator it=vec.iterator();
  System.out.println("Vector :");
  while(it.hasNext())
  {
    System.out.println(it.next());
  }


    }
}
