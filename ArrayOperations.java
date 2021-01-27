
/**
 * Write a description of class ArrayOperations here.
 *
 * @author Vivek Ily
 * @version Jan 27, 2021
 */
public class ArrayOperations
{
    public static void main(String[] args) {
        Double[] x = new Double[]{8.0, 4.0, 5.0, 21.0, 7.0, 9.0, 18.0, 2.0, 100.0};
        
        System.out.print("Length: " + x.length); System.out.println();
        System.out.print("First element: " + x[0]); System.out.println();
        System.out.print("Last element: " + x[x.length - 1]); System.out.println();
        
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.print("" + i + " ");
            System.out.print(x[i]);
        }
        System.out.println();
        double[] reverseArray = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            reverseArray[reverseArray.length - i -1] = x[i];
        }
        
        for (int i = 0; i < x.length; i++) {
            System.out.print("" + i);
            System.out.print(x[i]);
        }
        System.out.println();
        for (double element : x) {
            System.out.print(element);
        }
    }
}
