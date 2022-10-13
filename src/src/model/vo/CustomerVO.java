package model.vo;

public class CustomerVO {
	String name;		// 고객명
	String tel;		// 전화번호
	String addTel;		// 보조 전화번호
	String addr;		// 주소
	String email;		// 이메일

public String getCustName() {
	return name;
}

public void setCustName(String custName) {
	this.name = custName;
}

public String getCustTel1() {
	return tel;
}

public void setCustTel1(String custTel1) {
	this.tel = custTel1;
}

public String getCustTel2() {
	return addTel;
}

public void setCustTel2(String custTel2) {
	this.addTel = custTel2;
}

public String getCustAddr() {
	return addr;
}

public void setCustAddr(String custAddr) {
	this.addr = custAddr;
}

public String getCustEmail() {
	return email;
}

public void setCustEmail(String custEmail) {
	this.email = custEmail;
}


}
