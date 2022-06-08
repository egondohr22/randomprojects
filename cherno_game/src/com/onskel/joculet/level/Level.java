package com.onskel.joculet.level;

import com.onskel.joculet.graphics.Screen;

public class Level {
    
    private int width, height;
    private int[] tiles;

    public Level(int width, int height) {
        this.width = width;
        this.height =height;
        tiles = new int[width*height];
        generateLevel();
    }

    public Level(String path) {
        loadLevel(path);
    }

    private void generateLevel() {

    }

    private void loadLevel(String path) {

    }

    private void time() {
        
    }

    public void update() {

    }
    public void render(int xScroll, int yScroll, Screen screen) {

    }
}
