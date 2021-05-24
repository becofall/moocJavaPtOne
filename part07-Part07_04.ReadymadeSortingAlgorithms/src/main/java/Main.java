
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        String[] arrayOfStrings = {"date", "banana", "apple", "coconut"};
        
        ArrayList<String> arrayListOfStrings = new ArrayList<>();
        arrayListOfStrings.add("panda");
        arrayListOfStrings.add("zebra");
        arrayListOfStrings.add("turkey");
        arrayListOfStrings.add("bison");
        
        ArrayList<Integer> arrayListOfInts = new ArrayList<>();
        arrayListOfInts.add(5);
        arrayListOfInts.add(99);
        arrayListOfInts.add(63);
        arrayListOfInts.add(15);
        
        sort(array);
        System.out.println(Arrays.toString(array));
        
        sort(arrayOfStrings);
        System.out.println(Arrays.toString(arrayOfStrings));
        
        sortStrings(arrayListOfStrings);
        System.out.println(arrayListOfStrings);
        
        sortIntegers(arrayListOfInts);
        System.out.println(arrayListOfInts);
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

}
