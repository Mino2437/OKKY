package exception;

public class InputException extends Exception {

    public InputException() { // 기본 생성자
        System.out.println("명령어 입력 오류, 다시 입력하세요"); // Exception 생성자 호출
    }

}