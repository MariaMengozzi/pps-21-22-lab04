import u04lab.code.{Course, SameTeacher, Student}
import org.junit.*
import org.junit.Assert.*
import u04lab.code.List.*
import u04lab.code.List

class StudentTest:
  val cPPS = Course("PPS", "Viroli")
  val cPCD = Course("PCD", "Ricci")
  val cOOP = Course("OOP", "Viroli")
  val s1 = Student("mario", 2015)
  val s2 = Student("gino", 2016)
  val s3 = Student("rino")

  @Test def testEnrolling() =
    s1.enrolling(cPPS, cPCD)
    assertEquals(Cons("PCD",Cons("PPS",Nil())), s1.courses)

  @ Test def testHasTeacher() =
    s2.enrolling(cPPS, cPCD)
    assertTrue(s2.hasTeacher("Ricci"))

  @Test def testFactoryList() =
    val courses = List(cPPS, cPCD)
    assertEquals(Cons(Course("PPS","Viroli"), Cons(Course("PCD","Ricci"), Nil())), courses)

  @Test def testNotSameTeacher() =
    val courses = List(cPPS, cPCD)
    courses match
      case SameTeacher(t) => println( s" $courses have same teacher $t ")
      case _ => println( s" $courses haven't same teacher")

  @Test def testSameTeacher() =
    val courses = List(cPPS, cOOP)
    courses match
      case SameTeacher(t) => println( s" $courses have same teacher $t ")
      case _ => println( s" $courses haven't same teacher")

