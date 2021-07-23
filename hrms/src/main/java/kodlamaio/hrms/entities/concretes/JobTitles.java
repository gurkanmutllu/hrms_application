package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "job_titles")
public class JobTitles {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    public JobTitles() { }

    public JobTitles(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
