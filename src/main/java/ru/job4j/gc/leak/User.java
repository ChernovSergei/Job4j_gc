package ru.job4j.gc.leak;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        User user = (User) o;
        return name != null && name.equals(user.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
