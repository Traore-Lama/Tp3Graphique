module graphique.tp3graphique {
    requires javafx.controls;
    requires javafx.fxml;

    opens graphique.tp3graphique.models to javafx.fxml;
    opens graphique.tp3graphique to javafx.fxml;
    exports graphique.tp3graphique;
}