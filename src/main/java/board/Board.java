package board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Board {

    HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>(); // ArrList 인자로, # 1번
//    HashMap<Integer, ArrayList<Board>> map = new HashMap<Integer, ArrayList<Board>>(); // # 2번
    // Map, ArrList<객체>로 받음

    // 게시판 상태
    // 게시판 번호
    private int num;
    // 게시판 제목
    private String title;
    // 게시판 내용
    private String content;
    private ArrayList<Board> boardList;

    public Board() {

    }

    public Board(String title ,String content ) { // 제목과 내용으로 입력받아서

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

    // 0. Start 게시글 동작, 재귀호출
    public void boardStart() {

    };

    // 1. Create 게시글 작성
    public void boardCreate() {

        System.out.print("제목을 입력하세요 > ");
        this.title = inputCmd();

        System.out.print("내용을 입력하세요 > ");
        this.content = inputCmd();
        // 입력도 여기서 받게끔

        ArrayList<String> boardList = new ArrayList<String>(); // 어레이리스트를 인자로 map에 넣기위해 , # 1번
//        ArrayList<Board> boardList = new ArrayList<Board>(); // 어레이리스트를 인자로 map에 넣기위해 , # 2번
        // boardCreate에서의 값만 어레이리스트에 넣기 위해, 하나의 map value에 쌓이지 않기위해 여기서 사용

        boardList.add(this.title); // # 1번
        boardList.add(this.content); // # 2번

//        boardList.add(new Board(this.title,this.content)); // # 2번
        this.num++; // 작성 호출할때마다 게시글 번호 증가

        map.put(this.num, boardList);
        map.put(this.num, boardList);

        System.out.println("밸류" + map.get(this.num));

        System.out.println("맵밸류" + map.values());
        System.out.println("키셋" + map.keySet());
        System.out.println("맵사이즈" + map.size());


    }

    // 2. Read 게시글 조회
    public void boardRead() {

        System.out.print("어떤 게시물을 조회할까요? ");
        System.out.println("등록된 게시물 번호 : " + map.keySet());
        System.out.println("입력 예시 : 1번 또는 1 ");
//        System.out.println(numConv);

//        String tmp = inputCmd();

        String[] tmpSplit = inputCmd().split("번");

        Integer key = Integer.parseInt(tmpSplit[0]);
        // key값은 primitive 타입은 올수없고, Reference type인 Integer로 정수형을 사용할 수 있다.

        if(map.containsKey(key)) { // 키값 있는지 확인, boolean 타입 리턴
            System.out.println(key);
            System.out.println(key + "번 게시물을 조회합니다..");
            System.out.println(map.get(key));

        }
        else {
            System.out.println(key + " 번 게시물은 존재하지 않습니다..");
        }

//        for (key=0; key<map.size(); key++) {
//
//            key = Integer.parseInt(tmpSplit[0]);
//            if(map.containsKey(key)) { // 키값 있는지 확인, boolean 타입 리턴
//                System.out.println(key);
//                System.out.println(key + "번 게시물을 조회합니다..");
//                System.out.println(map.get(key));
//                break;
//            }
//            else {
//                System.out.println(key + " 번 게시물은 존재하지 않습니다..");
//                break;
//            }
//
//        }

//        for (Integer key : map.keySet()) { // key값은 primitive 타입은 올수없고, Reference type인 Integer로 정수형을 사용할 수 있다.

//            key = Integer.parseInt(tmpSplit[0]);
//            if(map.containsKey(key)) { // 키값 있는지 확인, boolean 타입 리턴
//                System.out.println(key);
//                System.out.println(key + "번 게시물을 조회합니다..");
//                System.out.println(map.get(key));
//                break;
//            }
//            else {
//                System.out.println(key + " 번 게시물은 존재하지 않습니다..");
//                break;
//            }

//            if (Integer.parseInt(tmpSplit[0]) == key) {
//                System.out.println(key + "번 게시물을 조회합니다..");
//                System.out.println(map.get(key)); // 괜히 arrList써서 key값 찾으려면 다시 split하고 반복해야함..
//                break;
//            }

    }

    // 3. Update 게시글 수정
    public void boardUpdate() {

        System.out.print("어떤 게시물을 수정할까요? ");
        System.out.println("등록된 게시물 번호 : " + map.keySet());
        System.out.println("입력 예시 : 1번 또는 1 ");

        String[] tmpSplit = inputCmd().split("번");

        Integer key = Integer.parseInt(tmpSplit[0]);
        // key값은 primitive 타입은 올수없고, Reference type인 Integer로 정수형을 사용할 수 있다.

        if(map.containsKey(key)) { // 키값 있는지 확인, boolean 타입 리턴
            System.out.println(key);
            System.out.println(key + "번 게시물을 수정합니다..");

            map.remove(key);
            ArrayList<String> arrTmp = new ArrayList<String>();

            System.out.print("제목을 입력하세요 > ");
            String tmpTitle = inputCmd();

            System.out.print("내용을 입력하세요 > ");
            String tmpContent = inputCmd();

            arrTmp.add(tmpTitle);
            arrTmp.add(tmpContent);

            map.put(key, arrTmp);
            System.out.println("맵 밸류 " + map.values());
            System.out.println("키셋 " + map.keySet());

            System.out.println(map.get(key));

        }
        else {
            System.out.println(key + " 번 게시물은 존재하지 않습니다..");
        }

    }

    // 4. Delete, 게시글 삭제
    public void boardDelete() {

        System.out.print("어떤 게시물을 삭제할까요? ");
        System.out.println("등록된 게시물 번호 : " + map.keySet());
        System.out.println("입력 예시 : 1번 또는 1 ");

        String[] tmpSplit = inputCmd().split("번");

        Integer key = Integer.parseInt(tmpSplit[0]);
        // key값은 primitive 타입은 올수없고, Reference type인 Integer로 정수형을 사용할 수 있다.

        if(map.containsKey(key)) { // 키값 있는지 확인, boolean 타입 리턴
            System.out.println(key);
            System.out.println(key + "번 게시물을 삭제합니다..");

            map.remove(key);
            System.out.println(key + "번 게시물이 성공적으로 삭제되었습니다..!");
            System.out.println(map.get(key));

        }
        else {
            System.out.println(key + " 번 게시물은 존재하지 않습니다..");
        }

    }


    // 5. Exit, 게시글 종료
    public void boardExit() {
        System.out.println(title + "종료");
    }
    // 6. Category, 게시글 목록
    public void boardCategory() {

        System.out.println("총 게시글 : " + map.values());

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

        return userCmd;
//        String strLast = userCmd.substring(userCmd.length()-1);
//
//        if(strLast.equals("번")){
//            return userCmd;
//        }
//        // 잘못된 입력 ,종료 예외처리 부분 만들어줘야함
//
//        // 사이 공백문자 예외처리 해야함
//        else {
//            return("잘못된 입력입니다.");

    }
//    public String toString() {
//        return String.format("%")
//    }

}