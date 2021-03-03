package de.dhbwka.java.exercise.classes;

public class Radio {
	
	boolean on;
	int volume;
    double frequency;
    
    Radio() {
    	
    }
    
    Radio (boolean on, int volume, double frequency) {
    	this.on = on;
    	if (volume > 10)
    	{
    		this.volume = 10;
    	} else if (volume < 0)
    	{
    		this.volume = 0;
    	} else {
    		this.volume = volume;
    	}
    	this.setFrequency(frequency);
    	
    }
    
    public void incVolume() {
    	if (on && volume < 10)
    	{
    		volume++;
    	}
    }
    
    public void decVolume() {
    	if (on && volume > 0)
    	{
    		volume--;
    	}
    }

    public void turnOn() {
    	if (!on)
    	{
    		on = true;
    	}
    }
    public void turnOff() {
    	if (on)
    	{
    		on = false;
    	}
    }
    public void setFrequency(double frequency){
    	if (frequency > 110.0 || frequency < 85.0) {
    		this.frequency = 99.9;
    	} else {
    		this.frequency = frequency;
    	}
    }
    public String toString() {
    	return "Radio "+(on ? "an" : "aus")+": Freq="+frequency+" Laut="+volume;
    }
}
