
package untitled.target.scala$minus2$u002E13.classes



final class untitled$_ {
def args = untitled_sc.args$
def scriptPath = """untitled/target/scala-2.13/classes/untitled.sc"""
/*<script>*/
val age = 25
if (age >= 18) {
  println("Majeur")
} else {
  println("Mineur")
}
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object untitled_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new untitled$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export untitled_sc.script as untitled

