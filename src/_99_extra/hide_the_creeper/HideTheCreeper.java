package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    
    PImage creeper;

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {
    	PImage minecraft = loadImage("minecraft.png");     //in setup method
    	minecraft.resize(500, 500);          //in setup method
    	background(minecraft);          //in setup method
    	
    	creeper=loadImage("creeper.png");
    	creeper.resize(100, 50);
    }

    @Override
    public void draw() {
    	
        
    }

    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
