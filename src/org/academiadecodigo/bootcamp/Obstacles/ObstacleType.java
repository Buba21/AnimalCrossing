package org.academiadecodigo.bootcamp.Obstacles;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum ObstacleType {

    public enum CarType {

        FOX,
        TRACTOR;


        private int v1;
        private int v2;


        ObstacleType(int v1 , int v2) {
            this.v1 = v1;
            this.v2 = v2;
        }


        Picture fox = new Picture(v1 , v2, "fox.jpg");
        Picture tractor = new Picture(v1, v2, "tractor.jpg");







}
