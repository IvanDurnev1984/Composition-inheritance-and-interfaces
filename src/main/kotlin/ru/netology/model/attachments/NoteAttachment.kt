package ru.netology.model.attachments

import ru.netology.model.Note

class NoteAttachment (
    val value: ru.netology.model.Note,
    override val type: String="note"
    ) : ru.netology.model.attachments.Attachment {

}


//    : Attachment {
//    override val type: String="note"
//    val note: Note = Note()
//
//
//}