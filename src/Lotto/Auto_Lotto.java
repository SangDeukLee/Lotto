package Lotto;
import java.util.Scanner;


public class Auto_Lotto extends Range{
	private int [] auto_num;
	private int bonus_num;
	
	// 자동으로 로또번호를 찍는 생성자
	Auto_Lotto() {
		System.out.println("");
		
		setAuto_num();
		setBonus_num();
		range(auto_num);
		prtNum();
		
	}
	
	
	// 자동을 선택한 경우 자동으로 번호 선택
	private void setAuto_num() {
		auto_num = new int [6];
		// 반복제거
		for(int iCount = 0 ; iCount < auto_num.length ; iCount++) {
			
			auto_num[iCount] = (int) (Math.random() * 49 + 1);
			
			for( int jCount = 0 ; jCount < iCount ; jCount++){
				while(true){
					if(auto_num[jCount] == auto_num[iCount]){
						
						auto_num[iCount] = (int) (Math.random() * 49 + 1);
						
						if(auto_num[jCount] != auto_num[iCount])
							break;

					}
					else
						break;
				}
			}
			
		}
	}
	
	// 배열을 들고 오기위한 getter 메소드
	public int[] getAuto_num() {
		return auto_num;
	}
	
	// 보너스 번호 
	private void setBonus_num() {
		Scanner scan = new Scanner(System.in);
		bonus_num = (int) (int) (Math.random() * 49 + 1);
		for( int iCount = 0 ; iCount < auto_num.length ; iCount++ ) {
			if ( bonus_num == auto_num[iCount] )
				continue;
			else 
				break;
		}
	}
	
	private void prtNum() {
		for( int iCount = 0 ; iCount < auto_num.length ; iCount++)
			System.out.print(auto_num[iCount] + "\t");
		System.out.println("보너스 번호 : " + bonus_num );
	}
	
	public int getBonus_num() {
		return bonus_num;
	}
}
