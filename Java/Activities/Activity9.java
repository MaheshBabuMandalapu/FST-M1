import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList=new ArrayList<String>();
        myList.add("mahesh");
        myList.add("Vinod");
        myList.add("ram");
        myList.add("spy");
        myList.add("sai");
        System.out.println("Print all names");
        for(String names:myList)
        {
            System.out.println(names);
        }
        System.out.println("3rd name arraylist : "+myList.get(2));
        System.out.println("check mahesh is present in array list: "+myList.contains("mahesh"));
        System.out.println("Size of arraylist : "+myList.size());
        myList.remove("sai");
        System.out.println("present size of array list : "+myList.size());
    }

}
