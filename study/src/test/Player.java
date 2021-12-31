package test;

// 생성자 - 해결
// getWordFromuser - 해결
// checkSuccess - 해결

public class Player {
	
	String name = "";
	String word = "";
	
	Player(String name){
		this.name = name; // 명확하게 하기 위해서
	}
	
	// 플레이어가 갖은 단어를 반환하는 함수 정의
	public String getWordFromuser() {
		return word;
	}
	
	public boolean checkSuccess(String prevword) {
		int lastIndex = prevword.length()-1;  		// 마지막 문자에 대한 인덱스
		char lastChar = prevword.charAt(lastIndex); // 마지막 문자
		char firstChar = word.charAt(0); 			// 첫 번째 문자
		
		if(lastChar == firstChar) {
			return true; // 같으면 문제 없음
		}else {
			return false; // --> while문을 나옴
		}
		
	}

}
