package assignmetApril26;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface SmartFeatures {
    void connectToWifi();
}


public class SmartPhone implements Camera , MusicPlayer , SmartFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    SmartPhone  obj = new SmartPhone();
	    obj.takePhoto();
	    obj.playMusic();
	    obj.connectToWifi();

	}
	
	
	


	@Override
	public void connectToWifi() {
		// TODO Auto-generated method stub
		System.out.println("Connected to WiFi");
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Playing music...");
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("Photo captured successfully");
	}

}
