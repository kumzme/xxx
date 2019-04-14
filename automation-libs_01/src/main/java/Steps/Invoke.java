package Steps;

import cucumber.api.cli.Main;
import com.Common.automation.CoreUtils;
import org.junit.Test;
import org.slf4j.*;

import java.io.IOException;
import java.util.*;
import java.util.stream.*;

import static com.Common.automation.CommonApplicationMethods.clear_Env_Chrome;
import static java.lang.Thread.currentThread;
import static java.util.Collections.addAll;


public class Invoke {
    private static final Logger logger = LoggerFactory.getLogger(CoreUtils.class);


    @Test
    public void Test_01_Test() throws IOException, InterruptedException {
        clear_Env_Chrome();
        List<Integer> total_Threads = new ArrayList<Integer>();
        addAll(total_Threads, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Byte> aa = total_Threads.parallelStream().map(
                counter -> {
                    return new Main().run(new String[]{"--glue", "Steps", "--plugin","io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "src/test/resources/"},
                            currentThread().getContextClassLoader());
                }).collect(Collectors.toList());

        clear_Env_Chrome();

    }

    //logger.info("Start thread - " + counter.toString()); //logger.info("End thread - " + counter.toString()); //return aa3;

}
