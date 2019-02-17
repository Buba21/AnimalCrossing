package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    // region Properties
    private final int PADDING = 10;
    private final int CELL_SIZE = 30;
    private Rectangle field;
    private final int COLS = 21;
    private final int ROWS = 16;
    // endregion

    public Grid(){
        this.field = new Rectangle(PADDING, PADDING, getWidth(), getHeight());
    }

    public void init() {
        this.field.draw();
        // TODO: Load background tiles.
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

    public Rectangle getField() {
        return field;
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
