package org.academiadecodigo.bootcamp.Obstacles;

public class ObstacleFactory {

        public static Obstacle getNewObstacle(Grid grid) {


            switch (ObstacleType) {
                case FOX:
                    fox = new Fox();
                    break;
                case TRACTOR:
                    tractor = new Tractor();
                    break;
                default:
            }

            return ;

        }




    }
