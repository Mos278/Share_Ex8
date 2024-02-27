public class App {
    public static void main(String[] args) {
        System.out.println("original");
        ImageManager manager = new ImageManager();
		manager.setRenderer(new SmartphoneRenderer());
		manager.show();
    }
}
