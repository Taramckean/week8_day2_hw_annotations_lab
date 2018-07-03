package models;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    private int id;
    private String title;
    private Level level;

    public Course(){

    }

    public Course(String title, Level level){
        this.title = title;
        this.level = level;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    @Column(name= "title")
    public String getTitle() {
        return title;
    }
    @Enumerated(value= EnumType.STRING)
    public Level getLevel() {
        return level;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
