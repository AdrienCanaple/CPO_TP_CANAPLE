/*
 * TP2 exo 4 relation 1
 * Adrien CANAPLE
 */
package tp2_relation_1_canaple;

/**
 *
 * @author adrie
 */
public class TP2_relation_1_CANAPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 6 ) ;
Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");
System.out.println("liste des voitures disponibles "+ uneClio +
"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

bob.liste_voitures[0] = uneClio ;
bob.nbVoitures = 1 ;
uneClio.Proprietaire = bob ;

bob.liste_voitures[1] = uneAutreClio;
bob.nbVoitures = 2;
uneAutreClio.Proprietaire = bob;

reno.liste_voitures[1] = une2008;
reno.nbVoitures = 2;
une2008.Proprietaire = reno;

System.out.println("la premiere voiture de Bob est " +
bob.liste_voitures[0] ) ;
System.out.println("la deuxieme voiture de Bob est " +
bob.liste_voitures[1] ) ;

System.out.println("la deuxieme voiture de reno est " +
reno.liste_voitures[1] ) ;

reno.liste_voitures[0] = uneMicra;
reno.nbVoitures = 1;
uneMicra.Proprietaire = reno;

System.out.println("la premiere voiture de reno est " +
reno.liste_voitures[0] ) ;
    }
    
}
