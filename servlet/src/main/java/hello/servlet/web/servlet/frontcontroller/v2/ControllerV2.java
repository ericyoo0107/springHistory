package hello.servlet.web.servlet.frontcontroller.v2;

import java.io.IOException;

import hello.servlet.web.servlet.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ControllerV2 {
	MyView process(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException;
}
