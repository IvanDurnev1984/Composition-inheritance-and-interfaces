package ru.netology

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
            attachments = emptyArray<ru.netology.model.attachments.Attachment>()
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
            attachments = emptyArray<ru.netology.model.attachments.Attachment>()
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
            attachments = emptyArray<ru.netology.model.attachments.Attachment>()
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
            attachments = emptyArray<ru.netology.model.attachments.Attachment>()
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
            attachments = emptyArray<ru.netology.model.attachments.Attachment>()
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
            attachments = emptyArray<ru.netology.model.attachments.Attachment>()
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
            attachments = emptyArray<ru.netology.model.attachments.Attachment>()
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
            attachments = emptyArray<ru.netology.model.attachments.Attachment>()
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
            attachments = emptyArray<ru.netology.model.attachments.Attachment>()
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
    fun checkPostAttachmentNoteText() {
        val note = ru.netology.model.Note(
            id = 0, ownerIid = 0, title = "Title 1", text = "Test text on Note 1",
            date = 1609879870328798L, comments = 1, readComments = 0, viewUrl = "url_note"
        )

        val photo = ru.netology.model.Photo(
            id = 0, ownerIid = 0, text = "Test text on Photo 1", date = 1609879870328798L,
            albumIid = 12, userIid = 232, sizes = emptyArray(), width = 1920, height = 1080
        )

        val video = ru.netology.model.Video(
            id = 1,
            ownerId = 0,
            title = "Title Video 1",
            description = "video id 1",
            duration = 12,
            image = emptyArray(),
            firstFrame = emptyArray(),
            date = 160872387L,
            addingDate = 16078182349800L,
            views = 42,
            localViews = 24,
            comments = 3,
            player = "",
            platform = "",
            canEdit = false,
            canAdd = false,
            isPrivate = false,
            accessKey = "key",
            processing = false,
            isFavorite = false,
            canComment = false,
            isCanEdit = false,
            canLike = false,
            canRepost = false,
            canSubscribe = false,
            CanAddToFaves = false,
            canAttachLink = false,
            width = 1920,
            height = 1080,
            userId = 2,
            converting = false,
            added = false,
            isSubscribed = false,
            repeat = true,
            typeVideo = ru.netology.model.TypeVideo.VIDEO,
            balance = 3,
            liveStatus = ru.netology.model.LiveStatus.STARTED,
            live = false,
            upcoming = false,
            spectators = 2,
            likes = ru.netology.model.LikesVideo(count = 3, userLikes = false),
            reposts = ru.netology.model.Repost()
        )

        var post = ru.netology.model.Post(
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
            attachments = emptyArray() //arrayOf() //note, photo, video)
        )
        val expected = "Test text on Note 1"

        val attNote = ru.netology.model.attachments.NoteAttachment(value = note)
        post = post.copy(attachments = post.attachments?.plus(attNote))

        val attPhoto = ru.netology.model.attachments.PhotoAttachment(value = photo)
        post = post.copy(attachments = post.attachments?.plus(attPhoto))

        val attVideo = ru.netology.model.attachments.VideoAttachment(value = video)
        post = post.copy(attachments = post.attachments?.plus(attVideo))



        val noteAttachment = post.attachments?.get(0)
        if (noteAttachment is ru.netology.model.attachments.NoteAttachment) {
            val result = noteAttachment.value.text
            assertEquals(expected, result)
        }

    }

    @Test
    fun checkPostAttachmentPhotoText() {
        val note = ru.netology.model.Note(
            id = 0, ownerIid = 0, title = "Title 1", text = "Test text on Note 1",
            date = 1609879870328798L, comments = 1, readComments = 0, viewUrl = "url_note"
        )

        val photo = ru.netology.model.Photo(
            id = 1, ownerIid = 0, text = "Test text on Photo 1", date = 1609879870328798L,
            albumIid = 12, userIid = 232, sizes = emptyArray(), width = 1920, height = 1080
        )

        val video = ru.netology.model.Video(
            id = 1,
            ownerId = 0,
            title = "Title Video 1",
            description = "video id 1",
            duration = 12,
            image = emptyArray(),
            firstFrame = emptyArray(),
            date = 160872387L,
            addingDate = 16078182349800L,
            views = 42,
            localViews = 24,
            comments = 3,
            player = "",
            platform = "",
            canEdit = false,
            canAdd = false,
            isPrivate = false,
            accessKey = "key",
            processing = false,
            isFavorite = false,
            canComment = false,
            isCanEdit = false,
            canLike = false,
            canRepost = false,
            canSubscribe = false,
            CanAddToFaves = false,
            canAttachLink = false,
            width = 1920,
            height = 1080,
            userId = 2,
            converting = false,
            added = false,
            isSubscribed = false,
            repeat = true,
            typeVideo = ru.netology.model.TypeVideo.VIDEO,
            balance = 3,
            liveStatus = ru.netology.model.LiveStatus.STARTED,
            live = false,
            upcoming = false,
            spectators = 2,
            likes = ru.netology.model.LikesVideo(count = 3, userLikes = false),
            reposts = ru.netology.model.Repost()
        )

        var post = ru.netology.model.Post(
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
            attachments = emptyArray()
        )
        val expected = "Test text on Photo 1"

        val attNote = ru.netology.model.attachments.NoteAttachment(value = note)
        post = post.copy(attachments = post.attachments?.plus(attNote))

        val attPhoto = ru.netology.model.attachments.PhotoAttachment(value = photo)
        post = post.copy(attachments = post.attachments?.plus(attPhoto))

        val attVideo = ru.netology.model.attachments.VideoAttachment(value = video)
        post = post.copy(attachments = post.attachments?.plus(attVideo))

        val photoAttachment = post.attachments?.get(0)
        if (photoAttachment is ru.netology.model.attachments.PhotoAttachment) {
            val result = photoAttachment.value.text
            assertEquals(expected, result)
        }



    }


}