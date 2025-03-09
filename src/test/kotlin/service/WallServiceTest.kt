package service

import data.Coments
import data.Likes
import data.Post
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

//import org.junit.Assert.assertTrue

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun addTest() {
        val service = WallService
        val post = Post(
            17, 11, 14, 17, 1741444833, "Проверочный текст",
            coments = Coments(1),
            likes = Likes(5)
        )
        val firstId = service.add(post).id
     assertEquals(1, firstId)
    }

    @Test
    fun updateTestTrue() {
        val service = WallService
        val post = Post(
            17, 11, 14, 17, 1741444833, "Проверочный текст",
            coments = Coments(1),
            likes = Likes(5)
        )
        service.add(post)
        assertTrue(service.update(post.copy(1)))
    }

    @Test
    fun updateTestFalse() {
        val service = WallService
        val post = Post(
            17, 11, 14, 17, 1741444833, "Проверочный текст",
            coments = Coments(1),
            likes = Likes(5)
        )
        service.add(post)
        assertFalse(service.update(post.copy(2)))
    }
}