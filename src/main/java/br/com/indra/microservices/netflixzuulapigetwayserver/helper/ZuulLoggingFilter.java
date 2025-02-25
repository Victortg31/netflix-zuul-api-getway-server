package br.com.indra.microservices.netflixzuulapigetwayserver.helper;



import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter{


	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//solicitando um filtro para cada execução da solicitação
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	//onde fica a lógica da implementação de filtro
	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		
		//o ponto de contexto do pedido começa no pontual do contexto, getRequest está pegando a request atual que está sendo tratada
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		
		logger.info("request -> {} request uri -> {}", request, request.getRequestURI());
		
		return request;
	}
	
	//quando devemos filtrar? (get,post, delete, put,error)
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}



}
