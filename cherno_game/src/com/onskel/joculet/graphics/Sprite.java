package com.onskel.joculet.graphics;

import javax.print.attribute.standard.Sides;

public class Sprite {
    
    private final int SIZE;
    private int x, y;
    private SpriteSheet sheet;
    public int[] pixels;


    public Sprite(int size, int x, int y, SpriteSheet sheet) {
        SIZE = size;
        pixels = new int[SIZE*SIZE];
        this.x = x * size;
        this.y = y * size;
        this.sheet = sheet;
        load();
    }

    private void load() {
        for(int y = 0; y < SIZE; y++) {
            for(int x = 0; x < SIZE; x++) {
                pixels[x+y*SIZE] = sheet.pixels[x+this.x + (y + this.y)*sheet.SIZE];
            }
        }
    }

}
