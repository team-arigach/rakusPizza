package jp.co.example.ecommerce_a.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.example.ecommerce_a.domain.LoginUser;
import jp.co.example.ecommerce_a.domain.Order;
import jp.co.example.ecommerce_a.form.OrderForm;
import jp.co.example.ecommerce_a.service.ShowConfirmService;

/**
 * 商品確認画面を表示するためのコントローラー.
 * 
 * @author suzukiryouhei
 *
 */
@Controller
@RequestMapping("")
public class ShowConfirmController {
	
	@Autowired
	private ShowConfirmService showConfirmService;
	
	@Autowired
	private HttpSession session;
	
	@ModelAttribute
	public OrderForm setUpOrderForm() {
		return new OrderForm();
	}
	
	/**
	 * 購入商品を表示する.
	 * 
	 * @param userId　ログインid
	 * @param model
	 * @return　商品確認画面
	 */
	@RequestMapping("/showConfirm")
	public String showConfirm(Model model, @AuthenticationPrincipal LoginUser loginUser) {
		Integer userId = session.getId().hashCode();
		if(loginUser != null) {
			userId = loginUser.getUser().getId();
		} else {
			userId = session.getId().hashCode();
		}
		Order order = showConfirmService.showOrderConfirm(userId, 0);
		System.out.println(order);
		if(order != null) {
			if(order.getOrderItemList().size() != 0) {
			model.addAttribute("order", order);
			}
		}
		return "order_confirm"; 
	}
}
