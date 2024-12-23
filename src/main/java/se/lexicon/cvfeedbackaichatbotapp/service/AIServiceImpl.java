package se.lexicon.cvfeedbackaichatbotapp.service;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.entity.CVFeedbackChatbot;

@Service
public class AIServiceImpl implements AIService {

    OpenAiChatModel openAiChatModel;

    @Autowired
    public AIServiceImpl(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }

    @Override
    public String generateFeedback(CVFeedbackChatbot cvFeedbackChatbot) {
        return "feedback";
    }

    @Override
    public String convertCVFeedbackChatbotToText(CVFeedbackChatbot cvFeedbackChatbot) {
        String cvFeedbackChatbotToText = convertCVFeedbackChatbotToText(cvFeedbackChatbot);
        return "cvFeedbackChatbotToText: " + cvFeedbackChatbotToText;
    }

    @Override
    public String callAIModelApi(String inputText) {
        String modelResponse = callAIModelApi(inputText);
        return modelResponse;

    }
}
