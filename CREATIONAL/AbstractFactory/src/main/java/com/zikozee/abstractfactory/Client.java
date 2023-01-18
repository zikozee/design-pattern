package com.zikozee.abstractfactory;


import com.zikozee.abstractfactory.aws.AwsResourceFactory;
import com.zikozee.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib){
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        Network network = factory.createNetwork(Network.Type.udp);
        instance.attachStorage(storage);
        instance.addNetwork(network);
        return instance;
    }

    public static void main(String[] args) {
    	Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 2400);
        i1.start();
        i1.stop();


        System.out.println("******************************");
        Client gcp  = new Client(new GoogleResourceFactory());
        Instance i2 = gcp.createServer(Instance.Capacity.micro, 2400);
        i2.start();
        i2.stop();
    }

}
