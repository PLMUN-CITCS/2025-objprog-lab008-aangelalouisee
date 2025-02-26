public class SelectionStatementsDemo {
    public static void main(String[] args) {
	
	int studentScore = 82;

	//one way if statement
	if (studentScore >= 60) {
	    System.out.println("You passed the exam!"); //display if the student score is greater than or equal to 60
	}

	//two way if else statement
	if (studentScore >= 90) {
	   System.out.println("Excellent performance!"); //display if the score is greater than or equal to 90
	} else {
	   System.out.println("Keep improving!"); //display if the score is less than 90
	}

	//nested if statements
	if (studentScore >= 60) {
   	   if (studentScore >= 90) {
	      System.out.println("Grade: A"); //display if the score is greater than or qual to 60 and greater than or equal to 90
	   } else {
	      if (studentScore >= 75) {
	         System.out.println("Grade: B"); //display if the score is greater than or equal to 60 and greater than or equal to 75
	      } else {
	         System.out.println("Grade: C"); //display if the score is greater than or equal to 60 but less than 75
	      }
   	   }
	} else {
	   System.out.println("Grade: F"); //display if the score is less than 60
	}

	//multiway if else chain
	if (studentScore >= 90) {
	   System.out.println("Multi-way Grade: A"); //display if the score is greater than or equal to 90
	} else if (studentScore >= 80) {
	   System.out.println("Multi-way Grade: B"); //display if the score is greater than or equal to 80
	} else if (studentScore >= 70) {
	   System.out.println("Multi-way Grade: C"); //display if the score is greater than or equal to 70
	} else if (studentScore >= 60) {
	   System.out.println("Multi-way Grade: D"); //display if the score is greater than or equal to 60
	} else {
	   System.out.println("Multi-way Grade: F"); //display if the score is less than all the values given above
	}
    }
}
