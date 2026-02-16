package graphique.tp3graphique;

import graphique.tp3graphique.models.Acteur;
import graphique.tp3graphique.models.Film;
import graphique.tp3graphique.models.Realisateur;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Tp3Controller implements Initializable {

    ArrayList<Film> films;
    @FXML
    private TableColumn<Acteur, String> tcPrenomActeurs;
    @FXML
    private TableColumn<Film, String> tcTitreFilms;
    @FXML
    private TableColumn<Acteur, String> tcNomActeurs;
    @FXML
    private TableColumn<Film, Number> tcNbEntrees;
    @FXML
    private TableColumn<Film, Number> tcAnnee;
    @FXML
    private TextField txtPrenomRealisateurs;
    @FXML
    private TextField txtNomRealisateurs;
    @FXML
    private TableView<Acteur> tvListeActeurs;
    @FXML
    private TableView<Film> tvListeFilms;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);

        Realisateur realisateur = new Realisateur("Spielberg", "Steven");
        alert.setContentText(
                "Nom du realisateur : " + realisateur.getNom() +
                "\n" + "Prenom du realisateur : " + realisateur.getPrenom()
        );
        alert.showAndWait();

        Acteur acteur1 = new Acteur("Magimel", "Benoit");
        Acteur acteur2 = new Acteur("Deneuve", "Catherine");
        Acteur acteur3 = new Acteur("De France", "Cecile");


        Film film = new Film("De son Vivant", 1345681, 2021, realisateur);
        alert.setContentText(
                "Titre du film : " + film.getTitre() +
                 "\n" + "Nombre d'entrees : " + film.getNbEntree() +
                 "\n" + "Annee de sortie : " + film.getAnneeSortie() +
                 "\n" + "Nom du realisateur : " + realisateur.getNom() +
                 "\n" + "Prenom du realisateur : " + realisateur.getPrenom() +
                 "\n" + "Liste des acteurs " + "\n" + "Nom de l'acteur = " + acteur1.getNomActeur() + "\n" +
                  "Prenom de l'acteur = " + acteur1.getPrenomActeur() + "\n" + "Nom de l'acteur = " + acteur2.getNomActeur() + "\n" +
                        "Prenom de l'acteur = " + acteur2.getPrenomActeur() + "\n" + "Nom de l'acteur = " + acteur3.getNomActeur() + "\n" +
                 "Prenom de l'acteur = " + acteur3.getPrenomActeur()
        );
        alert.showAndWait();


        films = new ArrayList();

        // Les 3 réalisateurs
        Realisateur realisateur1 = new Realisateur("Bercot", "Emmanuelle");
        Realisateur realisateur2 = new Realisateur("Mangold", "James");
        Realisateur realisateur3 = new Realisateur("Guédiguian", "Robert");

        // Les 7 acteurs
        Acteur acteur4 = new Acteur("Magimel", "Benoit");
        Acteur acteur5 = new Acteur("Deneuve", "Catherine");
        Acteur acteur6 = new Acteur("De France", "Cécile");
        Acteur acteur7 = new Acteur("Chalamet", "Timothée");
        Acteur acteur8 = new Acteur("Fanning", "Elle");
        Acteur acteur9 = new Acteur("Ascaride", "Arianne");
        Acteur acteur10 = new Acteur("Darroussin", "Jean-Pierre");

        // Les 3 films
        Film film1 = new Film("De son vivant", 745239, 2021, realisateur1);
        Film film2 = new Film("Un parfait inconnu", 564819, 2025, realisateur2);
        Film film3 = new Film("La pie voleuse", 871425, 2025, realisateur3);

        // On ajoute les acteurs à chaque film
        film1.ajouterActeur(acteur4);
        film1.ajouterActeur(acteur5);
        film1.ajouterActeur(acteur6);

        film2.ajouterActeur(acteur7);
        film2.ajouterActeur(acteur8);

        film3.ajouterActeur(acteur9);
        film3.ajouterActeur(acteur10);

        // On ajoute nos films à la collection
        films.add(film1);
        films.add(film2);
        films.add(film3);

        // Remplissements des Colones du TableView
        tcTitreFilms.setCellValueFactory(new PropertyValueFactory<>("titre"));
        tcNbEntrees.setCellValueFactory(new PropertyValueFactory<>("nbEntree"));
        tcAnnee.setCellValueFactory(new PropertyValueFactory<>("anneeSortie"));
        tcNomActeurs.setCellValueFactory(new PropertyValueFactory<>("nomActeur"));
        tcPrenomActeurs.setCellValueFactory(new PropertyValueFactory<>("prenomActeur"));

        // Ensuite on ajoute tout au TableView
        tvListeFilms.setItems(FXCollections.observableArrayList(films));

    }

    @FXML
    public void tvListeFilmsOnClicked(Event event)
    {
        txtNomRealisateurs.setText(tvListeFilms.getSelectionModel().getSelectedItem().getRealisateur().getNom());
        txtPrenomRealisateurs.setText(tvListeFilms.getSelectionModel().getSelectedItem().getRealisateur().getNom());

        tvListeActeurs.setItems(FXCollections.observableArrayList(tvListeFilms.getSelectionModel().getSelectedItem().getActeurs()));
    }
}
