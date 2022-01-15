package org.comstudy21.ex06;

import java.util.Objects;
import java.util.Vector;
import org.comstudy21.ex06.SaramDao;

public class SaramDto {
	private int idx;
	private String name;
	private String email;
	private String phone;
	private String member;

	public SaramDto() {
		this(0, "", "", "","");
	}

	public SaramDto(int idx, String name, String email, String phone,String member) {
		this.idx = idx;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.member = member;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "SaramDto [" + idx + ", " + name + ", " + email + ", " + phone +  member +"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idx, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaramDto other = (SaramDto) obj;
		return idx == other.idx && Objects.equals(name, other.name);
	}

	public Vector toVector() {
		Vector vector = new Vector();
		vector.add(idx);
		vector.add(name);
		vector.add(email);
		vector.add(phone);
		vector.add(member);
		return vector;
	}
}
