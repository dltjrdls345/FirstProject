package fegopa;

public class 부스VO {
	////
	private String 부스ID;
	private String 부스종류;
	private int 대여료;
	private String 대여시작기간;
	private String 대여종료기간;
	private String 부스크기;
	private String 부스상태;
	private String 축제ID;
	private String 주최ID;
	
	public 부스VO(String 부스id, String 부스종류, int 대여료, String 대여시작기간, String 대여종료기간, String 부스크기, String 부스상태,
			String 축제id,String 주최id) {
		this.부스ID = 부스id;
		this.부스종류 = 부스종류;
		this.대여료 = 대여료;
		this.대여시작기간 = 대여시작기간;
		this.대여종료기간 = 대여종료기간;
		this.부스크기 = 부스크기;
		this.부스상태 = 부스상태;
		this.축제ID = 축제id;
		this.주최ID = 주최id;
	}
	public String get부스ID() {
		return 부스ID;
	}
	public void set부스ID(String 부스id) {
		this.부스ID = 부스id;
	}
	public String get부스종류() {
		return 부스종류;
	}
	public void set부스종류(String 부스종류) {
		this.부스종류 = 부스종류;
	}
	public int get대여료() {
		return 대여료;
	}
	public void set대여료(int 대여료) {
		this.대여료 = 대여료;
	}
	public String get대여시작기간() {
		return 대여시작기간;
	}
	public void set대여시작기간(String 대여시작기간) {
		this.대여시작기간 = 대여시작기간;
	}
	public String get대여종료기간() {
		return 대여종료기간;
	}
	public void set대여종료기간(String 대여종료기간) {
		this.대여종료기간 = 대여종료기간;
	}
	public String get부스크기() {
		return 부스크기;
	}
	public void set부스크기(String 부스크기) {
		this.부스크기 = 부스크기;
	}
	public String get부스상태() {
		return 부스상태;
	}
	public void set부스상태(String 부스상태) {
		this.부스상태 = 부스상태;
	}
	public String get축제ID() {
		return 축제ID;
	}
	public void set축제ID(String 축제id) {
		this.축제ID = 축제id;
	}
	public String get주최ID() {
		return 주최ID;
	}
	public void set주최ID(String 주최id) {
		this.주최ID = 주최id;
	}
	
}
