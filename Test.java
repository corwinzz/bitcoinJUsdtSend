
public class Test {
	@Test
    public void tranaction() throws Exception {
        api.setIsMainNet(false);
        String fromAddress = "mm26iTQBLEga8zJxvqURo81xuKE7y4m3hB";
        String toAddress = "mjsmd3HGE7erguBCqCef2jG98TZrFLX6LY";
        String privateKey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        List<UTXO> utxos = api.getUnspent(fromAddress);
        Long amount = 10000L;
        Integer propertyid = 1;
        Long fee = api.getOmniFee(utxos);
        String sign = api.omniSign(fromAddress, toAddress, privateKey, amount,fee, propertyid,utxos);
        String txid = api.publishTx(sign);//广播交易
        System.out.println(txid);
}
