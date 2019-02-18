package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.MovementMappers.Direction;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GridPosition {

    //region Properties
    private int col;
    private int row;
    private Picture picture;
    private Grid grid;
    //endregion

    //region Constructor
    public GridPosition(int col, int row, Grid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
        this.picture = picture;
    }
    //endregion

    //region Movement Methods
    public void moveUp() {
        if (row <= 0) {
            row = 0;
        } else {
            row--;
        }
    }

    /* no need , porque os obstaculos só andam para os lados
    public void moveUp(int speed) {
        int maxRowsUp = speed < getRow() ? speed : getRow();
        setPos(getCol(), getRow() - maxRowsUp);
    }*/

    public void moveDown() {
        if (row >= getRow()) {
            row = getRow();
        } else {
            row++;
        }
    }

   /* no need , porque os obstaculos só andam para os lados
   public void moveDown(int speed) {
        int maxRowsDown = this.row > getGrid().getRows() - (getRow() + 1) ? getGrid().getRows() - (getRow() + 1) : speed;
        setPos(getCol(), getRow() + maxRowsDown);
    }*/

    public void moveLeft() {
        if (col <= 0) {
            col = 0;
        } else {
            col--;
        }
    }

    public void moveLeft(int speed) {
        int maxRowsLeft = speed < getCol() ? speed : getCol();
        setPos(getCol() - maxRowsLeft, getRow());
    }

    public void moveRight() {
        if (col >= getCol()) {
            col = getCol();
        } else {
            col++;
        }
    }

    public void moveRight(int speed) {
        int maxRowsRight = speed > getGrid().getCols() - (getCol() + 1) ? getGrid().getCols() - (getCol() + 1) : speed;
        setPos(getCol() + maxRowsRight, getRow());
    }

    public void moveInDirectionPlayer(Direction direction) {
        switch (direction) {
            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;
        }
    }

    //falta diferenciar posiçao logica e grafica

    /*
    Comparaçao da posiçao logica e gráfica

        double initialX = picture.getX();
        double initialY = picture.getY();
        super.moveInDirection(direction);
        double finalX = simpleGfxGrid.columnToX(getCol());
        double finalY = simpleGfxGrid.rowToY(getRow());
        picture.translate(finalX-initialX, finalY-initialY);

        */

    public void moveInDirectionObstacles(Direction direction, int speed) {

        switch (direction) {
/*            no need porque so andam para os lados
            case UP:
                moveUp(speed);
                break;
            case DOWN:
                moveDown(speed);
                break;*/
            case LEFT:
                moveLeft(speed);
                break;
            case RIGHT:
                moveRight(speed);
                break;
        }
    }
    //endregion

    public void show() {
        picture.draw();
    }

    public void stop() {
        //podiamos mudar para outra imagem e fazer novamente um draw
        picture.delete();
    }

    //region Getters
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Grid getGrid() {
        return grid;
    }

    public Picture getPicture() {
        return picture;
    }

    //endregion
//region Setters
    public void setPicture(Picture picture) {
        this.picture = picture;
        show();
    }

    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
        show();
    }
//endregion

    public boolean equals(GridPosition pos) {
        if (this.col == pos.getCol() && this.row == pos.getRow()) {
            return true;
        }
        return false;
    }


}
