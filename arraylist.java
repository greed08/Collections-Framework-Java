import java.util.*;
class arraylist
{
	public static void main(String args[])
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Yahiko");
		obj.add("Nagato");
		obj.add("Konan");
		//getting element by index
		System.out.println("first element is "+obj.get(0));
		//print whole list
		System.out.println("Current array list "+obj);
		//looping through arraylist
		for(int i=0;i<obj.size();i++)
		{
			System.out.println("Currently array list contains "+obj.get(i));
		}
		//adding at specific index
		obj.add(0,"Shikamaru");
		System.out.println("Current array list "+obj);
		//removing elements 
		obj.remove("Omkar");
		//removing value at specified index
		obj.remove(1);
		//updating value at a particular index
		obj.set(0,"Shikaku");
		//check if a object is present in array list
		System.out.println("Shikaku is there is list "+obj.contains("Shikaku"));
        //for clearing entire list
        obj.clear();
        //Different ways of initializing array list
        //Method 1
        ArrayList<String> obj2=new ArrayList<String>(Arrays.asList("Sakura","Sasuke","Inno"));
        System.out.println("Obj 2 contains "+obj2);
        //Method 2
        ArrayList<String> obj3=new ArrayList<String>(){{add("Sai");add("Yamato");add("Kakashi");}};
         System.out.println("Obj 3 contains "+obj3);
         //for filling the arraylist for n times with a specific value
         ArrayList<String> obj4=new ArrayList<String>(Collections.nCopies(10,"Pain"));
        System.out.println("Obj 4 contains "+obj4);
       //iterating through array list
        //Method 2: 
       for(String values:obj4)
       	System.out.println("Obj 4 contains "+values);
       //Method 3:Using iterator
       Iterator it=obj4.iterator();
       while(it.hasNext())
       	System.out.println("Obj 4 throught iterator "+it.next());
       //Sorting arraylist
       //Ascending order
       Collections.sort(obj3);
       System.out.println("obj 3 after sorting "+obj3);
       //Descending order
       Collections.sort(obj2,Collections.reverseOrder());
       System.out.println("obj2 in descending order "+obj2);
       //adding all elements of one array list into another
       obj2.addAll(obj3);
       System.out.println("Obj 2 now contains all the elements of both obj2 and obj3 "+obj2);

	}
}