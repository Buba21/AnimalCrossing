package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {

    // region Properties
    private final int PADDING = 10;
    private final int CELL_SIZE = 30;
    private int cols = 21;
    private int rows = 16;
    // endregion

    public void init() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Picture tile = new Picture(columnToX(col), rowToY(row), "GrassTile.png");
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
        return cols * CELL_SIZE;
    }

    public int getHeight() {
        return rows * CELL_SIZE;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }
    // endregion

}