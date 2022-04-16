package ru.netology.model.attachments

import ru.netology.model.Audio

class AudioAttachment(
    val value: ru.netology.model.Audio,
    override val type: String="audio"
): ru.netology.model.attachments.Attachment {
}