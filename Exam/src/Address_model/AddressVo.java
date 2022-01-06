package Address_model;

import java.util.Objects;

public class AddressVo {
	private int no;
	private String name;
	private String tel;
	private String adr;
	
	public AddressVo() {
		this(0,"","","");
	}
	
	
	public AddressVo(int no, String name, String tel, String adr) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.adr = adr;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adr, name, no, tel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressVo other = (AddressVo) obj;
		return Objects.equals(adr, other.adr) && Objects.equals(name, other.name) && no == other.no
				&& Objects.equals(tel, other.tel);
	}

	@Override
	public String toString() {
		return  no + "\t" + name + "\t" + tel + "\t" + adr;
	}

}
