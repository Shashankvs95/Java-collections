package com.assignment1.jobPortal;

import java.util.Comparator;

public class ByName implements Comparator<Candidate> {

	@Override
	public int compare(Candidate o1, Candidate o2) {
		String c1 = o1.cname;
		String c2 = o2.cname;
		return c1.compareTo(c2);
		
	}

	
}
