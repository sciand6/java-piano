package com.malcolmspiano.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInputHandler extends KeyAdapter {
	private PianoMain piano;
	
	public KeyInputHandler(PianoMain p) {
		this.piano = p;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		switch (key) {
		case KeyEvent.VK_A:
			piano.playSound("res/converted_AltSD16.wav");
			break;
		
		case KeyEvent.VK_S:
			piano.playSound("res/converted_AltSD17.wav");
			break;
			
		case KeyEvent.VK_D:
			piano.playSound("res/converted_AltSD18.wav");
			break;
			
		case KeyEvent.VK_F:
			piano.playSound("res/converted_AltSD19.wav");
			break;
		
		case KeyEvent.VK_H:
			piano.playSound("res/converted_AltSD20.wav");
			break;
			
		case KeyEvent.VK_J:
			piano.playSound("res/converted_AltSD21.wav");
			break;
			
		case KeyEvent.VK_K:
			piano.playSound("res/converted_AltSD22.wav");
			break;
			
		case KeyEvent.VK_L:
			piano.playSound("res/converted_AltSD17.wav");
			break;
			
			default:
		}
	}
}
