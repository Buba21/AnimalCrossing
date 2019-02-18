package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player implements KeyboardHandler {

    private Keyboard kb;
    private Picture pictureClicked;
    private Picture pictureReleased;

    public Player() {
        //pictureClicked = new Picture(10,10,"Bunny/BunnyUp.png");
        //pictureReleased = new Picture(0,0,"");
        kb = new Keyboard(this);


        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(rightPressed);

        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(leftPressed);

        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(upPressed);

        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(downPressed);

    }
    public void bunnyInit(){
        pictureClicked = new Picture(10,10,"Bunny/BunnyUp.png");
        pictureClicked.draw();

    }

    public void moveRight() {
        pictureClicked.translate(30, 0);
    }

    public void moveLeft() {
        pictureClicked.translate(-30, 0);
    }

    public void moveUp() {
        pictureClicked.translate(0, -30);
    }

    public void moveDown() {
        pictureClicked.translate(0, 30);
    }


    @Override
    public void keyPressed(KeyboardEvent event) {
        if (event.getKey() == KeyboardEvent.KEY_RIGHT) {
            moveRight();
        } else if (event.getKey() == KeyboardEvent.KEY_LEFT) {
            moveLeft();
        } else if (event.getKey() == KeyboardEvent.KEY_UP) {
            moveUp();
        } else if (event.getKey() == KeyboardEvent.KEY_DOWN) {
            moveDown();
        }


    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
