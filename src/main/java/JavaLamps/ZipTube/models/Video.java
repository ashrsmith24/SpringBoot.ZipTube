package JavaLamps.ZipTube.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String uri;

    private String title;

    private String description;

    private Date uploadDate;

    public Video() {
    }

    public Video(String idString) {
        this.id = Long.parseLong(idString);
    }


    public Video(String uri, String title, String description, Date uploadDate) {
        this.uri = uri;
        this.title = title;
        this.description = description;
        this.uploadDate = uploadDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}
