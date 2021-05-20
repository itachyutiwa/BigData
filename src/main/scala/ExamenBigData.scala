
object ExamenBigData {


//Question 8
  def fonction1(params:List[String]): List[String] ={
    val maListe = params.filter(f=>f.endsWith("n"))
    return maListe
  }


  def liste_double(): Unit ={
    val maliste = List(
        ("ecommercemag.fr",null),
      ("https://www.journalducm.com/contact/","payant"),
      ("https://www.zatsaz.com/",null),
      ("https://www.lerevenu.com/",null),
      ("https://www.cadre-dirigfdeant-magazine.com/","payant"),
      ("https://www.silicon.fr/services/contact#annoncer","payant"),
      ("https://www.channelbiz.fr/nous-contacter/",null),
      ("https://www.itespresso.fr/"->null),
      ("https://www.industrie-mag.com/article4.html","invité)",
      ("https://www.jesuisundev.com/article-invite/","invité)",
      ("https://www.numerama.com/",null)
      )))

    val maNewListe = maliste.foreach(f=>println(f))
    println(maNewListe)
  }
  def main(args:Array[String]):Unit={

    println(fonction1(List("Julien","Paul","jean","rac","trec","joel","ed","chris","maurice")))
 println(liste_double())
  }

  }



