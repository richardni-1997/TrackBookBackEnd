<<<<<<< HEAD
=======

>>>>>>> df9b424f8fb28b4548ccfd225d50ab88f397405e
package TrackBook.TrackBookAPI.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import TrackBook.TrackBookAPI.Models.Goal;

public interface GoalRepository extends JpaRepository<Goal, String> {
	//Goal findById(int id);
	List<Goal> findAll();
	Optional<Goal> findByEmail(String email); 
<<<<<<< HEAD
}
=======
}
>>>>>>> df9b424f8fb28b4548ccfd225d50ab88f397405e
