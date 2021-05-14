package TrackBook.TrackBookAPI.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goals")
public class Goal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long goalId;
	

	private String email;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private Date startDate;
	
	@Column
	private Date targetDate;
	
	public Goal(long goalId, String email, String name, String description, Date startDate, Date targetDate,
			double currentSavings, double targetSavings, String priority) {
		super();
		this.goalId = goalId;
		this.email = email;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.targetDate = targetDate;
		this.currentSavings = currentSavings;
		this.targetSavings = targetSavings;
		this.priority = priority;
	}

	public long getgoalId() {
		return goalId;
	}

	public void setgoalId(long goalId) {
		this.goalId = goalId;
	}

	@Column
	private double currentSavings;
	
	@Column
	private double targetSavings;
	
	@Column
	private String priority;
	
	public Goal() {
		
	}

	public Goal(String email, String name, String description, Date startDate, Date targetDate, double currentSavings,
			double targetSavings, String priority) {
		super();
		this.email = email;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.targetDate = targetDate;
		this.currentSavings = currentSavings;
		this.targetSavings = targetSavings;
		this.priority = priority;
	}

	

	@Override
	public String toString() {
		return "Goal [goalId=" + goalId + ", email=" + email + ", name=" + name + ", description=" + description
				+ ", startDate=" + startDate + ", targetDate=" + targetDate + ", currentSavings=" + currentSavings
				+ ", targetSavings=" + targetSavings + ", priority=" + priority + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public double getCurrentSavings() {
		return currentSavings;
	}

	public void setCurrentSavings(double currentSavings) {
		this.currentSavings = currentSavings;
	}

	public double getTargetSavings() {
		return targetSavings;
	}

	public void setTargetSavings(double targetSavings) {
		this.targetSavings = targetSavings;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
}
