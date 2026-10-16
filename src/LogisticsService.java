//6.Business requirement: A logistics company delivers packages using trucks, drones, and third-party courier services.
// Each delivery method has different execution logic,
// but the shipment service should support all of them.

interface DeliveryMethod{
    void deliver(int shipmentId);
}

class Truck implements DeliveryMethod{
    @Override
    public void deliver(int shipmentId) {
        System.out.println("Delivering shipment "+shipmentId+" through truck");
    }
}

class Drones implements DeliveryMethod{
    @Override
    public void deliver(int shipmentId) {
        System.out.println("Delivering shipment "+shipmentId+" through drone");
    }
}

class ThirdParty implements DeliveryMethod{
    @Override
    public void deliver(int shipmentId) {
        System.out.println("Delivering shipment "+shipmentId+" through third party courier");
    }
}

public class LogisticsService {

    public static void main(String[] args){
        LogisticsService service = new LogisticsService();
        service.shipPackage(new Truck(), 2);
        service.shipPackage(new Drones(), 3);
    }
    public void shipPackage(DeliveryMethod method, int shipmentId){
        method.deliver(shipmentId);
    }
}




