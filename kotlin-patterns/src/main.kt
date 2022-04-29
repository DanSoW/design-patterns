import builder.BlogPostBuilder
import builder.BlogPostManager

fun main() {
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