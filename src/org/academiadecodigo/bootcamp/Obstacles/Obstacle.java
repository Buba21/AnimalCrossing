package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.bootcamp.Collidable;
import org.academiadecodigo.bootcamp.CollisionDetector;

abstract public class Obstacle implements Collidable {

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

    abstract public void move();

}
