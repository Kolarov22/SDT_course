public class Window extends AWindow{
    public void draw(){
        System.out.println("Basic Draw");
    }

    public static void main(String[] args) {
        AWindow clientWindow = new Window();
        clientWindow.draw();

        AWindow clientWindow2 = new MegaEnhancedWindow(new EnhancedWindow(new Window()));
        clientWindow2.draw();


    }

}