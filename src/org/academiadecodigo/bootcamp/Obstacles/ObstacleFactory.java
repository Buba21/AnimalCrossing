package org.academiadecodigo.bootcamp.Obstacles;

public class ObstacleFactory {

        public static Obstacle getNewObstacle() {

            int random = (int) (Math.random() * ObstacleType.values().length);
            ObstacleType obstacleType = ObstacleType.values()[random];

            Obstacle obstacle;

            switch (obstacleType) {
                case FOX:
                    obstacle = new Fox();

                    break;
                case TRACTOR:
                    obstacle = new Tractor();
                    break;
                default:
                    System.out.println("something really really weird happened");
                    obstacle = new Fox();
            }

            return obstacle;

        }




    }
