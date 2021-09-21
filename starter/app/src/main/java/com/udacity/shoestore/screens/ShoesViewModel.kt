package com.udacity.shoestore.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.R
import com.udacity.shoestore.models.Shoe

class ShoesViewModel : ViewModel() {

    val _shoes = MutableLiveData<MutableList<Shoe>>()
    val shoes: LiveData<MutableList<Shoe>>
        get() = _shoes

    init {
        _shoes.value = mutableListOf(
            Shoe(
                "Palermo antique Dark Brown Calf",
                "The classicaly elegant Palermo is the perfect automne wear of the sophisticated gentleman.",
                "\n" +
                        "\n" +
                        "The Chukka\n" +
                        "\n" +
                        "The Chukka Boot or Desert Boot has both a military and sporting heritage. The lace-up ankle boots were once worn by British polo players in India, the name itself originates from the word “chukker” which signifies a period of a polo game.\n" +
                        "\n" +
                        "HOW TO STYLE\n" +
                        "\n" +
                        "The Palermo is an elegant Chukka Boot, well adapted for smart wear. The deep patina calls to be paired with a navy or flannel suit.\n" +
                        "\n" +
                        "CONSTRUCTION & LEATHER\n" +
                        "\n" +
                        "The Palermo is constructed using three pieces of outer material; inside quarter, outside quarter and vamp with three eyelets. In a true Casa Fagliano tradition, the Palermo is Goodyear welted and finished with a bark tanned leather sole. The Palermo is completely re-solable, designed to last a lifetime.\n" +
                        "\n" +
                        "Our leather soles are a masterpiece of craftsmanship to themselves, hand stained and endowed with a “gentleman’s corner”,to prevent your heel from getting caught in your trousers cuffs.\n" +
                        "\n" +
                        "The Chukka is equipped with a pull tab at the back for practicality.\n",
                R.drawable.palermo_antique_dark_brown
            ),
            Shoe("Loafer Dark Green Suede",
                "The Alpargata is an espadrilles style of shoe taken straight out of the Argentinian lifestyle, the street slipper of the polo player.",
                "\n" +
                        "\n" +
                        "The Alpargata\n" +
                        "\n" +
                        "The Alpargatas is truly a product of the Argentinian lifestyle, an evolution of rope shoes introduced by the Spanish in the 15th century. In the 1850’s there were about 50 families in Buenos Aires producing and living off the construction of their handmade Alpargatas.\n" +
                        "\n" +
                        "Originally, the practical slip on shoe is made of canvas fabric and rope and was developed as an affordable shoe for the rural workers. The mythical gauchos of Argentina popularised the alpargatas, wearing them on and off there horse, wherever they go. The slip-on shoe is appreciated for its comfort and practicality.\n" +
                        "\n" +
                        "The Fagliano’s have revisited the shoe and turned it into a sophisticated item of clothing.\n" +
                        "\n" +
                        "HOW TO STYLE\n" +
                        "\n" +
                        "The Alpargata is the perfect option for the discerning gentleman looking for a comfortable and yet elegant style of footwear, ideal for a smart-casual sockless summer.\n" +
                        "\n" +
                        "CONSTRUCTION & LEATHER\n" +
                        "\n" +
                        "The Alpargata is available in a range of colours: Blue, Chocolate, Dark Green, Light Green, Oltremare, Orange, Sand and Sky Blue. A colour for every mood and occasion.\n" +
                        "\n" +
                        "The summer loafer is made of the softest Italian suede and finished with a light weight bark tanned leather sole. The slipper is beautifully hand-stitched by our expert craftsman with an internal lining to ensure added comfort and durability.\n" +
                        "\n" +
                        "The Alpargata is equipped with a discreet pull tab at the back for an ease of wear.\n",
                R.drawable.alpargata_dark_green
            ),
            Shoe(
                "Santa Fe Black Calf",
                "The Santa Fe is a Derby Blucher, probably one of our more fashionable and contemporary shoe with its oversized look that is often seen in high fashion.",
                "\n" +
                        "\n" +
                        "The Derby\n" +
                        "\n" +
                        "The derby is slightly more casual then the Oxford and is recognised by the eyelets stitched on top of the vamp. The Derby is probably the most versatile model, that bridges the gap between smart and smart casual wear. Because of it’s open lacing, the derby is suitable for wider feet or feet with a higher in-step.\n" +
                        "\n" +
                        "HOW TO STYLE\n" +
                        "\n" +
                        "The Santa Fe is a heavy but stylish derby that can easily be styled with tweed or denim.\n" +
                        "\n" +
                        "CONSTRUCTION & LEATHER\n" +
                        "\n" +
                        "The Santa Fe is available in two models: Bordeaux Antique Calf and Black Calf.\n" +
                        "\n" +
                        "The calf comes from the French “Tannerie d’Annonay”, a selection of the finest calf leather. The Santa Fe is a Goodyear construction with Storm welt, for added water resistance. The Derby sole is vibram rubber with a dotted surface for extra grip, an added finish to ensure the Santa Fe is equipped to face the elements.\n",
                R.drawable.santa_fe_black_calf
            ),
            Shoe(
                "Ligure Dark Brown Grained Calf",
                "The Ligure is a Derby, defined by its hand-stitched Norwegian apron and toe seam.",
                "\n" +
                        "\n" +
                        "The Derby\n" +
                        "\n" +
                        "The derby is slightly more casual then the Oxford and is recognised by the eyelets stitched on top of the vamp. The Derby is probably the most versatile model, that bridges the gap between smart and smart casual wear. Because of it’s open lacing, the derby is suitable for wider feet or feet with a higher in-step.\n" +
                        "\n" +
                        "HOW TO STYLE\n" +
                        "\n" +
                        "The Ligure is a very versatile shoe that bridges the gap between smart and smart casual wear. The deep colours of the formal shoe are ideal for complementing a navy suit, flannel or dark jeans.\n" +
                        "\n" +
                        "CONSTRUCTION & LEATHER\n" +
                        "\n" +
                        "The Ligure is available in three models: a black grained calf, a dark brown grained calf and a dark oak antique calf. The leather comes from the French “Tannerie d’Annonay”, a selection of the finest calf leather.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "LIGURE – DARK BROWN GRAINED CALF\n" +
                        "\n" +
                        "The scotch grained leather injects a hint of texture into your outfit.\n" +
                        "\n" +
                        "The Ligure is a Goodyear welted construction, just like all Casa Fagliano products, finished with a vibram rubber sole. The sole has a dotted surface for extra grip and is just as discreet as a leather sole with the comfort of a rubber sole.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "LIGURE – BLACK GRAINED CALF\n" +
                        "\n" +
                        "The scotch grained leather injects a hint of texture into your outfit.\n" +
                        "\n" +
                        "The Ligure is a Goodyear welted construction, just like all Casa Fagliano products, finished with a bark tanned leather sole. The sole is hand painted, waxed and equipped with a “gentelman’s corner” to insure the cuffs of your trousers don’t get caught on the heel.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "LIGURE – OAK ANTIQUE CALF\n" +
                        "\n" +
                        "The Oak Antique Calf is layers of handwork, resulting in a deep and unique patina. The Ligure is a Goodyear welted construction, just like all Casa Fagliano products, finished with a bark tanned leather sole. The sole is hand painted, waxed and equipped with a “gentelman’s corner” to insure the cuffs of your trousers don’t get caught on the heel.\n",
                R.drawable.ligure_black_grained_calf
            ),
            Shoe(
                "San Telmo Medium Brown Grained Calf",
                "The San Telmo is a classic Double Monk strap shoe with straight toe cap. The Monk Strap is part of the collection of footwear style that every discerning gentleman should have in his wardrobe.",
                "\n" +
                        "\n" +
                        "The Double Monk\n" +
                        "\n" +
                        "The Monk Strap was developed by the alpine monks in the 15th century and would have been warn in monasteries around Europe. The closed shoe was an evolution from the double straps sandals warn by the monks, whom wanted a footwear that offered more protection from the weather and the terrain of the mountains. The solution came about as a closed version of their traditional monks strap sandal, thus came about the monk strap shoe.\n" +
                        "\n" +
                        "The Double Monk uses the same construction as a derby with the addition of a tongue finished with two silver buckles closing. The Monk has a very comfortable fit on the foot, with however, less adjustment due to the absence of laces.\n" +
                        "\n" +
                        "HOW TO STYLE\n" +
                        "\n" +
                        "Less formal then an Oxford but more so even then the Derby, the monk shoe is a versatile footwear just as well adapted as a formal or a smart casual wear.\n" +
                        "\n" +
                        "CONSTRUCTION & LEATHER\n" +
                        "\n" +
                        "The design comes in two different styles: Brown Grained calf or Black calf.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "BROWN GRAINED CALF\n" +
                        "\n" +
                        "The Brown Grained Calf leather of the San Telmo is a selection from the finest leather of the French “Tannerie d’Annonay”. The model’s pebble grained calf injects a subtle hint of texture into any outfit. The San Telmo is a Goodyear welted construction finished with a vibram sole, with a dotted surface for extra grip and protection from the elements.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "BLACK CALF\n" +
                        "\n" +
                        "The Black Boxcalf leather is a classical choice for formal footwear with a superb shine. The leather is a selection from the finest calf of the French “Tannerie d’Annonay”. The Double Monk is finished with a bark tanned leather sole that is completely re-solable. Our leather soles are hand-stained and waxed to protect from the elements, they are endowed with a “gentleman’s corner” to prevent your heel from getting caught in your trousers cuffs.\n",
                R.drawable.san_telmo_medium_brown_grained_calf
            ),
            Shoe(
                "Recoleta Brown Suede",
                "The Recoleta is a full brogue Oxford with rich punching details on the front and sides, including a wing-tip pattern on the vamp and a medallion on the toe. The unique detailing of the Recoleta sets it apart from other brogue models.",
                "\n" +
                        "\n" +
                        "The Brogue Oxford\n" +
                        "\n" +
                        "The Oxford is the most recognisable English classic with its timeless design. It is the most popular dress shoe of the modern gentleman, a must have in any men’s wardrobe. The design of the Oxford is equipped with closed lacing, for a discreet and formal look.\n" +
                        "\n" +
                        "Originally, the punctured holes of the brogue were there to let water drain out, but today they are just ornaments on an English classic.\n" +
                        "\n" +
                        "HOW TO STYLE\n" +
                        "\n" +
                        "The Oxford is part of the collection of footwear style that every discerning gentleman should have in his wardrobe. The Recoleta is a versatile design and can be paired with just about any style, from suit trousers, to jeans or chinos, making this Oxford a invaluable addition to your wardrobe.\n" +
                        "\n" +
                        "CONSTRUCTION & LEATHER\n" +
                        "\n" +
                        "The Recoleta is a contemporary brogue, available in four different models: Suede Brown, Bordeaux Antique Calf, Dark Brown Calf and Velvet Brown Calf. We select our suede in Italy, handpicking solely un-split skins to ensure the durability of the leather. The calf on the other hand is a selection of the finest leather from the Tannerie d’Annonay, in France. All of our leathers have a have a natural finish, showcasing the rich hues of the material that varies with each shoe, no two are the same.\n" +
                        "\n" +
                        "The Recoleta is Goodyear welted and 100% resolable, just like all of our Fagliano design, and finished with a bark tanned leather sole. Our leather soles are a masterpiece of craftsmanship to themselves, hand stained and endowed with a “gentleman’s corner”, to prevent your heel from getting caught in your trousers cuffs. The formal shoe has five blind eyelets with waxed cotton laces.\n",
                R.drawable.recoleta_brown_suede
            ),
            Shoe(
                "Buenos Aires Dark Blue Calf",
                "The Buenos Aires combines the practicality of a sneaker with the expert craftsmanship inherent to Casa Fagliano. The Buenos Aires is the city sneaker of the discerning gentleman.\n" +
                        "\n" +
                        "The Buenos Aires is also available in Cordovan upon special request. Your bespoke pair of sneakers using one of the most exclusive leather.\n" +
                        "\n" +
                        "Contact us now to get your pair.\n",
                "\n" +
                        "\n" +
                        "HOW TO STYLE\n" +
                        "\n" +
                        "The details in the stitching and quality of the sneaker leggier construction, sets the sneaker appart, ensuring luxury and style whatever the occasion might be.\n" +
                        "\n" +
                        "CONSTRUCTION & LEATHER\n" +
                        "\n" +
                        "The Buenos Aires is available in a range of colours: Cognac Calf, Dark Blue Calf, Dark Brown Calf, Dark Grey Suede, Museum Brown Calf and Black Calf.\n" +
                        "\n" +
                        "The calf sneakers uses a selection of the finest French leather. As for the suede, it is handpicked in Italy to only select un-split skins, ensuring the durability of the suede.\n" +
                        "\n" +
                        "Each pair of sneakers is equipped with two different colours of cotton laces, one white and the other matching the colour of the sneaker’s leather. The hand stitched sneakers are mounted on lightweight rubber sole that vary in colour depending on the design.\n" +
                        "\n" +
                        "Each pair is signed with a “960” on the tongue, which represents the brands registration number in Argentina. The stamp on the leather mimics the way livestocks are branded in “la pampa” by the gauchos.\n",
                R.drawable.buenos_aires_dark_blue_calf
            ),
            Shoe(
                "The Buenos Aires White & Cognac Calf",
                "A brand new addition to the Buenos Aires Collection in White Calf & Cognac. With the same style and construction but with the addition of cordovan leather stitched on the back of the sneaker. The cordovan detailing is a wink to Casa Fagliano prized polo boots.\n" +
                        "\n" +
                        "The Buenos Aires combines the practicality of a sneaker with the expert craftsmanship inherent to Casa Fagliano. The Buenos Aires is the city sneaker of the discerning gentleman.\n",
                "\n" +
                        "\n" +
                        "HOW TO STYLE\n" +
                        "\n" +
                        "The details in the stitching and quality of the sneaker leggier construction, sets the sneaker appart, ensuring luxury and style whatever the occasion might be.\n" +
                        "\n" +
                        "CONSTRUCTION & LEATHER\n" +
                        "\n" +
                        "The Buenos Aires is available in a range of colours: Cognac Calf, Dark Blue Calf, Dark Brown Calf, Dark Grey Suede, Museum Brown Calf and Black Calf.\n" +
                        "\n" +
                        "The calf sneakers uses a selection of the finest French leather.\n" +
                        "\n" +
                        "Each pair of sneakers is equipped with two different colours of cotton laces, one white and the other matching the colour of the sneaker’s leather.The hand stitched sneakers are mounted on lightweight rubber sole that vary in colour depending on the design.\n" +
                        "\n" +
                        "Each pair is signed with a “960” on the tongue, which represents the brands registration number in Argentina.The stamp on the leather mimics the way livestocks are branded in “la pampa” by the gauchos.\n",
                R.drawable.dsc_1724
            ),
            Shoe(
                "Torino Chestnut Grain & Velvet Brown",
                "The Torino is a beautiful addition to your formal automne to winter wardrobe. The Goodyear construction and height of the boot will be sure to keep your feet warm and stylish.",
                "The Derby Boot\n" +
                        "\n" +
                        "The Derby is defined by the eyelets stitched on top of the vamp. The boot has a military heritage, inspired by the boots warn by the British armies during the World War II. The boot was designed to be sturdy and practical, using four metal speed hooks for a quicker lacing.\n" +
                        "\n" +
                        "HOW TO STYLE\n" +
                        "\n" +
                        "The Torino is a dress boot that is very versatile in the way it can be styled, the secret is in how much of the boot you chose to show. The ankle boot can just as well be worn with a tweed suit or with a pair of rugged jeans. The extra height of this ankle boot allows for long and thick socks and the Goodyear stitching protects it from infiltrations.\n" +
                        "\n" +
                        "CONSTRUCTION & LEATHER\n" +
                        "\n" +
                        "The Torino is a Goodyear welted construction finished with a vibram rubber sole. The dotted surface of the soles give it the extra grip needed for all terrains and weather. The details that does the particularity of the Torino is the apron toe stitching , hand stitched by our expert craftsman.\n" +
                        "\n" +
                        "The leather also plays a role in the distinctiveness of the boot, with the seamless marriage of the chestnut grained and the velvet brown calf. The texture of the chestnut grained and the beautiful hues of the velvet’s antique finish, injects character into any outfit. The leather comes from the Tannerie D’Annonay, a selection of the finest calf leather.\n" +
                        "\n" +
                        "The Torino is equipped with a practical pull tab, for an ease of wear.\n",
                R.drawable.torino_chestnut_grain_velvet_brown
            )
        )
    }

    fun addShoe(shoe: Shoe) {
        _shoes.value?.add(shoe)
    }

    fun addShoeFromData(name: String, features: String, description: String) {
        addShoe(Shoe(name, features, description, R.drawable.no_shoe))
    }

    fun removeShoe(shoeName: String) {
        val shoe = _shoes.value?.find {it.name == shoeName }!!
        _shoes.value?.remove(shoe)
    }

}