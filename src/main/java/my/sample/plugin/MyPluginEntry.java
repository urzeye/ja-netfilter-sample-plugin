package my.sample.plugin;

import io.zhile.research.ja.netfilter.plugin.PluginEntry;
import io.zhile.research.ja.netfilter.transformers.MyTransformer;

import java.util.ArrayList;
import java.util.List;

public class MyPluginEntry implements PluginEntry {
    private final List<MyTransformer> transformers = new ArrayList<>();

    public MyPluginEntry() {
        transformers.add(new TestTransformer());
    }

    @Override
    public String getName() {
        return "SamplePlugin";
    }

    @Override
    public String getVersion() {
        return "v1.0.0";
    }

    @Override
    public String getDescription() {
        return "a sample ja-netfilter plugin";
    }

    @Override
    public List<MyTransformer> getTransformers() {
        return transformers;
    }
}
