
// Method over Loading

package week3.day1;

public class Student {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID is = "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID is = "+id+" ; Student Name is = "+name);
	}
	public void getStudentInfo(String email, long phone) {
		System.out.println("Student Mail ID is = "+email+" ; Contact number = "+phone);
	}
	public static void main(String[] args) {
		Student st = new Student();
		st.getStudentInfo(78);
		st.getStudentInfo(78, "ANISH RAJ N");
		st.getStudentInfo("nanishraj1998@gmail.com", 866816884);
	}

}
