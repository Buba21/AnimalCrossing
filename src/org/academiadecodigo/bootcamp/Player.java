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
        pictureClicked = new Picture(0,0,"");
        pictureReleased= new Picture(0,0,"");
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

    public void moveRight() {
        picture.translate(30, 0);
    }

    public void moveLeft() {
        picture.translate(-30, 0);
    }

    public void moveUp() {
        picture.translate(0, -30);
    }

    public void moveDown() {
        picture.translate(0, 30);
    }


    @Override
    public void keyPressed(KeyboardEvent position) {
        if (position.getKey() == KeyboardEvent.KEY_RIGHT) {
            moveRight();
        } else if (position.getKey() == KeyboardEvent.KEY_LEFT) {
            moveLeft();
        } else if (position.getKey() == KeyboardEvent.KEY_UP) {
            moveUp();
        } else if (position.getKey() == KeyboardEvent.KEY_DOWN) {
            moveDown();
        }


    }


}
