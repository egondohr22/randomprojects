package com.onskel.joculet.graphics;

import java.awt.image.BufferedImage;
import java.io.Console;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
    
    private String path = "res/textures/spritesheet.png";
    public final int SIZE;
    public int[] pixels;

    public static SpriteSheet tiles = new SpriteSheet("res/textures/spritesheet.png", 16);

    public SpriteSheet(String path, int size) {
        this.path = path;
        SIZE = size;
        pixels = new int[SIZE*SIZE];
        load();
    }

    private void load() {
        try {
            BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
