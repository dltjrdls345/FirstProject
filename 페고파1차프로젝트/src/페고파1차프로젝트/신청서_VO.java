package 페고파1차프로젝트;

public class 신청서_VO {

	// apply 테이블이 가지고 있는 칼럼
	private String app_id;
	private String cus_id;
	private String app_num;
	private String cus_tel;
	private String boo_id;
	private String app_int;
	private String fes_file;

	public 신청서_VO(String app_id, String cus_id, String app_num, String cus_tel, String boo_id, String app_int,
			String fes_file) {
		this.app_id = app_id;
		this.cus_id = cus_id;
		this.app_num = app_num;
		this.cus_tel = cus_tel;
		this.boo_id = boo_id;
		this.app_int = app_int;
		this.fes_file = fes_file;
	}

	public 신청서_VO(String app_id, String cus_id, String app_num, String cus_tel, String boo_id, String app_int) {
		this.app_id = app_id;
		this.cus_id = cus_id;
		this.app_num = app_num;
		this.cus_tel = cus_tel;
		this.boo_id = boo_id;
		this.app_int = app_int;
	}

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public String getCus_id() {
		return cus_id;
	}

	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}

	public String getApp_num() {
		return app_num;
	}

	public void setApp_num(String app_num) {
		this.app_num = app_num;
	}

	public String getCus_tel() {
		return cus_tel;
	}

	public void setCus_tel(String cus_tel) {
		this.cus_tel = cus_tel;
	}

	public String getBoo_id() {
		return boo_id;
	}

	public void setBoo_id(String boo_id) {
		this.boo_id = boo_id;
	}

	public String getApp_int() {
		return app_int;
	}

	public void setApp_int(String app_int) {
		this.app_int = app_int;
	}

	public String getFes_file() {
		return fes_file;
	}

	public void setFes_file(String fes_file) {
		this.fes_file = fes_file;
	}


}
