import org.junit.*
import org.junit.Assert.*
import u04lab.code.Complex
import u04lab.code.Complex.*

class ComplexTest :
  val a = Array(Complex(10, 20), Complex(1, 1), Complex(7, 0))

  @Test def testComplexSum() =
    val c = a(0) + a(1) + a(2)
    assertEquals(Complex(18.0,21.0), c)

  @Test def testComplexProduct() =
    val c = a(0) + a(1) + a(2)
    assertEquals(Complex(18.0,21.0), c)

  @Test def testToString() =
    assertEquals("ComplexImpl(10.0,20.0)", a(0).toString())