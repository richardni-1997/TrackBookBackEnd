<<<<<<< HEAD
=======
<<<<<<< HEAD
package TrackBook.TrackBookAPI.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import TrackBook.TrackBookAPI.Models.PaymentInfo;


public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String>{
	Optional<PaymentInfo> findByEmail(String email);
	List<PaymentInfo> findAll();
}
=======
>>>>>>> b1d5448c1ba63443d86a12c403885032b99f84fc
//package TrackBook.TrackBookAPI.Repositories;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface PaymentInfoRepository extends JpaRepository{
//
//}
<<<<<<< HEAD
=======
>>>>>>> 4cb7c4de688013dbc8e6095fd0f37c9cdedebe51
>>>>>>> b1d5448c1ba63443d86a12c403885032b99f84fc
