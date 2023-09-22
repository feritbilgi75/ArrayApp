/**
 * arrayCreate
 */

import java.util.Random;


public class ArrayCreate {


    Random random = new Random();

    public int[] createArray(int size){
        int a[] = new int[size];
        for (int i = 0; i < size; i++){
            int forAdd = random.nextInt(100);
            
            a[i] = forAdd;


            
            //It creates new integer array with random numbers from 0 to 100 with given size.

        }
        return a;
    }
    
}