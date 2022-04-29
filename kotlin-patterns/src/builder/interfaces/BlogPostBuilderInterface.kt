package builder.interfaces

import builder.classes.BlogPost

interface BlogPostBuilderInterface {
    // Create
    public fun create(): BlogPostBuilderInterface

    // Setters
    public fun setTitle(value: String): BlogPostBuilderInterface
    public fun setBody(value: String): BlogPostBuilderInterface
    public fun setCategories(value: Array<String>): BlogPostBuilderInterface
    public fun setTags(value: Array<Int>): BlogPostBuilderInterface

    // Getters
    public fun getBlogPost(): BlogPost
}