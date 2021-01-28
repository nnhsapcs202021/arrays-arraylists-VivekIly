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

            if (lessIndex > moreIndex) {
                this.values[i] = lessIndex;
            } else {
                this.values[i] = moreIndex;
            }
        }
    }

    public void removeMiddle() {
        if (this.values.length % 2 == 0) {
            int middle = (this.values.length / 2) - 1;

            int[] temp = new int[this.values.length - 2];

            for (int i = 0; i < temp.length; i++) {
                int index = 0;
                if (i != middle || i != middle + 1) {
                    index = i;
                    temp[i] = this.values[index];
                } else {
                    index++;
                }
            }
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
        }
    }

    public static void main(String[] args) {
        int[] testValues = new int[]{3, 5, 6, 1 /* add your own values */};
        ArrayMethods tester = new ArrayMethods(testValues);
        tester.printArray();
        tester.swapFirstAndLast();
        tester.printArray();

        testValues = new int[]{1, 6, 3, 9, 5, 6 /* add your own values */};
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


    }
}