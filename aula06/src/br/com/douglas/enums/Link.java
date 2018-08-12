package br.com.douglas.enums;

public enum Link {
	
	GOOGLE("www.google.com"),
	FACEBOOK("www.facebook.com"),
	GMAIL("www.gmail.com");
	
	private String url;
	
	Link(String url){
		this.url = url;
	}
	
	public String url() {
		return url;
	}

}
