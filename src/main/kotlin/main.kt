fun main(){
    val original = Post(
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

    val WallService = WallService()
    println(WallService.add(original))




    val original4 = Post(
        id = 1,
        owner_id = 0,
        from_id = 11,
        created_by = 1,
        date = "02.02.2020",
        text = "updated text of post with id=1",
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


    if(WallService.update(original4))
        println("post id=1 successfuly updated")
    else
        println("no such id found")

    println(WallService.showPostById(1))

}