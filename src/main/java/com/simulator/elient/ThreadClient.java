package com.simulator.elient;

/**
 * ＊模拟器多线程客户端
 */
public class ThreadClient {
    public static void main(String[] args) throws Exception {
        String deviceID = "0526";
        for (int i = 0; i < 1000; i++) {
            new Thread(new StepcountPackageThread(Integer.parseInt(deviceID + i))).start();
        }
    }
}
