package hello.servlet.web.servlet.frontcontroller.v3;

import java.util.Map;

import hello.servlet.web.servlet.frontcontroller.ModelView;

public class MemberFormControllerV3 implements ControllerV3 {
	@Override
	public ModelView process(Map<String, String> paramMap) {
		return new ModelView("new-form");
	}
}
