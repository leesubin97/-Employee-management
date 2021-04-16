package main;
import java.util.List;
import java.util.Scanner;

import dao.MemberDao;
import dto.MemberDto;

public class MemberProcess {

	MemberDao dao = MemberDao.getInstance();
	
	public void insertMember() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사원정보를 입력헤주세요");
		System.out.println("사원아이디:");
		String id = sc.next();
		
		System.out.println("사원이름:");
		String name = sc.next();
		
		System.out.println("사원전화번호:");
		String phone = sc.next();
		
		System.out.println("사원직무:");
		String job = sc.next();
		
		System.out.println("사원부서:");
		String dep = sc.next();
		
		MemberDto dto = new MemberDto(id, name, phone, job, dep);
		
		boolean a = dao.insert(dto);
		
		if(a) {
			System.out.println("사원등록완료.");
		}else {
			System.out.println("사원등록실패");
		}
		
		
	}
	
	public void MemberList() {
		
		List<MemberDto> list =dao.getMember();
		
		System.out.println("==========사원리스트==========");
		
		for (MemberDto memberDto : list) {
			System.out.println(memberDto);
		}
		
		
	}
	
}
