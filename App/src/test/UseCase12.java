package test;

import java.util.ArrayList;
import java.util.List;

public class UseCase12 {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("  UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("====================================");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("\nGoods Bogies in Train:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println(g.type + " -> " + g.cargo);
        }

        boolean isSafe = true;

        for (GoodsBogie g : goodsBogies) {
            if (g.cargo.equals("Petroleum") && !g.type.equals("Cylindrical")) {
                isSafe = false;
                break;
            }
            if (g.cargo.equals("Coal") && g.type.equals("Cylindrical")) {
                isSafe = false;
                break;
            }
        }

        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}