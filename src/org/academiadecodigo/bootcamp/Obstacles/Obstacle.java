package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.bootcamp.CollisionDetector;

abstract public class Obstacle {

    private boolean collidable;

/*
    protected CollisionDetector collisionDetector;
    protected GridDirection currentDirection;

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public GridPosition getPos() {
        return pos;
    }

*/

    public boolean isCollidable() {
        return collidable;
    }

    public void setCollidable(Boolean collidable) {
        this.collidable = collidable;
    }

    abstract public void move();





}
