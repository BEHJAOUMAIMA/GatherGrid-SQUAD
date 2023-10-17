package com.squad.squad.domain;
import jakarta.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class Event {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date date;
    private Time hour;
    private String place;
    private String description;
    @ManyToOne
    private Category category;
    @OneToMany
    private List<Comment> commentaires;

    public Event() {
    }

    public Event(String name, Date date, Time hour, String place, String description) {
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.place = place;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", hour=" + hour +
                ", place='" + place + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", commentaires=" + commentaires +
                '}';
    }
}
