package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fox extends Obstacle {


    public final static int SPEED = 1;
    private boolean collidable;
    Picture fox;

    public boolean isCollidable() {
        return collidable;
    }

    public void setCollidable(Boolean collidable) {
        this.collidable = collidable;
    }

    public Fox() {
        fox = new Picture(60, 60, "fox.png");
        fox.draw();
    }

    @Override
    public void move() {

        fox.translate(-30, 0);


    }


}
