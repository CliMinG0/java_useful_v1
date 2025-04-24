package _object;

//import java.lang.Object;
//import java.lang.*;
//java.lang.*패키지도 자동으로 넣어준다

/*
* Object 최상위 클래스에 대한 이해
* 기본적으로 Object클래스상속을 받는다
* 자바는 Object 클래스 (모든 클래스의 최상위 클래스)를 제외하고
* 단일 상속 만을 제공 합니다
 */
//public class Book extends Object
public class Book {

    private String title;
    private String author;

    //showInfo()


    @Override
    public String toString() {
        return "title : " + title + " , " + "author : " + author;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    //테스트코드

    public static void main(String[] args) {
        Book book1 = new Book("데미안", "헤르만헤세");

        System.out.println(book1.toString()); //toString 주소값을 반환시켜줌

    }
}
