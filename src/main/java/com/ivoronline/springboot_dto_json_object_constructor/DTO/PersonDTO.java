package com.ivoronline.springboot_dto_json_object_constructor.DTO;

public class PersonDTO {

  //PROPERTIES
  public String  propName;
  public Integer propAge;

  //CONSTRUCTOR
  private PersonDTO(String name, Integer age) {
    this.propName = name;
    this.propAge  = age;
  }

}
