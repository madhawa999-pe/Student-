class Student{
	private String name;
	private int age;
	private double gpa;
	
public void setname(String name){
	this.name = name;
 }
 public void setage(int age){
 
	if(age>=18 && age<= 30){
		this.age = age;
	}else{
		System.out.println("Your age is not eligible");	
	}
	
 }
 public void setgpa(double gpa){
	this.gpa = gpa;
 
 }
 
 public String getname(){
	return name;
	
 }
 public int getage(){
	return age;
	
 }
 public double getgpa(){
	return gpa;
 }
}