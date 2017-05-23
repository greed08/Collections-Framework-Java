import java.util.*;
class linklist
{
	public static void main(String args[])
	{
		//Declaration
		LinkedList<String> link_list=new LinkedList<String>();
		ArrayList<String> array=new ArrayList<String>();
		//Adding elements in link list
		link_list.add("Shikamaru");
		link_list.add("Inno");
		link_list.add("Chozi");
		System.out.println("Contents in link list "+link_list);
		//Setting new value at particular index
		link_list.set(0,"Asuna");
		System.out.println("Modified contents in link list are "+link_list);
        //removing first element
        link_list.removeFirst();
        //removing last elemnt
        link_list.removeLast();
        //adding at a particular index	
        link_list.add(0,"Shikamaru");
        array.add("Hinata");
        array.add("Kiba");
        array.add("Shino");
        //Inserting entire collection into link list
        link_list.addAll(array);
        System.out.println("Modified contents in link list are "+link_list);
        //check if a list contains a specific value or not
        System.out.println("List contains Shikamaru "+link_list.contains("Shikamaru"));
        //get index of a particular value in link list
        int pos=link_list.indexOf("Shikamaru");
        System.out.println("Position of Shikamaru in link list is "+pos);   
        //Returns and remove the first element of the list
        String name=link_list.poll();
        System.out.println("Name os shikaku's son is "+name);
        //iterating through list
       Iterator i = link_list.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
         //Searching first occurrence of element
     int firstIndex = link_list.indexOf("Hinata");
     //Link List iteratot for next and previous elements
     ListIterator listit=link_list.listIterator();
     //Iterating the list in forward direction
     System.out.println("Forward iteration");
     while(listit.hasNext())
     {
     	System.out.println(listit.next());
     }

     System.out.println("Backward iteration");
     while(listit.hasPrevious())
     {
     	System.out.println(listit.previous());
     }
      //peek()
     System.out.println(link_list.peek());
	 }
	

}