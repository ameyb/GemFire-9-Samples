package io.pivotal.client;

import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.pdx.ReflectionBasedAutoSerializer;

public class BasicClient {

	private static Region<String, String> getCustomerRegion() {

		Region<String,String> region = null;

		ClientCache cache = new ClientCacheFactory()
		.set("name", "ProjectClient")
		.set("log-level", "info")
		.set("log-file","client.log")
		.setPdxSerializer(new ReflectionBasedAutoSerializer(".*"))
		.set("cache-xml-file",
				"gemfire/config/clientCache.xml").create();

		region = cache.getRegion("customer");

		return region;
	}

	public static void main(String args[]) {

		Region<String,String> customerRegion = getCustomerRegion();

		customerRegion.put("cust1", "Josh");
		customerRegion.put("cust2", "Amey");
		customerRegion.put("cust3", "Nikhil");


		String name = customerRegion.get("cust1");
		System.out.println("Value for key: cust1\t" + "Value: " + name);

		name = customerRegion.get("cust2");
		System.out.println("Value for key: cust2\t" + "Value: " + name);
		System.exit(0);
	}

}
