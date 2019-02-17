package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {

    // region Properties
    private final int PADDING = 10;
    private final int CELL_SIZE = 30;
    private final int COLS = 21;
    private final int ROWS = 16;
    // endregion

    public void init() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                Picture tile = new Picture(columnToX(col), rowToY(row), "grassTile.png");
                tile.draw();
            }
        }
    }

    public int columnToX(int column) {
        return column * CELL_SIZE + PADDING;
    }

    public int rowToY(int row) {
        return row * CELL_SIZE + PADDING;
    }

    // region Getters
    public int getPadding() {
        return PADDING;
    }

    public int getCellSize() {
        return CELL_SIZE;
    }

    public int getWidth() {
        return COLS * CELL_SIZE;
    }

    public int getHeight() {
        return ROWS * CELL_SIZE;
    }

    public int getCols() {
        return COLS;
    }

    public int getRows() {
        return ROWS;
    }
    // endregion


}