package com.assignment1.jobPortal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class JobPortalMain 
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeSet<Candidate> ts = new TreeSet<Candidate>(new ByName());

		String res = null;

		do {
			System.out.println("Enter candidate details:");
			int cid = sc.nextInt();
			String cname = sc.next();
			double cperc = sc.nextDouble();

			Candidate c = new Candidate(cid, cname, cperc);

			boolean rs = ts.add(c);
			if(rs) {
				System.out.println("Candidate added successfully.");
			}else {
				System.out.println("Duplicate candidates are not allowed !!!");
			}
			System.out.println("Do you wish to add more candidates? (yes / no)");
			res = sc.next();
		}while(res.equalsIgnoreCase("yes"));

		System.out.println("End of adding candidates\n.");

		System.out.println("Added candidates are:");
		for (Candidate candidate : ts) {
			System.out.println("ID: "+candidate.cid+", Name: "+candidate.cname+", Percentage: "+candidate.cperc);		
		}

		System.out.println("List of candidates are: ");
		Iterator itr = ts.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Enter criteria:");
		double criteria = sc.nextDouble();

		System.out.println("Criteria for the company is: "+criteria);

		System.out.println("Candidates who are eligible are:");

		ArrayList<Candidate> al = new ArrayList<Candidate>();

		al.addAll(ts);

		for(int i=0;i<al.size();i++) {
			Candidate c = al.get(i);

			if(c.cperc>=criteria) {
				System.out.println(al.get(i));
			}
		}


	}
}
