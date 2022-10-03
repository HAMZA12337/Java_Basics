public class Exercice2 {

//    Ecrire un programme qui lit un verbe du premier groupe et qui en affiche la conjugaison
//    au présent sous la forme :
//    Entrez un verbe du premier groupe : chanter
//    je chante
//    tu chantes
//    il chante
//    nous chantons
//    vous chantez
//    ils chantent
//    Le programme vérifiera que le verbe se termine bien par er et on supposera qu’il s’agit
//    d’un verbe régulier.


private String verb;


// constructor

    public Exercice2(String verb){
        this.verb=verb;
    }


    void convert(){

        String root=verb.substring(0,verb.length()-2);
        String term=verb.substring(verb.length()-2,verb.length());
        System.out.println("radical ="+root);
        System.out.println("root ="+term);

        if(!term.equals("er")){
            System.out.println("is not a first class verb");
        }else{

            System.out.println(" je "+root+"e");
            System.out.println(" tu "+root+"es");
            System.out.println(" il "+root+"e");
            System.out.println(" nous "+root+"ons");
            System.out.println(" vous "+root+"ez");
            System.out.println(" ils "+root+"ent");


        }








    }








}
