import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Merge_Insertion_Sort {

	static Student student = new Student(null,null,null);
	static int studentCount = 0;
	static Student[] studentObjects = null;
	
	public static void main(String[] args) throws IOException {
		//call read file method
		readFile();
						
		
	}
	public static void readFile() throws IOException {
		//read file
		Path IDPath = Paths.get("student.txt");											
		Scanner sc = new Scanner(IDPath);	
		//count student with txt line(-1 because of information part)
		studentCount = (int) Files.lines(Paths.get("student.txt")).count();
		studentCount--;
		Student[ ] studentObjects = new Student[studentCount];
		String line = null;
		String[] lineVector;
		int count = 0;		
		//skip the information line
		sc.nextLine();
		//read text 
		while (sc.hasNextLine())  {				
			line = sc.nextLine();
			lineVector = line.split(",");			 	
			studentObjects[count] = new Student(lineVector[0],lineVector[1],lineVector[2]);          	
			count++;
                     
		}	
		//write txt file to the console.
		System.out.println("STUDENT TXT FILE");		
		print(studentObjects);
		sc.close();
		//call merge and insertion sort methods.
		insertion_sort.insertionSort(studentObjects);
		merge_sort.mergeSort(studentObjects, studentCount/2, studentCount - (studentCount/2));
		
	}	 
	
	public static void print(Student[] studentObjects) {
		System.out.println("name, "+"surname, "+"id");
		for(int i=0; i<studentCount;i++) {
			System.out.println(studentObjects[i].studentName+ ", "+studentObjects[i].studentSurname+", "+studentObjects[i].studentID);
			
		}
		System.out.println("----------------------------");
	}
	

	

}
