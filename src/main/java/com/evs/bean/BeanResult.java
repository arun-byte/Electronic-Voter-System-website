package com.evs.bean;

public class BeanResult {
	private String UserId;
	private String ElectionName;
	private String CandidateId;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getElectionName() {
		return ElectionName;
	}
	public void setElectionName(String electionName) {
		ElectionName = electionName;
	}
	public String getCandidateId() {
		return CandidateId;
	}
	public void setCandidateId(String candidateId) {
		CandidateId = candidateId;
	}
}
