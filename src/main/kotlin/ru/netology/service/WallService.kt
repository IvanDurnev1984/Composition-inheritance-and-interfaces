package ru.netology.service

import ru.netology.model.Likes
import ru.netology.model.Post

class WallService {

    var id = 0

    var posts = emptyArray<ru.netology.model.Post>()

    fun add(post: ru.netology.model.Post): ru.netology.model.Post {
        val copy = post.copy(id = id++)
        posts += copy
        return copy
    }

    fun remove(removeId: Int): Int {
        val postWithoutId = posts.filterIndexed { index, s -> (index != removeId)}
        posts = postWithoutId.toTypedArray()
        return --id
    }

    fun likeById(id: Int): Int {
        posts.forEachIndexed { index, post ->
            if (index == id) {
                val countLikes = posts[index].likes.countLikes + 1
                val countDislakes = posts[index].likes.countDislikes
                posts[index] = posts[index].copy(likes = ru.netology.model.Likes(countLikes, countDislakes))
                return posts[index].likes.countLikes
            }
        }
        return 0
    }

    fun dislikeById(id: Int): Int {
        for (post in posts) {
            if (post.id == id) {
                val countLikes = posts[id].likes.countLikes
                val countDislakes = posts[id].likes.countDislikes + 1
                posts[id] = posts[id].copy(likes = ru.netology.model.Likes(countLikes, countDislakes))
                return posts[id].likes.countDislikes
            }
        }
        return 0
    }

    fun sizeWallPosts() = posts.size

    fun update(post: ru.netology.model.Post): Boolean {
        posts.map {
            if (it.id == post.id) {
                val itId = it.id
                val itOwnerId = it.ownerId
                val itDate = it.date
                val copy = post.copy(id = itId, ownerId = itOwnerId, date = itDate)
                posts.set(itId, copy)
                return true
            }
        }
        return false
    }

    fun get(id: Int) = posts[id]

}