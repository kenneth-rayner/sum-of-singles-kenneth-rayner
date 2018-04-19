import org.scalatest.{MustMatchers, WordSpec}

class SumOfSinglesSpec extends WordSpec with MustMatchers{

  "SumOfSingles" must {

    "given a list (1,2 return 3)" in {
      SumOfSingles.sumInt(List(1,2)) mustEqual 3
    }
    "given a list (1,2,3 return 6)" in {
      SumOfSingles.sumInt(List(1,2,3)) mustEqual 6
    }

    "given a list (1,2,3,2,1) must return list(1,2,3)" in {
      SumOfSingles.toDistinct(List(1,2,3,2,1)) mustEqual List(1,2,3)
    }
    "given a list (1,2,3,2,1) must return a list showing diff between original list and distinct list" in {

      SumOfSingles.diffInputAndDistinct(List(1,2,3,2,1)) mustEqual List (2,1)
    }
    "given a list (1,2,3,2,1) must return a list showing unique numbers List(3)" in {

      SumOfSingles.showUniqueNumbers(List(1,2,3,2,1)) mustEqual List (3)
    }
    "given a list (1,2,3,4,5,6,3,2,1) must return a list showing unique numbers List(4,5,6)" in {

      SumOfSingles.showUniqueNumbers(List(1,2,3,4,5,6,3,2,1)) mustEqual List (4,5,6)
    }
    "given a list (1,2,3,2,1) must return the sum of the unique numbers(3)" in {

      SumOfSingles.sumUniqueNumbers(List(1,2,3,2,1)) mustEqual 3
    }
    "given a list (1,1,2,2,3,3,4,5) must return the sum of the unique numbers(9)" in {

      SumOfSingles.sumUniqueNumbers(List(1,1,2,2,3,3,4,5)) mustEqual 9
    }
    "one line version of given a list (1,1,2,2,3,3,4,5) must return the sum of the unique numbers(9)" in {

      SumOfSingles.sumUniqueNumbers2(List(1,1,2,2,3,3,4,5)) mustEqual 9
    }
  }
}
