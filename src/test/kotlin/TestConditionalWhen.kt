import com.study.ConditionalWhen
import org.junit.jupiter.api.Test

class TestConditionalWhen {
    @Test
    fun testRunWhen(){
        val c = ConditionalWhen()
        c.runWhenByValue(1)
        c.runWhenByValue(10)
    }
}