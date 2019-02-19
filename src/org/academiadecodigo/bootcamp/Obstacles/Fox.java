package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.bootcamp.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fox extends Obstacle {


    public final static int SPEED = 1;
    Picture fox;

    public Fox(GridPosition pos) {
        super(pos, ObstacleType.FOX);
    }

    @Override
    public void move() {
        //condition to grid end
        //speed change
        fox.translate(-30, 0);


    }


}
