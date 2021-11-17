import kotlin.random.Random


class MetaBallHandler(val maxX: Int = 0, val maxY: Int = 0) {
    var metaBalls = ArrayList<MetaBall>();

    fun add(ball: MetaBall){
        this.metaBalls.add(ball)
    }

    fun add(balls: ArrayList<MetaBall>){
        this.metaBalls.addAll(balls)
    }

    fun createBall(xPos: Int, yPos: Int){
        this.add(MetaBall(xPos, yPos))
    }

    fun createRandomBall(){
        this.add(MetaBall(Random.nextInt(0, this.maxX), Random.nextInt(0, this.maxY)))
    }

    fun update(){
        for(ball in this.metaBalls){
            ball.update(this.maxX, this.maxY)
        }
    }

    fun reverseDistance(x: Int, y: Int): Double {
        var result = 0.0;

        for(ball in this.metaBalls){
            result += ball.reverseDistance(x, y)
        }

        return result
    }
}
