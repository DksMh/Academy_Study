package day14ExamWithT;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

class Student {
	String name;
	String depart;
	String no;
	String avg;

	public Student() {
		this("", "", "", "");
	}

	public Student(String name, String depart, String no, String avg) {
		this.name = name;
		this.depart = depart;
		this.no = no;
		this.avg = avg;
	}

	public String getname() {
		return name;
	}

	@Override
	public String toString() {
		return name + "," + depart + ", " + no + ", " + avg;
	}

	public String toString(int i) {
		return "이름 : " + name + "\n학과 : " + depart + "\n학번 : " + no + "\n학점평균 : " + avg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
}
