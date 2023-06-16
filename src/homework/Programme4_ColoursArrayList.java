package homework;

import java.util.ArrayList;

/**
 * Created by Trupal limbani
 */
/*
Write a java program to create a new array list add some colours (string)
and printout the collection using for each loop
 */
public class Programme4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("GREEN");
        colorList.add("YELLOW");
        colorList.add("BLACK");
        colorList.add("WHITE");
        colorList.add("ORANGE");
        colorList.add("PURPLE");
        colorList.add("CYAN");

        for (String colourList : colorList) {
            System.out.print(colourList + ", ");
        }

    }
}
