import data.Coments
import data.Likes
import data.Post
import service.WallService

fun main() {
    val post = Post(10, 12, 23, 45, 1741444833, "Проверка",
            coments = Coments(1, canClose = true),
            likes = Likes(10))
    val changePost = post.copy(canPin = true, canEdit = true, canDelete = true)
    val changePost2 = post.copy(id = 2, text = "проверка 2")
    val service = WallService
    println(service.add(post))
    println(service.add(changePost))
    println(service.update(changePost2))

}