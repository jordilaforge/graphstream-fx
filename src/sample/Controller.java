package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.fx_viewer.FxDefaultView;
import org.graphstream.ui.fx_viewer.FxViewPanel;
import org.graphstream.ui.fx_viewer.FxViewer;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    GridPane gridPane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        gridPane.getChildren().add(createGraph());
    }


    private FxViewPanel createGraph(){
        Graph graph = new SingleGraph("Tutorial 1");
        FxViewer fxViewer = new FxViewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        fxViewer.enableAutoLayout();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("AB", "A", "B");
        graph.addEdge("AC", "A", "C");
        graph.addEdge("BC", "B", "C");

        return  (FxViewPanel) fxViewer.addDefaultView(false);
    }
}
