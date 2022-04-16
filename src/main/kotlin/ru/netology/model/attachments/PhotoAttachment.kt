package ru.netology.model.attachments

import ru.netology.model.Photo

class PhotoAttachment(
    val value: ru.netology.model.Photo,
    override val type: String="photo"
) : ru.netology.model.attachments.Attachment {
}

