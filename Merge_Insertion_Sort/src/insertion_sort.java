import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class insertion_sort {
	public static void insertionSort(Student[] arr) throws FileNotFoundException, UnsupportedEncodingException 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            Student key = arr[i]; 
            int j = i - 1; 
           
            while (j >= 0 && Integer.parseInt((String) arr[j].getStudentID()) > Integer.parseInt((String) key.getStudentID())) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
      
      //create and write the new text file for insertion sort
        PrintWriter writer = new PrintWriter("insertion_sort.txt", "UTF-8");
        writer.println("name, "+"surname, "+"id");
		for(int i=0; i<arr.length;i++) {
			writer.println(arr[i].studentName+ ", "+arr[i].studentSurname+", "+arr[i].studentID);
			
		}
		writer.close();
		
		//write txt file to the console
		System.out.println("INSERTION SORT TXT FILE");
		Merge_Insertion_Sort.print(arr);
    }

}
