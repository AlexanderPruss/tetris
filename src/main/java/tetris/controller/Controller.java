package tetris.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

	private static final int PIXELS_TO_MOVE = 25;
	private static final int WIDTH = 100;

	@FXML
	Canvas canvas;

	private int x = 100;
	private int y = 100;
	private int oldX = 100;
	private int oldY = 100;

	public Controller() {
		System.out.println("Creating controller.");
	}

	@FXML
	private void keyPressed(final KeyEvent event){
		switch (event.getCode()){
			case UP:
				y -= PIXELS_TO_MOVE;
				break;
			case RIGHT:
				x += PIXELS_TO_MOVE;
				break;
			case LEFT:
				x -= PIXELS_TO_MOVE;
				break;
			case DOWN:
				y += PIXELS_TO_MOVE;
				break;
		}
		redraw();
	}

	private void redraw() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.clearRect(oldX, oldY, WIDTH, WIDTH);
		gc.fillRect(x, y, WIDTH, WIDTH);
		oldX = x;
		oldY = y;
	}

	@Override
	public void initialize(final URL location, final ResourceBundle resources) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.RED);
		gc.fillRect(x, y, WIDTH, WIDTH);
	}
}
