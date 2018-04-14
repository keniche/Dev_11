package android.lifeistech.com.flashcardplus;

public class Card {
    public int imageId;
    public String title;
    public String content;
    public int likeNum = 0;

    public String meaning;

    public Card(int imageId, String title, String content, String meaning) {
        this.imageId = imageId;
        this.title = title;
        this.content = content;
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return "Card{" +
                "imageId=" + imageId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", likeNum=" + likeNum +
                ", meaning='" + meaning + '\'' +
                '}';
    }
}
