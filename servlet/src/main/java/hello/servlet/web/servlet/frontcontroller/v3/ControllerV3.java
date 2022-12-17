package hello.servlet.web.servlet.frontcontroller.v3;

import java.util.Map;

import hello.servlet.web.servlet.frontcontroller.ModelView;

public interface ControllerV3 {
	ModelView process(Map<String, String> paramMap);
}
