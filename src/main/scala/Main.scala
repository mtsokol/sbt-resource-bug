import java.io.File

object Main extends App {

  //File doesn't exist -> exception is thrown
  try {
    getClass.getResource("/mydir").toExternalForm
  } catch {
    case ex: Exception => println("No such dir expected")
  }

  //No exception thrown -> file has been found
  val dirPath = getClass.getResource("/my-dir").toExternalForm

  println("Dir path: " + dirPath)

  val fileDir = new File(dirPath)

  //But in program it fails
  println("File exists: " + fileDir.exists())

  println("File is directory: " + fileDir.isDirectory)

  for {
    file <- fileDir.listFiles
  } yield println(file.getName)

}
