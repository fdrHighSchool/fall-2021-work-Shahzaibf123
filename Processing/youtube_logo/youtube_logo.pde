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
In this case I filled it to be red.
*/

rect(200,200,300,200,70);
/*
rect(a,b,c,d); or rect(a,b,c,d,r); or rect(a,b,c,d,r,t1,tr,br,b1);
Simply put; a is the x-coordinate of the rectangle, b is the y-coordinate, c is the width of the rectangle,
d is the height of the rectangle. {r,t1,tr,br,b1} is optional. r: the radii for all four corners,
t1, tr, br, b1 are the radius for the top-left, top-right, bottom-right, and bottom-left corners respectively.
In this case I only used r to set the same radii for each corner to curve each corner like the youtube logo would have.
*/


fill(255,255,255);//Used fill to fill in white for the triangle
triangle(325,265,400,300,325,335);
/*
Same triangle as explained before, the inputs are the three points
Here I used the points (325,265), (400,300), and (325,335)
*/
}
