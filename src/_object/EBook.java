package _object;

public class EBook {

    private int bookTypeId;
    private String title;
    private String author;

    public EBook(int bookTypeId, String author, String title) {
        this.bookTypeId = bookTypeId;
        this.author = author;
        this.title = title;
    }

    //toString()매서드 재정의

    //equal()매서드 재정의

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //hashcode()매서드 재정의

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
