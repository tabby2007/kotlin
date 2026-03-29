 fun main() {
    val counties = arrayOf("Nairobi", "Mombasa", "Kisumu", "Nakuru", "Eldoret", "Machakos", "Kiambu")
    for (county in counties.indices) {
        if(county == 0 || county == 2){
            println("${counties[county]}")
        }
    }
}