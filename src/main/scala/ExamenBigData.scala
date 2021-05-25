import scala.collection.immutable.ListMap

object ExamenBigData {


//Question 8
  def fonction1(params:List[String]): List[String] ={
    val maListe = params.filter(f=>f.endsWith("n"))
    return maListe
  }


  def avoirdomaine(lien:String) : String ={  //obtention des domaines
    return lien.replace("https://www.","").split("/")(0)
  }

  def liste_double(): Unit = {
    val Maliste = List(("ecommercemag.fr", " "),
      ("https://www.journalducm.com/contact/", "Payant"),
      ("https://www.zatsaz.com/", " "),
      ("https://www.lerevenu.com/", " "),
      ("https://www.cadre-dirigfdeant-magazine.com/", "Payant"),
      ("https://www.silicon.fr/services/contact#annoner", "Payant"),
      ("https://www.channelbiz.fr/nous-contacter/", " "),
      ("https://www.itespresso.fr/", " "),
      ("https://www.industrie-mag.com/article4.html", "invite"),
      ("https://www.jesuisundev.com/article-invite/", "invite"),
      ("https://www.numerama.com/", " ")
    )
    // je cree d'abord une liste avec les domaines et ensuite je fais une fusion
    val finalListe =  (ListMap(Maliste:_*).keys.toList.map(l => avoirdomaine(l) ) zip ListMap(Maliste:_*).values).toList // funsionner les 2 dans une liste de tuple
    println("Ma liste finale :"+finalListe)
  }

    def main(args:Array[String]):Unit={

    println(fonction1(List("Julien","Paul","jean","rac","trec","joel","ed","chris","maurice")))
 println(liste_double())
  }

  }



