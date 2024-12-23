package se.lexicon.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class CVFeedbackChatbot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String workExperience;
    private String education;
    private String skills;

    public CVFeedbackChatbot(String name, String workExperience, String education, String skills) {
        this.name = name;
        this.workExperience = workExperience;
        this.education = education;
        this.skills = skills;
    }
}
