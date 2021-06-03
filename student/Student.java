package com.assignment1.student;

public class Student {
	
	private int sid;
	private String sname;
	private double per;
	public Student(int sid, String sname, double per) 
	{
		this.sid=sid;
		this.sname=sname;
		this.per=per;
	}
	@Override
	public String toString() 
	{
		return "[sid=" + sid + ", sname=" + sname + ", per=" + per + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}

}