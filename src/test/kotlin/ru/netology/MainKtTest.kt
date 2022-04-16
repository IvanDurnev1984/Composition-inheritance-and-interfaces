package ru.netology

import getPostAttachment
import getPostAttachmentNoteText
import ru.netology.model.*
import org.junit.Assert.*
import org.junit.Test
import ru.netology.service.WallService
import viewPost

class MainKtTest {
    private val service = ru.netology.service.WallService()

    @Test
    fun addPost() {

        val post = ru.netology.model.Post(
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = emptyArray<ru.netology.model.Attachment>()
        )

        val expected = ru.netology.model.Post(
            id = 1,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = emptyArray<ru.netology.model.Attachment>()
        )

        service.add(post)
        val result = service.add(post)
        assertEquals(expected.id, result.id)

    }

    @Test
    fun likePost() {

        val post = ru.netology.model.Post(
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = emptyArray<ru.netology.model.Attachment>()
        )

        val expected = 1

        var copy = service.add(post)
        copy = service.add(copy)

        val result = service.likeById(1)
        assertEquals(expected, result)

    }

    @Test
    fun removePost() {

        val post = ru.netology.model.Post(
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = emptyArray<ru.netology.model.Attachment>()
        )

        val expected = 2

        var copy = service.add(post)
        copy = service.add(copy)
        copy = service.add(copy)
        service.remove(1)

        val result = service.sizeWallPosts()
        assertEquals(expected, result)
    }

    @Test
    fun dislikePost() {

        val post = ru.netology.model.Post(
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = emptyArray<ru.netology.model.Attachment>()
        )

        val expected = 2

        var copy = service.add(post)
        copy = service.add(copy)
        service.dislikeById(1)

        val result = service.dislikeById(1)
        assertEquals(expected, result)

    }

    @Test
    fun updatePost() {

        val post = ru.netology.model.Post(
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = emptyArray<ru.netology.model.Attachment>()
        )

        val expected = ru.netology.model.Post(
            id = 1,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = emptyArray<ru.netology.model.Attachment>()
        )

        service.add(post)
        val copy = post.copy(ownerId = 2, date = "20.04.2022" )
        service.add(copy)

        val isResult = service.update(expected)
        val result = service.get(expected.id)
        assertTrue(isResult && result.ownerId == copy.ownerId && result.date == copy.date)

    }


    @Test
    fun updatePostNotExistId() {

        val post = ru.netology.model.Post(
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = emptyArray<ru.netology.model.Attachment>()
        )

        val expected = ru.netology.model.Post(
            id = 4,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = emptyArray<ru.netology.model.Attachment>()
        )

        service.add(post)
        val copy = post.copy(ownerId = 2, date = "20.04.2022" )
        service.add(copy)

        assertFalse(service.update(expected))

    }

    @Test
    fun displayPostWithoutAttachment() {
        val post = ru.netology.model.Post(
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = null
        )
        viewPost(post)

    }

    @Test
    fun checkPostAttachment() {
        val post = ru.netology.model.Post(
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = null
        )

        val expected = "No attachment"

        val result = getPostAttachment(post)
        assertEquals(expected, result)
    }

    @Test
    fun checkPostAttachmentNoteText() {
        val attachment = ru.netology.model.Attachment(
            photo = ru.netology.model.Photo(
                id = 0, albumIid = 0, ownerIid = 0, userIid = 0,
                text = "photo test", date = 160092938989L,
                sizes = emptyArray(), width = 800, height = 600
            ),
            postedPhoto = ru.netology.model.PostedPhoto(id = 0, ownerId = 0, photo130 = "", photo_604 = ""),
            note = ru.netology.model.Note(id = 0, title = "Title 1", text = "Test text on Note 1"),
            video = null,
            audio = null,
            doc = ru.netology.model.Doc(),
            graffiti = ru.netology.model.Graffiti(),
            link = ru.netology.model.Link(),
            app = ru.netology.model.App(),
            poll = ru.netology.model.Poll(),
            page = ru.netology.model.Page(),
            album = ru.netology.model.Album(),
            photosList = emptyList(),
            market = ru.netology.model.Market(),
            marketAlbum = ru.netology.model.MarketAlbum(),
            sticker = ru.netology.model.Stiker(),
            prettyCards = ru.netology.model.PrettyCard(),
            event = null
        )


        val post = ru.netology.model.Post(
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = arrayOf(attachment)
        )

        val expected = "Test text on Note 1"

        val result = getPostAttachmentNoteText(post)
        assertEquals(expected, result)
    }

    @Test
    fun checkPostEmptyAttachmentNoteText() {
        val post = ru.netology.model.Post(
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = "14.04.2022",
            text = "Text test",
            replyOwnerId = 0,
            replyPostIid = 0,
            friendsOnly = false,
            postType = "first",
            signerId = 1234,
            canPin = false,
            canDelete = true,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = ru.netology.model.Donut(),
            postponedId = 0,
            comments = ru.netology.model.Comments(),
            copyright = ru.netology.model.Copyright(),
            likes = ru.netology.model.Likes(),
            reposts = ru.netology.model.Repost(),
            views = ru.netology.model.Views(),
            attachments = null
        )

        val expected = "default"

        val result = getPostAttachmentNoteText(post)
        assertEquals(expected, result)
    }

}