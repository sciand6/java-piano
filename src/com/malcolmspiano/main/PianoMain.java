package com.malcolmspiano.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PianoMain extends Canvas implements Runnable
{
	private static final long serialVersionUID = -8550276805273876458L;

	public PianoMain() {
		new Window(800, 600, "Piano V1", this);
		this.addKeyListener(new KeyInputHandler(this));
		this.run();
	}
	
	public void playSound(String filepath) {
		String fp2 = filepath;
		
		try {
			File fp = new File(fp2);
			
			if (fp.exists()) {
				AudioInputStream aip = AudioSystem.getAudioInputStream(fp);
				Clip clip = AudioSystem.getClip();
				clip.open(aip);
				clip.start();
			} else {
				System.out.println("No file.");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new PianoMain();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			render();
		}
	}
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.drawString("Piano", 380, 50);
		g.drawString("KEYS: ASDF HJKL", 340, 70);
		g.dispose();
		bs.show();
	}
}