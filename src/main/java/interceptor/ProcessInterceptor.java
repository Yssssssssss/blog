package interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ProcessInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o)
			throws Exception {

		httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");

		httpServletResponse.setHeader("Access-Control-Allow-Headers",
				"Content-Type,Content-Length, Authorization, Accept,X-Requested-With,Access-Token");

		httpServletResponse.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");

		httpServletResponse.setHeader("X-Powered-By", "Jetty");

		httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
		httpServletResponse.setHeader("Access-Control-Expose-Headers", "*");

		String method = httpServletRequest.getMethod();
		
		 Date date=new Date();
		 SimpleDateFormat format =new SimpleDateFormat("YYYY MM:dd HH:mm");
		 String formatDate = format.format(date);
		if (method.equals("OPTIONS")) {
			httpServletResponse.setStatus(200);
			return false;
		}

		System.out.println(method+"    "+formatDate);
		

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object o, Exception e) throws Exception {

	}
}
