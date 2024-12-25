package se.lexicon.cvfeedbackaichatbotapp.service;


public interface AIService {



    public  String generateFeedback(String cv);

    String convertCVFeedbackChatbotToText(String cv);

    String callAIModelApi(String inputText);

    }

