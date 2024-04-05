import controllers.ConverterController;

public class App {
    private static final ConverterController converterController = new ConverterController();

    private void run() {
        converterController.converterControllerProcessing();
    }
    public static void main(String[] args) {
        new App().run();
    }
}
