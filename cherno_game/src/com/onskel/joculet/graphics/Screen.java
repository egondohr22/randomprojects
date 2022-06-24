package com.onskel.joculet.graphics;

import java.util.Random;

import com.onskel.joculet.level.tile.Tile;

public class Screen {
    
    public int width, height;
    public int[] pixels;
    public final int MAP_SIZE = 64;
    public final int MAP_SIZE_MASK = MAP_SIZE-1;
    public int[] tiles = new int[MAP_SIZE*MAP_SIZE];
    public int xOffset, yOffset;

    private Random random = new Random();

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];

        for(int i = 0; i < MAP_SIZE*MAP_SIZE; i++) {
            tiles[i] = random.nextInt(0xFFFFFF);
        }
    }

    public void clear() {
        for(int i = 0; i < pixels.length; i++) {
            pixels[i] = 0;
        }
    }

    public void render(int xOffset, int yOffset) {
        for (int y = 0; y < height; y++) {
            int yy = y+yOffset;
            if(yy < 0 || yy >= height) continue;
            for(int x = 0; x < width; x++) {
                int xx = x+xOffset;
                if(xx < 0 || xx >= width) continue;
                pixels[xx+yy*width] = Sprite.grass.pixels[(x&15) + (y&15)*Sprite.grass.SIZE];
            }
        }
    }

    public void renderTile(int xp, int yp, Tile tile) {
        xp -= xOffset;
        yp -= yOffset;
        for(int y = 0; y < tile.sprite.SIZE; y++) {
            int ya = y + yp;
            for(int x = 0; x < tile.sprite.SIZE; x++) {
                int xa = x + xp;
                if(xa < 0 || xa >= width || ya < 0 || ya >= width) break;
                pixels[xa + ya * width] = tile.sprite.pixels[x + y * width];
            }
        }
    }

    public void setOffset(int xOffset, int yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

}
