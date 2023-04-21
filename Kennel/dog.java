
public class dog extends Animal  //here we extend the animal class

{
 private int exerciseTime;
 
 public dog(String name, int exerciseTime) //adding another parameter while also calling the original
 
 {
	 super (name); //here we are calling the super constructor from animal to intitialize
	 this.exerciseTime = exerciseTime;   //here we initialize the new cosntructor
	 if(exerciseTime<0) exerciseTime=0;  //to eliminate negative numbers
 }
 
 public int getTime() {
	 return exerciseTime;
 }
 
 public void setTime(int exerciseTime) {
	 this.exerciseTime= exerciseTime;
 }
 
 public String toString() {
	 System.out.println("Animal name =" + name + "\n" + "Exercise Time = " + exerciseTime);
	 return "Animal name =" + name + "Exercise Time = " + exerciseTime;
 }
 
}
