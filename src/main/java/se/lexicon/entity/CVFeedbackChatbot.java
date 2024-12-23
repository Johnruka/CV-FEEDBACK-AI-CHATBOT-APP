package se.lexicon.entity;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
public class CVFeedbackChatbot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(columnDefinition = "TEXT")
    private String workExperience;
    @Column(columnDefinition = "TEXT")
    private String education;
    @Column(columnDefinition = "TEXT")
    private String skills;
    private String feedback;


    public CVFeedbackChatbot(String name, String workExperience, String education, String skills) {
        this.name = name;
        this.workExperience = workExperience;
        this.education = education;
        this.skills = skills;
    }
}
