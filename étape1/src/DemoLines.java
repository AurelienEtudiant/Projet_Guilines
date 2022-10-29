import guilines.Lines;
import guilines.IJeuDesBilles;

/**
 * Classe DemoLines
 * 
 * @author COQUET Jean-Philippe
 * @author LARIVIERE Aurélien
 * @author MOUTON William
 */
public class DemoLines {

    public static void main(String[] args) {
        IJeuDesBilles game = new MonJeu();
        // Création de la fenêtre à l'aide de l'interface graphique impémentée dans le guilines.jar
        
        Lines fenetre = new Lines("LILines", game);
    }// DemoLines

}
