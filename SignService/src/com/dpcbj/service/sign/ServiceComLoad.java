package com.dpcbj.service.sign;

import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Vector;

public class ServiceComLoad {

	public static String BalanceServer(String comServer) {
		Random r = new Random();
		Vector vector = new  Vector();
		Map<String, Object> servers = new HashMap<String, Object>();
		String server = "";
		boolean comConnect= false;
		if(comServer != null && comServer.contains(","))
		{
			String[] serverArray = comServer.split(",");
			for(int i = 0;i < serverArray.length;i++){
				comConnect = PingServer(serverArray[i]);
				if(comConnect)
				{
					Integer ranInt = r.nextInt(9);
					String ranKey = ranInt+serverArray[i].replace(".", "");
					servers.put(ranKey, serverArray[i]);
					vector.add(ranKey);
				}
			}
			if(servers.size() > 0 && !vector.isEmpty())
			{
				Object[] tmpArray = (Object[]) vector.toArray();
/*				for(int j=0; j < tmpArray.length;j++)
				{
					System.out.println("servers.size() is" + servers.size());
					System.out.println("------------------------------------------");
					System.out.println("tmpArray.length is" + tmpArray.length);
					System.out.println("------------------------------------------");
					Arrays.sort(tmpArray);
					System.out.println("key is" + tmpArray[0]);
					System.out.println("------------------------------------------");
					server = servers.get(tmpArray[0]).toString();
					System.out.println("server is" + server);
					System.out.println("------------------------------------------");
				}*/
				Arrays.sort(tmpArray);
				server = servers.get(tmpArray[0]).toString();
				vector.clear();
				servers.clear();
			}
			else
			{
				return "localhost";
			}
		}
		else
		{
			server = comServer;
		}

		return server;
	}

	private static boolean PingServer(String serverIP) {
		boolean success = true;
		try {
			java.net.Socket s = new java.net.Socket();
			s.connect(new InetSocketAddress(serverIP, 135), 100);
			if (!s.isConnected()) success = false;
		} catch (java.net.UnknownHostException e) {
			success = false;
		} catch (java.net.ConnectException e) {
			success = false;
		} catch (java.io.IOException e) {
			success = false;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
}
