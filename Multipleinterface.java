package com.tnsif.javainterface;

interface Camera{
	void takephoto();
}

interface Musicplayer{
	void playmusic();
}

class Smartphone implements Camera,Musicplayer{

	@Override
	public void playmusic() {
		System.out.println("Play the music");
		
	}

	@Override
	public void takephoto() {
		System.out.println("Take a photo");
		
	}
	
}

public class Multipleinterface {
	public static void main(String[] args) {
		Smartphone sp=new Smartphone();
		sp.playmusic();
		sp.takephoto();
	}
}
