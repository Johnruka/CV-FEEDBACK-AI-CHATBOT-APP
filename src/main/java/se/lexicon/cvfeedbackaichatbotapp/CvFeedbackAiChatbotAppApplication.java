package se.lexicon.cvfeedbackaichatbotapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "se.lexicon.entity")
public class CvFeedbackAiChatbotAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CvFeedbackAiChatbotAppApplication.class, args);
    }

}
