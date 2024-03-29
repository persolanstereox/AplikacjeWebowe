package ug.unigo.UniGo.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.validator.constraints.URL;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;


@Document
@Data
public class UniversityItem {
    @MongoId
    private String id;

    @NotEmpty(message = "University name is required")
    private String university;

    @NotEmpty(message = "SearchItem is required")
    private String city;

    @NotEmpty(message = "Faculty is required")
    private String faculty;

    @NotEmpty(message = "Field of study is required")
    private String fieldOfStudy;

    @NotEmpty(message = "Title is required")
    private String title;

    @NotEmpty(message = "Website is required")
    private String website;

    @NotEmpty(message = "Interests are required")
    private List<String> interests;

    @URL(message = "Logo URL is not valid")
    private String logoURL;
}
