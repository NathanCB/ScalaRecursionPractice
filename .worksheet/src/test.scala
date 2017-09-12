object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(48); 
  val firstName: String = "Nathan";System.out.println("""firstName  : String = """ + $show(firstName ));$skip(48); 
  
  def reverse(n: String): String = n.reverse;System.out.println("""reverse: (n: String)String""");$skip(32); 
  
  val x = reverse(firstName);System.out.println("""x  : String = """ + $show(x ))}
  
  
  }
