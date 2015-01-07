/* Euler15.java
   Works super fast up until about an 18x18 grid. Can memoize
   to make faster
   Many hours on the white board required to solve this one.
   Author: Danny Grant
*/

public class Euler15 {
    
    public static long extra(int dim1, int dim2){
        if (dim2 == 1 )
            return dim1 + 1;
        else if (dim1 - dim2 == 1)
            return numCombinations(dim1 -1) + extra(dim1, dim2 -1);
        else return extra(dim1, dim2 -1) + extra(dim1 - 1, dim2);
        
    }

    public static long numCombinations(int sqrDimension){
        if (sqrDimension == 1)
            return 2;
        else
            return (2 * extra(sqrDimension, sqrDimension - 1));
    }
    
    public static void main(String[] args) {
        System.out.println(numCombinations(20));
    }
}
