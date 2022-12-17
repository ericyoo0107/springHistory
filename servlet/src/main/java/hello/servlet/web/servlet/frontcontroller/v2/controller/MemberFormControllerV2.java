package hello.servlet.web.servlet.frontcontroller.v2.controller;

import java.io.IOException;

import hello.servlet.web.servlet.frontcontroller.MyView;
import hello.servlet.web.servlet.frontcontroller.v2.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberFormControllerV2 implements ControllerV2 {
	@Override
	public MyView process(HttpServletRequest request, HttpServletResponse response) throws
		ServletException,
		IOException {
		return new MyView("/WEB-INF/views/new-form.jsp");
	}
}
