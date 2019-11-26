package jp.co.example.ecommerce_a.form;

import javax.validation.constraints.NotBlank;

public class OrderForm {

	/**	宛名氏名 */
	@NotBlank(message="名前を入力して下さい")
	private String destinationName;
	
	/**	宛名Eメール */
	@NotBlank(message="メールアドレスを入力して下さい")
	private String destinationEmail;
	
	/**	宛名郵便番号 */
	private String destinationZipcode;
	
	/**	宛名住所 */
	@NotBlank(message="住所を入力して下さい")	
	private String destinationAddress;
	
	/**	宛名電話番号 */
	@NotBlank(message="電話番号を入力して下さい")
	private String destinationTel;
	
	/**	配達時間 */
	@NotBlank(message="配達日時を入力して下さい")
	private String deliveryTime;
	
	/**	支払方法 */
	private String paymentMethod;

	//以下getter/setter
	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDestinationEmail() {
		return destinationEmail;
	}

	public void setDestinationEmail(String destinationEmail) {
		this.destinationEmail = destinationEmail;
	}

	public String getDestinationZipcode() {
		return destinationZipcode;
	}

	public void setDestinationZipcode(String destinationZipcode) {
		this.destinationZipcode = destinationZipcode;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getDestinationTel() {
		return destinationTel;
	}

	public void setDestinationTel(String destinationTel) {
		this.destinationTel = destinationTel;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "OrderForm [destinationName=" + destinationName + ", destinationEmail=" + destinationEmail
				+ ", destinationZipcode=" + destinationZipcode + ", destinationAddress=" + destinationAddress
				+ ", destinationTel=" + destinationTel + ", deliveryTime=" + deliveryTime + ", paymentMethod="
				+ paymentMethod + "]";
	}

}
