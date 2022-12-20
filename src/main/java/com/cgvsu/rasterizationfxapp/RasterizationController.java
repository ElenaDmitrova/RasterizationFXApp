package com.cgvsu.rasterizationfxapp;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;

import com.cgvsu.rasterization.*;
import javafx.scene.paint.Color;

import static java.lang.Math.PI;

public class RasterizationController {

    @FXML
    AnchorPane anchorPane;
    @FXML
    private Canvas canvas;

    @FXML
    private void initialize() {
        anchorPane.prefWidthProperty().addListener((ov, oldValue, newValue) -> canvas.setWidth(newValue.doubleValue()));
        anchorPane.prefHeightProperty().addListener((ov, oldValue, newValue) -> canvas.setHeight(newValue.doubleValue()));

        Rasterization.draw(
                canvas.getGraphicsContext2D(), 300, 300, 200, 0, (float) Math.PI, Color.RED, Color.BLUE);
        Rasterization.draw(
                canvas.getGraphicsContext2D(), 500, 500, 100, (float) Math.PI , 3 * (float) Math.PI / 2, Color.BLACK, Color.BLUE);
        Rasterization.draw(
                canvas.getGraphicsContext2D(), 600, 300, 150, (float) Math.PI / 4, 3 * (float) Math.PI / 4, Color.AQUA, Color.CHOCOLATE);
    }
}

