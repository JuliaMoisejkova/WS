package ru.raiffeisen.cources.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IHelloWorld {
    @WebMethod String sayHello(String name);
}
