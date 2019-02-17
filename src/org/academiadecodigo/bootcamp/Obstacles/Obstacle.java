package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.bootcamp.CollisionDetector;

abstract public class Obstacle {
/*
    private GridPosition pos;
    private Grid grid;
    private ObstacleType obstacleType;
    private bollean collidable;


    protected CollisionDetector collisionDetector;
    protected GridDirection currentDirection;


    public Obstacle(GridPosition pos, ObstacleType obstacleType) {

        this.pos = pos;
        this.obstacleType = obstacleType;

        pos.setColor(carType.getColor());
        currentDirection = GridDirection.values()[(int) (Math.random() * GridDirection.values().length)];

    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public GridPosition getPos() {
        return pos;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }


    public boolean isCollidable() {
        return collidable;
    }

    public void setCollidable() {

    }
*/
    abstract public void move();





}
