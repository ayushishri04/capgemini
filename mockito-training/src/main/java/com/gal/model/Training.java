package com.gal.model;
import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Training {
	@Id
	@GeneratedValue
	private int trainingid;
	private Date  startDate , endDtae;
	private String topic;
	private String trainername;
	
	public Training() {
		super();
	}
	
	public int getTrainingid() {
		return trainingid;
	}
	public Training(int trainingid, Date startDate, Date endDtae, String topic, String trainername) {
		super();
		this.trainingid = trainingid;
		this.startDate = startDate;
		this.endDtae = endDtae;
		this.topic = topic;
		this.trainername = trainername;
	}

	public void setTrainingid(int trainingid) {
		this.trainingid = trainingid;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDtae() {
		return endDtae;
	}
	public void setEndDtae(Date endDtae) {
		this.endDtae = endDtae;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	

}
