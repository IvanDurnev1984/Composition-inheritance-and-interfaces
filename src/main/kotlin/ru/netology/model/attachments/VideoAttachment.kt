package ru.netology.model.attachments

import ru.netology.model.Video

class VideoAttachment(
    val value: ru.netology.model.Video,
    override val type: String="video"
) : ru.netology.model.attachments.Attachment {


}
