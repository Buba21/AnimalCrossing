package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.bootcamp.Collidable;
import org.academiadecodigo.bootcamp.CollisionDetector;
import org.academiadecodigo.bootcamp.Grid;
import org.academiadecodigo.bootcamp.GridPosition;
import org.academiadecodigo.bootcamp.MovementMappers.Direction;

abstract public class Obstacle implements Collidable {

    private GridPosition pos;
    private Grid grid;
    private ObstacleType obstacleType;


    private Direction direction;


    public Obstacle (GridPosition pos, ObstacleType obstacleType){
        this.pos = pos;
        this.obstacleType= obstacleType;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public GridPosition getPos() {
        return pos;
    }

    public Direction chooseDirection(){
        return null;

    }







    abstract public void move();

}
