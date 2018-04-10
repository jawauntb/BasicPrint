// =============================================================================
/**
 * Print a variety of basic 2D patterns to the console.
 *
 * @author Jawaun Brown
 */

public class PrintPattern {
    // =============================================================================
    
    
    
    // =========================================================================
    // CONSTANTS
    
    /** The character to use in printing the boundaries of each pattern. */
    final public static char mark = '+';
    
    /** The character to use in printing the spaces within each pattern. */
    final public static char space = ' ';
    
    /** The character to use in printing the trunk within the tree pattern. */
    final public static char trunk = '|';
    // =========================================================================
    
    
    
    // =========================================================================
    /**
     * The program's entry point.
     *
     * @param args The command-line arguments provided by the user.
     */
    public static void main (String[] args) {
        
        // If an incorrect number of arguments was provided on the command-line,
        // then print the correct usage and exit.
        if (args.length != 2) {
            showUsageAndExit();
        }
        
        // Grab the arguments.
        String shape = args[0];
        int size = 0;
        try {
            size = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            showUsageAndExit();
        }
        
        // Call the appropriate method for the requested pattern.
        if (shape.equals("square")) {
            printSquare(size);
        } else if (shape.equals("triangle")) {
            printTriangle(size);
        } else if (shape.equals("tree")) {
            printTree(size);
        } else if (shape.equals("serpinksi")) {
            printSierpinkski(size);
        } else {
            showUsageAndExit();
        }
        
    } // main()
    // =========================================================================
    
    
    
    // =========================================================================
    /**
     * Print the correct form for running this program and exit with an error
     * code.
     */
    public static void showUsageAndExit () {
        
        System.err.println("USAGE: java PrintPattern " +
                           "<shape [square|triangle|tree|sierpinkski]> <size>");
        System.exit(1);
        
    } // showUsageAndExit()
    // =========================================================================
    
    
    
    // =========================================================================
    /**
     * Print an empty square with <code>size</code> characters to each side.
     *
     * @param size The size of a the square on each size (as a number of
     *             characters).
     */
    public static void printSquare (int size) {
        
        for (int i = 0; i < size; i += 1) {
            System.out.print(mark);
        }
        System.out.println();
        for (int i = 0; i < size - 2; i += 1) {
            System.out.print(mark);
            for (int j = 0; j < size - 2; j += 1) {
                System.out.print(space);
            }
            System.out.println(mark);
        }
        for (int i = 0; i < size; i += 1) {
            System.out.print(mark);
        }
        System.out.println();
        
    } // printSquare()
    // =========================================================================
    
    
    
    // =========================================================================
    /**
     * Print an empty isosceles triangle with <code>size</code> characters for
     * the base and height.
     *
     * @param size The size of the base and height of the triangle (as a number
     *             of characters).
     */
    public static void printTriangle (int size) {
        
        System.out.println(mark);
        for(int i=0; i<size-2; i++){
            System.out.println(mark);
            for(int j=0; j<i; j++){
                System.out.print(space);
            }
            System.out.println(mark);
        }
        for(int i=0; i<size; i++)
            System.out.print(mark);
        
    } // printTriangle ()
    // =========================================================================
    
    
    
    // =========================================================================
    /**
     * Print a tree with <code>size</code> rows (plus a trunk).
     *
     * @param size The number of rows of the tree.
     */
    public static void printTree (int size) {
        
        for(int i=0;i< size-1;i++){
            for(int j=0;j< (((2*size)-3)/2);j++){
                System.out.print(space);
            }
            for(int k=0; k< ((2 * i) +1); k++){
                System.out.print(mark);
            }
            System.out.println();
        }
        for(int i=0; i<(((2*size)-3)/2)); i++){
            System.out.print(space);
        }
        System.out.println(trunk);
    } // printTree ()
    // =========================================================================
    
    
    
    // =========================================================================
    public static void printChars (char c, int reps) {
        
        for (int j = 0; j < reps; j += 1) {
            System.out.print(c);
        }
        
    }
    // =========================================================================
    
    // =============================================================================
} // class PrintPattern
// =============================================================================
