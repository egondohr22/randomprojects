package com.onskel.joculet.level.tile;

import com.onskel.joculet.graphics.Screen;
import com.onskel.joculet.graphics.Sprite;

public class VoidTile extends Tile {

    public VoidTile(Sprite sprite) {
        super(sprite);

    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x, y, this);
    }
}
