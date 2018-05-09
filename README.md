# graphstream-fx

GraphStream is a graph library totally written in java. In this project I will show how to 
use this library with a javafx ui. For that we need the newest lib jars from the project 
which I linked below. Remember that this libraries are still in alpha state.

* [GraphStream](http://graphstream-project.org/)
* [gs-core](https://github.com/graphstream/gs-core/releases)
* [gs-ui-javafx](https://github.com/graphstream/gs-ui-javafx/releases)

First we need a normal javafx project if you have intellij you can build this sceleton be clicking on new project and then on javafx. This will generate a Main.java which is the starting point of the application, a fxml for layout and a controller. If you do not have intellij you can just add all the files manually.

Lets start with the sample.fxml this file defines the layout uf our ui window. Nothing special here we just define a gridPane to put our graphstream graph inside. You can use any other layout.

```
<?import javafx.geometry.Insets?>
<?import javafx.scene.layout.GridPane?>
<GridPane fx:id="gridPane" fx:controller="sample.Controller" xmlns:fx="http://javafx.com/fxml" alignment="center" hgap="10" vgap="10">
    <padding><Insets top="25" right="25" bottom="10" left="25"/></padding>
</GridPane>
```
The Main.class is the entry point of the application. We load our fxml in it define the size and set the title.

```java
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
```
