import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = "명령어 > ";
        String userCmd;

        while (true) {

            System.out.print(str);
            userCmd = sc.nextLine();
            userCmd = userCmd.trim();

            if (userCmd.equals("quit") || userCmd.equals("종료")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else if (
                    userCmd.equals("작성") || userCmd.equals("조회") || userCmd.equals("삭제") || userCmd.equals("수정")
            ) {
                switch (userCmd) {
                    case "작성":
                        System.out.println("작성중"); break;

                    case "조회":
                        System.out.println("조회중"); break;

                    case "삭제":
                        System.out.println("삭제중"); break;

                    case "수정":
                        System.out.println("수정중"); break;
                }
            }

            else {
                System.out.println("잘못된 입력 입니다. 다시 입력 하세요.");
            }
        }
    }
}

