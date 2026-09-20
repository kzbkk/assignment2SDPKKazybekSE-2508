Subscription Service
In this assignment I implemented two design patterns:
Factory Method** — for creating Basic and Premium subscriptions.
Abstract Factory** — for creating a subscription together with its payment method.

Structure
Factory Method
Subscription
├── BasicSubscription
└── PremiumSubscription
SubscriptionCreator
├── BasicCreator
└── PremiumCreator

Abstract Factory
SubscriptionFactory
├── BasicFactory
│   ├── BasicPlan
│   └── BasicPayment
│
└── PremiumFactory
    ├── PremiumPlan
    └── PremiumPayment


I used meaningful names, small methods, interfaces, and simple class structure to keep the code easy to understand and maintain.

Run `Main.java` to see both patterns working.
