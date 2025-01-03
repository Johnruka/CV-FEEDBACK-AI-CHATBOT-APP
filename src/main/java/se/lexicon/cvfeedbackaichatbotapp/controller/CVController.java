package se.lexicon.cvfeedbackaichatbotapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.lexicon.cvfeedbackaichatbotapp.repository.CVRepository;
import se.lexicon.cvfeedbackaichatbotapp.service.AIService;
import se.lexicon.entity.CV;

@RestController
@RequestMapping("/api/cv-feedback")
public class CVController {

    @Autowired
    private AIService service;

    @Autowired
    private CVRepository cvRepository;



    @PostMapping("/feedback")
    public ResponseEntity<String> getFeedback(@RequestBody CV cv) {

        cv.setName(cv.getName());
        cv.setWorkExperience(cv.getWorkExperience());
        cv.setEducation(cv.getEducation());
        cv.setSkills(cv.getSkills());
        cv.setFeedback(cv.getFeedback());

        String feedback = service.generateFeedback(cv.getFeedback());
        cv.setFeedback(feedback);
        cvRepository.save(cv);
        return ResponseEntity.ok(feedback);

    }
    @GetMapping("/feedback")
    public String chat(@RequestParam String feedback) {
        return  service.generateFeedback(feedback);
    }

    @GetMapping("/reactive-feedback")
    public String reactiveChat(@RequestParam String feedback){
        return service.generateFeedback(feedback);
    }
}
