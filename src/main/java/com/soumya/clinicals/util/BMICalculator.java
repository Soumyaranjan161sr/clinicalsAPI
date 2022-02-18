package com.soumya.clinicals.util;

import java.util.List;

import com.soumya.clinicals.entities.ClinicalData;

public class BMICalculator {
	public static void calculateBMI(List<ClinicalData> clinicalData, ClinicalData eachEntry) 
	{
		if (eachEntry.getComponentName().equals("hw")) 
		{
			String[] heightAndWeight = eachEntry.getComponentValue().split("/");
			if (heightAndWeight != null && heightAndWeight.length > 1) 
			{
				float feetInMetres = Float.parseFloat(heightAndWeight[0]) * 0.4536F;
				float bmi = Float.parseFloat(heightAndWeight[1]) / (feetInMetres * feetInMetres);
				ClinicalData bmiData = new ClinicalData();
				bmiData.setComponentName("bmi");
				bmiData.setComponentValue(Float.toString(bmi));
				clinicalData.add(bmiData);
			}
		}
	}
}
	
