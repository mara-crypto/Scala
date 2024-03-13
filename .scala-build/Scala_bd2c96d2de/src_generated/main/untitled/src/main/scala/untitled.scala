
package untitled.src.main.scala



final class untitled$_ {
def args = untitled_sc.args$
def scriptPath = """untitled/src/main/scala/untitled.sc"""
/*<script>*/
val age = 19
if (age >= 18) {
  println("Majeur")
} else {
  println("Mineur")
}



val numeros: Array[Int] = Array(1, 2, 3)
for ( numero <- numeros) {
  println(numero)
}

val numeros = Array(1, 2, 3, 4, 5)
for (numero <- numeros if numero % 2 == 0) {
  println(numero)
}

for (i <- 1 to 5) {
  println(i)
}

val fruits = Array("pomme", "banane", "orange")
for ((fruit, index) <- fruits.zipWithIndex) {
  println(s"À l'indice $index : $fruit")
}

val numeros = Array(1, 2, 3, 4, 5)
val carres = for (numero <- numeros) yield numero * numero



var compteur = 0
while (compteur < 5) {
  println(compteur)
  compteur += 1
}


var essai = 0
do {
  println("Tentative " + essai)
  essai += 1
} while (essai < 3)



def addition(x: Int, y: Int): Int = x + y

def afficheMonNom(nom: String): String = {
  s"Je m'appelle $nom"
}

val somme = addition(3, 4) // Résultat : 7
val message = afficheMonNom("Aissatou") // Résultat : "Je m'appelle Aissatou"




val maListe = List("A", "B", "C", "D")

// Accéder au premier élément (A)
val premierElement = maListe(0)

// Accéder au deuxième élément (B)
val deuxiemeElement = maListe(1)



val monTableau = Array(10, 20, 30, 40)

// Accéder au premier élément (10)
val premierElement = monTableau(0)

// Accéder au deuxième élément (40)
val dernierElement = monTableau(monTableau.length - 1)




val ages: Map[String, Int] = Map("Alice" -> 30, "Bob" -> 25)

// Accéder à la valeur associée à la clé "Alice" (30)
val ageAlice = ages("Alice")




val nombres: Set[Int] = Set(1, 2, 1, 3) // Contient uniquement 1, 2, 3

// Vérifier si l'élément 2 est présent dans l'ensemble
val contientDeux = nombres(2) // renverra true




val personne: (String, Int, String) = ("Alice", 30, "Paris")

// Accéder au nom (premier élément)
val nom = personne._1






class Personne(nom: String, age: Int) {
  def afficheInfos(): Unit = {
    println(s"Nom : $nom, Age : $age")
  }
}
val personne1 = new Personne("Alice", 30)
personne1.afficheInfos()

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

