import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class merge_sort {
	public static void mergeSort(Student[] arr, int l, int r) throws FileNotFoundException, UnsupportedEncodingException 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        }
        
    }
	
	public static void merge(Student[] arr, int l, int m, int r) throws FileNotFoundException, UnsupportedEncodingException 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        Student[] L = new Student [n1]; 
        Student[] R = new Student [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
        
        
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (Integer.parseInt((String) L[i].getStudentID()) <= Integer.parseInt((String) R[j].getStudentID()) ) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
        
      //create and write the new text file for merge sort
        PrintWriter writer = new PrintWriter("merge_sort.txt", "UTF-8");
        writer.println("name, "+"surname, "+"id");
		for(int q=0; q<arr.length;q++) {
			writer.println(arr[q].studentName+ ", "+arr[q].studentSurname+", "+arr[q].studentID);
			
		}
		writer.close();
		
		//write txt file to the console
		System.out.println("MERGE SORT TXT FILE");
		Merge_Insertion_Sort.print(arr);
		
    }

}
