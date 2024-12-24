package se.lexicon.cvfeedbackaichatbotapp.service;

import org.springframework.stereotype.Service;
import se.lexicon.entity.CVFeedbackChatbot;


public interface AIService {



    public  String generateFeedback(CVFeedbackChatbot cvFeedbackChatbot);

    String convertCVFeedbackChatbotToText(CVFeedbackChatbot cvFeedbackChatbot);

    String callAIModelApi(String inputText);

    }

