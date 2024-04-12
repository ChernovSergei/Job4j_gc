package ru.job4j.gc.leak;

public class Comment {

    private String text;
    private User user;

    public Comment(String text, User user) {
        this.text = text;
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Comment comment = (Comment) o;
        return text.equals(comment.getText()) && user.equals(comment.getUser());
    }

    @Override
    public int hashCode() {
        int mutliplier = 31;
        int result = 1;
        result = mutliplier * result + ((text == null) ? 0 : text.hashCode());
        result = mutliplier * result + ((user == null) ? 0 : user.hashCode());
        return result;
    }
}
