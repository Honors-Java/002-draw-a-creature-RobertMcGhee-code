void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  rectMode(center)
  background(200)
  fill(0, 255, 150)
  rect(200, 200, 100, 100)
  fill(255,25,0)
  ellipse(175, 200, 25, 50)
  ellipse(225, 200, 25, 50)
  stroke(0, 0, 255)
  fill(102, 20, 113)
  rect(200, 300, 25, 100)
  fill(0, 255, 200)
  ellipse(201, 350, 45, 45)
  point(200, 236)
	line(200, 150, 130, 90)
  line(200, 150, 270, 90)
  line(200, 150, 200, 50)
  point(200, 200)
  point(201, 350)
  point(200, 164)
}