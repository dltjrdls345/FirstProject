package �����1��������Ʈ;

public class ȸ��_���Լ����α���_VO {
	String ID;
	String PW;
	String �ּ�;
	String �̸�;
	String ����ó;
	String �������;
	String �̸���;
	
	public ȸ��_���Լ����α���_VO(String iD, String pW, String �ּ�, String �̸�, String ����ó, String �������, String �̸���) {
		ID = iD;
		PW = pW;
		this.�ּ� = �ּ�;
		this.�̸� = �̸�;
		this.����ó = ����ó;
		this.������� = �������;
		this.�̸��� = �̸���;
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
	public String get�ּ�() {
		return �ּ�;
	}
	public void set�ּ�(String �ּ�) {
		this.�ּ� = �ּ�;
	}
	public String get�̸�() {
		return �̸�;
	}
	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}
	public String get����ó() {
		return ����ó;
	}
	public void set����ó(String ����ó) {
		this.����ó = ����ó;
	}
	public String get�������() {
		return �������;
	}
	public void set�������(String �������) {
		this.������� = �������;
	}
	public String get�̸���() {
		return �̸���;
	}
	public void set�̸���(String �̸���) {
		this.�̸��� = �̸���;
	}
}
