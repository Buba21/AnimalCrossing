package org.academiadecodigo.bootcamp.Obstacles;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class StarterTest {

    Rectangle rectangle = new Rectangle(10,10,600,480);






    public void start() throws InterruptedException{
        rectangle.draw();
        Obstacle obs = ObstacleFactory.getNewObstacle();

        while (true) {


            Thread.sleep(200);
            obs.move();


        }

    }






}
