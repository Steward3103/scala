class Foo {

  var cnt = 0

  class Bar {
    cnt = cnt + 1
    val id = cnt
  }
}

object Test extends Application {
  val foo = new Foo
  Console.println((new foo.Bar).id)
}
