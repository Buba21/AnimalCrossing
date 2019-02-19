package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Obstacles.Obstacle;
import org.academiadecodigo.bootcamp.Obstacles.ObstacleFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Lane {

    private Grid grid;
    private int row;
    private Obstacle[] obstacles;
    private final int MIN_FREE_CELLS = 3;

    public Lane(Grid grid, int row) {

        this.grid = grid;
        this.row = row;

        int randomNumObs = 3 /*+ (int) (Math.random() * (grid.getCols() - MIN_FREE_CELLS))*/;
        obstacles = new Obstacle[randomNumObs];

    }

    public void generateCollidable() throws InterruptedException {
        int currentCol = grid.getCols() - 1;
        Obstacle obstacleChosen = ObstacleFactory.getNewObstacle(new GridPosition(currentCol, row, grid), grid);

        for (int i = 0; i < obstacles.length; i++) {
            if (obstacles[i] == null) {
                obstacles[i] = obstacleChosen;
                System.out.println(i);
            }

/*            while (true) {
                Thread.sleep(200);
                obstacles[i].move();
            }*/
        }

    }

    public void generateRideable() {

    }

}
