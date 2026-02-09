package graphique.tp3graphique;

import graphique.tp3graphique.Models.Acteur;
import graphique.tp3graphique.Models.Film;
import graphique.tp3graphique.Models.Realisateur;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Tp3Controller implements Initializable {

    @FXML
    private TableColumn<Acteur, String> tcPrenomActeurs;
    @FXML
    private TableColumn<Film, String> tcTitreFilms;
    @FXML
    private TableColumn<Acteur, String> tcNomActeurs;
    @FXML
    private TableColumn<Film, Integer> tcNbEntrees;
    @FXML
    private TableColumn<Film, Integer> tcAnnee;
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
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle("Information");
//        alert.setHeaderText(null);
//
//        Realisateur realisateur = new Realisateur("Spielberg", "Steven");
//        alert.setContentText(
//                "Nom du realisateur : " + realisateur.getNom() +
//                "\n" + "Prenom du realisateur : " + realisateur.getPrenom()
//        );
//        alert.showAndWait();
//
//        Acteur acteur1 = new Acteur("Magimel", "Benoit");
//        Acteur acteur2 = new Acteur("Deneuve", "Catherine");
//        Acteur acteur3 = new Acteur("De France", "Cecile");
//
//
//        Film film = new Film("De son Vivant", 1345681, 2021, realisateur);
//        alert.setContentText(
//                "Titre du film : " + film.getTitre() +
//                 "\n" + "Nombre d'entrees : " + film.getNbEntree() +
//                 "\n" + "Annee de sortie : " + film.getAnneeSortie() +
//                 "\n" + "Nom du realisateur : " + realisateur.getNom() +
//                 "\n" + "Prenom du realisateur : " + realisateur.getPrenom() +
//                 "\n" + "Liste des acteurs " + "\n" + "Nom de l'acteur = " + acteur1.getNomActeur() + "\n" +
//                  "Prenom de l'acteur = " + acteur1.getPrenomActeur() + "\n" + "Nom de l'acteur = " + acteur2.getNomActeur() + "\n" +
//                        "Prenom de l'acteur = " + acteur2.getPrenomActeur() + "\n" + "Nom de l'acteur = " + acteur3.getNomActeur() + "\n" +
//                 "Prenom de l'ateur = " + acteur3.getPrenomActeur()
//        );
//        alert.showAndWait();


        // Remplissements des Colones du TableView
        tcTitreFilms.setCellValueFactory(new PropertyValueFactory<>("titre"));
        tcNbEntrees.setCellValueFactory(new PropertyValueFactory<>("nbEntree"));
        tcAnnee.setCellValueFactory(new PropertyValueFactory<>("anneeSortie"));
        tcNomActeurs.setCellValueFactory(new PropertyValueFactory<>("nomActeur"));
        tcPrenomActeurs.setCellValueFactory(new PropertyValueFactory<>("prenomActeur"));


        // Les 3 réalisateurs
        Realisateur realisateur1 = new Realisateur("Bercot", "Emmanuelle");
        Realisateur realisateur2 = new Realisateur("Mangold", "James");
        Realisateur realisateur3 = new Realisateur("Guédiguian", "Robert");

        // Les 7 acteurs
        Acteur acteur1 = new Acteur("Magimel", "Benoit");
        Acteur acteur2 = new Acteur("Deneuve", "Catherine");
        Acteur acteur3 = new Acteur("De France", "Cécile");
        Acteur acteur4 = new Acteur("Chalamet", "Timothée");
        Acteur acteur5 = new Acteur("Elle", "Fanning");
        Acteur acteur6 = new Acteur("Ascaride", "Arianne");
        Acteur acteur7 = new Acteur("Darroussin", "Jean-Pierre");

        // Les 3 films
        Film film1 = new Film("De son vivant", 745239, 2021, realisateur1);
        Film film2 = new Film("Un parfait inconnu", 564819, 2025, realisateur2);
        Film film3 = new Film("La pie voleuse", 871425, 2025, realisateur3);

        // On ajoute les acteurs à chaque film
        film1.ajouterActeur(acteur1);
        film1.ajouterActeur(acteur2);
        film1.ajouterActeur(acteur3);

        film2.ajouterActeur(acteur4);
        film2.ajouterActeur(acteur5);

        film3.ajouterActeur(acteur6);
        film3.ajouterActeur(acteur7);

        // Une collection pour stocker tous les films
        List<Film> films = new ArrayList<>();
        ObservableList<Film> filmsObs = FXCollections.observableArrayList(films);

        // On ajoute nos films à la collection
        films.add(film1);
        films.add(film2);
        films.add(film3);

        tvListeFilms.setItems(filmsObs);
    }
}
