import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ClothingStoreApp {

    public static void main(String[] args) {
        // Cannot create instance of an interface!
//        Clothing redShirt = new Clothing();

        // Cannot create instance of an abstract class!
//        Clothing bluePants = new Pants("15");

        // Can create instance of a regular class
        Pants orangePants = new USSizePants("15", "orange");
        Clothing blueJapPants = new JapanSizePants("20", "blue");

        System.out.println(orangePants.getColor());
        System.out.println(blueJapPants.getColor());
        System.out.println(orangePants.getSize());
        System.out.println(blueJapPants.getSize());


//        AbstractMap<Integer, String> map = new HashMap<>();
//        AbstractMap<Integer, String> map2 = new ConcurrentHashMap<>();

    }

}
