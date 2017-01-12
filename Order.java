package warehouseorderingtrackingsystem;


public abstract class Order {

	private int orderId;
	private int orderNo;

/**
 * Class constructor
 * @param orderId
 * @param orderNo
 */
	public Order(int orderId, int orderNo){
		this.orderId = orderId;
		this.orderNo = orderNo;
	}
	
	/**
	 * gets orderId from class order
	 * @return orderId as an Int
	 */
	public int getOrderId() {
		return orderId;
	}
	
	/**
	 * gets orderNo from class order
	 * @return orderNo as an Int
	 */
	public int getOrderNo() {
		return orderNo;
	}
	
	/**
	 * gets orderedItems from class order
	 * @return orderedItems as an Array
	 */
	public abstract String getOrderedItems(int orderNumber);
	public abstract void addToOrder(Item item);
}
