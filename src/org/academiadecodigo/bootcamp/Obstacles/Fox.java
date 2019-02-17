package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fox extends Obstacle {


    public final static int SPEED = 1;
    Picture fox;

    /*   public Fox(GridPosition pos) {
           super(pos, Obstacle.FOX);
       }
*/
    public Fox() {
        fox = new Picture(60, 60, "fox.png");
        fox.draw();
    }

    @Override
    public void move() {


    }


}
