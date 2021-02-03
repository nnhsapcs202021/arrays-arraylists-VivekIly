// Implements a 2-D array of characters

public class CharMatrix
{
    // Instance variables:
    char[][]  charMatrix;

    // Constructor: creates a grid with dimensions rows, cols,
    // and fills it with spaces
    public CharMatrix(int rows, int cols)
    {
        this.charMatrix = new char[rows][cols];

        for (char[] i : charMatrix) 
        {
            for (int j = 0; j < i.length; j++)
            {
                i[j] = ' ';
            }

        }
    }

    // Constructor: creates a grid with dimensions rows , cols ,
    // and fills it with the fill  character
    public CharMatrix(int rows, int cols, char fill)
    {
        this.charMatrix = new char[rows][cols];

        for (char[] i : charMatrix) 
        {
            for (int j = 0; j < i.length; j++)
            {
                i[j] = fill;
            }

        }
    }

    // Returns the number of rows in grid
    public int numRows()
    {
        return this.charMatrix.length;
    }

    // Returns the number of columns in grid
    public int numCols()
    {
        return this.charMatrix[0].length;
    }

    // Returns the character at row, col location
    public char charAt(int row, int col)
    {
        return this.charMatrix[row][col];
    }

    // Sets the character at row, col location to ch
    public void setCharAt(int row, int col, char ch)
    {
        this.charMatrix[row][col] = ch;
    }

    // Returns true if the character at row, col is a space,
    // false otherwise
    public boolean isEmpty(int row, int col)
    {
        return this.charMatrix[row][col] == ' ';
    }

    // Fills the given rectangle with fill  characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void fillRect(int row0, int col0, int row1, int col1, char fill)
    {
        for (int row = row0; row <= row1; row++)
        {
            for (int col = col0; col <= col1; col++)
            {
                this.charMatrix[row][col] = fill;
            }
        }
    }

    // Fills the given rectangle with SPACE characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void clearRect(int row0, int col0, int row1, int col1)
    {
        for (int row = row0; row <= row1; row++)
        {
            for (int col = col0; col <= col1; col++)
            {
                this.charMatrix[row][col] = ' ';
            }
        }
    }

    // Returns the count of all non-space characters in row 
    public int countInRow(int row)
    {
        int count = 0;
        
        for (int i = 0; i < this.charMatrix[row].length; i++)
        {
            if (this.charMatrix[row][i] != ' ')
            {
                count++;
            }
        }
        return count;
    }

    // Returns the count of all non-space characters in col 
    public int countInCol(int col)
    {
        int count = 0;
        
        for (int i = 0; i < this.charMatrix.length; i++)
        {
            if (this.charMatrix[i][col] != ' ')
            {
                count++;
            }
        }
        return count;
    }
}
