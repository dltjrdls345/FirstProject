package fegopa;

public class 주최회원_VO {
	private String ID;
	private String PW;
	private String 주소;
	private String 기관명;
	private String 연락처;
	private String logtime;
	///
	


	public 주최회원_VO(String iD, String pW, String 주소, String 기관명, String 연락처, String logtime) {
		this.ID = iD;
		this.PW = pW;
		this.주소 = 주소;
		this.기관명 = 기관명;
		this.연락처 = 연락처;
		this.logtime = logtime;
	}


	public 주최회원_VO(String iD, String pW) {
		ID = iD;
		PW = pW;
	}


	public 주최회원_VO(String iD, String pW, String 주소, String 기관명, String 연락처) {
		this.ID = iD;
		this.PW = pW;
		this.주소 = 주소;
		this.기관명 = 기관명;
		this.연락처 = 연락처;
	}
	
	
	public 주최회원_VO(String pW, String 주소, String 기관명, String 연락처) {
		this.PW = pW;
		this.주소 = 주소;
		this.기관명 = 기관명;
		this.연락처 = 연락처;
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
	public String getLogtime() {
		return logtime;
	}

	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}

}
