package project_3;

import java.util.ArrayList;

public class Test
{
	public static void main(String[] args)
	{
	
		Module sw = new Module("Software Workshop", "Jon Rowe");
		
		System.out.println(sw);
		
		System.out.println(sw.getName());
		System.out.println(sw.getLecturer());
		
		System.out.println("changing lecturer");
		sw.setLecturer("Martin Escardo");
		
		System.out.println(sw);
		
		Student alf = new Student("Alfred Smith", 12345);
		
		System.out.println(alf);
		System.out.println(alf.getName());
		System.out.println(alf.getId());
		
		System.out.println("changing id");
		alf.setId(54321);
		System.out.println(alf);
		
		alf.setModule(0, sw);
		alf.setModule(1, new Module("Foundations", "Dan Ghica"));
		alf.setModule(2, new Module("Intro to AI", "Volker Sorge"));
		
		//System.out.println(alf.getModule(1));
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(alf.getModule(i));
		}
		//My testing code:
		System.out.println();
		
		Module modules[] = new Module[5];
		modules[0] = new Module("Software Workshop","Georgi");
		modules[1] = new Module("Mathematics","Angel");
		modules[2] = new Module("Software Workshop","Osama");
		modules[3] = new Module("Engineering:Bombs","Omar");
		modules[4] = new Module("Mathematics","Habib");
		
		for (int i = 0; i < modules.length-1; i++)
			for (int j = i+1; j < modules.length; j++)
				if(modules[i].equals(modules[j])) System.out.println(modules[i].getLecturer()+" and "+modules[j].getLecturer()+" can work together on module: "+modules[i].getName());
		for (int j = 0; j < modules.length; j++)
			if(alf.onModule(modules[j])) System.out.println(alf.getName()+" could be thaught "+modules[j].getName()+" by "+modules[j].getLecturer());
		
		ArrayList<Student> lst = new ArrayList<>();
		lst.add(alf);
		TutorGroup tutor = new TutorGroup("Osama",lst);
		System.out.println(tutor.toString());
		tutor.setName("Hasan");
		Student ahm = new Student("Ahmed Junior", 23456);
		tutor.addStudent(ahm);
		System.out.println(tutor.toString());
		System.out.println(tutor.getStudents().get(1).toString());
		
		TutorGroup tutor_2 = new TutorGroup("Mohamed",new ArrayList<Student>());
		tutor_2.addStudent(ahm);
		System.out.println(tutor_2.toString());
		
	}
}
