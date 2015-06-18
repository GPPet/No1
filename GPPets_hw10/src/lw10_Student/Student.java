package lw10_Student;

import hw10_P4_Library.Book;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	private String firstName;
	private String familyName;
	private int facNumber;
	private HashMap<String, ArrayList<Integer>> subjects;
	
	public Student() {
		super();
	}

	public Student(String firstName, String familyName, int facNumber,
			HashMap<String, ArrayList<Integer>> subjects) {
		super();
		this.firstName = firstName;
		this.familyName = familyName;
		this.facNumber = facNumber;
		this.subjects = subjects;
	}

	public HashMap<String, ArrayList<Integer>> addSubjectMark(String subject, int mark){
		HashMap<String, ArrayList<Integer>> addSubjectMark = subjects;
		ArrayList<Integer> marksList = addSubjectMark.get(subject);
		if(mark >= 2 && mark <= 6) marksList.add(mark);
		addSubjectMark.put(subject, marksList);
		return addSubjectMark;
	}
	
	public float calculateAvarageMark(String subject){
		HashMap<String, ArrayList<Integer>> calculateAve = subjects;
		ArrayList<Integer> marksList = calculateAve.get(subject);
		int sum = 0;
		for(Integer mark : marksList){
			sum += mark;
		}
		float ave = (float) sum / marksList.size();
		
		return ave;
	}
	
	
	
	@Override
	public String toString() {
		String result = "";
		result += "Name:\t" + getFirstName() + " " + getFamilyName();
		result += "\nFaculty No:\t" + getFacNumber();
		result += "\n\nSubject : Marks : Average";
		for(String subject : getSubjects().keySet()){
			result += "\n" + subject + " : " + getSubjects().get(subject) + " : " + calculateAvarageMark(subject);
		}
		
		return result;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public int getFacNumber() {
		return facNumber;
	}
	public void setFacNumber(int facNumber) {
		this.facNumber = facNumber;
	}
	public HashMap<String, ArrayList<Integer>> getSubjects() {
		return subjects;
	}
	public void setSubjects(HashMap<String, ArrayList<Integer>> subjects) {
		this.subjects = subjects;
	}
	
	

}
