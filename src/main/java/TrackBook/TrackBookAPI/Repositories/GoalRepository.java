<<<<<<< HEAD
=======

>>>>>>> df9b424f8fb28b4548ccfd225d50ab88f397405e
package TrackBook.TrackBookAPI.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import TrackBook.TrackBookAPI.Models.Goal;

public interface GoalRepository extends JpaRepository<Goal, String> {
	//Optional<Goal> findById(long id);
	List<Goal> findAll();
<<<<<<< HEAD
	Optional<Goal> findByEmail(String email);
	//Optional<Goal> findByGoalId(int goalId);
	Optional<Goal> findByGoalId(long goalId);
	
	//Optional<Goal> findAllByEmail(String email); 
}
=======
	Optional<Goal> findByEmail(String email); 
<<<<<<< HEAD
}
=======
}
>>>>>>> df9b424f8fb28b4548ccfd225d50ab88f397405e
>>>>>>> 30928d9fc1fa8d829a35c4087812bbe42688bc11
