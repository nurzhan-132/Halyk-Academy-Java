import java.util.*;
import java.util.Arrays;

public class StarsArray {
    public static void main(String[] args) {
        // filling 2D Array manually
        String[][] twod_array = {
                {"         *"},
                {"        ***"},
                {"       *****"},
                {"      *******"},
                {"     *********"},
                {"    ***********"},
                {"   *************"},
                {"  ***************"},
                {" *****************"},
                {"*******************"},
        };

        // Using nested loop to print 2D Array
        for(int i = 0; i < twod_array.length; i++) {
            for(int j = 0; j < twod_array[i].length; j++) {
                System.out.print(twod_array[i][j]);
            }
            System.out.println();
        }

        // Using deepToString(arr) method of Arrays class for printing an array
        //System.out.println(Arrays.deepToString(twod_array).replace("[[","").replace("]]","]").replace("]","\n").replace("[","").replace(", ",""));

    }
}


