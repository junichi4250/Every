package com.example.message.form;

public class MessageForm {

	@Size(max = 30)
	private String name;

	@Size(min=1, max=140)
	private String text;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;S
	}
}
