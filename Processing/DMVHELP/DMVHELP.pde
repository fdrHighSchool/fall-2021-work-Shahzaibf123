void setup(){
  size(1000,1000);
}
int x = 200;
int y = 500;

void draw(){
  carV2(x,y);
  fill(235,232,52);
  lines();
  noFill();
  arrow();
}
void arrow(){
  arc(50, 55, 80, 80, PI+QUARTER_PI, TWO_PI);
}
void lines(){
  rect(500,25,20,75);
  rect(500,150,20,75);
  rect(500,275,20,75);
  rect(500,400,20,75);
  rect(500,525,20,75);
  rect(500,650,20,75);
  rect(500,775,20,75);
  rect(500,900,20,75);
}
void car(){
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

void carV2(int xPos, int yPos){
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
