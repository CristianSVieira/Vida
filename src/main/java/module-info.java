module ls.vilantino.vida {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ls.vilantino.vida to javafx.fxml;
    exports ls.vilantino.vida;
}