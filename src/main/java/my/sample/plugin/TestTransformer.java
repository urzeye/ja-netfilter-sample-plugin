package my.sample.plugin;


import io.zhile.research.ja.netfilter.plugin.MyTransformer;

public class TestTransformer implements MyTransformer {
    @Override
    public String getHookClassName() {
        return "sun/security/x509/X509CertImpl";
    }

    @Override
    public byte[] transform(String className, byte[] classBytes, int order) throws Exception {
        System.out.println("Oh! It's you: " + className);

        return classBytes;
    }
}
