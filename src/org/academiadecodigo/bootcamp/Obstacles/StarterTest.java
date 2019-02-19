package org.academiadecodigo.bootcamp.Obstacles;


import org.academiadecodigo.bootcamp.Grid;
import org.academiadecodigo.bootcamp.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class StarterTest {

    private Grid grid = new Grid();


    public void start() throws InterruptedException{
        grid.init();
        Obstacle obs = ObstacleFactory.getNewObstacle(new GridPosition(0,0, grid), grid);

        while (true) {


            Thread.sleep(200);
            obs.move();


        }

    }






}
