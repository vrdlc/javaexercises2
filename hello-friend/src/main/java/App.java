import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine; //WE NEED TO INCLUDE THIS IN APP.JAVA FILE TO USE VELOCITY TEMPLATES

import static spark.Spark.*;  //"*" IMPORTS ALL LIBRARIES FROM CURRENT PATH



public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/", (request, response) -> { // "/" will automatically take us to the root url
    HashMap model = new HashMap();
    model.put("template", "templates/hello.vtl");
    return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());


    get("/favorite_photos", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/favorite_photos.vtl");
        return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }
}
