package com.longerdude.taskmanagerandcalculator;

import com.longerdude.taskmanagerandcalculator.TaskManager.Task;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaskUI extends Application {
    @Override
    public void start(Stage window){
        // main layout
        BorderPane layout = new BorderPane();
        // Scene setter buttons
        Button tasksButton = new Button("Task Manager");
        Button calculationButton = new Button("Calculator");
        HBox hBox = new HBox();
        hBox.getChildren().addAll(tasksButton,calculationButton);

        // central Layout
        BorderPane centralLayout = new BorderPane();
        VBox taskManagerButtons = new VBox();
        Button addTaskButton = new Button("Add Task");
        TextField taskName = new TextField("Task Name");
        TextArea taskDescription = new TextArea("Task Description");
        taskManagerButtons.getChildren().addAll(addTaskButton,taskName,taskDescription);
        centralLayout.setTop(taskManagerButtons);


        TreeTableView<Task> treeTableView = new TreeTableView<Task>();
        TreeTableColumn<Task, String> treeTableColumn1 = new TreeTableColumn<>("Tasks");
        TreeTableColumn<Task, String> treeTableColumn2 = new TreeTableColumn<>("Description");

        treeTableColumn1.setCellValueFactory(new TreeItemPropertyValueFactory<>("brand"));
        treeTableColumn2.setCellValueFactory(new TreeItemPropertyValueFactory<>("model"));


        treeTableView.getColumns().add(treeTableColumn1);
        treeTableView.getColumns().add(treeTableColumn2);
        TreeItem mercedes1 = new TreeItem(new Task("Mercedes", "SL500"));
        TreeItem mercedes2 = new TreeItem(new Task("Mercedes", "SL500 AMG"));
        TreeItem mercedes3 = new TreeItem(new Task("Mercedes", "CLA 200"));

        TreeItem mercedes = new TreeItem(new Task("Mercedes", "..."));
        mercedes.getChildren().add(mercedes1);
        mercedes.getChildren().add(mercedes2);

        TreeItem audi1 = new TreeItem(new Task("Audi", "A1"));
        TreeItem audi2 = new TreeItem(new Task("Audi", "A5"));
        TreeItem audi3 = new TreeItem(new Task("Audi", "A7"));

        TreeItem audi = new TreeItem(new Task("Audi", "..."));
        audi.getChildren().add(audi1);
        audi.getChildren().add(audi2);
        audi.getChildren().add(audi3);

        TreeItem cars = new TreeItem(new Task("Cars", "..."));
        cars.getChildren().add(audi);
        cars.getChildren().add(mercedes);

        treeTableView.setRoot(cars);

        centralLayout.setCenter(treeTableView);






        layout.setTop(hBox);
        layout.setCenter(centralLayout);
        tasksButton.setOnAction(event -> {});
        calculationButton.setOnAction(event -> {});

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();



    }
}
