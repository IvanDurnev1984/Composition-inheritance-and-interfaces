package ru.netology.model

class Doc (
    val id: Int,
    val ownerIid: Int,

    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Long,
    val typeDoc: ru.netology.model.TypeDoc,
    val preview: ru.netology.model.Preview?,

    )
{

}
