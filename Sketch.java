import processing.core.PApplet;

public class Sketch extends PApplet {
	
	float r;
  float g;
  float b;
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500,500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
   background(255,255,255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  

  stroke(0);
  
  for (int lineX = 0; lineX <= width/2; lineX += 30) {
    line(lineX, 0, lineX, height/2);
  for (int lineY = 0; lineY <= height/2; lineY += 30) {
      line(0, lineY, width/2, lineY);
  }
  }

  fill(255,192,203);
  for (int circleX = width/80*46; circleX <= width/80*74; circleX += width/80*7) {
    ellipse(circleX, height/80*3, width/80*5,height/80*5);
  }
  
    for (int circleX = width/80*46; circleX <= width/80*74; circleX += width/80*7) {
    ellipse(circleX, height/80*11, width/80*5, height/80*5);
  }
  
  for (int circleX = width/80*46; circleX <= width/80*74; circleX += width/80*7) {
    ellipse(circleX, height/80*19, width/80*5,height/80*5);
  }
 
  for (int circleX = width/80*46; circleX <= width/80*74; circleX += width/80*7) {
    ellipse(circleX, height/80*27, width/80*5,height/80*5);
  }
  for (int circleX = width/80*46; circleX <= width/80*74; circleX += width/80*7) {
    ellipse(circleX, height/80*35, width/80*5,height/80*5);
  }

  
  
  stroke(255);
  
  for (int i = 1; i <= width/2; i++) {
    r=i*(19/10);
    g=i*(19/10);
    b=i*(19/10);
    stroke(r,g,b);

    line(i, height/2, i, height);
  }
translate(width/4*3, height/4*3);
   for(int c = 0; c <= 3; c++){
   fill(255,140,0);
  ellipse(0,0,30,110);
   fill(0,100,0);
  ellipse(0, 0, width/40*5, height/40*5);
  rotate(PI/4);

   }
}
}
