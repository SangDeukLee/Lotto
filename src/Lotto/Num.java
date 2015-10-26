package Lotto;

public class Num extends Range{
	
	private int [] arr1;
	private int bonus_num;
	private int comparison;
	private int check = 0;	// 맞춘 개수 카운트
	
	Num(int [] array, int bonus) {
		arr1 		= new int[array.length];
		bonus_num 	= bonus;
		for(int iCount = 0 ; iCount < array.length ; iCount++) {
			arr1[iCount] = array[iCount];
		}
		range(arr1);
		prtArr(arr1, bonus_num);
		
		
	}
	
	// 배열을 출력하기 위한 메소드
	private void prtArr(int[] arr1, int bonus_num) {
		System.out.println("\n" + "정답 출력");
		for( int iCount = 0 ; iCount < arr1.length ; iCount++) {
			System.out.print(arr1[iCount] + "\t");
		}
		System.out.println("보너스 번호 : " + bonus_num);
	}
	
	// 자동인지 수동인지 판별 후 실행(정답과 일치여부도 확인)
	public void autoOrpassive(int input) {
		comparison = input;
		switch(comparison) {
		case 1 :
			
			Auto_Lotto auto = new Auto_Lotto();
			
			for(int iCount = 0 ; iCount < arr1.length ; iCount++){
				for(int jCount = 0 ; jCount < arr1.length ; jCount++){
					if( arr1[iCount] == auto.getAuto_num()[jCount] )
						check++;
				}
			}
			
			if( check == 6)
				System.out.println("1등 입니다.");
			else if( check == 5 && bonus_num == auto.getBonus_num() )
				System.out.println("2등 입니다.");
			else if( check == 5 )
				System.out.println("3등 입니다.");
			else if( check == 4 )
				System.out.println("4등 입니다.");
			else if( check == 3 )
				System.out.println("5등 입니다.");
			else 
				System.out.println("꽝 입니다.");
			check = 0;
			break;
		
		case 2 :
			
			Passive_Lotto passive = new Passive_Lotto();
			
			for(int iCount = 0 ; iCount < arr1.length ; iCount++){
				for(int jCount = 0 ; jCount < arr1.length ; jCount++){
					if( arr1[iCount] == passive.getPassive_num()[jCount] )
						check++;
				}
			}
			
			if( check == 6)
				System.out.println("1등 입니다.");
			else if( check == 5 && bonus_num == passive.getBonus_num() )
				System.out.println("2등 입니다.");
			else if( check == 5 )
				System.out.println("3등 입니다.");
			else if( check == 4 )
				System.out.println("4등 입니다.");
			else if( check == 3 )
				System.out.println("5등 입니다.");
			else 
				System.out.println("꽝 입니다.");
		
			check = 0;
			break;
		}
	}
}


class Range {
	
	
	public int[] range(int [] arr1) {
		int temp;
		
		for(int iCount = 0 ; iCount < arr1.length-1 ; iCount++){
			for(int jCount = 0 ; jCount < arr1.length-1 ; jCount++){
				if(arr1[jCount] > arr1[jCount+1]){
					temp = arr1[jCount];
					arr1[jCount] = arr1[jCount+1];
					arr1[jCount+1] = temp;
				}
			}
		}
		return  arr1;
	}
	
}
