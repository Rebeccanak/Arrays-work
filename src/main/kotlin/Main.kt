fun main() {
    val friends = arrayOf("Becky", "Ben", "Josephine", "Bridget")
    println(friends.contentToString())
    println(friends[2])
    println(friends[3])
    println(friends.get(1))
    println("${friends[2]} ${friends[3]}")


    var friends2 = friends.plus("Kimani")
    println(friends2.contentToString())
    val newFriends = arrayOf("Sarah", "Fred", "Julia")
    friends2 = friends2.plus(newFriends)
    println(friends2.contentToString())
    println(getdimension(12,8,7))
    println(friends.size)
    println(friends.min())
    println(friends.max())
//    println(friends.sum())
//    println(number.sum)
//    println(friends.count())perty or an atributte of a array


//get a valuable and put it in a another valuable name. friends(3(put 3 in a box)friends(3) = firstname
    val friend = arrayOf("Becky", "Ben", "Josephine", "Bridget")
    var firstname = friends[0]
//    println(firstname)
    friends[0] = friends[3]
    friends[3] = firstname
    println(friends.contentToString())


//    acess a array with its index operator if you write a wrong thing it brings a negaative -1
    val Besties = arrayOf("Jane", "Joy","Hun","Peace")
    println(Besties.indexOf("Jane"))


}
fun getdimension(length:Int, width:Int, Height:Int):Int{
    var dimension = length *width* Height
    return dimension
}
//    friends.set(1,"Jane")
//    friends[2] = "kipkorir"
//    println(friends.contentToString())
//    changing the name to another name


//wirte a funtion that takes in the dimensions of a cubiod returns its volume


