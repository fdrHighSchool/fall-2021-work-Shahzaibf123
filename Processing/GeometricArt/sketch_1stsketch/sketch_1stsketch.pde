void setup() {
size(1024,768);
}
float x = 0;
void draw() { 
  /*background(204); 
  line(pmouseX,20, pmouseX, 80); 
  line(pmouseX,20,pmouseX+20,80);
  line(pmouseX+20,20,pmouseX+20,80);
  ellipse(pmouseX+60,50,60,60);
  line(pmouseX,768,pmouseY,60);
  line(768,768,pmouseY,60);*/
  triangle(300,350,700,350,500,700);
  quad(300,350,400,225,600,225,700,350);
  triangle(500,700,600,350,400,350);
  line(500,700,500,350);
} 
