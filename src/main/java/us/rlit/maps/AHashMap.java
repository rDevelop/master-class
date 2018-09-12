package us.rlit.maps;

import java.util.HashMap;

import static us.rlit.ConsoleColors.ANSI_RED;
import static us.rlit.ConsoleColors.ANSI_RESET;

public class AHashMap {

    public static void main(String[] args) {

//        String key = "One";
//        Integer h = key.hashCode();
//        System.out.println("h1 " + Integer.toBinaryString(h) + " " + h);
//        Integer shifted = h >>> 16;
//        System.out.println("h2 " + Integer.toBinaryString(shifted) + " " + shifted);
//        Integer hashed = h ^ h >>> 16;
//        System.out.println("h3 " + Integer.toBinaryString(hashed) + " "  + hashed);
//
//        //return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
//        System.out.println(hash(key));

        HashMap<Integer,String> map = new HashMap();
        size(map);
//        map.put(4_000_000.000, 52.00);
//        //map.put("One", "Two");
//
//        map.put(55_000_000_000.21, 43.555);
//        map.put(55_000_000_000.21, 43.5551);
        for(int i=0; i<12; i++) {
            map.put(i, "rob");


        }
        map.put(13, "last");
        map.put(14, "newLast");
        size(map);
        //map.put("Two", "One");

    }


    public static void size(HashMap map) {
        System.out.println(ANSI_RED+map.size()+ANSI_RESET);


    }

    static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}


/*
XOR ^

h1 1010010101011001010100101010
h2                 101001010101
h3 1010010101011001111101111111
 */