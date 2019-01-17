package ThreeDay;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class GUI {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		Container pane=frame.getContentPane();
		pane.setLayout(new BorderLayout());
		
		JSlider headingSlider=new JSlider(0,360,180);
		pane.add(headingSlider,BorderLayout.SOUTH);
		
		JSlider pitchSlider=new JSlider(SwingConstants.VERTICAL,-90,90,0);
		pane.add(pitchSlider,BorderLayout.EAST);
		
		JPanel renderPanel=new JPanel(){
			public void paintConponent(Graphics g) {
				Graphics2D g2=(Graphics2D) g;
				g2.setColor(java.awt.Color.BLACK);
				g2.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		 pane.add(renderPanel, BorderLayout.CENTER);

	        frame.setSize(400, 400);
	        frame.setVisible(true);
	}
	class Vertex{
		double x;
		double y;
		double z;
		Vertex(double x,double y,double z){
			this.x=x;
			this.y=y;
			this.z=z;
		}
	}
	class Triangle{
		Vertex v1;
		Vertex v2;
		Vertex v3;
		Color color;
		Triangle (Vertex v1,Vertex v2,Vertex v3,Color color){
			this.v1=v1;
			this.v2=v2;
			this.v3=v3;
			this.color=color;
		}
	}
	
}