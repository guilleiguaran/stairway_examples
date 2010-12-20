import java.io.File
import scala.io.Source

val filesHere = (new File(".")).listFiles
def fileLines(file: File) = Source.fromFile(file).getLines.toList

val forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")	
  } yield trimmed.length