package models;

public class News {
    private int id;
    private String content;
    private String description;

    public News(String content, String description) {
        this.content = content;
        this.description = "department news";
    }
}
