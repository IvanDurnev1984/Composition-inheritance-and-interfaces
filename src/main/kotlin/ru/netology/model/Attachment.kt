package ru.netology.model

sealed class Attachment(
    val type: String,
    val attach: ru.netology.model.Attachment?
) {
    data class Graffiti(
        val id: Int,
        val ownerIid: Int,
        val photo130: String,
        val photo604: String
    ) : ru.netology.model.Attachment("graffiti", null)
    data class Link(
        val id: Int,
        val ownerId: Int,
        val url: String,
        val title: String,
        val caption: String,
        val description: String,
        val photo: ru.netology.model.Photo?,
        val product: ru.netology.model.Product?,
        val button: ru.netology.model.Button?,
        val previewPage: String,
        val previewUrl: String
    ) : ru.netology.model.Attachment("link", null)
    data class App(
        val id: Int,
        val ownerId: Int,
        val photo130: String,
        val photo604: String
    ) : ru.netology.model.Attachment("app", null)
    data class Page(
        val id: Int,
        val groupId: Int,
        val title: String
    ) : ru.netology.model.Attachment("page", null)
    object NotAttachment : ru.netology.model.Attachment("", null)
}
