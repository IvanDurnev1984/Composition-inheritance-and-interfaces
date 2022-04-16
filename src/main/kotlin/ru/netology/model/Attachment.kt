package ru.netology.model

data class Attachment (
    val photo: ru.netology.model.Photo?,
    val postedPhoto: ru.netology.model.PostedPhoto?,
    val video: ru.netology.model.Video?,
    val audio: ru.netology.model.Audio?,
    val doc: ru.netology.model.Doc?,
    val graffiti: ru.netology.model.Graffiti?,
    val link: ru.netology.model.Link?,
    val note: ru.netology.model.Note?,
    val app: ru.netology.model.App?,
    val poll: ru.netology.model.Poll?,
    val page: ru.netology.model.Page?,
    val album: ru.netology.model.Album?,
    val photosList: List<Int>?,
    val market: ru.netology.model.Market?,
    val marketAlbum: ru.netology.model.MarketAlbum?,
    val sticker: ru.netology.model.Stiker?,
    val prettyCards: ru.netology.model.PrettyCard?,
    val event: ru.netology.model.Event?
    ) {

}
