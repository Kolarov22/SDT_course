class EnhancedWindow extends AWindow{
    AWindow original;

    public EnhancedWindow(AWindow original) {
        this.original = original;
    }

    public void draw(){
        original.draw();
        System.out.println("Enhanced Draw");
    }
}