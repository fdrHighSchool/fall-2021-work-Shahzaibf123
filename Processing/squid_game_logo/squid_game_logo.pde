// or /**/ mean comments in code, does not affect the code.

void setup() {//set up function that defines the size of the screen
size(500,300);//width of the screen is 500, height of the screen is 300
/*In processing (0,0) is the topleft corner. 
x value increases towards the right as in a normal graph
as y increases it will go more towards the bottom, y as 0 will indicate all the way on top.
So (500,300) would be the bottom right of the screen and (250,150) will be the middle
*/
}

void draw() {
strokeWeight(8);//strokeWeight(weight); weight is a number that defines how thick the pen will be when making shapes or lines
/*
circle(x,y,extent);
A function that creates a circle. 
x: The x value of the center, y: The y value of the center
extent: width and height of the circle, the bigger it is the bigger the circle
*/
circle(100,150,100);//Circle at a center of (100,150) with an extent of 100. 


/*
square(x,y,extent);
x: The x value of the rectangle, y: the y value of the center
extent: width and height of the rectangle by default.
*/
square(200,100,100);//Square at a center of (200,100) with an extent of 100


/*
triangle(x1, y1, x2, y2, x3, y3);
x1 y1 are the first point of the triangle. A triangle having three points takes in 6 inputs.
x2 y2 are the second point and x3 y3 are the third.
*/
triangle(350,200,450,200,400,100);//A triangle made up of the points (350,200), (450,200), (400,100)

//Code prints out a simple image of a circle square or triangle, if you know what I mean :)
}
