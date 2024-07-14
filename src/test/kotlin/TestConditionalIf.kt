import com.study.ConditionalIf
import org.junit.jupiter.api.Test

class TestConditionalIf {
    @Test
    fun getMaxTest(){
        val c = ConditionalIf()
        println("GetMax: ${c.getMax(2, 3)}")
        println("GetMax Kotlin Style: ${c.getMaxKt(5, 3)}")
    }
}