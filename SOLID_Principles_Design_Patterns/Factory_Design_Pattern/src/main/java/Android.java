public class Android extends Platform{
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}
