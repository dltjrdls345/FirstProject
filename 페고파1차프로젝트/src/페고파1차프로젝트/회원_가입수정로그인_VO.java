package 페고파1차프로젝트;

public class 회원_가입수정로그인_VO {
	String ID;
	String PW;
	String 주소;
	String 이름;
	String 연락처;
	String 생년월일;
	String 이메일;
	
	public 회원_가입수정로그인_VO(String iD, String pW, String 주소, String 이름, String 연락처, String 생년월일, String 이메일) {
		ID = iD;
		PW = pW;
		this.주소 = 주소;
		this.이름 = 이름;
		this.연락처 = 연락처;
		this.생년월일 = 생년월일;
		this.이메일 = 이메일;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String get주소() {
		return 주소;
	}
	public void set주소(String 주소) {
		this.주소 = 주소;
	}
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public String get연락처() {
		return 연락처;
	}
	public void set연락처(String 연락처) {
		this.연락처 = 연락처;
	}
	public String get생년월일() {
		return 생년월일;
	}
	public void set생년월일(String 생년월일) {
		this.생년월일 = 생년월일;
	}
	public String get이메일() {
		return 이메일;
	}
	public void set이메일(String 이메일) {
		this.이메일 = 이메일;
	}
}
