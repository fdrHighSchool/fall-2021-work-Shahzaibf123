//U-TURN
void setup(){
  size(1000,1000);
}
int x = 100;
int y = 500;
int count = 0;
void draw(){
  carV2(x,y);
  fill(235,232,52);
  lines();
  noFill();
  arrow();
}
void mouseClicked(){//each movement appears after every click
  count++;
  if (count == 1){
    movement1();
  }
  if (count == 2){
    fill(255);
    movement2();
  }
  if (count == 3){
    fill(255);
    movement3();
  }
  if (count == 4){
    fill(255);
    movement4();
}
  if (count > 4){
    fill(255);
    count = 0;
}
}
  

void movement1(){//cars, shows movement
  
  fill(255);
  pushMatrix();
  translate(300,200);
  rotate(degrees(60));
  carV2(0,0);
  popMatrix();
  fill(255);
  
}
void movement2(){
  pushMatrix();
  translate(600,100);
  rotate(degrees(-90));
  carV2(0,0);
  popMatrix();
  
}
void movement3(){
  pushMatrix();
  translate(800,400);
  rotate(degrees(180));
  carV2(0,0);
  popMatrix();
  
}
void movement4(){
  pushMatrix();
  translate(800,800);
  rotate(degrees(80));
  carV2(0,0);
  popMatrix();
}

void arrow(){//arrow to signal what direction to go to
  //arc(500, 500, 200, 200, degrees(45),PI);
  arc(500, 200, 400, 400, PI, TWO_PI);
  line(300,390,300,190);
  line(301,390,301,190);
  line(700,390,700,190);
  line(701,390,701,190);
  //fill(0);
  triangle(700,450,750,390,650,390);

}
void lines(){//street lines in the middle of the road
  rect(500,25,20,75);
  rect(500,150,20,75);
  rect(500,275,20,75);
  rect(500,400,20,75);
  rect(500,525,20,75);
  rect(500,650,20,75);
  rect(500,775,20,75);
  rect(500,900,20,75);
}
void car(){//V1 of car, all hardcoded
  rect(200,500,100,200,28);
  fill(0);
  rect(212.5,540,75,35,48,48,0,0);

  fill(0);
  quad(210, 587, 220, 602, 220, 642, 210, 662);
  fill(0);
  quad(290, 587, 280, 602, 280, 642, 290, 662);
  fill(0);
  quad(230, 647, 220, 672, 280, 672, 272, 647);
  fill(0);
  rect(220, 505, 20, 5, 5);
  fill(0);
  rect(260, 505, 20, 5, 5);
  fill(0);
  //line(100,300,

 fill(255,255,255);
}

void carV2(int xPos, int yPos){//V2 of car to make it easier to use
  // xPos maps to 200, yPos 500
  rect(xPos, yPos,100,200,28);
  fill(0);
  rect(xPos + 12.5 , yPos + 40,75,35,48,48,0,0);

  fill(0);
  quad(xPos+10, yPos+87, xPos+20, yPos+102, xPos+20, yPos+142, xPos+10, yPos+162);
  fill(0);
  quad(xPos+90, yPos+87, xPos+80, yPos+102, xPos+80, yPos+142, xPos+90, yPos+162);
  fill(0);
  quad(xPos+30, yPos+147, xPos+20, yPos+172, xPos+80, yPos+172, xPos+72, yPos+147);
  fill(0);
  rect(xPos+20, yPos+5, 20, 5, 5);
  fill(0);
  rect(xPos+60, yPos+5, 20, 5, 5);
  fill(0);

 fill(255,255,255);
}
