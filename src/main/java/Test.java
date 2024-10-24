import board.Board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // 명령어 final로 키워드 상수로 정적배열에 넣기
        final String[] cmdArr = {
                "작성", "조회", "수정", "삭제", "quit", "종료", "목록"
        };


//        String s = " 1번 ";
//        String b = s.trim();
        Scanner sc = new Scanner(System.in);

//        String[] ar = b.split("");
//        String[] cmdSplit = sc.next().split("");
//
//        System.out.println(ar.length);
//
//        if (ar.length < 4) {
//            System.out.println("여기서만 출력");
//
//            System.out.println(ar[0]);
//            System.out.println(ar[1]);
//            System.out.println(ar[2]);
//
//        } else System.out.println("예외처리");


        Board board = new Board();
        Board board2 = new Board();
        String userCmd;


        String str = "명령어 > ";
//        HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();

//        HashMap<Integer, ArrayList<Board>> map2 = new HashMap<Integer, ArrayList<Board>>();
//        Board 객체 타입으로 가능한지 확인중

        // 여기에 재귀함수로 계속 호출하게 메인메서드 깔끔하게 정리, boardStart();


        while (true) {

            // 메소드로 변환 예정
            System.out.print("사용 가능 명령어 > ");

            // 명령어 조회, 잘못된 입력했을때 ?를 입력하면 보여주게끔
            System.out.println(Arrays.toString(cmdArr));
            System.out.print(str);
            userCmd = inputCmd();
            // 메모리 누수( obsolete reference ) 생길예정, 계속 확인하기

            if (userCmd.equals(cmdArr[0])) { // == "작성" Create


                // board클래스 게시글 작성 메소드 호출
                board.boardCreate(); // 게시판1(커뮤니티)
//                board2.boardCreate(); // 게시판2(Q&A) 작성, 호출

                // 메소드 인자가 두개일때, 세개일때 그나머지일때 예외처리
                // 여기서도 잘못된 명령어 예외처리 및 사용 가능한 명령어 출력 처리 어떻게 할지 생각

            } else if (userCmd.equals(cmdArr[1])) { // == "조회" Read

                // board클래스 게시글 조회 메소드 호출
                board.boardRead();
                // 여기서도 잘못된 명령어 예외처리 및 사용 가능한 명령어 출력 처리 어떻게 할지 생각

            } else if (userCmd.equals(cmdArr[2])) { // == "수정" Update

                // board클래스 게시글 수정 메소드 호출
                board.boardUpdate();
                // 여기서도 잘못된 명령어 예외처리 및 사용 가능한 명령어 출력 처리 어떻게 할지 생각
            } else if (userCmd.equals(cmdArr[3])) { // == "삭제" Delete

                // board클래스 게시글 삭제 메소드 호출
                board.boardDelete();
                // 여기서도 잘못된 명령어 예외처리 및 사용 가능한 명령어 출력 처리 어떻게 할지 생각

            } else if (userCmd.equals(cmdArr[4]) || userCmd.equals(cmdArr[5])) { // == "quit", "종료"

                // board클래스 종료 메소드 호출
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else if (userCmd.equals(cmdArr[6])) { // == "목록"

                // board클래스 게시글 목록 메소드 호출
                board.boardCategory();

            } else {
                // board클래스 잘못된 명령어 메소드 호출
                System.out.println("존재하지 않는 명령어 입니다. 다시 입력 하세요.");


                // 클래스내 메소드로 변경 예정

            }
//              else if (
//                    userCmd.equals("작성") || userCmd.equals("조회") || userCmd.equals("삭제") || userCmd.equals("수정")
//            ) {
//                switch (userCmd) {
//                    case "작성": { // 명령어를 부모 클래스에 멤버변수로 상수로 둬서 부모.name이 같은지, 다만 클래스 외부에서 변경 불가

            // if userCmd, 작성 제목+내용, 번호+제목+내용
//                        Board board = new Board("게시글 제목", "게시글 내용"); // 제목 내용 멤버변수로
////                        Board board2 = new Board(1, "게시판 제목", "게시판 내용");
//                        board.boardCreate();
//                        break;
//                    }
//                    case "조회":
//                        System.out.println("조회중"); break;
//
//                    case "삭제":
//                        System.out.println("삭제중"); break;
//
//                    case "수정":
//                        System.out.println("수정중"); break;
//                }
//            }

        }
    }

    public static String inputCmd() {

        String userCmd;
        Scanner sc = new Scanner(System.in);
        userCmd = sc.nextLine().trim(); // trim() : 앞 뒤 공백 제거


        // 잘못된 입력 ,종료 예외처리
        return userCmd;

    }
}

