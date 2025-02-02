package lw10_Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student dik = new Student();
		dik.setFirstName("Diana");
		dik.setFamilyName("Koleva");
		dik.setFacNumber(6313);
		HashMap<String, ArrayList<Integer>> dikSubjects = new HashMap<String, ArrayList<Integer>>();
		dikSubjects.put("Biology", new ArrayList<Integer>(Arrays.asList(3,4,3)));
		dikSubjects.put("Math", new ArrayList<Integer>(Arrays.asList(5,6,6)));
		dikSubjects.put("IT", new ArrayList<Integer>(Arrays.asList(6,6,6)));
		dikSubjects.put("Chemistry", new ArrayList<Integer>(Arrays.asList(5,6,6,4)));
		dikSubjects.put("Physics", new ArrayList<Integer>(Arrays.asList(4,5,5,6)));
		dik.setSubjects(dikSubjects);
		System.out.println(dik.toString());
		System.out.println();
		dik.addSubjectMark("Chemistry", 4);
		System.out.println(dik.toString());
		System.out.println();
		
		Student div = new Student();
		div.setFirstName("Dimitar");
		div.setFamilyName("Volenov");
		div.setFacNumber(6314);
		HashMap<String, ArrayList<Integer>> divSubjects = new HashMap<String, ArrayList<Integer>>();
		divSubjects.put("Biology", new ArrayList<Integer>(Arrays.asList(6,6,6)));
		divSubjects.put("Math", new ArrayList<Integer>(Arrays.asList(6,5,4)));
		divSubjects.put("IT", new ArrayList<Integer>(Arrays.asList(5,6,5)));
		divSubjects.put("Chemistry", new ArrayList<Integer>(Arrays.asList(3,3,2)));
		divSubjects.put("Physics", new ArrayList<Integer>(Arrays.asList(4,3,5)));
		div.setSubjects(divSubjects);
		System.out.println(div.toString());
		System.out.println();
		
		Student dis = new Student();
		dis.setFirstName("Denis");
		dis.setFamilyName("Stoyanov");
		dis.setFacNumber(6316);
		HashMap<String, ArrayList<Integer>> disSubjects = new HashMap<String, ArrayList<Integer>>();
		disSubjects.put("Biology", new ArrayList<Integer>(Arrays.asList(3,3,2)));
		disSubjects.put("Math", new ArrayList<Integer>(Arrays.asList(3,2,2)));
		disSubjects.put("IT", new ArrayList<Integer>(Arrays.asList(3,4,3)));
		disSubjects.put("Chemistry", new ArrayList<Integer>(Arrays.asList(3,3,3)));
		disSubjects.put("Physics", new ArrayList<Integer>(Arrays.asList(4,3,2)));
		dis.setSubjects(disSubjects);
		System.out.println(dis.toString());
		System.out.println();

	}

}
