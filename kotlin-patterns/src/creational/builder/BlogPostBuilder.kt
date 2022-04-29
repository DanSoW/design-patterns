package creational.builder

import creational.builder.classes.BlogPost
import creational.builder.interfaces.BlogPostBuilderInterface

class BlogPostBuilder() : BlogPostBuilderInterface {
    private var blogPost: BlogPost = BlogPost()

    init {
        create()
    }

    override fun create(): BlogPostBuilderInterface {
        this.blogPost = BlogPost()

        return this
    }

    override fun setTitle(value: String): BlogPostBuilderInterface {
        this.blogPost.title = value

        return this
    }

    override fun setBody(value: String): BlogPostBuilderInterface {
        this.blogPost.body = value

        return this
    }

    override fun setCategories(value: Array<String>): BlogPostBuilderInterface {
        this.blogPost.categories = value

        return this
    }

    override fun setTags(value: Array<Int>): BlogPostBuilderInterface {
        this.blogPost.tags = value

        return this
    }

    override fun getBlogPost(): BlogPost {
        val result = this.blogPost
        this.create()

        return result
    }
}