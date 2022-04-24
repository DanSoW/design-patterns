package creational.simple_factory.factories

import creational.simple_factory.classes.EmailMessenger
import creational.simple_factory.classes.SmsMessenger
import creational.simple_factory.interfaces.MessengerInterface
import creational.simple_factory.interfaces.MessengerSimpleFactoryInterface

class MessengerSimpleFactory: MessengerSimpleFactoryInterface {
    override fun build(type: String): MessengerInterface {
        val messenger: MessengerInterface

        when(type){
            "email" -> {
                messenger = EmailMessenger()
                messenger
                    .setSender("email@mail.ru")
                    .setMessage("Hello, Steve")
            }
            "sms" -> {
                messenger = SmsMessenger()
                messenger
                    .setSender("+799128519252")
                    .setMessage("Hello, Steve")
            }
            else -> {
                throw IllegalArgumentException("Не верный тип")
            }
        }

        return messenger
    }
}