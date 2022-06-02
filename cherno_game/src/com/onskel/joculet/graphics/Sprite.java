package com.onskel.joculet.graphics;

public class Sprite {
    
    private final int SIZE;
    private int x, y;
    private SpriteSheet sheet;
    public int[] pixels;


    public Sprite(int size, int x, int y, SpriteSheet sheet) {
        SIZE = size;
        this.x = x * size;
        this.y = y * size;
        this.sheet = sheet;
    }

}
