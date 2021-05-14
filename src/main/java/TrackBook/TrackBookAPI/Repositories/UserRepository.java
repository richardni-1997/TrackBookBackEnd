<<<<<<< HEAD
package TrackBook.TrackBookAPI.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TrackBook.TrackBookAPI.Models.*;

public interface UserRepository extends JpaRepository <Users, String>{
	
	  Optional<Users> findByEmailContaining(String email);

}
=======
//package TrackBook.TrackBookAPI.Repositories;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
<<<<<<< HEAD
//public interface UserRepository extends JpaRepository {
=======
//public interface UserRepository extends JpaRepository<> {
>>>>>>> 4cb7c4de688013dbc8e6095fd0f37c9cdedebe51
//
//}
>>>>>>> b1d5448c1ba63443d86a12c403885032b99f84fc
