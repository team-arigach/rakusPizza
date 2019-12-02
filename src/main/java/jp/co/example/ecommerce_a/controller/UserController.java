package jp.co.example.ecommerce_a.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ユーザーを操作するコントローラー.
 * 
 * @author takahiro.suzuki
 *
 */
@Controller
@RequestMapping("")
public class UserController {

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private HttpSession session;
	
	/**
	 * ログイン画面を表示する.
	 * @return ログイン画面
	 */
	@RequestMapping("/login")
	public String toLogin(Model model, @RequestParam(required = false) String error) {
		//=====sessionに前のURLを記憶============
		if(!("/login".equals( request.getHeader("REFERER").substring(21))) ) {
			session.setAttribute("referer", request.getHeader("REFERER").substring(21));
		}
		System.err.println("referer = > " + session.getAttribute("referer"));
		//======================================
		if(error != null) {
			System.err.println("ログイン失敗");
			model.addAttribute("loginError", "メールアドレスまたはパスワードが違います。");
		}

		return "login";
	}

}
