package homework;

import java.util.Arrays;

/**
 * created by Trupal limbani
 */
/*
Write a java Programe to reverse an array of interger values
 */
public class Programme3_ReverseArray {
    public static void main(String[] args) {
        int[]array=new int[]{23,45,34,54,67,78};//single dimension array
        System.out.println("Original array:"+Arrays.toString(array));
        Programme3_ReverseArray obj=new Programme3_ReverseArray();
        System.out.print("Reverse array :");
        obj.reverseAnArray(array);
    }
    //method to reverse an array
    public void reverseAnArray(int[]list){
        for (int i=0; i<(list.length)/2;i++){
            int temp=list[i];
            list[i]=list[list.length-1 -i];
            list[list.length-1 -i]=temp;
        }
        System.out.println(Arrays.toString(list));
    }
}
