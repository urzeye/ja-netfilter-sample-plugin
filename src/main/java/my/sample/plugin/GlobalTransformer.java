package my.sample.plugin;

import com.janetfilter.core.commons.DebugInfo;
import com.janetfilter.core.plugin.MyTransformer;

public class GlobalTransformer implements MyTransformer {
    @Override
    public String getHookClassName() {
        return null;
    }

    @Override
    public void before(String className, byte[] classBytes) throws Exception {
        DebugInfo.debug("before transform: " + className);
    }

    @Override
    public byte[] preTransform(String className, byte[] classBytes, int order) throws Exception {
        DebugInfo.debug("pre transform: " + className + ", order: " + order);

        return classBytes;
    }

    @Override
    public byte[] postTransform(String className, byte[] classBytes, int order) throws Exception {
        DebugInfo.debug("post transform: " + className + ", order: " + order);

        return classBytes;
    }

    @Override
    public void after(String className, byte[] classBytes) throws Exception {
        DebugInfo.debug("pre transform: " + className);
    }
}
