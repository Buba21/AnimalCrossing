package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fox extends Obstacle {


    public final static int SPEED = 1;
    Picture fox;

    public Fox() {
        fox = new Picture(560, 60, "fox.png");
        fox.draw();
    }

    @Override
    public void move() {
        //condition to grid end
        //speed change
        fox.translate(-30, 0);


    }


}
