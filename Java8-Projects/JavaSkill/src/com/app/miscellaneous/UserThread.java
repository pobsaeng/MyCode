package com.app.miscellaneous;
public class UserThread {
	public static void main(String[] args) {
		MonitorThread monitor = new MonitorThread();
		monitor.start();
	}
}
