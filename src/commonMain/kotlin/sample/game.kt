package org.jonnyzzz.lifegame

fun main() {


  val blinker = """
      ...........
      ...x.......
      ...x.......
      ...x.......
      ...........
  """

  val beacon = """
      ...........
      ...xx......
      ...xx......
      .....xx....
      .....xx....
      ...........

  """

  val glider = """
      ...x.............
      ....x............
      ..xxx............
      .................
      .................
      .................
      .................
      .................
      .................

  """

  var m = loadMaze(glider)

  repeat(30) {
    println(m.renderToString())
    m = m.nextGeneration(EvolutionCell::conwayLaws)
  }
}

