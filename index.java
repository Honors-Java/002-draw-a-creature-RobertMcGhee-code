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
  //Center rectangles
  rectMode(center)
  //Background color
  background(200)
  //Cyano's head
  fill(0, 255, 150)
  rect(200, 200, 100, 100)
  //Cyano's eyes
  fill(255,25,0)
  ellipse(175, 200, 25, 50)
  ellipse(225, 200, 25, 50)
  //Outline
  stroke(0, 0, 255)
  //Cyano's leg
  fill(102, 20, 113)
  rect(200, 300, 25, 100)
  //Cyano's foot
  fill(0, 255, 200)
  ellipse(201, 350, 45, 45)
  //Center of Cyano's foot
  point(200, 350)
	//Cyano's hair
  line(200, 150, 130, 90)
  line(200, 150, 270, 90)
  line(200, 150, 200, 50)
  //Middle of Cyano's head
  point(200, 200)
  point(201, 236)
  point(200, 164)
  //Cyano's mouth
  fill(0, 0, 100)
  triangle(191, 245, 211, 245, 201, 225)
}