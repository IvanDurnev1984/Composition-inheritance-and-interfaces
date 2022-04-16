package ru.netology.model

import ru.netology.model.CopyImage

data class Photo (

    val id: Int,
    val ownerIid: Int,

    val albumIid: Int,
    val userIid: Int,
    val text: String,
    val date: Long,
    val sizes: Array<ru.netology.model.CopyImage>,
    val width: Int,
    val height: Int,
    )
{

}
