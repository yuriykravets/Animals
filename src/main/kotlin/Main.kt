fun main(args: Array<String>) {

    val animals = arrayOf(Wolf(), Hippo())
    for (item in animals){
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()

    vet.giveShot(wolf)
    vet.giveShot(hippo)

}