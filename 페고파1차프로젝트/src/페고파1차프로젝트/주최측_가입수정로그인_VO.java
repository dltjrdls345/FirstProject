package 페고파1차프로젝트;

public class 주최측_가입수정로그인_VO {
	String ID;
	String PW;
	String 주소;
	String 기관명;
	String 연락처;
	
	public 주최측_가입수정로그인_VO(String iD, String pW, String 주소, String 기관명, String 연락처) {
		ID = iD;
		PW = pW;
		this.주소 = 주소;
		this.기관명 = 기관명;
		this.연락처 = 연락처;
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
	public String get기관명() {
		return 기관명;
	}
	public void set기관명(String 기관명) {
		this.기관명 = 기관명;
	}
	public String get연락처() {
		return 연락처;
	}
	public void set연락처(String 연락처) {
		this.연락처 = 연락처;
	}
}
