import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

val file = new FileReader("input.txt")

try {

} catch{
  case ex: FileNotFoundException => println("File is missing")
  case ex: IOException => println("I/O Error")
} finally {
  file.close()
}