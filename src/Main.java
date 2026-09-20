import FactoryMethod.*;
import AbstractFactoryMethod.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method");
        SubscriptionCreator basicCreator = new BasicCreator();
        SubscriptionCreator premiumCreator = new PremiumCreator();

        Subscription basic = basicCreator.createSubscription();
        Subscription premium = premiumCreator.createSubscription();

        basic.show();
        premium.show();


        System.out.println("\nAbstract Factory");
        SubscriptionFactory basicFactory = new BasicFactory();
        Subscription basicPlan = basicFactory.createSubscription();
        Payment basicPayment = basicFactory.createPayment();
        basicPlan.show();
        basicPayment.pay();

        SubscriptionFactory premiumFactory = new PremiumFactory();
        Subscription premiumPlan = premiumFactory.createSubscription();
        Payment premiumPayment = premiumFactory.createPayment();
        premiumPlan.show();
        premiumPayment.pay();
    }
}
