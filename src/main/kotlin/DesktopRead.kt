import java.net.ServerSocket
import java.net.Socket
import java.util.Scanner

fun main() {
    Thread{
        listen()
    }.start()


}

fun listen(){
    //Listen port 1000
    val socket = ServerSocket(1000)
    val socket1 = socket.accept()
    val scanner = Scanner(socket1.getInputStream())
    while (scanner.hasNextLine()){
        val a = scanner.nextLine()
        println("Android: $a")
        break
    }
    socket.close()
    listen()
}

