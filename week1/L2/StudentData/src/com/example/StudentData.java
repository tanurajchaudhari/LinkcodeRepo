package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.example.entity.Student;

public class StudentData<T> extends ArrayList<T> {
	
	
	public void addElement(BufferedReader br,ArrayList<Student>al) throws NumberFormatException, IOException {
		
	
		System.out.println("Enter  the position  where you want to or if you want to add last then press -1");
		
	}
	public void addStudent(ArrayList<Student>al,BufferedReader br) throws IOException{
		
		System.out.println("Enter "+" Student data");
		System.out.println("Enter roll number");
		int roll=-1;
		try {
		 String  rollinside=br.readLine();
		 roll=Integer.parseInt(rollinside);
		 if(roll<=0) {
			 System.out.println("Roll number must be positive ! try again ");
		 }
		}catch(NumberFormatException e) {
			System.out.println("invalid input ");
		}
		System.out.println("Enter name ");
		String name=br.readLine();
		System.out.println("Enter Education ");
		String education=br.readLine();
		
		System.out.println("Enter  the position  where you want to or if you want to add last then press -1");
		int pos=Integer.parseInt(br.readLine());
		if(pos!=-1 && al.size()<=pos) {
			al.add(new Student(roll,name,education));
		}else if(pos!=-1&& pos<al.size()) {
			al.add(pos,new Student(roll,name,education));
		}else {
			al.add(new Student(roll,name,education));
		}
		
	}
	public void searchStudent(ArrayList<Student>al,BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Search by :");
		System.out.println("press 1 for search by roll No : ");
		System.out.println("press 2 for seach by Name : ");
		int choice =Integer.parseInt(br.readLine());
		boolean found=false;
		if(choice==1) {
			System.out.println("Enter  roll number to research : ");
			int roll= Integer.parseInt(br.readLine());
			for(Student s:al) {
				if(s.getRollNo()==roll) {
					System.out.println("student found at :"+s);
					found=true;
					break;
				}
			}
		}else if(choice==2) {
			System.out.println("Enter the Name :");
			String name=br.readLine();
			for(Student s:al) {
				if(s.getName().equalsIgnoreCase(name)){
					System.out.println("Student found at "+s);
					found=true;
					break;
				}
			}
		}
		if(!found) {
			System.out.println("Student are not found  ");
		}
		
	}
	public void updateStudent(ArrayList<Student>al,BufferedReader br) throws NumberFormatException, IOException {
		if(al.isEmpty()) {
			
			System.out.println("List is empty");
			return;
			
		}
		System.out.println("Enter the roll number of student you want to  update the data");
		int roll=Integer.parseInt(br.readLine());
		int foundIndex=-1;
		for(int i=0;i<al.size();i++) {
			if(al.get(i).getRollNo()== roll) {
				foundIndex=i;
				break;
			}
		}
		if(foundIndex==-1) {
			
			System.out.println("student not found ");
			return;
		}
		System.out.println("Current data of student"+al.get(foundIndex));
		Student existing =al.get(foundIndex);
		System.out.println("want change roll number if yes the press 1 if no then press 0");
		int flagR=Integer.parseInt(br.readLine());
		if(flagR==1) {
			System.out.println("Enter the new roll number");
			int rollNew=Integer.parseInt(br.readLine());
			existing.setRollNo(rollNew);
		}
		
		System.out.println("Want to change name if yes then press 1 or if no then press 0");
		int flagN=Integer.parseInt(br.readLine());
		if(flagN==1) {
			System.out.println("Enter new name ");
			String name=br.readLine();
			existing.setName(name);
		}
		System.out.println("Want to change the education  if yes then press1 or no then press 0");
		int flagE=Integer.parseInt(br.readLine());
		if(flagE==1) {
			System.out.println("Enter the new Education");
			String Edu=br.readLine();
			existing.setEducation(Edu);
		}
		System.out.println("Updated");
	}
	public void deleteStudent(ArrayList<Student>al,BufferedReader br)throws IOException {
		if(al.size()==0) {
			System.out.println("List is empty");
			return;
			
		}
		System.out.println("current student list ");
		for(Student s: al) {
			System.out.println(s);
		}
		System.out.println("choose below option");
		System.out.println("press 1 if u  want to delete the one student");
		System.out.println("press 2 if u want to delete the  whole list");
		int choice=Integer.parseInt(br.readLine());
		if(choice==1) {
			System.out.println("Enter the the roll number");
			int rollNo=Integer.parseInt(br.readLine());
			int foundIndex=-1;
			for(int i=0;i<al.size();i++) {
				if(al.get(i).getRollNo()==rollNo) {
					foundIndex=i;
					break;
				}
			}
			if(foundIndex==-1) {
				System.out.println("Student with Roll number "+rollNo+" NOT found !!");
			}else {
				Student remove = al.remove(foundIndex);
				System.out.println(" Roll number "+rollNo +" Deleted successfully ");
				
			}
		}else {
			al.clear();
			System.out.println("List deleted fully");
		}
	}
	public void showStudents(ArrayList<Student>al) {
		System.out.println("Elements in the student list");
		for(Student s:al) {
			System.out.println("Student RollNo : "+s.getRollNo());
			System.out.println("Student Name : "+s.getName());
			System.out.println("Student Education : "+s.getEducation());
			System.out.println("=================================================");
		}
	}
	public static void main(String[]args)throws IOException {
		
		ArrayList<Student>al= new ArrayList<>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    int flag=-1;
	    StudentData st= new StudentData();
		while(flag!=0) {
			System.out.println("choose one option ");
			System.out.println("press 1 and hit enter if you want to add ");
			System.out.println("press 2 anf hit enter if you want search element ");
			System.out.println("press 3 and hit enter if you want to update  element in array list  ");
			System.out.println("press 4 and hit enter if you want to delete element in the arraylist");
			System.out.println("press 5 and hit enter if you want to see element in the arraylist");
			System.out.println("press 0 if you dont want anything  and conclude the program ");
			
			flag=Integer.parseInt(br.readLine());
			if(flag<0 && flag >4) {
				System.out.println("Invalide number  pressed press only given  number ");
			}
			if(flag==1) {
				st.addStudent(al, br);
			}else if(flag==2) {
				st.searchStudent(al,br);
			}else if(flag==3) {
				st.updateStudent(al,br);
			}else if(flag==4) {
				st.deleteStudent(al,br);
			}else if(flag==5) {
				st.showStudents(al);
			}
			
		}
		System.out.println("Thank Yoou !!!");
	}

	

}
