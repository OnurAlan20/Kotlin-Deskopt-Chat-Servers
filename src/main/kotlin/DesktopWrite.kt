import java.net.ServerSocket

fun main() {
    //Read port 1001
    val server = ServerSocket(1001)
    Thread{
        alpha(server)
    }.start()

}

fun alpha(serverSocket: ServerSocket){
    var a: Boolean
    while (true){
        val socket1 = serverSocket.accept()
        print("Computer: ")
        val b = readln()
        socket1.getOutputStream().write(b.toByteArray())
        a = socket1.isBound
        socket1.close()
        if(a){
            break
        }
    }
    alpha(serverSocket)
}

