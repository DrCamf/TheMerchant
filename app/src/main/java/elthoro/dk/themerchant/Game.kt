package elthoro.dk.themerchant




class Game {

    var merchant = Merchant()

    fun mayVisit(name: String): Boolean {
        var may = false
        var c = City(name)
        c = setNeighbours(merchant.lastVisited.toString());
        for(city in c.neighbours) {
            if(city == name) {
                may = true
                break
            } else {
                may = false
            }
        }
        return may
    }

    fun setNeighbours(cname: String): City {
        var info = PreData()
        var cities = info.cities
        var lokalCity = City(cname);

        when (cname) {

            "silvercrest" -> lokalCity.neighbours.add(cities[27].cityName.toString()) and
                    lokalCity.neighbours.add(cities[1].cityName.toString()) and lokalCity.neighbours.add(
                cities[26].cityName.toString())
            "cliffsedge" -> lokalCity.neighbours.add(cities[0].cityName.toString()) and lokalCity.neighbours.add(
                cities[25].cityName.toString()) and lokalCity.neighbours.add(cities[8].cityName.toString())
            "arlansway" -> lokalCity.neighbours.add(cities[4].cityName.toString()) and lokalCity.neighbours.add(
                cities[2].cityName.toString())
            "dimbar" -> lokalCity.neighbours.add(cities[3].cityName.toString()) and lokalCity.neighbours.add(
                cities[2].cityName.toString()) and lokalCity.neighbours.add(cities[6].cityName.toString())
            "marlburg" ->lokalCity.neighbours.add(cities[2].cityName.toString()) and lokalCity.neighbours.add(
                cities[7].cityName.toString())
            "duskendale" -> lokalCity.neighbours.add(cities[7].cityName.toString()) and lokalCity.neighbours.add(
                cities[4].cityName.toString()) and lokalCity.neighbours.add(cities[9].cityName.toString())
            "easthaven" -> lokalCity.neighbours.add(cities[6].cityName.toString()) and lokalCity.neighbours.add(
                cities[6].cityName.toString()) and lokalCity.neighbours.add(cities[8].cityName.toString())
            "elbright" -> lokalCity.neighbours.add(cities[7].cityName.toString()) and lokalCity.neighbours.add(
                cities[19].cityName.toString()
            ) and lokalCity.neighbours.add(cities[24].cityName.toString()) and lokalCity.neighbours.add(
                cities[1].cityName.toString()) and lokalCity.neighbours.add(cities[25].cityName.toString())
            "ironforge" -> lokalCity.neighbours.add(cities[6].cityName.toString()) and lokalCity.neighbours.add(
                cities[10].cityName.toString())
            "karasvale" -> lokalCity.neighbours.add(cities[9].cityName.toString()) and lokalCity.neighbours.add(
                cities[11].cityName.toString())
            "lastlock" -> lokalCity.neighbours.add(cities[10].cityName.toString()) and lokalCity.neighbours.add(
                cities[12].cityName.toString())
            "leeside" -> lokalCity.neighbours.add(cities[11].cityName.toString()) and lokalCity.neighbours.add(
                cities[14].cityName.toString()) and lokalCity.neighbours.add(cities[13].cityName.toString())
            "mahalaga" -> lokalCity.neighbours.add(cities[12].cityName.toString()) and lokalCity.neighbours.add(
                cities[14].cityName.toString())
            "marrenseve" -> lokalCity.neighbours.add(cities[13].cityName.toString()) and lokalCity.neighbours.add(
                cities[12].cityName.toString()) and lokalCity.neighbours.add(cities[15].cityName.toString())
            "irragin" -> lokalCity.neighbours.add(cities[14].cityName.toString()) and lokalCity.neighbours.add(
                cities[16].cityName.toString())
            "lakestown" -> lokalCity.neighbours.add(cities[15].cityName.toString()) and lokalCity.neighbours.add(
                cities[17].cityName.toString()) and lokalCity.neighbours.add(cities[18].cityName.toString())
            "hillfar" -> lokalCity.neighbours.add(cities[16].cityName.toString()) and lokalCity.neighbours.add(
                cities[18].cityName.toString())
            "moonbright" -> lokalCity.neighbours.add(cities[20].cityName.toString()) and lokalCity.neighbours.add(
                cities[17].cityName.toString()) and lokalCity.neighbours.add(cities[16].cityName.toString())
            "nargorthon" -> lokalCity.neighbours.add(cities[23].cityName.toString()) and lokalCity.neighbours.add(
                cities[24].cityName.toString())
            "orrinshire" -> lokalCity.neighbours.add(cities[18].cityName.toString()) and lokalCity.neighbours.add(
                cities[21].cityName.toString())
            "pinnellapass" -> lokalCity.neighbours.add(cities[20].cityName.toString()) and lokalCity.neighbours.add(
                cities[22].cityName.toString())
            "ramshorn" -> lokalCity.neighbours.add(cities[21].cityName.toString()) and lokalCity.neighbours.add(
                cities[23].cityName.toString()) and lokalCity.neighbours.add(cities[27].cityName.toString())
            "snakescanyon" -> lokalCity.neighbours.add(cities[22].cityName.toString()) and lokalCity.neighbours.add(
                cities[27].cityName.toString()) and lokalCity.neighbours.add(cities[26].cityName.toString()) and lokalCity.neighbours.add(
                cities[24].cityName.toString()) and lokalCity.neighbours.add(cities[19].cityName.toString())
            "northpass" -> lokalCity.neighbours.add(cities[23].cityName.toString()) and lokalCity.neighbours.add(
                cities[25].cityName.toString()) and lokalCity.neighbours.add(cities[19].cityName.toString()) and lokalCity.neighbours.add(
                cities[8].cityName.toString())
            "seameet" -> lokalCity.neighbours.add(cities[8].cityName.toString()) and lokalCity.neighbours.add(
                cities[24].cityName.toString()) and lokalCity.neighbours.add(cities[1].cityName.toString())
            "quelenesti" -> lokalCity.neighbours.add(cities[0].cityName.toString()) and lokalCity.neighbours.add(
                cities[23].cityName.toString())
            "redhawk" -> lokalCity.neighbours.add(cities[0].cityName.toString()) and lokalCity.neighbours.add(
                cities[22].cityName.toString()
            )
        }
        return lokalCity
    }


}