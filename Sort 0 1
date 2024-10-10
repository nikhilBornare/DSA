/* Sort 0 1 

Input : 0 1 1 0 1 0 1 

Output : 0 0 0 1 1 1 1 */
public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	int zeroPointer = 0 ;

        for ( int i = 0 ; i < arr.length ; i ++ ){
            if ( arr [ i ] == 0 ){
                int temp = arr[zeroPointer];
                arr[zeroPointer] = arr[i];
                arr[i] = temp;
                
                zeroPointer ++;
            }
        }
    }
}
