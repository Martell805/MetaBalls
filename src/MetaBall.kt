import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

class MetaBall(xPos: Int, yPos: Int) {
    var x = xPos
    var y = yPos
    var vx: Int = Random.nextInt(1, 5)
    var vy: Int = Random.nextInt(1, 5)
    var r: Int = Random.nextInt(30, 100)

    fun reverseDistance(x: Int, y: Int): Double = this.r.toDouble() / sqrt(
        (this.x.toDouble() - x.toDouble()).pow(2.0) +
           (this.y.toDouble() - y.toDouble()).pow(2.0)
    )

    fun update(maxX: Int, maxY: Int){
        if(this.x + this.vx > maxX || this.x + this.vx < 0) this.vx = -this.vx 
        if(this.y + this.vy > maxY || this.y + this.vy < 0) this.vy = -this.vy

        this.x += this.vx
        this.y += this.vy
    }
}
