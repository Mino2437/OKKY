import board.Board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {

        // 명령어 final로 키워드 상수로 정적배열에 넣기
        final String[] cmdArr = {
                "작성", "조회", "수정", "삭제", "quit", "종료", "목록"
        };
        Board board = new Board();
        String userCmd;

        String str = "명령어 > ";
        HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
        int i=1;
        int j=1;

        while (true) {

            System.out.print(str);
            userCmd = inputCmd();
            // 메모리 누수( obsolete reference ) 생길예정, 계속 확인하기

            if (userCmd.equals(cmdArr[0])) { // == "작성" Create

                board.boardCreate();
                System.out.println(board.getTitle() + "  " + board.getContent());

                System.out.print("겟타이틀");
                System.out.println(board.getTitle());

                ArrayList<String> boardList= new ArrayList<String>(); // 어레이리스트를
                boardList.add(board.getTitle());
                boardList.add(board.getContent());
                System.out.println("보드리스트 "+ boardList);

                map.put(i,boardList);
                i++;
                System.out.println("맵밸류" + map.values());
                System.out.println("키셋" + map.keySet());
                System.out.println("맵사이즈" + map.size());

                // 메소드 인자가 두개일때, 세개일때 그나머지일때 예외처리
                // board클래스 게시글 작성 메소드 호출
                // 여기서도 잘못된 명령어 예외처리 및 사용 가능한 명령어 출력 처리 어떻게 할지 생각

            } else if (userCmd.equals(cmdArr[1])) { // == "조회" Read


                // board클래스 게시글 조회 메소드 호출
                // 여기서도 잘못된 명령어 예외처리 및 사용 가능한 명령어 출력 처리 어떻게 할지 생각
                break;
            } else if (userCmd.equals(cmdArr[2])) { // == "수정" Update

                // board클래스 게시글 수정 메소드 호출
                // 여기서도 잘못된 명령어 예외처리 및 사용 가능한 명령어 출력 처리 어떻게 할지 생각
                break;
            } else if (userCmd.equals(cmdArr[3])) { // == "삭제" Delete

                // board클래스 게시글 삭제 메소드 호출
                // 여기서도 잘못된 명령어 예외처리 및 사용 가능한 명령어 출력 처리 어떻게 할지 생각
                break;
            } else if (userCmd.equals(cmdArr[4]) || userCmd.equals(cmdArr[5])) { // == "quit", "종료"

                // board클래스 종료 메소드 호출

                System.out.println("프로그램이 종료됩니다.");
                break;

            } else if (userCmd.equals(cmdArr[6])) { // == "목록"

                // board클래스 게시글 목록 메소드 호출
                break;
            } else {
                // board클래스 잘못된 명령어 메소드 호출
                System.out.println("잘못된 입력 입니다. 다시 입력 하세요.");
//                Board board = new Board("게시글 제목", "게시글 내용"); // 제목 내용 멤버변수로
//                Board board2 = new Board(1, "게시판 제목", "게시판 내용");
//                board2.boardCreate();


                // 클래스내 메소드로 변경 예정
                System.out.print("사용 가능 명령어 > ");
                System.out.println(Arrays.toString(cmdArr)); // 명령어 조회, 잘못된 입력했을때 ?를 입력하면 보여주게끔
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

