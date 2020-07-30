package fegopa;

public class 축제VO {
	
	private String 축제ID;
	private String 축제명;
	private String 시작기간;
	private String 종료기간;
	private String 주소;
	private String 기관연락처;
	private String 축제설명;
	private String 첨부파일;
	private String 주최ID;
	
	

	public 축제VO(String 축제id, String 축제명, String 시작기간, String 종료기간, String 주소, String 기관연락처, String 축제설명, String 첨부파일,
			String 주최id) {
		축제ID = 축제id;
		this.축제명 = 축제명;
		this.시작기간 = 시작기간;
		this.종료기간 = 종료기간;
		this.주소 = 주소;
		this.기관연락처 = 기관연락처;
		this.축제설명 = 축제설명;
		this.첨부파일 = 첨부파일;
		주최ID = 주최id;
	}

	public 축제VO(String 축제id, String 축제명, String 시작기간, String 종료기간, String 주소, String 기관연락처, String 축제설명, String 첨부파일) {
		this.축제ID = 축제id;
		this.축제명 = 축제명;
		this.시작기간 = 시작기간;
		this.종료기간 = 종료기간;
		this.주소 = 주소;
		this.기관연락처 = 기관연락처;
		this.축제설명 = 축제설명;
		this.첨부파일 = 첨부파일;
	}

	public String get주최ID() {
		return 주최ID;
	}

	public void set주최ID(String 주최id) {
		주최ID = 주최id;
	}
	
	public String get축제ID() {
		return 축제ID;
	}

	public void set축제ID(String 축제id) {
		this.축제ID = 축제id;
	}

	public String get축제명() {
		return 축제명;
	}

	public void set축제명(String 축제명) {
		this.축제명 = 축제명;
	}

	public String get시작기간() {
		return 시작기간;
	}

	public void set시작기간(String 시작기간) {
		this.시작기간 = 시작기간;
	}

	public String get종료기간() {
		return 종료기간;
	}

	public void set종료기간(String 종료기간) {
		this.종료기간 = 종료기간;
	}

	public String get주소() {
		return 주소;
	}

	public void set주소(String 주소) {
		this.주소 = 주소;
	}

	public String get기관연락처() {
		return 기관연락처;
	}

	public void set기관연락처(String 기관연락처) {
		this.기관연락처 = 기관연락처;
	}

	public String get축제설명() {
		return 축제설명;
	}

	public void set축제설명(String 축제설명) {
		this.축제설명 = 축제설명;
	}

	public String get첨부파일() {
		return 첨부파일;
	}

	public void set첨부파일(String 첨부파일) {
		this.첨부파일 = 첨부파일;
	}
	
	
	
	



}

