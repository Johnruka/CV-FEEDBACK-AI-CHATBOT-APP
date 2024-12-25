package se.lexicon.cvfeedbackaichatbotapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import se.lexicon.entity.CV;
@Service
public interface CVRepository extends JpaRepository<CV, Long> {
}
