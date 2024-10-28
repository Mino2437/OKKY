import board.Board;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 명령어 final로 키워드 상수로 정적배열에 넣기
        final String[] cmdArr = {
                "작성", "조회", "수정", "삭제", "quit", "종료", "목록"
        };

        Board board = new Board();

        String userCmd;

        String str = "명령어 > ";

        // 메인메서드 깔끔하게 정리, boardStart();
        while (true) {

            // 메소드로 변환 예정
            System.out.print("사용 가능 명령어 > ");

            // 명령어 조회
            System.out.println(Arrays.toString(cmdArr));
            System.out.print(str);
            userCmd = board.inputCmd();
            // 메모리 누수( obsolete reference ) 생길예정, 계속 확인하기

            if (userCmd.equals(cmdArr[0])) { // == "작성" Create

                // board클래스 게시글 작성 메소드 호출
                board.boardCreate(); // 게시판1

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

        }
    }

}

