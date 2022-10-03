import java.util.Scanner;

public class Exercice3 {

static private StringBuilder word;
   static void  enterSentence(){
       System.out.println("Enter character string :");
       Scanner sc =new Scanner(System.in);
      word=new StringBuilder(sc.nextLine());

   }

    static void  displaySentence(){
System.out.println("your sentence that you entered");
       System.out.println(word);
}

    static void reverseSentence(){

       System.out.println("your sentence after reversed "+word.reverse());

    }


    static void nbOfWords(){

// first version

        int nbWords=1;

        for(int i=0; i<word.length(); i++){
            //check for white space and increment counter
            if(word.charAt(i) == ' ')
                nbWords++;
        }
System.out.println("the number of words is "+nbWords);


       
    }













    public static void main(String[] args) {

// variables block------------
       int choice ;
        Scanner sc =new Scanner(System.in);
//----------------------------
        do{
           System.out.println("\n        *******      String Options    ****** \n\n");
           System.out.println("          ============================================= \n\n");
           System.out.println("      <1.  Enter character string------------------------------ \n");
           System.out.println("      <2.  Display my sentence ----------------------- \n");
           System.out.println("      <3.  reverse my sentence------------------ \n");
           System.out.println("      <4. the number of words in my sentence -------------- \n");
           System.out.println("      <5.  Quitter---------------------------------------- \n");
           System.out.println("          ============================================== \n\n");
           System.out.println("Entre your choice");
            choice=sc.nextInt();

            switch(choice){
                case 1:enterSentence();break;
                case 2:displaySentence();break;
                case 3:reverseSentence();break;
                case 4:nbOfWords();break;
//                case 5:quitter();break;
                default :System.out.println("your choice is not valid !!!\n");
            }

        }while(choice!=5);



    }
}
