<<<<<<< HEAD
=======

>>>>>>> df9b424f8fb28b4548ccfd225d50ab88f397405e
package TrackBook.TrackBookAPI.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import TrackBook.TrackBookAPI.Models.PaymentInfo;


public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String>{
	Optional<PaymentInfo> findByEmail(String email);
	List<PaymentInfo> findAll();
	Optional<PaymentInfo>findByPaymentId(long paymentId);
}

