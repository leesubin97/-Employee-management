package main;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MemberProcess mem = new MemberProcess();
		
		boolean t = true;

		while (t) {
            System.out.println();
            System.out.println("============== 사원 관리 프로그램 ==============");
            System.out.println("1. 사원목록");         
            System.out.println("2. 사원등록   ");
            System.out.println("3. 종료");
            System.out.println("=========================================");
            System.out.print("메뉴를 입력하세요 : ");
           
            Scanner scn = new Scanner(System.in);
            int num=0;
            
             num = scn.nextInt();
               
            switch (num) {
            case 1:
            	mem.MemberList();//회원목록         
                break;
            case 2:
            	mem.insertMember(); //회원 등록
                break;
       
            case 3:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0); //프로그램 종료
                   
            }//end switch()---------------
        }//while---------------------      
		
	}
}
