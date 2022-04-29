package creational.simple_factory.interfaces

interface MessengerSimpleFactoryInterface {
    fun build(type: String): MessengerInterface
}