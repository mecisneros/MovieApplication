package com.example.MovieApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Entity
public class MovieRating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private int rating;
    private String personName;
    private String date;
    private String time;

    public MovieRating(String title, int rating, String personName, String date, String time) {
        this.title = title;
        this.rating = rating;
        this.personName = personName;
        this.date = date;
        this.time = time;
    }

    public MovieRating(int id, String title, int rating, String personName) {
        this();
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.personName = personName;
    }

    public MovieRating() {
        GregorianCalendar calendar = new GregorianCalendar();
        date = calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DATE) + "-" + calendar.get(Calendar.YEAR);
        time = calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public String getPersonName() {
        return personName;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
