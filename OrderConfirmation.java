package warehouseorderingtrackingsystem;

public interface OrderConfirmation {
	/**
	 * interface for receive order used by accounts and supplier
	 * @param confirmation
	 * @return
	 */
	public boolean receiveOrder(int orderNo);
		
	
}
