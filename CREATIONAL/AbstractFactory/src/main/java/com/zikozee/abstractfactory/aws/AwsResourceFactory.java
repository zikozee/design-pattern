package com.zikozee.abstractfactory.aws;

import com.zikozee.abstractfactory.Instance;
import com.zikozee.abstractfactory.Network;
import com.zikozee.abstractfactory.ResourceFactory;
import com.zikozee.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }

    @Override
    public Network createNetwork(Network.Type type) {
        return new AwsNetwork(type);
    }
}
