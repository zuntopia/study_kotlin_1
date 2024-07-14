import com.study.ConditionalWhen
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)// 생명 주기 조절, 디폴트값은 PER_METHOD
class TestConditionalWhen {
//    lateinit var c: ConditionalWhen
//    @BeforeAll
//    internal fun setUp(){
//        c = ConditionalWhen()
//    }

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