import java.util.Arrays;
import java.util.List;

public class RunSwitch {

    public void runSwitch(){
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
    }

    public void runSwitchByValue(int value){
        switch(value){
            case 1:
                System.out.println("print number one");
                break;
            case 2:
                System.out.println("print number two");
            case 3:
                System.out.println("print number three");
                break;
            default:
                System.out.println("others");
        }

    }
}
