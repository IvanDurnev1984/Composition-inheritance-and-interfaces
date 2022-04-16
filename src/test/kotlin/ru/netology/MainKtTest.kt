package ru.netology

import attachIs
import getPostAttachment
import org.junit.Assert.*
import org.junit.Test
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

        val expected = "none"

        val result = post.attachments?.get(0)?.type ?: "none"
//            getPostAttachmentNoteText(post)
        assertEquals(expected, result)
    }

    @Test
    fun checkPostAttachmentLinkType() {
        val none = ru.netology.model.Attachment.NotAttachment
        val link = ru.netology.model.Attachment.Link(
            id = 3,
            ownerId = 0,
            url = "url_lonk",
            title = "Title Link 3",
            caption = "caption Link 3",
            description = "description Link 3",
            photo = null,
            product = null,
            button = null,
            previewPage = "preview",
            previewUrl = "url preview"
        )

        val graffiti = ru.netology.model.Attachment.Graffiti(
            id = 1,
            ownerIid = 4,
            photo130 = "130",
            photo604 = "604"
        )

        val page = ru.netology.model.Attachment.Page(
             id = 65,
             groupId = 34,
             title = "Title Page 65"
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
            attachments = arrayOf(link, graffiti, page)
        )
        val expected = "link"

        val attLink = post.attachments?.get(0)
        val attGraffiti = post.attachments?.get(1)
        val attPage = post.attachments?.get(2)


        val result = attachIs(post.attachments?.get(0) ?: none)
        assertEquals(expected, result)
    }

    @Test
    fun checkPostAttachmentPageType() {
        val none = ru.netology.model.Attachment.NotAttachment
        val link = ru.netology.model.Attachment.Link(
            id = 3,
            ownerId = 0,
            url = "url_lonk",
            title = "Title Link 3",
            caption = "caption Link 3",
            description = "description Link 3",
            photo = null,
            product = null,
            button = null,
            previewPage = "preview",
            previewUrl = "url preview"
        )

        val graffiti = ru.netology.model.Attachment.Graffiti(
            id = 1,
            ownerIid = 4,
            photo130 = "130",
            photo604 = "604"
        )

        val page = ru.netology.model.Attachment.Page(
            id = 65,
            groupId = 34,
            title = "Title Page 65"
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
            attachments = arrayOf(link, graffiti, page)
        )
        val expected = "page"

        val attLink = post.attachments?.get(0)
        val attGraffiti = post.attachments?.get(1)
        val attPage = post.attachments?.get(2)

        val result = attachIs(post.attachments?.get(2) ?: none)
        assertEquals(expected, result)

    }

    @Test
    fun checkPostAttachmentNoneType() {
        val none = ru.netology.model.Attachment.NotAttachment
        val link = ru.netology.model.Attachment.Link(
            id = 3,
            ownerId = 0,
            url = "url_lonk",
            title = "Title Link 3",
            caption = "caption Link 3",
            description = "description Link 3",
            photo = null,
            product = null,
            button = null,
            previewPage = "preview",
            previewUrl = "url preview"
        )

        val graffiti = ru.netology.model.Attachment.Graffiti(
            id = 1,
            ownerIid = 4,
            photo130 = "130",
            photo604 = "604"
        )

        val page = ru.netology.model.Attachment.Page(
            id = 65,
            groupId = 34,
            title = "Title Page 65"
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
            attachments = arrayOf(link, graffiti, page, none)
        )
        val expected = ""

        val attLink = post.attachments?.get(0)
        val attGraffiti = post.attachments?.get(1)
        val attPage = post.attachments?.get(2)

        val result = attachIs(post.attachments?.get(3) ?: none)
        assertEquals(expected, result)
    }

    @Test
    fun checkPostAttachmentGraffitiType() {
        val none = ru.netology.model.Attachment.NotAttachment
        val link = ru.netology.model.Attachment.Link(
            id = 3,
            ownerId = 0,
            url = "url_lonk",
            title = "Title Link 3",
            caption = "caption Link 3",
            description = "description Link 3",
            photo = null,
            product = null,
            button = null,
            previewPage = "preview",
            previewUrl = "url preview"
        )

        val graffiti = ru.netology.model.Attachment.Graffiti(
            id = 1,
            ownerIid = 4,
            photo130 = "130",
            photo604 = "604"
        )

        val page = ru.netology.model.Attachment.Page(
            id = 65,
            groupId = 34,
            title = "Title Page 65"
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
            attachments = arrayOf(link, graffiti, page)
        )
        val expected = "graffiti"

        val attLink = post.attachments?.get(0)
        val attGraffiti = post.attachments?.get(1)
        val attPage = post.attachments?.get(2)

        val result = attachIs(post.attachments?.get(1) ?: none)
        assertEquals(expected, result)

    }

}