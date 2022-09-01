package homeWorkInheritance;

 class GrandFather {                                       // |-> Single
	 public void show() {
		 System.out.println("I am grandfather.");
	 }
   }
 class Father extends GrandFather{
	 public void show() {
		 System.out.println("I am father.");
	 }
 }                                                        // <-|
 class Son extends Father{
	 public void show() {
		 System.out.println("I am son.");
	 }
 }
 class Daughter extends Father{
	 public void show() {
		 System.out.println("I am daughter. ");
	 }
 }
