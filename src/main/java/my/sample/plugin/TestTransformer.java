package my.sample.plugin;

import io.zhile.research.ja.netfilter.transformers.MyTransformer;

public class TestTransformer implements MyTransformer {
    @Override
    public String getHookClassName() {
        return "java/lang/String";
    }

    @Override
    public byte[] transform(String className, byte[] classBytes, int order) throws Exception {
        System.out.println("Oh! It's you: " + className);

        return classBytes;
    }
}
