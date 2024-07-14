import com.study.ForLoop
import com.study.IterInstance
import org.junit.jupiter.api.BeforeAll

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)// 생명 주기 조절, 디폴트값은 PER_METHOD
class TestForLoop {

    lateinit var fl: ForLoop

    @BeforeAll
    fun setUp(){
        fl = ForLoop()
    }

    @Test
    fun testForLoop1(){
        val fl = ForLoop()
        fl.forLoop1()
    }

    @Test
    fun testForLoop2(){
        val fl = ForLoop()
        val iterInstance = IterInstance()
        fl.forLoop2(iterInstance)
    }
}