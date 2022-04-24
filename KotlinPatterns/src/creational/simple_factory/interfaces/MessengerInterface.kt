package creational.simple_factory.interfaces

interface MessengerInterface {
    fun setSender(value: String): MessengerInterface
    fun setMessage(value: String): MessengerInterface
    fun getSenderString(): String
    fun getMessage(): String
}