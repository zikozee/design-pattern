package com.dp.singleton;

import java.util.jar.JarOutputStream;

public class Client {

	public static void main(String[] args) {

		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		System.out.println(registry2 == registry);


		LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();

		System.out.println(lazySingleton1 == lazySingleton2);

		LazyRegistryIODH singleton;
		singleton = LazyRegistryIODH.getInstance();

	}

}
