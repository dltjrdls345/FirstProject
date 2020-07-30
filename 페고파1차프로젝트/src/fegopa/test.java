package fegopa;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		///

		Scanner sc = new Scanner(System.in);
		
		일반회원_DAO 일반dao = new 일반회원_DAO();
//		일반회원_VO vo1 = new 일반회원_VO("iD2", "pW", "주소", "이름", "연락처", "생년월일", "이메일");
//		System.out.println(일반dao.insert(vo1));
		
		
		//로그인 기능 : id, pw 입력받기
//		System.out.print("id 입력 >> ");
//		String id = sc.next();
//		System.out.print("pw 입력 >> ");
//		String pw = sc.next();
		String res = 일반dao.logIN(new 일반회원_VO("123","11"));
		if(res !=null) {
		일반dao.updateLogtime("123");}
//		System.out.println(일반dao.updateLogtime(id));
		System.out.println("현재 로그인 된 아이디" + 일반dao.selectID());
		
		
		
		//로그인한 회원 정보 보여주기
		System.out.println(일반dao.showCustomerInfo().get생년월일());
		System.out.println(일반dao.showCustomerInfo().get연락처());
		System.out.println(일반dao.showCustomerInfo().get이름());
		System.out.println(일반dao.showCustomerInfo().get이메일());
		System.out.println(일반dao.showCustomerInfo().get주소());
		
		
		일반회원_VO vo = null;
		//로그인한 회원 정보 변경
		int cnt = 일반dao.updateCustomerInfo(vo = new 일반회원_VO("12345", "광주", "예슬", "010", "1997", "dptmf24@naver.com"));
		
		System.out.println(cnt + " " + 일반dao.selectID()+" 님의 변경된 패스워드 : " +일반dao.showCustomerInfo().getPW());
	}

}
