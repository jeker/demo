package com.jeker.test.androidcalljs;
//package com.gionee.pay.recharge;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.zip.GZIPInputStream;
//
//import net.minidev.json.JSONObject;
//import net.minidev.json.JSONStyle;
//
//import org.apache.commons.lang3.CharEncoding;
//import org.junit.Test;
//
//import com.gionee.pay.dao.DbUtil;
//
//public class RechargePresentExpressionTest {
//	private final String reqUrl = "http://localhost/pay/gnpay/present/expression";
//	private final String channel = "104111";
//	
//	
//	@Test
//	public void testRechargeTimes() {
//		System.out.println(DbUtil.selectEventChannel("105115", "10,11,12,13,14,15,18,19,20,21"));
//	}
//	
//	@Test
//	public void testGetExpression() {
//		JSONObject jsonReq = new JSONObject();
//		jsonReq.put("channel", channel);
//
//		String response = null;
//		try {
//			response = post(reqUrl, jsonReq.toJSONString(JSONStyle.NO_COMPRESS));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//		System.out.println(response);
//
//	}
//	
//	public static String post(String reqUrl, String body) throws IOException {
//		URL serverUrl = new URL(reqUrl);
//		HttpURLConnection conn = null;
//		GZIPInputStream isr = null;
//		BufferedReader br = null;
//		StringBuffer buffer = new StringBuffer();
//		FileOutputStream out = null;
//		try {
//			conn = (HttpURLConnection) serverUrl.openConnection();
//			conn.setConnectTimeout(5000);
//			conn.setReadTimeout(5000);
//			conn.setRequestMethod("POST");
//			conn.setDoOutput(true);
//			conn.connect();
//
//			conn.getOutputStream().write(body.getBytes(CharEncoding.UTF_8));
//
//			isr = new  GZIPInputStream(conn.getInputStream());
//			out = new FileOutputStream(new File("D:/expression.txt"));
//			
//			byte[] buf = new byte[1024];
//			
//			int len = 0;
//
//			while((len = isr.read(buf)) > 0) {
//				out.write(buf, 0, len);
//			}
//		} finally {
//			if (null != br) {
//				br.close();
//			}
//			if (null != isr) {
//				isr.close();
//			}
//			if(null != out) {
//				out.close();
//			}
//			if (null != conn) {
//				conn.disconnect();
//			}
//		}
//
//		return buffer.toString();
//	}
//
//
//}
