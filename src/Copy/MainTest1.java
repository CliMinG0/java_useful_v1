package Copy;

public class MainTest1 {
    //stack메모리 라는 곳에서 할당
    //얕은 복사(Shallow copy) 주소값 복사
    //기본데이터 타입(소문자로 작성), 참조타입(대문자로 작성)

    public static void main(String[] args) {

        int a = 10;
        int b = a; // 기본 데이터 타입은 값 복사
        System.out.println("a : " + a );
        System.out.println("b : " + b );

        //person 참조변수 heap 메모리에 있는 주소값이 담김
        Person person1 = new Person("홍길동");
        Person person2 = person1; //주소값 복사가 된다 -> 얕은 복사
        //즉 사람1과 사람2는 같은 객체를 바라보고 있기 때문에
        person2.name = "티모"; //person2는 name값 수정
        System.out.println(person1.name); //하지만 출력은 person1



    }//end of main
}//end of public class

class Person {

    String name;
    public Person(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}//end of class