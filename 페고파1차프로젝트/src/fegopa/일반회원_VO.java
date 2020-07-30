package fegopa;

public class 일반회원_VO {
	///
	
	private String ID;
	private String PW;
	private String 주소;
	private String 이름;
	private String 연락처;
	private String 생년월일;
	private String 이메일;
	private String logtime;
	
	
	public 일반회원_VO() {
		
	}
	
	public 일반회원_VO(String iD, String pW) {
		ID = iD;
		PW = pW;
	}

	public 일반회원_VO(String pW, String 주소, String 이름, String 연락처, String 생년월일, String 이메일) {
		this.PW = pW;
		this.주소 = 주소;
		this.이름 = 이름;
		this.연락처 = 연락처;
		this.생년월일 = 생년월일;
		this.이메일 = 이메일;
	}
	
	public 일반회원_VO(String iD, String pW, String 주소, String 이름, String 연락처, String 생년월일, String 이메일) {
		this.ID = iD;
		this.PW = pW;
		this.주소 = 주소;
		this.이름 = 이름;
		this.연락처 = 연락처;
		this.생년월일 = 생년월일;
		this.이메일 = 이메일;
	}
	public 일반회원_VO(String iD, String pW, String 주소, String 이름, String 연락처, String 생년월일, String 이메일, String logtime) {
		this.ID = iD;
		this.PW = pW;
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
		this.ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		this.PW = pW;
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
	public String getLogtime() {
		return logtime;
	}
	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}
	
	
}
