
/*Scala Variance Type	Syntax	Description
Covariant	[+T]	If S is subtype of T, then List[S] is also subtype of List[T]
Contravariant	[-T]	If S is subtype of T, then List[T] is also subtype of List[S]
Invariant	[T]	If S is subtype of T, then List[S] and List[T] are unrelated.*/

class Animal[+T](val animial:T)

class Dog
class Puppy extends Dog

class AnimalCarer(val dog:Animal[Dog])

object ScalaCovarianceTest{
  def main(args: Array[String]) {
    val puppy = new Puppy
    val dog = new Dog

    val puppyAnimal:Animal[Puppy] = new Animal[Puppy](puppy)
    val dogAnimal:Animal[Dog] = new Animal[Dog](dog)

    val dogCarer = new AnimalCarer(dogAnimal)
    val puppyCarer = new AnimalCarer(puppyAnimal)

    println("Done.")
  }
}
