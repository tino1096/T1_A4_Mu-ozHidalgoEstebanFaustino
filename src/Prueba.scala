import scala.io.StdIn._
import scala.math._

object Prueba {
  def main(args: Array[String]): Unit = {

    println("Ingresa el numero de datos: ")
    val numDatos = readByte()
    var datos = new Array[Double](numDatos)

    for (i <- 0 until datos.length) {
      println("Ingresa un dato: " + (i + 1) + ":")
      datos(i) = readDouble()
    }

    mostrarDatos(datos)
    calculos(sacarMedia(datos), desviacionEstandar(sacarMedia(datos), datos))
  }

  // Sacar media
  def sacarMedia(datos: Array[Double]): Double = {
    var media: Double = 0.0
    for (i <- datos) {
      media = media + i
    }
    media = media / datos.length
    return media
  } //sacar media

  //Sacar desviacion estandar
  def desviacionEstandar(med: Double, dat: Array[Double]): Double = {
    var sumatoria: Double = 0.0
    for (i <- dat) {
      sumatoria = sumatoria + (pow((abs(med - i)), 2))
    }
    sumatoria = sumatoria / dat.length
    sumatoria = sqrt(sumatoria)
    return sumatoria
  }

  def calculos(med: Double, dat: Double): Unit = {
    println("\n La Media Aritmética es: " + med)
    println("La Desviación Estándar es: " + dat)
  }

  def mostrarDatos(md: Array[Double]): Unit = {
    print("Datos: ")
    for (elemento <- md) {
      print(elemento + " , ")
    }
  }
}