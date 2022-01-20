package my.sample.plugin;

import com.janetfilter.core.commons.DebugInfo;
import com.janetfilter.core.plugin.MyTransformer;

public class TestTransformer implements MyTransformer {
    @Override
    public String getHookClassName() {
        return "sun/security/x509/X509CertImpl";
    }

    @Override
    public byte[] transform(String className, byte[] classBytes, int order) throws Exception {
        DebugInfo.debug("Oh! It's you: " + className);

        return classBytes;
    }
}
