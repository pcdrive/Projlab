package gui.sokoban;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MySokoban extends Frame {
    MyNewgameButton newGameButton;
    MyLoadGameButton loadGameButton;
    MyExitgameButton exitgameButton;

    final int FRAME_WIDTH = 600, FRAME_HEIGHT = 600;
    final int HEIGHT = 100, WIDTH = 400, H_SPACE = 20, V_SPACE = 100;

    MySokoban(String frameText ){
        super(frameText);

        newGameButton = new MyNewgameButton(V_SPACE, H_SPACE, WIDTH, HEIGHT,"New Game", this);
        loadGameButton = new MyLoadGameButton(V_SPACE, H_SPACE*2+HEIGHT, WIDTH, HEIGHT,"New Game", this);
        exitgameButton = new MyExitgameButton(V_SPACE, H_SPACE*3+HEIGHT*2, WIDTH, HEIGHT,"New Game", this);

        setLayout(null);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
    }

    public static void main(String[] args) {
	// write your code here
        new MySokoban("Sokoban of team Megegyezesalatt");
    }
}

public class MyNewgameButton extends Button implements ActionListener {
    MySokoban s;
    MyNewgameButton(int x, int y, int width, int height, String text, MySokoban sokoban){
        super(text);
        setBounds(x,y,width,height);
        this.s = sokoban;
        this.s.add(this);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO : start a new game
    }
}

public class MyLoadGameButton extends Button implements ActionListener {
    MySokoban s;
    MyLoadGameButton(int x, int y, int width, int height, String text, MySokoban sokoban){
        super(text);
        setBounds(x,y,width,height);
        this.s = sokoban;
        this.s.add(this);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO : load from file
    }
}

public class MyExitgameButton extends Button implements ActionListener{
    MySokoban s;

    MyExitgameButton(int x, int y, int width, int height, String text, MySokoban sokoban){
        super(text);
        setBounds(x,y,width,height);
        this.s = sokoban;
        this.s.add(this);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }



}