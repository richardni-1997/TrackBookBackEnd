
package TrackBook.TrackBookAPI.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TrackBook.TrackBookAPI.Models.*;

public interface UserRepository extends JpaRepository <Users, String>{
	
	  Optional<Users> findByEmailContaining(String email);

}

