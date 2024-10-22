package board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Board {


    // 게시판 상태
    // 게시판 번호
    private int num;
    // 게시판 제목
    private String title;
    // 게시판 내용
    private String content;

    public Board() {

    }

    public Board(String title ,String content ) {

        this.title = title; // 게시판 제목
        this.content = content; // 게시판 내용

    }
    public Board(int num ,String title ,String content ) {

        this.num = num; // 게시판 번호
        this.title = title; // 게시판 제목
        this.content = content;  // 게시판 내용

    }

    // 위에서 부모클래스를 인스턴스 생성해버려서 입력받을때 비교하면됨 !!!
    // board라는 부모 클래스를 만들어서, 입력을 상수 static 변수로 만들어 명령어에 접근하지 못하도록
    // 게시판, 댓글 부모 클래스
    // 입력 받을때 중복되는 요소들을 상속받아 자식 클래스로 만듦
    // 하위클래스를 CRUD로 나눔

    // 행동, CRUD , 작성 Create, 조회 Read, 수정 Update, 삭제 Delete
    // 1. Create 게시글 작성
    public void boardCreate() {
        System.out.print("제목을 입력하세요 > ");
        String tmp1 = inputCmd();
        this.title = tmp1;

        System.out.print("내용을 입력하세요 > ");
        String tmp2 = inputCmd();
        this.content = tmp2;
        // 입력도 여기서 받게끔

//        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
//        ArrayList<String> boardList= new ArrayList<String>();
//        boardList.add(title);
//        boardList.add(content);
//        map.put("1", boardList);
//        System.out.println(map.values());
//
        Board board = new Board(tmp1, tmp2);

    }
    // 2. Read 게시글 조회
    public void boardRead() {
        System.out.println(title + "을/를 조회중");
    }

    // 3. Update 게시글 수정
    public void boardUpdate() {
        System.out.println(title + "을/를 수정중");
    }

    // 4. Delete, 게시글 삭제
    public void boardDelete() {
        System.out.println(title + "을/를 삭제중.");
    }

    // 5. Exit, 게시글 종료
    public void boardExit() {
        System.out.println(title + "종료");
    }
    // 6. Category, 게시글 목록
    public void boardCategory() {
        System.out.println(title + "목록");
    }

    // getter, 클래스내 private 멤버변수 접근 가능
    public int getNum() { //  게시글 번호 리턴
        return num;
    }
    public String getTitle() { // 게시글 제목 리턴
        return title;
    }
    public String getContent() { // 게시글 내용 리턴
        return content;
    }


    // setter
    public void setNum(int num) { // 게시글 번호
        this.num = num;
    }
    public void setTitle(String title) { // 게시글 제목
        this.title = title;
    }
    public void setContent(String content) { // 게시글 내용
        this.content = content;
    }
    public static String inputCmd() {

        String userCmd;
        Scanner sc = new Scanner(System.in);
        userCmd = sc.nextLine().trim(); // trim() : 앞 뒤 공백 제거


        // 잘못된 입력 ,종료 예외처리
        return userCmd;

    }

}