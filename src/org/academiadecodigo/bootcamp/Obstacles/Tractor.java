package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.bootcamp.Grid;
import org.academiadecodigo.bootcamp.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Tractor extends Obstacle {

    public final static int SPEED = 3;
    Picture sprite;

    public Tractor(GridPosition pos, Grid grid) {
        super(pos, ObstacleType.TRACTOR, grid);
        this.sprite = new Picture(grid.columnToX(pos.getCol()) , grid.rowToY(pos.getRow()), "tractor.png");
        sprite.draw();
    }


    @Override
    public void move() {
        //condition to grid end
        //speed Change
        sprite.translate(40,0);

    }


}
