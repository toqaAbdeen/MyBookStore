package com.example.mybookstore.DataBasePkg;

public class Book {
    private String title;
    private int numberOfCopies;
    private String cat;
    private int edition;


    public Book(String title, String cat) {
        this.title = title;

        this.cat = cat;
    }


    public Book(String title, int numberOfCopies, String cat, int edition) {
        this.title = title;
        this.numberOfCopies = numberOfCopies;
        this.cat = cat;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                ", cat='" + cat + '\'' +
                ", edition=" + edition;
    }
}
