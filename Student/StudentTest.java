class StudentTest{
	public static void main(String[]args){
		
		Student stu1 = new Student();
		
		stu1.setname("PABASARA");
		stu1.setage(18);
		stu1.setgpa(3.9);
		
		System.out.println(stu1.getname()  + "- Age is " + stu1.getage() + " GPA is " + stu1.getgpa());
		System.out.println();	
		System.out.println();	
       
		Student stu2 = new Student();
		
		stu2.setname("john");
		stu2.setage(16);
		stu2.setgpa(3.7);
		
		System.out.println(stu2.getname() + "- Age is " + stu2.getage() + " GPA is " + stu2.getgpa());	
		
		
		
	}
}