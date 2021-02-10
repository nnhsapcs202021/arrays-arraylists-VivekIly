import java.util.ArrayList;

/**
 * Write a description of class ArrayListOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListOperations{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);

        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");

        System.out.println(names);

        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));

        System.out.println("Size: " + names.size());

        names.set(0, "Alice B. Toklas");
        System.out.println(names);

        names.add(4, "Doubg");
        System.out.println(names);

        for (String s : names) {
            System.out.println(s);
        }

        ArrayList<String> names2 = new ArrayList<String>(names);
        
        System.out.println(names2);

        names.remove(0);

        System.out.println(names);
        System.out.println(names2);
    }
}
