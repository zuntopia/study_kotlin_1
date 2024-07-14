import com.study.ConditionalWhen
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TestConditionalWhen {
    companion object {
        lateinit var c: ConditionalWhen
        @JvmStatic
        @BeforeAll
        internal fun setUp(){
            c = ConditionalWhen()
        }
    }

    @Test
    @DisplayName("When")
    fun testRunWhen(){
        c.runWhenByValue(1)
        c.runWhenByValue(10)
    }

    @Test
    @DisplayName("Switch")
    fun testRunSwitchFromJava(){
        c.callSwitchFromJava(1)
        c.callSwitchFromJava(5)
    }
}