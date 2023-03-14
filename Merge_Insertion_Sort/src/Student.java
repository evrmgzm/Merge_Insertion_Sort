
public class Student {
	Object studentName = null;
	Object studentSurname = null;
	Object studentID = null;
	
	public Student(Object name,Object surname, Object ID)
	{
	    studentName = name;
	    studentID = ID;
	    studentSurname = surname;
	}
	public Object getStudentSurname() {
		return studentSurname;
	}
	public void setStudentSurname(Object studentSurname) {
		this.studentSurname = studentSurname;
	}
	public Object getStudentName() {
		return studentName;
	}
	public void setStudentName(Object studentName) {
		this.studentName = studentName;
	}
	public Object getStudentID() {
		return studentID;
	}
	public void setStudentID(Object studentID) {
		this.studentID = studentID;
	}
	 public String toString()
	    {
	        return studentName + " " + studentSurname+" "+studentID;  
	    }
}
