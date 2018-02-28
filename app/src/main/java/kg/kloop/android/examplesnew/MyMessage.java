package kg.kloop.android.examplesnew;

/**
 * Created by alexwalker on 28.02.2018.
 */

class MyMessage {
    private String author;
    private String text;
    private String time;

    public MyMessage() {
    }

    public MyMessage(String author, String text, String time) {
        this.author = author;
        this.text = text;
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
