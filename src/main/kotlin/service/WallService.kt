package service

import data.Post

object WallService {
    private var id = 0
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = ++id)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, actualPost) in posts.withIndex()) {
            if (actualPost.id == post.id) {
                posts[index] = post.copy()
                return true
            }
        }
        return false
    }

    fun clear(){
        posts = emptyArray()
        id = 0
    }
}