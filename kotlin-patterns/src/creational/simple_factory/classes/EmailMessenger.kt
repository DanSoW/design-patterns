package creational.simple_factory.classes

import creational.simple_factory.interfaces.MessengerInterface

class EmailMessenger: MessengerInterface {
    var sender: String = ""
    var email: String = ""

    override fun setSender(value: String): MessengerInterface {
        sender = value
        return this
    }

    override fun setMessage(value: String): MessengerInterface {
        email = value
        return this
    }

    override fun getSenderString(): String {
        return sender
    }

    override fun getMessage(): String {
        return email
    }
}