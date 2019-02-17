package org.academiadecodigo.bootcamp.Obstacles;



public enum ObstacleType {

    FOX("fox.jpg"),
    TRACTOR("tractor.jpg");


    private int v1;
    private int v2;


    ObstacleType(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public String getSource() {
        //
    }



}
