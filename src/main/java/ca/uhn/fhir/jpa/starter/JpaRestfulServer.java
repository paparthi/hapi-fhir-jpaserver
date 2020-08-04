package ca.uhn.fhir.jpa.starter;

import ca.uhn.fhir.jpa.starter.servlet.BaseJpaRestfulServer;

import javax.servlet.ServletException;

//Alternatively use Annotations
//@WebServlet(name="HAPI FIR JPA Server", urlPatterns = "/fhir/*")  //http://localhost:8085/hapi-fhir-jpaserver/fhir

public class JpaRestfulServer extends BaseJpaRestfulServer {

  private static final long serialVersionUID = 1L;

  @Override
  protected void initialize() throws ServletException {
    super.initialize();

    // Add your own customization here

  }

  public static void main(String [] theArgs) throws Exception
  {
    int ourPort = 8085;
  }
}
