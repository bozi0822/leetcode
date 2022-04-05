package com.example.coding.AdapterMode;

public class AdapterPattern {
	public static void main(String[] args) {
		Adapter adapter = new Adapter(new Speaker());
		adapter.translate();

	}


}

class Speaker{
	String speak() {
		return "China No.1";
	}
}

interface Translator {
	public String translate();
}

class Adapter implements Translator {

	private Speaker speaker;

	Adapter(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public String translate() {
		String result = speaker.speak();
//		result...
		return result;
	}
}
