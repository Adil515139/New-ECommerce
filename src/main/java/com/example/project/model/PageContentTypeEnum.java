package com.example.project.model;

import lombok.Getter;

@Getter
public enum PageContentTypeEnum {

	 AboutUs("AboutUs"),PrivacyPolicy("PrivacyPolicy"),TermsCondition("Terms&Condition");
	private String type;

	PageContentTypeEnum(String type) {
		this.type=type;
	}


}
