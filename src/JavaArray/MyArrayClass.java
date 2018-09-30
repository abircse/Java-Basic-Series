package JavaArray;

import java.util.Arrays;

public class MyArrayClass {

    /*
    * Point 1: Array is a container where same type data can store
    * Point 2: To write array must need to use datatype then use [] sign then array name
    * Point 3: We can define array size also like this datatype[] myarray = new datatype[50];
    * Point 4: Every array represent in index no, to call array value or data we need to call index
    * Point 5: Index is also called identifier to identify called data
    * Point 6: Array first value index no is 0
    * Point 7: We can print our array data by call index but if we have more & more data
    *          we have to follow below string array concept
    * Point 8: Array are 2 type: one is one diemtional & Another is two dimentional
     * */

    public static void main(String[] args)
    {

        ////------we have a array which size is 5 & we can put value in this size array like below---//
        int[] myarray = new int[5];
        myarray[0] = 10;
        myarray[1] = 20;
        myarray[2] = 30;
        myarray[3] = 40;
        myarray[4] = 50;

        ///----if we want specific object data---we can do here we call 4 index ----//
        System.out.println(myarray[4]);

        ///-----String array example-----//


        ///-----this is a string array contain more data, now print it dynamically if add or remove data by user no need to do assign or call direct index no to print---//
        String[] name = {"Abir","Ramim","Saiful","Bappy","Shanta","Imran","Asrafa","Nasrin"};

        for (int a = 0; a < name.length; a++)
        {
            System.out.println(name[a]);
        }

        ////----java give us to print array by default which result will be show full array----//
        System.out.println(Arrays.toString(name));


        ////------------Two Dimentional Array------------//

        int[][] numbers = {
                             {1,2,3},
                             {4,5,6},
                             {7,8,9}
                          };


        ///-First loop count per per internal data e.g: {1,2,3} or {4,5,6} & second loop help to enter this per internal data value e.g: in {1,2,3} it enter to count 1,2,3---//

        for (int l = 0; l < numbers.length; l++)
        {
            for (int i = 0 ; i < numbers[l].length; i++)
            {
                System.out.println("My 2d arrays numbers is "+ numbers[l][i]);
            }
        }

////----java give us to print 2Darray by default which result will be show full 2darray----//
        System.out.println(Arrays.deepToString(numbers));
    }

}
