package com.evs.bean;

public class CVoterBean1 {
	private String CandidateId;
	private String Name;
	private String ElectionId;
	private String PartyId;
	private String District;
	private String Constituency;
	
	public String getCandidateId() {
		return CandidateId;
	}
	public void setCandidateId(String candidateId) {
		CandidateId = candidateId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getElectionId() {
		return ElectionId;
	}
	public void setElectionId(String electionId) {
		ElectionId = electionId;
	}
	public String getPartyId() {
		return PartyId;
	}
	public void setPartyId(String partyId) {
		PartyId = partyId;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getConstituency() {
		return Constituency;
	}
	public void setConstituency(String constituency) {
		Constituency = constituency;
	}
}
