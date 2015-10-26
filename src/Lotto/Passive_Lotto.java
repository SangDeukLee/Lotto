package Lotto;
import java.util.*;

public class Passive_Lotto extends Range{
	private int [] passive_num;
	private int bonus_num;
	
	Passive_Lotto() {
		System.out.println("");
		
		setPassive_num();
		setBonus_num();
		range(passive_num);
		prtNum();
	}
	
	private void setPassive_num() {
		
		Scanner scan = new Scanner(System.in);
		passive_num = new int [6];
		for(int iCount = 0 ; iCount < 6 ; iCount++ ){
			switch(iCount){
			case 0 :	
				System.out.println("첫 번째 수를 입력하세요");
				passive_num[iCount] = scan.nextInt();
				break;
			case 1 :
				System.out.println("두 번째 수를 입력하세요");
				passive_num[iCount] = scan.nextInt();
				for(int jCount = 0 ; jCount < iCount ; jCount++) {
					if( passive_num[iCount] == passive_num[jCount] ){
						System.out.println("이미 있는 숫자 입니다.");
						System.out.println("다시 입력하세요.");
						iCount--;
					}
				}
				break;
			case 2 : 	
				System.out.println("세 번째 수를 입력하세요");
				passive_num[iCount] = scan.nextInt();
				for(int jCount = 0 ; jCount < iCount ; jCount++) {
					if( passive_num[iCount] == passive_num[jCount] ){
						System.out.println("이미 있는 숫자 입니다.");
						System.out.println("다시 입력하세요.");
						iCount--;
					}
				}
				break;
			case 3 :	
				System.out.println("네 번째 수를 입력하세요");
				passive_num[iCount] = scan.nextInt();
				for(int jCount = 0 ; jCount < iCount ; jCount++) {
					if( passive_num[iCount] == passive_num[jCount] ){
						System.out.println("이미 있는 숫자 입니다.");
						System.out.println("다시 입력하세요.");
						iCount--;
					}
				}
				break;
			case 4 :
				System.out.println("다섯 번째 수를 입력하세요");
				passive_num[iCount] = scan.nextInt();
				for(int jCount = 0 ; jCount < iCount ; jCount++) {
					if( passive_num[iCount] == passive_num[jCount] ){
						System.out.println("이미 있는 숫자 입니다.");
						System.out.println("다시 입력하세요.");
						iCount--;
					}
				}
				break;
			case 5 :
				System.out.println("여섯 번째 수를 입력하세요");
				passive_num[iCount] = scan.nextInt();
				for(int jCount = 0 ; jCount < iCount ; jCount++) {
					if( passive_num[iCount] == passive_num[jCount] ){
						System.out.println("이미 있는 숫자 입니다.");
						System.out.println("다시 입력하세요.");
						iCount--;
					}
				}
				break;
			}
		}		
	}
	
	public int[] getPassive_num() {
		return passive_num;
	}
	
	// 보너스 번호 
	private void setBonus_num() {
		Scanner scan = new Scanner(System.in);
		System.out.println("보너스 번호를 입력하세요");
		bonus_num = scan.nextInt();
		for(int iCount = 0 ; iCount < passive_num.length ; iCount++ ) {
			do {
				if( bonus_num == passive_num[iCount]){
					System.out.println("이미 있는 숫자 입니다.");
					System.out.println("다시 입력하세요.");
					bonus_num = scan.nextInt();
				}	
			}while(passive_num[iCount] == bonus_num);
		}
	}
	
	private void prtNum() {
		for( int iCount = 0 ; iCount < passive_num.length ; iCount++)
			System.out.print(passive_num[iCount] + "\t");
		System.out.println("보너스 번호 : " + bonus_num );
	}
	
	public int getBonus_num() {
		return bonus_num;
	}
}
