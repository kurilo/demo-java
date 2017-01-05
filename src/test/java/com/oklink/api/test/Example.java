package com.oklink.api.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.oklink.api.OKLink;
import com.oklink.api.OKLinkBuilder;
import com.oklink.api.util.SignTool;

public class Example {
	
	
	private static final String KEY = null;  //apikey	
	private static final String SECRET = null;//secretkey
	public static void main(String[] args) throws Exception {
		OKLink oklink = OKLinkBuilder.getInstance().setHost("https://www.oklink.com")
                .build(KEY, SECRET);
		  String result = null;
		 //#common api
		
		 //result = oklink.getTicker("EXRATE");
		 //result = oklink.getCountryList();
		  
		 //#setting api
		 //result = oklink.setDeliveryStatus(1);
		  
		 //#remitance api 
		 //result = oklink.getBankInfo(82);
	     //result = oklink.createRemit(82,1,2,0,299,"san1##zhang","86,15001137489","","si1##li","1985-10-12","PASSPORT","2343","86,15001137489","","6129@11122222333",0,"wallet234",0,true) ;  //269
		 //result = oklink.getRemitInfo("81qxFhp6QP4W3Q",1);
		 //result = oklink.getRemitList(2, 1, 10, 5);
		
		 //#pay
         //result = oklink.getPayInfo("D3uU3cPA5d7Cws");
         //JSONObject json = JSON.parseObject(result);
		 //JSONObject payInfo = json.getJSONObject("pay_info");
		 //String privateKeyWIF = SignTool.decodePrivateKeyWIF(payInfo.getString("aes256key"), "123!e", payInfo.getString("salt"));
		 //String hex = SignTool.verifyAndSignTransaction(payInfo.getString("pay_hex"),SignTool.COIN_TOKEN, privateKeyWIF,"", true);
		 //result = oklink.toPay("D3uU3cPA5d7Cws", hex);
		
		 //#accept
		 //result = oklink.accept("D3uU3cPA5d7Cws");
		  
         //result = oklink.getRejectInfo("FNEF81zo6xym7s");
		 //JSONObject json = JSON.parseObject(result);
		 //JSONObject payInfo = json.getJSONObject("reject_info");
		 //String privateKeyWIF = SignTool.decodePrivateKeyWIF(payInfo.getString("aes256key"), "1qazxsw@", payInfo.getString("salt"));
		 //String hex = SignTool.verifyAndSignTransaction(payInfo.getString("reject_hex"),SignTool.COIN_TOKEN, privateKeyWIF,payInfo.getString("redeem_script"), true);
		 //result = oklink.reject(1081, hex,"this is no good");
		 
		 //#refund 
		 //result = oklink.getReFundInfo("D3uU3cPA5d7Cws");
		 //JSONObject json = JSON.parseObject(result);
		 //JSONObject payInfo = json.getJSONObject("refund_info");
		 //String privateKeyWIF = SignTool.decodePrivateKeyWIF(payInfo.getString("aes256key"), "123!e", payInfo.getString("salt"));
		 //String hex = SignTool.verifyAndSignTransaction(payInfo.getString("refund_hex"),SignTool.COIN_TOKEN, privateKeyWIF,payInfo.getString("redeem_script"), true);
		 //result = oklink.refund("D3uU3cPA5d7Cws", hex);
		  
		 //#receive
         //result = oklink.getReciveInfo(845);
         //JSONObject json = JSON.parseObject(result);
         //JSONObject payInfo = json.getJSONObject("receive_info");
         //String privateKeyWIF = SignTool.decodePrivateKeyWIF(payInfo.getString("aes256key"), "a1!", payInfo.getString("salt"));
         //String redeem_script = payInfo.getString("redeem_script");
         //String hex = SignTool.verifyAndSignTransaction(payInfo.getString("receive_hex"),SignTool.COIN_TOKEN, privateKeyWIF,
         //  redeem_script, true);
         //result = oklink.appealReceive(845, 651287, hex);
		
		 //#user account api
		 //result = oklink.getUserInfo();
		 System.out.println(result);
		
	}
	
}
