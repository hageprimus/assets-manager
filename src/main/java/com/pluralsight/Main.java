package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Asset> myAssets = new ArrayList<>();
        myAssets.add(new House("Main home", "2017-04-01", new BigDecimal(60000),
                                "475 Miller Avenue", 2, 200, 300));
        myAssets.add(new House("Vacation home", "2025-02-17", new BigDecimal(120000),
                "1 Southampton St", 1, 300, 350));
        myAssets.add(new Vehicle("Main vehicle", "2015-06-20", new BigDecimal(45000),
                "Toyota Camry", 2015, 75000));
        myAssets.add(new Vehicle("Side vehicle", "2021-05-20", new BigDecimal(60000),
                "Chevrolet Bolt", 2021, 25000));

        for (Asset a : myAssets) {
            System.out.println(a.toString());
            if (a instanceof Vehicle) {
                System.out.println(((Vehicle) a).getYear() + ", " + ((Vehicle) a).getMakeModel());
            } else if (a instanceof House) {
                System.out.println(((House) a).getAddress());
            }
        }
    }
}
