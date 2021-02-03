import java.util.Arrays;

public class ArrayMethods {
    private int[] values;

    public ArrayMethods(int[] initialValues) {
        this.values = initialValues;
    }

    public void printArray() {
        System.out.println(Arrays.toString(this.values));
    }

    public void swapFirstAndLast() {
        int first = this.values[0];
        int last = this.values[this.values.length - 1];

        this.values[0] = last;
        this.values[this.values.length - 1] = first;
    }

    public void shiftRight() {
        int[] newArray = new int[this.values.length];
        for (int i = 0; i < this.values.length; i++) {
            if (i != this.values.length - 1) {
                newArray[i + 1] = this.values[i];
            } else {
                newArray[0] = this.values[i];
            }
        }
        this.values = newArray;
    }

    public void evenToZero() {
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] % 2 == 0) {
                this.values[i] = 0;
            }
        }
    }

    public void largerOfNeighbours() {
        for (int i = 1; i < this.values.length - 1; i++) {
            int lessIndex = this.values[i - 1];
            int moreIndex = this.values[i + 1];

            this.values[i] = Math.max(lessIndex, moreIndex);
        }
    }

    public void removeMiddle() {
        if (this.values.length % 2 == 0) {
            int middle = (this.values.length / 2) - 1;

            int[] temp = new int[this.values.length - 2];

            int index = 0;
            for (int i = 0; i < this.values.length; i++) {
                if (i != middle && i != middle + 1) {
                    temp[index] = this.values[i]; index++;
                }
            }
            this.values = temp;
        } else {
            int middle = (this.values.length / 2);

            int[] temp = new int[this.values.length - 1];

            int index = 0;
            for (int i = 0; i < temp.length; i++) {
                if (i != middle) {
                    index = i;
                    temp[i] = this.values[index];
                } else {
                    index++;
                }
            }
            this.values = temp;
        }
    }

    public void evensToFront() {
        for (int i = 1; i < this.values.length; i++) {
            if (this.values[i] % 2 == 0) {
                int num = this.values[i];
                for (int j = 0; j < i; j++) {
                    this.values[i - j] = this.values[i - j - 1];
                }
                this.values[0] = num;
            }
        }

        int indexOfLastEven = -1;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] % 2 == 0) {
                indexOfLastEven = i;
            }
        }

        int[] evensSubArray = new int[indexOfLastEven + 1];
        if (indexOfLastEven >= 0) System.arraycopy(this.values, 0, evensSubArray, 0, indexOfLastEven + 1);

        int[] reverseArray = new int[evensSubArray.length];

        for (int i = 0; i < evensSubArray.length; i++) {
            reverseArray[reverseArray.length - i - 1] = evensSubArray[i];
        }

        int[] returnArray = new int[this.values.length];
        System.arraycopy(reverseArray, 0, returnArray, 0, reverseArray.length);

        if (this.values.length - (indexOfLastEven + 1) >= 0)
            System.arraycopy(this.values, indexOfLastEven + 1, returnArray, indexOfLastEven + 1, this.values.length - (indexOfLastEven + 1));

        this.values = returnArray;
    }

    public int secondLargest() {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : this.values) {
            if (value > largest) {
                largest = value;
            }
        }

        for (int value : this.values) {
            if (value > secondLargest && value < largest) {
                secondLargest = value;
            }
        }

        return secondLargest;
    }

    public boolean isSorted() {
        boolean isSorted = true;

        for (int i = 1; i < this.values.length; i++) {
            if (this.values[i] < this.values[i - 1]) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }

    public boolean hasAdjacentDuplicate() {
        boolean hasAD = false;

        for (int i = 1; i < this.values.length - 1; i++) {
            int higherValue = this.values[i - 1];
            int lowerValue = this.values[i + 1];

            if (this.values[i] == higherValue || this.values[i] == lowerValue) {
                hasAD = true;
                break;
            }
        }

        return hasAD;
    }

    public boolean hasDuplicate() {
        boolean hasD = false;

        int[] existing = new int[this.values.length];

        Arrays.fill(existing, Integer.MIN_VALUE);

        int index = 0;
        for (int value : this.values) {
            boolean add = true;
            for (int i = 0; i < existing.length; i++) {
                if (value == existing[i]) {
                    add = false;
                }
            }

            if (add) {
                existing[index] = value;
                index++;
            } else {
                hasD = true;
            }
        }

        return hasD;
    }

    public static void main(String[] args) {
        int[] testValues = new int[]{3, 5, 6, 1 /* add your own values */};
        ArrayMethods tester = new ArrayMethods(testValues);
        tester.printArray();
        tester.swapFirstAndLast();
        tester.printArray();

        testValues = new int[]{1, 6, 3, 9, 5, 6 /* add your own values */ };
        tester = new ArrayMethods(testValues);
        tester.printArray();
        tester.shiftRight();
        tester.printArray();

        tester.evenToZero();
        tester.printArray();

        testValues = new int[]{1, 6, 3, 9, 5, 6 /* add your own values */};
        tester.largerOfNeighbours();
        tester.printArray();

        testValues = new int[]{1, 6, 3, 9, 5, 6 /* add your own values */};
        tester.removeMiddle();
        tester.printArray();

        testValues = new int[]{1, 6, 3, 9, 5, 8, 10, 12 /* add your own values */};
        tester = new ArrayMethods(testValues);
        tester.evensToFront();
        tester.printArray();

        testValues = new int[]{1, 2, 3, 4, 5, 6 /* add your own values */};
        tester = new ArrayMethods(testValues);

        System.out.println(tester.hasDuplicate());



    }
}