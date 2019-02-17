package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Tractor extends Obstacle{

    public final static int SPEED = 3;
    private boolean collidable = false;
    Picture tractor;



    public boolean isCollidable() {
        return collidable;
    }

    public void setCollidable(Boolean collidable) {
        this.collidable = collidable;
    }

    public Tractor() {
        tractor = new Picture(40,40, "tractor.png");
        tractor.draw();
    }


    @Override
    public void move() {
        //condition to grid end
        //speed Change
        tractor.translate(40,0);

    }


}
