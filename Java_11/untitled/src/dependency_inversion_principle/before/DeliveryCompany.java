package dependency_inversion_principle.before;

public class DeliveryCompany {

    public void sendProduct(Product product) {
        DeliveryDriver deliveryDriver = new DeliveryDriver();
        deliveryDriver.deliverProduct(new Product());
    }

}
