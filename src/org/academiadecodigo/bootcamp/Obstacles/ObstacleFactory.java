package org.academiadecodigo.bootcamp.Obstacles;

public class ObstacleFactory {

        /**
         * Manufactures new random cars
         *
         * @return a newly instantiated car
         */
        public static Obstacle getNewObstacle(Grid grid) {


            switch (ObstacleType) {
                case FOX:
                    fox = new Fox();
                    break;
                case TRACTOR:
                    tractor = new Tractor();
                    break;
                default:
                    car = new Fiat(grid.makeGridPosition());
            }

            return ;

        }




    }
