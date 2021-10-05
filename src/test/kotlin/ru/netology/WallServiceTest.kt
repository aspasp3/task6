package ru.netology

import WallService
import Comments
import Copyright
import Likes
import Repost
import Views
import Donut

import Post
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun updateExisting() {
        val service = WallService()
        val postTestObject = Post(
            id = 0,
            owner_id = 0,
            from_id = 11,
            created_by = 1,
            date = "01.02.2020",
            text = "some text 1",
            reply_owner_id = 0,
            reply_post_id = 0,
            friends_only = false,
            comments = Comments(
                count = 0,
                can_post = true,
                groups_can_post = true,
                can_close = false,
                can_open = true
            ),
            copyright = Copyright(
                id = 0,
                link = "",
                name = "",
                type = ""
            ),
            likes = Likes(
                count = 0,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            repost = Repost(
                count = 0,
                user_reposted = false
            ),
            views = Views(
                count = 0
            ),
            post_type = "post",
            signer_id = 0,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = false,
            is_favorite = false,
            donut = Donut(
                is_donut = false,
                paid_duration = 0,
                placeholder = 0,
                can_publish_free_copy = true,
                edit_mode = "all"
            ),
            postponed_id = 0,
        )
        val postTestObject2 = Post(
            id = 0,
            owner_id = 0,
            from_id = 12,
            created_by = 1,
            date = "02.02.2020",
            text = "some text 2",
            reply_owner_id = 0,
            reply_post_id = 0,
            friends_only = false,
            comments = Comments(
                count = 0,
                can_post = true,
                groups_can_post = true,
                can_close = false,
                can_open = true
            ),
            copyright = Copyright(
                id = 0,
                link = "",
                name = "",
                type = ""
            ),
            likes = Likes(
                count = 0,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            repost = Repost(
                count = 0,
                user_reposted = false
            ),
            views = Views(
                count = 0
            ),
            post_type = "post",
            signer_id = 0,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = false,
            is_favorite = false,
            donut = Donut(
                is_donut = false,
                paid_duration = 0,
                placeholder = 0,
                can_publish_free_copy = true,
                edit_mode = "all"
            ),
            postponed_id = 0,
        )
        service.add(postTestObject)
        service.add(postTestObject2)


        val update = Post (
            id = 1,
            owner_id = 0,
            from_id = 12,
            created_by = 1,
            date = "12.02.2020",
            text = "some text updated",
            reply_owner_id = 0,
            reply_post_id = 0,
            friends_only = false,
            comments = Comments(
                count = 0,
                can_post = true,
                groups_can_post = true,
                can_close = false,
                can_open = true
            ),
            copyright = Copyright(
                id = 0,
                link = "",
                name = "",
                type = ""
            ),
            likes = Likes(
                count = 0,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            repost = Repost(
                count = 0,
                user_reposted = false
            ),
            views = Views(
                count = 0
            ),
            post_type = "post",
            signer_id = 0,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = false,
            is_favorite = false,
            donut = Donut(
                is_donut = false,
                paid_duration = 0,
                placeholder = 0,
                can_publish_free_copy = true,
                edit_mode = "all"
            ),
            postponed_id = 0,
        )
        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun addNotZero() {
        val service = WallService()
        val postTestObject = Post(
            id = 0,
            owner_id = 0,
            from_id = 11,
            created_by = 1,
            date = "04.02.2020",
            text = "some text 4",
            reply_owner_id = 0,
            reply_post_id = 0,
            friends_only = false,
            comments = Comments(
                count = 0,
                can_post = true,
                groups_can_post = true,
                can_close = false,
                can_open = true
            ),
            copyright = Copyright(
                id = 0,
                link = "",
                name = "",
                type = ""
            ),
            likes = Likes(
                count = 0,
                user_likes = true,
                can_like = true,
                can_publish = true
            ),
            repost = Repost(
                count = 0,
                user_reposted = false
            ),
            views = Views(
                count = 0
            ),
            post_type = "post",
            signer_id = 0,
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = false,
            is_favorite = false,
            donut = Donut(
                is_donut = false,
                paid_duration = 0,
                placeholder = 0,
                can_publish_free_copy = true,
                edit_mode = "all"
            ),
            postponed_id = 0,
        )
        val result = service.add(postTestObject)
        var booleanResult = true

        if(result.id == 0L)
            booleanResult = false

        assertTrue(booleanResult)
    }
}