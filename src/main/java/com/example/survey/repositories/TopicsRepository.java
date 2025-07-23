package com.example.survey.repositories;

import com.example.survey.entities.Topics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicsRepository extends JpaRepository<Topics, Long> {
    // Add custom query methods here if needed, e.g.:
    Topics findByTopic(String topic);
}
