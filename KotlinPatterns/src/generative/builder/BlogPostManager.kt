package generative.builder

import generative.builder.classes.BlogPost
import generative.builder.interfaces.BlogPostBuilderInterface

class BlogPostManager {
    private lateinit var builder: BlogPostBuilderInterface

    public fun setBuilder(builder: BlogPostBuilderInterface): BlogPostManager{
        this.builder = builder

        return this
    }

    public fun createCleanPost(): BlogPost {
        return builder.getBlogPost()
    }

    public fun createNewPostIt(): BlogPost {
        return builder
            .setTitle("New post about IT")
            .setBody("New post about IT ...")
            .setCategories(
                arrayOf(
                    "Category one"
                )
            )
            .setTags(
                arrayOf(
                    1, 2, 3
                )
            )
            .getBlogPost()
    }
}