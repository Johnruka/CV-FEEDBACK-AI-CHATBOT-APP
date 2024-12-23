package se.lexicon.cvfeedbackaichatbotapp.service;

import se.lexicon.entity.CVFeedbackChatbot;

public interface AIService {



    public  String generateFeedback(CVFeedbackChatbot cvFeedbackChatbot);

    String convertCVFeedbackChatbotToText(CVFeedbackChatbot cvFeedbackChatbot);

    String callAIModelApi(String inputText);

    }

