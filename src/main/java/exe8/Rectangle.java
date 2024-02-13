package exe8;

/*Write a Java program to create an interface Resizable with methods and
resizeHeight(int height) that allow an object to be resized.
 Create a class Rectangle that implements the
 Resizable interface and implements the resize methods*/

public class Rectangle implements Resizable{
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        myRectangle.myResizeHeight(2);
        myRectangle.myResizeWidth(10);
        System.out.println(nume);
    }

    @Override
    public void myResizeWidth(int width) {
        System.out.println(width);
    }

    @Override
    public void myResizeHeight(int height) {
        System.out.println(height);
    }
}
