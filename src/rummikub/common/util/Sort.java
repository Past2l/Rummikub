package rummikub.common.util;

import rummikub.common.Tile;

import java.util.ArrayList;
import java.util.Comparator;

public class Sort {
    // TODO
    public static void number(ArrayList<Tile> tileList) {
        tileList.sort(Comparator.comparingInt(o -> o.number));
    }

    // TODO
    public static void color(ArrayList<Tile> tileList) {
        Sort.number(tileList);
        tileList.sort(Comparator.comparingInt(o -> o.color.number));
    }
}
