package com.assignment1.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> st = new ArrayList<Student>();
		String res=null;
		do {
			System.out.println("enter sid sname perc");
			int sid=sc.nextInt();
			String sname=sc.next();
			double per=sc.nextDouble();
			
			Student s=new Student(sid,sname,per);
			
			boolean rs=st.add(s);
			if(rs)
				System.out.println("added successfully");
			else
				System.out.println("Failed to add");
			
			System.out.println("do you have more student records to add");
			res=sc.next();
		}while(res.equalsIgnoreCase("yes"));
		
		System.out.println("entered student details are");
		Iterator<Student> it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for (int i = 1; i <st.size(); i++)
		{
			Student s1=(Student) st.get(i);
			if(s1.getPer()>=85)
			System.out.println("distinction per is: "+s1.getPer());
		}
		
		for (int i = 1; i < st.size(); i++)
		{
			Student s2=(Student) st.get(i);
			if(s2.getPer()<=85 && s2.getPer()>70)
			System.out.println("1st class per is: "+s2.getPer());
		}
		
		for (int i = 1; i < st.size(); i++)
		{
			Student s3=(Student) st.get(i);
			if(s3.getPer()<=70)
			System.out.println("2st class per is: "+s3.getPer());
		}
		sc.close();

	}

}