//Halle Bristol 2016
//Syracuse University Project Advance
//Computer Engineering

public class Ball {

 private int x, y;
 private color col;
 private int rad;
 private int xVel, yVel;
 
 public Ball() {
    x = (int)random(100, 700);
    y = (int)random(100, 500);
    col = color((int)(20 + random(236)),20+(int)(random(236)),20+(int)(random(236)));
    rad = (int)(random(20, 70));
    xVel = (int)random(2, 12);
    yVel = (int)random(2, 12);
    if(random(1,100) < 50.0) xVel *= -1;
    if(random(1,100) < 50.0) xVel *= -1;
  }

  public Ball(int x1, int y1) {
    x = x1;
    y = y1;
    col = color((int)(20 + random(236)),20+(int)(random(236)),20+(int)(random(236)));
    rad = (int)(random(20, 70));
    xVel = (int)random(2, 12);
    yVel = (int)random(2, 12);
    if(random(1,100) < 50.0) xVel *= -1;
    if(random(1,100) < 50.0) xVel *= -1;
  }

  public int getX() {
    return x;
  }
  
  public int getY() {
    return y;
  }
    
  public int getRad() {
    return rad;
  }
  
  public int setRad(int r) {
    rad = r;
    return r;
  }

  public void moveMe() {
    x += xVel;
    y += yVel;
    if(x <= 0 || x >= (800-rad)) xVel *= -1;
    if(y <= 0 || y >= (600-rad)) yVel *= -1;
  }

  public void grow(int more) {
    rad += more; 
  }

  public void drawMe() {
    moveMe();
    fill(col);
    ellipse(x,y,rad, rad);
  }  
  
}




ArrayList<Ball> balls;

void setup() {
 size(800,600);
 background(250);
 balls = new ArrayList<Ball>();
 
 for(int i = 1; i <= 50; i++) {
   balls.add(new Ball());}
  
 ellipseMode(CENTER);  
 strokeWeight(3);
 frameRate(30);
}



public void draw() {
  background(2);
  
  for(int j = 0; j <= balls.size() - 1; j++) {
    balls.get(j).drawMe();
  }

  float fr = frameRate *= 5;
  if(frameRate == fr){
    balls.add(new Ball());  
  
  checkForIntersect();
}


}
void checkForIntersect() {
  
  for(int k = 0; k < balls.size(); k++) {
    
    for(int m = k + 1; m < balls.size(); m++) {
      
      float kx = balls.get(k).getX();
      float ky = balls.get(k).getY();
      float kr = balls.get(k).getRad();
      
      float mx = balls.get(m).getX();
      float my = balls.get(m).getY();
      float mr = balls.get(m).getRad();
      
      float dx = (mx - kx) * (mx - kx);
      float dy = (my - ky) * (my - ky);
      
      float distance = sqrt(dx + dy);
      
      if(distance < kr || distance < mr) {
        balls.get(k).grow(2);
        
        if(balls.get(k).getRad() > 300) {
          balls.get(k).setRad(10); }
          
        balls.remove(balls.get(m));
      }
    }
  }  
}
