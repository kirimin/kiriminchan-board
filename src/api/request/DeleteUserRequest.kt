package site.kirimin_chan.board.api.request

data class DeleteUserRequest(
    val userId: Int,
    val token: String
)