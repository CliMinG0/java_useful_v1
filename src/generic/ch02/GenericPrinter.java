package generic.ch02;

/*
* 제네릭 프로그래밍을 사용해보자
* 문법 클래스, 데이터 타입, 메서드 등에서 <T> 대체 문자열을 선언 할수 있다
*/
public class GenericPrinter<T> {

    // T(Type) 라는 대체 문자 를 사용 아무 문자나 사용 가능하다, E(elements) K(key) V(value)를 많이 씀
    //자료형 매개변수라고 함 (type parameter)
    //이 클래스는 사용하는 시점에 실제 사용될 자료형이 결정이 된다.

    T material; //T 대체 문자형으로 변수를 선언할수 있다

    //getter,setter
    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "GenericPrinter{" +
                "material=" + material +
                '}';

    }

}//end of class
