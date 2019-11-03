public class Monitor {

/*   the resolution Class is part of the monitor, the monitor isnt a resolution but has a resolution
     that is what composition is.


     */

    private String model;
    private String manufactorer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufactorer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x,int y, String color){

        System.out.println("Drawing pixel at " + x + "," + y + " in colour" + color);

    }

    public String getModel() {
        return model;
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
