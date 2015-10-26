package Lotto;
import java.util.*;


public class Main {
	
	public static void main(String [] args) {
		
		Num obj;
		int bonus_num = 0;
		
		// 정답을 자동으로 생성해 놓은 수를 담아놓는 배열 선언
		int answer [] = new int[6];
		
		// 배열에 정답을 담아놓음
		for(int iCount = 0 ; iCount < answer.length ; iCount++) {
			answer[iCount] = (int) (Math.random() * 49 + 1);
			// 동일한 수를 저장하지 않기 위한 for문
			for( int jCount = 0 ; jCount < iCount ; jCount++){
				while(true){
					if(answer[jCount] == answer[iCount]){
						
						answer[iCount] = (int) (Math.random() * 49 + 1);
					
						if(answer[jCount] != answer[iCount])
							break;
					}
					else
						break;
				}
			}	
		}
		
		// 정답 배열을 정렬
		int temp;
		for(int iCount = 0 ; iCount < answer.length-1 ; iCount++){
			for(int jCount = 0 ; jCount < answer.length-1 ; jCount++){
				if(answer[jCount] > answer[jCount+1]){
					temp = answer[jCount];
					answer[jCount] = answer[jCount+1];
					answer[jCount+1] = temp;
				}
			}
		}
		
		//보너스 번호 등록
		for( int iCount = 0 ; iCount < answer.length ; iCount++ ){
			bonus_num = (int) (Math.random() * 49 + 1);
			if( bonus_num == answer[iCount] )
				continue;
		}
		
		while(true){
			int input;
			Scanner scan = new Scanner(System.in);
			System.out.println("\n선택하세요.");
			System.out.println("1.자동  2. 수동");
			input = scan.nextInt();
			
			obj = new Num(answer, bonus_num);
			obj.autoOrpassive(input);
			
		}	
	}
}
