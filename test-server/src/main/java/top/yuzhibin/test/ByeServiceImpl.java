package top.yuzhibin.test;

import top.yuzhibin.rpc.annotation.Service;
import top.yuzhibin.rpc.api.ByeService;

/**
 * @author yuzhibin
 */
@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
