import org.junit.jupiter.api.Test;

public class TestRunSwitch {
    @Test
    public void testRunSwitch(){
        RunSwitch rs = new RunSwitch();
        rs.runSwitchByValue(1);
        rs.runSwitchByValue(2);
        rs.runSwitchByValue(4);
        rs.runSwitchByValue(22);
    }
}
