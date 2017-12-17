package scripts.dataext.initdataext.testmaterial.simple;

import com.github.winteryoung.yanwte2.core.ServiceOrchestrator;
import com.github.winteryoung.yanwte2.core.spi.Combinator;
import scripts.dataext.initdataext.testmaterial.simple.ns3.Service3Provider1;

/**
 * @author Winter Young
 * @since 2017/12/13
 */
public class Service3Orchestrator implements ServiceOrchestrator<Service3> {
    @Override
    public Combinator tree() {
        return chain(provider(Service3Provider1.class));
    }
}
