package generics.classforsingleattributedemo;
//Data type: T-Place holder for actual object

public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}


