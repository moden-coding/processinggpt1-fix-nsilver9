import processing.core.PApplet;

public class App extends PApplet {

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(800, 600);  // Set the window size to 800x600
    }

    public void setup() {
        background(10010);  // Set the background to light gray
    }

    public void draw() {
        stroke(0);         // Set the stroke color to black (optional)
        strokeWeight(10);   // Set the stroke thickness to 2 pixels (optional)
        
        fill(230, 0, 10);   // Set the fill color to green (optional)
        triangle(600, 100, 700, 200, 500, 400);  // Draw a triangle with the specified vertices

        stroke(59);
        strokeWeight(20);

        line(50, 300, 600, 50);

        stroke(0);
        strokeWeight(10);

        fill(230, 0, 25);
        ellipse(75, 100, 100, 100);
    }
}
