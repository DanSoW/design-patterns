import creational.builder.BlogPostBuilder
import creational.builder.BlogPostManager
import creational.simple_factory.factories.MessengerSimpleFactory

fun useBuilder(){
    val builder = BlogPostBuilder()

    var posts = builder.setTitle("from Builder")
        .getBlogPost()

    println(posts.title)

    val manager = BlogPostManager()
    manager.setBuilder(builder)

    posts = manager.createCleanPost()
    posts = manager.createNewPostIt()

    println(posts.body)
}

fun useSimpleFactory(){
    val factory = MessengerSimpleFactory()

    val appMailMessenger  = factory.build("email")
    val appPhoneMessenger = factory.build("sms")

    println(appMailMessenger.getSenderString())
    println(appPhoneMessenger.getSenderString())
}