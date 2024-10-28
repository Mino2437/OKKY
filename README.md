# OkkyBoard
**EST Oreumi Project_1**  

<table>
    <tbody>
        <tr>
            <td>언어</td> <td>Java</td>
        </tr>
        <tr>
            <td>SDK</td> <td>graalVM 21</td>
        </tr>
        <tr>
            <td>Project</td> <td>게시판 구현</td>
        </tr>
    </tbody>
</table>

## 명령어

작성, 조회, 수정, 삭제, quit, 종료, 목록

### 명령어 입력을 통한 기능

**게시글 작성**  
**게시글 조회**  
**게시글 삭제**  
**게시글 수정**  
**게시글 목록**  
**종료**  

## 트러블 슈팅
`HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();`

Map을 이용하여, 하나의 키에 여러개의 값을 넣고자 ArrayList를 이용한 Map을 구현해 사용했는데,

Map에 값이 중복되어 계속 쌓이게 되었다. map의 메소드와 arrList의 메소드의 사용법중 어떤것이 잘못된건지 다시 한번 파악해보기위해

메서드들을 찾아보고 인자를 확인해봤는데도 쉽게 알수가 없어, 하나 하나 출력해보았으며

arrList가 조건문 블럭 바깥쪽에 선언되어 있는 간단한 문제였는데, 메서드 사용법에 확신도 없고, arrList로 map을 사용해본적이 없어, 메서드를 확인하고 있었다.

따라서 조건문 안쪽에 ArrList를 생성하여 아래와 같이 value값이 쌓이지 않고 잘 출력되었다..

→ 항상 코드블럭을 조심하자, 또한 함수를 사용하기전에 제대로 파악하고 사용해야겠으며, 이제 arrList를 이용한 map은 잘 기억할것 같다.

