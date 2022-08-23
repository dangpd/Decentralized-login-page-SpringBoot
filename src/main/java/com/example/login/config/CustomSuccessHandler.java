package com.example.login.config;


import com.example.login.service.MyUserDetails;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

public class CustomSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		MyUserDetails userLogined = getUserLogined();
		request.getSession().setAttribute("USER", userLogined.getUsername());
 		request.getSession().setAttribute("memberName", userLogined.getFullName());
		@SuppressWarnings("unchecked")
 		Set<GrantedAuthority> authors = (Set<GrantedAuthority>) userLogined.getAuthorities();
		for (GrantedAuthority author : authors) {
			if (author.getAuthority().equals("ROLE_ADMIN") || author.getAuthority().equals("ADMIN")) {
				response.sendRedirect(request.getContextPath() + "/admin");
				return;
			}
		}
		response.sendRedirect(request.getContextPath() + "/customer");
	}


	public MyUserDetails getUserLogined() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return (MyUserDetails) principal;
	}
}
