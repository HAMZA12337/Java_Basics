import java.util.Scanner;
import java.util.Arrays;
public class Exercice1 {


   private int size;
    private double[] notes;

    //constructor
 public   Exercice1(int size ){
        this.size=size;
        this.notes= new double[size];
    }


void enterMarks(){
// in this method we can use three different methods : for - while - do while
// for me i will use for .

    for(int i=0;i<size;i++){
        System.out.println("enter the mark of student number "+(i+1));
        Scanner scanner= new Scanner(System.in);
        notes[i]=scanner.nextInt();
    }
 }

 //--------------------- display all marks-----------------------//

void displayMarks(){
     // for this case i will use foreach that which help me easily to display  my data table
        System.out.println("the marks you entered :");
    for(double temp :notes){

        System.out.println(temp);

    }

    }

    // Sort the list of students

    void sortList(){

     System.out.println("you list after sorting");
     // Time Complexity: O(N log N)
       Arrays.sort(notes);
        for(double temp :notes){

            System.out.println(temp);

        }
 }

 //------------ get the average rating------------------------------//

 void averageRating(){
   double sum=0;
        for(double temp :notes){

            sum+=temp;}
System.out.println("Average Rating ="+(sum/size));

    }


//------------ get max and min mark without sorting ------------------------------//


    void getMaxMin(){

     double max=notes[0],min=notes[0];
        for(double temp :notes) {
              max=Math.max(max,temp);
              min=Math.min(min,temp);
        }
System.out.println("the max mark is :"+max);
System.out.println("the min mark is :"+min);

    }

//------------ get max and min mark After sorting ------------------------------//

    void getMaxMinSort(){

//  in this cas we need just to use the indexes to get min & max value

        System.out.println("the max mark = "+notes[size]);
// are the sanme size=notes[notes.length]

        System.out.println("the min mark ="+notes[0]);


    }


void getNbMark(double note ){

     int temp=0;
    for(double mark :notes){

        if (note == mark) {

       temp++;
        }

      System.out.println("the number of students with  the same mark ="+temp);


        }



    }


}






