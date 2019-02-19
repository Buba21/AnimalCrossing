package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.bootcamp.Grid;
import org.academiadecodigo.bootcamp.GridPosition;

public class ObstacleFactory {

	public static Obstacle getNewObstacle(GridPosition pos, Grid grid) {

		int random = (int)(Math.random() * ObstacleType.values().length);
		ObstacleType obstacleType = ObstacleType.values()[random];

		Obstacle obstacle;

		switch (obstacleType) {
			case FOX:
				obstacle = new Fox(pos, grid);
				break;
			case TRACTOR:
				obstacle = new Tractor(pos, grid);
				break;
			default:
				System.out.println("something really really weird happened");
				obstacle = new Fox(pos, grid);
		}

		return obstacle;

	}

}
