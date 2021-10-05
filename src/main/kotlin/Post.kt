data class Comments (
    val count:Long,
    val can_post:Boolean,
    val groups_can_post:Boolean,
    val can_close:Boolean,
    val can_open:Boolean,
)
data class Copyright(
    val id:Long,
    val link: String,
    val name:String,
    val type: String,
)
data class Likes (
    val count:Long,
    val user_likes:Boolean,
    val can_like:Boolean,
    val can_publish:Boolean,
)
data class Repost (
    val count:Long,
    val user_reposted:Boolean,
)
data class Views (
    val count:Long,
)
data class Donut(
    val is_donut:Boolean,
    val paid_duration: Int,
    val placeholder: Int,
    val can_publish_free_copy:Boolean,
    val edit_mode:String,
)
data class Post(
    /*val id:Long,
    val AuthorId:Long,
    val AuthorName:String,
    val content:String,
    val date:String,
    val likes: Int = 0*/
    val id:Long,
    val owner_id:Long,
    val from_id:Long,
    val created_by:Long,
    val date: String,
    val text:String,
    val reply_owner_id:Long,
    val reply_post_id:Long,
    val friends_only:Boolean,
    val comments:Comments,
    val copyright:Copyright,
    val likes:Likes,
    val repost:Repost,
    val views:Views,
    val post_type:String,
    val signer_id:Long,
    val can_pin:Boolean,
    val can_delete:Boolean,
    val can_edit:Boolean,
    val is_pinned:Boolean,
    val marked_as_ads:Boolean,
    val is_favorite:Boolean,
    val donut:Donut,
    val postponed_id:Long,
)

class WallService {
    private var posts = emptyArray<Post>()
    private var currentUniqId:Long=1


    fun add(post: Post): Post {
        posts += post.copy(id = currentUniqId)
        currentUniqId++
        return posts.last()
    }
    fun update(post2: Post): Boolean {
        for ((index,post) in posts.withIndex()) {
            if(post.id == post2.id) {
                //posts[index] = post.copy(content = post2.content,AuthorName=post2.AuthorName,likes=post2.likes,date=post2.date)
                posts[index] = post.copy(
                    text = post2.text,
                    from_id = post2.from_id,
                    date = post2.date
                )

                return true
            }
        }
        return false
    }

    fun showPostById(id: Long) {

        for ((index,post) in posts.withIndex()) {
            if(post.id == id) {
                println(posts[index])
            }
        }

    }

}