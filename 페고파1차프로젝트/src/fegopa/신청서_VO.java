package fegopa;

public class 신청서_VO {

	// apply 테이블이 가지고 있는 칼럼//.
	private String 신청id;
	private String 이름;
	private String 사업자번호;
	private String 연락처;
	private String 부스id;
	private String 부스소개;
	private String 첨부파일;
	private String 신청상태;
	private String 회원id;
	private String 축제id;
	
	

	

	public 신청서_VO(String 이름, String 사업자번호, String 연락처, String 부스id, String 부스소개, String 첨부파일, String 축제id) {
		this.이름 = 이름;
		this.사업자번호 = 사업자번호;
		this.연락처 = 연락처;
		this.부스id = 부스id;
		this.부스소개 = 부스소개;
		this.첨부파일 = 첨부파일;
		this.축제id = 축제id;
	}


	public 신청서_VO(String 신청id, String 이름, String 사업자번호, String 연락처, String 부스id, String 부스소개, String 첨부파일, String 신청상태,
			String 회원id, String 축제id) {
		this.신청id = 신청id;
		this.이름 = 이름;
		this.사업자번호 = 사업자번호;
		this.연락처 = 연락처;
		this.부스id = 부스id;
		this.부스소개 = 부스소개;
		this.첨부파일 = 첨부파일;
		this.신청상태 = 신청상태;
		this.회원id = 회원id;
		this.축제id = 축제id;
	}
	

	public 신청서_VO(String 이름, String 사업자번호, String 연락처, String 부스id, String 부스소개, String 첨부파일, String 신청상태, String 회원id,
			String 축제id) {
		this.이름 = 이름;
		this.사업자번호 = 사업자번호;
		this.연락처 = 연락처;
		this.부스id = 부스id;
		this.부스소개 = 부스소개;
		this.첨부파일 = 첨부파일;
		this.신청상태 = 신청상태;
		this.회원id = 회원id;
		this.축제id = 축제id;
	}





	public String get축제id() {
		return 축제id;
	}

	public void set축제id(String 축제id) {
		this.축제id = 축제id;
	}
	
	public String get회원id() {
		return 회원id;
	}

	public void set회원id(String 회원id) {
		this.회원id = 회원id;
	}
	
	public String get신청상태() {
		return 신청상태;
	}

	public void set신청상태(String 신청상태) {
		this.신청상태 = 신청상태;
	}

	public 신청서_VO(String 회원id) {
		super();
		this.회원id = 회원id;
	}

	public String get신청id() {
		return 신청id;
	}

	public void set신청id(String 신청id) {
		this.신청id = 신청id;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get사업자번호() {
		return 사업자번호;
	}

	public void set사업자번호(String 사업자번호) {
		this.사업자번호 = 사업자번호;
	}

	public String get연락처() {
		return 연락처;
	}

	public void set연락처(String 연락처) {
		this.연락처 = 연락처;
	}

	public String get부스id() {
		return 부스id;
	}

	public void set부스id(String 부스id) {
		this.부스id = 부스id;
	}

	public String get부스소개() {
		return 부스소개;
	}

	public void set부스소개(String 부스소개) {
		this.부스소개 = 부스소개;
	}

	public String get첨부파일() {
		return 첨부파일;
	}

	public void set첨부파일(String 첨부파일) {
		this.첨부파일 = 첨부파일;
	}

}
