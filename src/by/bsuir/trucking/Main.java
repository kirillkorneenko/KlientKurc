package by.bsuir.trucking;

import by.bsuir.trucking.window.StartWindow;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        StartWindow startWindow = new StartWindow();
        startWindow.setVisible(true);
        startWindow.setLocationRelativeTo(null);
    }

    public static final int PORT = 9000;

}

