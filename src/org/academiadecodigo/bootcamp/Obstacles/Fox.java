package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.bootcamp.Grid;
import org.academiadecodigo.bootcamp.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fox extends Obstacle {


    public final static int SPEED = 1;
    Picture sprite;

    public Fox(GridPosition pos, Grid grid) {
        super(pos, ObstacleType.FOX, grid);
        this.sprite = new Picture(grid.columnToX(pos.getCol()) , grid.rowToY(pos.getRow()), "fox.png");
        sprite.draw();
    }

    @Override
    public void move() {
        //condition to grid end
        //speed change
        sprite.translate(-30, 0);


    }


}
