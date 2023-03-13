package Java;

public class Problem1{

        public static void main(String[] args) {
            int[] array1 = {8,7,9,6,5,6,6,5,6,4,6,7,8,5,4,3,2,1,4,5,6,7,8,7,8};
            int[] array2 = {2,4,5,6,7,6,7,8,9,8,7,6,7,6,5,4,3,2,3,4,5,5,5,4,5};



            //We will initiate swapping at index 7
            int index = 7;
            int temp = array1[index];
            array1[index] = array2[index];
            array2[index] = temp;


            //We will initiate swapping at index 8
            index=8;
            temp = array1[index];
            array1[index] = array2[index];
            array2[index] = temp;

            //We will initiate swapping at index 9
            index=9;
            temp = array1[index];
            array1[index] = array2[index];
            array2[index] = temp;

    
            //this piece of code will find the max values and multiply them
            int max1,max2;
            max1=findMax(array1);
            max2=findMax(array2);
            System.out.println(max1*max2);
        }

        public static int findMax(int[] array) {

            //Program for returning the maximum amount of an array
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
 }