package TrackBook.TrackBookAPI.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paymentinfo")
public class PaymentInfo {

	@Id
	private String email;
	
	@Column
	private String goalName;
	
	@Column
	private double depositAmount;
	
	@Column
	private Date depositSchedule;
	
	
	@Override
	public String toString() {
		return "PaymentInfo [email=" + email + ", goalName=" + goalName + ", depositAmount=" + depositAmount
				+ ", depositSchedule=" + depositSchedule + "]";
	}
	public PaymentInfo() {
		
	}
	public PaymentInfo(String email, String goalName, double depositAmount, Date depositSchedule) {
		super();
		this.email = email;
		this.goalName = goalName;
		this.depositAmount = depositAmount;
		this.depositSchedule = depositSchedule;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGoalName() {
		return goalName;
	}

	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Date getDepositSchedule() {
		return depositSchedule;
	}

	public void setDepositSchedule(Date depositSchedule) {
		this.depositSchedule = depositSchedule;
	}
	
}
