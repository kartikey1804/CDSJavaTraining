import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        //add your five friends name
        ArrayList<String> namelist = new ArrayList<>();
        //to add 5 friends name into arraylist
        namelist.add("Anshu");
        namelist.add("Vishal");
        namelist.add("Pawan");
        namelist.add("Prashant");
        namelist.add("Shruti");
        //print the arraylist name using for each loop
        for (String name : namelist)
        {
            System.out.println(name);
        }
        //to get the specific value using index
        System.out.println(namelist.get(3));
        //to sort the arraylist
        Collections.sort(namelist);
        System.out.println(namelist);
        //reverse the arraylist element
        for (String name : namelist.reversed())
        {
            System.out.println(name);
        }
        //reverse the arraylist element
        for (int i=namelist.size()-1;i>=0;i--)
            System.out.println(namelist.get(i));
        //find the repeated element in arraylist

        for(int i=0;i<namelist.size(); i++) {
             for ( int j= i+1;j< namelist.size();j++){
                 if (namelist.get(i).equals(namelist.get(j))){
                     System.out.println(namelist.get(j));
                 }

             }
        }
    }
}
