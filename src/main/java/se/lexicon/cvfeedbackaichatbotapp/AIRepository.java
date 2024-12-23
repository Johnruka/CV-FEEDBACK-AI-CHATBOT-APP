package se.lexicon.cvfeedbackaichatbotapp;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.entity.CVFeedbackChatbot;

public interface AIRepository extends JpaRepository<CVFeedbackChatbot, Long> {
}
