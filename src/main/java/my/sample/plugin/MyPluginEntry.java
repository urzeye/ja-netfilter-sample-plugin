package my.sample.plugin;

import com.janetfilter.core.plugin.MyTransformer;
import com.janetfilter.core.plugin.PluginEntry;

import java.util.ArrayList;
import java.util.List;

public class MyPluginEntry implements PluginEntry {
    private final List<MyTransformer> transformers = new ArrayList<>();

    public MyPluginEntry() {
        transformers.add(new TestTransformer());
        transformers.add(new GlobalTransformer());
        transformers.add(new AttachOnlyTransformer());
        transformers.add(new ManageTransformer());
    }

    @Override
    public String getName() {
        return "SamplePlugin";
    }

    @Override
    public String getAuthor() {
        return "neo";
    }

    @Override
    public String getVersion() {
        return "v1.2.0";
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
