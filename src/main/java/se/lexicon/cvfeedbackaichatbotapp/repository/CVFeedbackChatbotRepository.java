package se.lexicon.cvfeedbackaichatbotapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import se.lexicon.entity.CVFeedbackChatbot;
@Service
public interface CVFeedbackChatbotRepository extends JpaRepository<CVFeedbackChatbot, Long> {
}
