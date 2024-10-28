package exception;

public class InputException extends Exception {

    public InputException() { // 기본 생성자
        System.out.println("명령어 입력 오류"); // Exception(String message) 생성자 호출
    }

    public InputException(String msg) {
        super(msg);
    }

}