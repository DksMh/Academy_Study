package Address_model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Objects;

public class AddressVo implements Externalizable {
	private int no;
	private String name;
	private String tel;
	private String adr;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(no);
		out.writeUTF(name);
		out.writeUTF(tel);
		out.writeUTF(adr);		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		no = in.read();
		name = in.readUTF();
		tel = in.readUTF();
		adr = in.readUTF();
	}
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
		return Objects.hash(name);
	}
	
	// equals를 Override한 이유는 이걸로만 비교하면 되니까~
	// adrlist.get(i).equals(vo); == adrlist.get(i).equals(vo.get(i).getName());
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressVo other = (AddressVo) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return  no + "\t" + name + "\t" + tel + "\t" + adr;
	}

	

}
