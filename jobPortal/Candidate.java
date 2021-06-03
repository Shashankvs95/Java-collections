package com.assignment1.jobPortal;

public class Candidate
{
	public int cid;
	public String cname;
	public double cperc;
	public Candidate(int cid, String cname, double cperc) {
		this.cid = cid;
		this.cname = cname;
		this.cperc = cperc;
	}
	@Override
	public String toString() {
		return "["+"ID: "+cid+", Name: "+cname+", Percentage: "+cperc+" ]";
	}
	
	
	
}
