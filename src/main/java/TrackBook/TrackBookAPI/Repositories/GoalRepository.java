
package TrackBook.TrackBookAPI.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import TrackBook.TrackBookAPI.Models.Goal;

public interface GoalRepository extends JpaRepository<Goal, String> {
	//Optional<Goal> findById(long id);
	List<Goal> findAll();
	Optional<Goal> findByEmail(String email);
	//Optional<Goal> findByGoalId(int goalId);
	Optional<Goal> findByGoalId(long goalId);
	
	//Optional<Goal> findAllByEmail(String email); 
}