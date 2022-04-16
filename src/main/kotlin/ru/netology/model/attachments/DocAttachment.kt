package ru.netology.model.attachments

import ru.netology.model.Doc

class DocAttachment(
    val value: ru.netology.model.Doc,
    override val type: String="doc"
) : ru.netology.model.attachments.Attachment {


}