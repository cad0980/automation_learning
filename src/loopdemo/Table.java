package loopdemo;

import java.util.*;

public class Table {
    public static void main(String[] args) {
        for (int table = 1; table <= 20; table++) {
            for (int i = 1; i <= 10; i++) {
                if (table==6 || table ==12 || table ==17){
                    continue;
                }
               System.out.println(table + "*" + i + " = " + (table * (i)));
            }
            System.out.println("----");


        }
        }

    }

