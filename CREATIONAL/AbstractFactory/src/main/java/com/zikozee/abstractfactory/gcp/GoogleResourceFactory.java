package com.zikozee.abstractfactory.gcp;

import com.zikozee.abstractfactory.Instance;
import com.zikozee.abstractfactory.Network;
import com.zikozee.abstractfactory.ResourceFactory;
import com.zikozee.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }

    @Override
    public Network createNetwork(Network.Type type) {
        return new GoogleNetwork(type);
    }
}
