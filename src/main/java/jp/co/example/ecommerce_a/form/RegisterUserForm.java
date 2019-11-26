package jp.co.example.ecommerce_a.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * ユーザー登録フォーム.
 * 
 * @author yosuke.yamada
 *
 */
public class RegisterUserForm {
	

	/**	名前 */
	@NotBlank(message = "お名前を入力して下さい")	
	private String name;
	/** メールアドレス */
	@NotBlank(message = "メールアドレスを入力して下さい")
	@Email(message = "入力された内容がメールアドレスではありません")
	private String email;
	/**	電話番号 */
	@NotBlank(message = "電話番号を入力して下さい")
	private String telephone;
	/**	パスワード */
	@NotBlank(message = "パスワードを入力して下さい")
	private String password;
	/**	確認用パスワード */
	@NotBlank(message = "確認用パスワードを入力して下さい")
	private String passwordconfomation;
	/**	住所 */
	@NotBlank(message = "住所を入力して下さい")
	private String address;
	/**	郵便番号 */
	@NotBlank(message="郵便番号を入力してください")
	private String zipcode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordconfomation() {
		return passwordconfomation;
	}
	public void setPasswordconfomation(String passwordconfomation) {
		this.passwordconfomation = passwordconfomation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "RegisterUserForm [name=" + name + ", email=" + email + ", telephone=" + telephone + ", password="
				+ password + ", passwordconfomation=" + passwordconfomation + ", address=" + address + ", zipcode="
				+ zipcode + "]";
	}

}