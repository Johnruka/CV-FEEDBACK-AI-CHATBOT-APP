package se.lexicon.cvfeedbackaichatbotapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.lexicon.cvfeedbackaichatbotapp.repository.CVFeedbackChatbotRepository;
import se.lexicon.cvfeedbackaichatbotapp.service.AIService;
import se.lexicon.entity.CVFeedbackChatbot;

@RestController
@RequestMapping("/api/cv-feedback")
public class CVFeedbackController {

    @Autowired
    private AIService aiService;

    @Autowired
    private CVFeedbackChatbotRepository cvFeedbackChatbotRepository;



    @PostMapping("/feedback")
    public ResponseEntity<String> getFeedback(@RequestBody CVFeedbackChatbot cvFeedbackChatbot) {

        cvFeedbackChatbot.setName(cvFeedbackChatbot.getName());
        cvFeedbackChatbot.setWorkExperience(cvFeedbackChatbot.getWorkExperience());
        cvFeedbackChatbot.setEducation(cvFeedbackChatbot.getEducation());
        cvFeedbackChatbot.setSkills(cvFeedbackChatbot.getSkills());
        cvFeedbackChatbot.setFeedback(cvFeedbackChatbot.getFeedback());

        String feedback = aiService.generateFeedback(cvFeedbackChatbot);
        cvFeedbackChatbot.setFeedback(feedback);
        cvFeedbackChatbotRepository.save(cvFeedbackChatbot);
        return ResponseEntity.ok(feedback);

    }

}
