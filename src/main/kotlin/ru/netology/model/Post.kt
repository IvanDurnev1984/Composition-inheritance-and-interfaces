package ru.netology.model

import ru.netology.model.attachments.Attachment

data class Post (
    val id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: String,
    val text: String,
    val replyOwnerId: Int,
    val replyPostIid: Int,
    val friendsOnly: Boolean,
    val postType: String,

    val attachments: Array<ru.netology.model.attachments.Attachment>?,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: ru.netology.model.Donut,
    val postponedId: Int,
    val comments: ru.netology.model.Comments,
    val copyright: ru.netology.model.Copyright,
    val likes: ru.netology.model.Likes,
    val reposts: ru.netology.model.Repost,
    val views: ru.netology.model.Views
)