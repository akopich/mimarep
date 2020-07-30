package mimarep

abstract class A

trait T

object Main {
//  implicit val instance: T = new A with T // v0.1
  implicit val instance: A with T = new A with T // v0.2
}
