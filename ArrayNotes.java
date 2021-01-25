import java.util.GregorianCalendar;

/**
 * Notes for the Arrays Unit.
 * 
 * @author Vivek Ily
 * @version January 20, 2021
 */
public class ArrayNotes{

    public static void createArrayOfEvens(){
        /*

        An array is an ordered collection of elements of the same type. The type can be a primitive type or a class.

        An array variable is like an object variable in that it must be declared and initialized.

        The number in the square brackets specifies the number of elements in the array.

        All elements in the array are initialized to their default values (e.g. 0, false, null).

        This code creates an array that contains 10 int values (all i to start).
         */

        int[] evens = new int[10];

        for (int i = 0; i < evens.length; i++) {
            evens[i] = (i + 1) * 2;
        }

        System.out.println(evens);

        for (int i = 0; i < evens.length; i++) {
            System.out.println(i + ": " + evens[i]);
        }
    }

    public static void createArrayOfOdds(){
        int[] odds = new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        for (int i = 0; i <= odds.length; i++) {
            System.out.println(i + ": " + odds[i]);
        }
    }

    public static void createArrayOfCalendars() {
        /*

        Create an array of 12 calendars, each calendar initialized ot the start of each month.

        When we create an array of objects, each element is initialized to null. We have to explicitly create new objects and assign to each element.

         */

        GregorianCalendar[] calendars = new GregorianCalendar[12];

        /*

        At this point, every element in the array has a value of null.

         */

        for (GregorianCalendar calendar : calendars) {
            System.out.println(calendar);
        }
    }

    public static void main(String[] args) {
        createArrayOfEvens();
    }

}
