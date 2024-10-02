class MegaEnhancedWindow extends AWindow{
    AWindow original;

    public MegaEnhancedWindow(AWindow original) {
        this.original = original;
    }

    public void draw(){
        original.draw();
        System.out.println("MegaEnhanced Draw");
    }
}
