public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue ){
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }
        
        return randomArray;
    }
    
    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array ){
        System.out.print("[");
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if(i < array.length - 1)
            {
                System.out.print(", ");
            }
        }
        
        System.out.println("]");
    }
    
    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  @returns the average
     */
    public static void sumAndAverage(){
        double sum = 0;
        double average = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int element : array)
        {
            sum += element;
        }

        average = sum / array.length;
        
        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators(){
        int[] newArray = createRandomArray(15, 100);

        System.out.print("[");

        for (int i = 0; i < newArray.length - 1; i++) {
            System.out.print(newArray[i] + " | ");
        }

        System.out.print(newArray[newArray.length - 1]); System.out.println("]");
    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index (or -1 if not found)
     */
    public static void linearSearch( int valueToFind ){
        int[] newArray = createRandomArray(15, 100);

        int index = -1;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == valueToFind) {
                index = i;
                break;
            }
        }

        printArray(newArray);
        System.out.println("Index: " + index);
    }

    /*
     * Array Algorithm #4: Count Less Than
     *  creates an array filled with random numbers
     *  counts the number of elements that are less than the specified value
     *  prints the array and the count
     */
    public static void countLessThan( int limit ){
        
        int[] newArray = createRandomArray(15, 100);
        
        int count = 0;
        
        for (int element : newArray){
            if (element < limit){
                count++;
            }
        }
        
        printArray(newArray);
        
        System.out.println("Count: " + count);
        
    }

    /*
     * Array Algorithm #5: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax(){
        int[] maxArray = createRandomArray(10, 70);
        
        int max = Integer.MIN_VALUE;
        for (int j : maxArray) {
            if (j > max) {
                max = j;
            }
        }
        
        printArray(maxArray);
        
        System.out.println("Max: " + max);
    }

    /*
     * Array Algorithm #6: Reverse Array
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] reverseArray(){
        int[] newArray = createRandomArray(15, 100);
        int[] reverseArray = new int[newArray.length];

        for (int i = 0; i < newArray.length; i++) {
            reverseArray[reverseArray.length - i -1] = newArray[i];
        }

        printArray(newArray);
        printArray(reverseArray);

        return reverseArray;
    }

    public static void main(String[] args) {
        printElementSeparators();
    }

}