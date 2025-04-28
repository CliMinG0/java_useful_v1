package inner;

public class OuterClass {

    private int num = 10;
    //inner 클래스란 클래스 안 클래스를 말한다
    //멤버 내부 클래스
    class InnerClass{
        public  void display(){
            System.out.println("inner class display() 호출" + num);
        }

    }//inned class end

    public static void main(String[] args) {

        //InnerClass innerClass = new InnerClass();
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();

    }

}//outer class end
