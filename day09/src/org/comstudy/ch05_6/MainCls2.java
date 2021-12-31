package org.comstudy.ch05_6;

import static java.lang.System.out;

import java.util.Scanner;

class Music {
   // 가수, 노래
   private String type;
   private String song;
   public Music(String song, String type) {
      this.type = type;
      this.song = song;
   }
   public void play() {
      System.out.printf("%s type의 %s가 실행됩니다.", type, song);
   }
   
   public String getType() {
	   return type;
   }
   public void setType(String type) {
	   this.type = type;
   }
   public String getSong() {
	   return song;
   }
   public void setSong(String song) {
	   this.song = song;
   }
}

class DanceMusic extends Music {
   private String name;
   public DanceMusic(String name, String song, String type) {
      super(song, type);
      this.name = name;
   }
   @Override
   public void play() {
      super.play();
      System.out.printf("가수는 %s입니다.", name);
   }
}

class NCSMusic extends Music {
   public NCSMusic(String song, String type) {
      super(song, type);
   }
   
   @Override
   public void play() {
      super.play();
      System.out.println("No Copyrignt Sound!");
   }
}


class MusicPlayer{ // 음악을 틀어주는 역할 따로 노는 것	
//	private Music[] musicList = new Music[12];
	public Music[] musicList = new Music[12];
	private int top = 0; // 아직 한 것이 없음
		
	public void setTop(int top) {
		this.top = top;
	}
	
//	public void appendMusic(Music music) {
	public void appendMusic() {
		//음악 추가
		System.out.print("1. 댄스 음악, 2. NCS 음악 >> ");
		int num = scan.nextInt();
		switch(num) {
		case 1:
			System.out.print("가수와 음악과 타입을 적어 추가 >>");
			String name = scan.next();
			String song = scan.next();
			String type = scan.next();
			musicList[top++] = new DanceMusic(name, song, type);
//			System.out.printf("%s, %s, %s\n",name,song,type);
			break;
		case 2:
			System.out.print("음악과 타입을 적어 추가 >>");
			String song2 = scan.next();
			String type2 = scan.next();
			System.out.printf("%s, %s\n",song2, type2);
			musicList[top++] = new NCSMusic(song2, type2);
			break;
		default:
			break;
		}
	}

//	public Music removeMusic(int i) { //몇 번째를 제거할 겁니까.
	public void removeMusic() { //몇 번째를 제거할 겁니까.
		// 음악 제거
		System.out.print("노래 제거 이름 >> ");
		String removesong = scan.next();
//		int num = 0;
		for(int i = 0; i<top; i++) {
			if(removesong.equals(musicList)) {
				System.out.println(musicList[i].getSong() + "을 삭제합니다.");
				musicList[i] = new Music("", "");
				top--;
//				num += 1;
				break;
			}
			if(!(removesong.equals(musicList))) {
				System.out.printf("%s는 플리에 없는 노래",removesong);
			}
				
		}
//		return null;
	}
//	public Music findMusic(Music music) {
	public Music findMusic() {
		// 음악 검색
		return null;
	}
	public void playAllMusic() {
		// 모든 음악 실행
		
	}
	
	Scanner scan = new Scanner(System.in);
	 public void menu() {
		 System.out.println("1.추가 2.전체곡실행 3.선택곡실행 4.제거 5.종료");
		 System.out.print("선택 >> ");
		 int num = scan.nextInt();
		 switch(num) {
		 case 1 : appendMusic(); break;
		 case 2 : playAllMusic(); break;
		 case 3 : findMusic(); break;
		 case 4 : removeMusic(); break;
		 case 5 :
			 break;
		 }
		 
	 }
	
	
}




public class MainCls2 {

	public static void main(String[] args) {
		MusicPlayer muzlist = new MusicPlayer();
		muzlist.menu();
		

	}

}
