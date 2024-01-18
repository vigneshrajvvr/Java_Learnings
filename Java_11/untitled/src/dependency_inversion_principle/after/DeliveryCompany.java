package dependency_inversion_principle.after;

import dependency_inversion_principle.before.DeliveryDriver;
import dependency_inversion_principle.before.Product;

public class DeliveryCompany {

    private DeliveryService deliveryService;

    DeliveryCompany(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void sendProduct(dependency_inversion_principle.after.Product product) {
        this.deliveryService.deliverProduct(product);
    }

}
