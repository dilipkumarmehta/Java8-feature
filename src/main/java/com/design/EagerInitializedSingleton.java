package com.design;

class SingaltonDesign {
	private static SingaltonDesign singaltonDesign;

	private SingaltonDesign() {
	}

	public static SingaltonDesign getSingalotndesing() {
		if (singaltonDesign == null) {
			singaltonDesign = new SingaltonDesign();
		}
		return singaltonDesign;
	}
}

public class EagerInitializedSingleton {
	public static void main(String[] args) {
		SingaltonDesign singaltonDesign = SingaltonDesign.getSingalotndesing();
		System.out.println(singaltonDesign);
	}
}
