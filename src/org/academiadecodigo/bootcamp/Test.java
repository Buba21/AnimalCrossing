package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        // region Grid draw test
        Grid grid = new Grid();
        grid.init();
        // endregion

        // region Bunny sprite test
        int lastRow = grid.rowToY(grid.getRows() - 1);
        int middleCol = grid.columnToX((grid.getCols() / 2));

        Picture bunny = new Picture(middleCol, lastRow, "Bunny/BunnyUp.png");
        bunny.draw();
        Thread.sleep(1000);
        bunny.delete();

        bunny = new Picture(middleCol, lastRow, "Bunny/BunnyJumpUp.png");
        bunny.draw();
        Thread.sleep(1000);
        bunny.delete();

        bunny = new Picture(middleCol, lastRow, "Bunny/BunnyUp.png");
        bunny.draw();
        Thread.sleep(1000);
        bunny.delete();

        bunny = new Picture(middleCol, lastRow, "Bunny/BunnyJumpRight.png");
        bunny.draw();
        Thread.sleep(1000);
        bunny.delete();

        bunny = new Picture(middleCol, lastRow, "Bunny/BunnyRight.png");
        bunny.draw();
        Thread.sleep(1000);
        bunny.delete();

        bunny = new Picture(middleCol, lastRow, "Bunny/BunnyJumpDown.png");
        bunny.draw();
        Thread.sleep(1000);
        bunny.delete();

        bunny = new Picture(middleCol, lastRow, "Bunny/BunnyDown.png");
        bunny.draw();
        Thread.sleep(1000);
        bunny.delete();

        bunny = new Picture(middleCol, lastRow, "Bunny/BunnyJumpRight.png");
        bunny.grow(-30, 0); // flips the picture to the right
        bunny.draw();
        Thread.sleep(1000);
        bunny.delete();

        bunny = new Picture(middleCol, lastRow, "Bunny/BunnyRight.png");
        bunny.grow(-30, 0);
        bunny.draw();
        Thread.sleep(1000);
        // endregion

    }
}
