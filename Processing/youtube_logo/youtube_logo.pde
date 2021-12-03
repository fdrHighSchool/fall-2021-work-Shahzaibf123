void setup() {
size(700,700);//sets dimensions of the screen of which my code will appear on
}
/* void setup(){} is usually a function in Java in which you set your screen.
It is usually at the top of your program, and only runs once when starting
*/
void draw() {
fill(255,0,0);
/*
fill(rgb) or fill(rgb,alpha) is a way to attain color in your code. 
It sets the color that fills your shapes. The rgb value you want can be 
found online in a rgb finder.
*/

rect(200,200,300,200,70);



fill(255,255,255);
triangle(300,265,375,300,300,335);

}
