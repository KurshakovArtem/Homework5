package data

data class Coments(
    val count: Int,                      // количество комментариев
    val canPost: Boolean = true,         // информация о том, может ли текущий пользователь комментировать запись
    val groupsCanPost: Boolean = true,   // информация о том, могут ли сообщества комментировать запись
    val canClose: Boolean = false,       // может ли текущий пользователь закрыть комментарии к записи
    val canOpen: Boolean = false         // может ли текущий пользователь открыть комментарии к записи
)
