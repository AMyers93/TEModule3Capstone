package com.techelevator.npgeek.Models;

import java.util.List;

public interface SurveyDAO {




	public boolean saveSurvey(String parkCode, String emailAddress, String state, String activityLevel);
	
	public List<SurveyResults> getAllSurveyResults();
}

