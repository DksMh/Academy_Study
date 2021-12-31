package day1215;


public class Player {
	private String name = "";
	private String word = "";
	
	// 생성자에 String name을 인자값으로 하여 setName을 호출해서 이름 초기화
	public Player(String name) {
		setName(name);
	}
	
	// private name 을 얻기위한 getName()
	public String getName() {
		return name;
	}
	// private name을 초기화하기 위한 setName();
	public void setName(String name) {
		this.name = name;
	}

	
	// 사용자로부터 단어를 입력받는 class
	public void setWord(String word) {
		this.word = word;
	}
	
	// private word 변수를 얻기위한 getWordFromUser()
	public String getWordFromUser() {
		return word;
	}
	
	// 입력받은 문자가 인정되면 계속 불인정되면 player 졌습니다. 종료
	public boolean checkSuccess(String prevword) {
		int lastIndex = prevword.length() -1;
		char lastChar = prevword.charAt(lastIndex);
		char firstChar = word.charAt(0);
		// 이전 단어의 마지막과 사용자가 입력한 단어의 첫번째가 
		// 맞으면 true, 다르면 false 반환
		if(lastChar==firstChar) {
			return true;
		}else
			return false;
	}
	
	
	
}


