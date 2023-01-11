package de.uni.koeln.de.bookstore.datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String author;

    private Integer PubYear;

    private Integer price;
    public Book() {
    }

    public Book(String name, String author, Integer PubYear, Integer price) {
        this.name = name;
        this.author = author;
        this.PubYear = PubYear;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPubYear() {
        return PubYear;
    }

    public void setPubYear(Integer pubYear) {
        PubYear = pubYear;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
