package com.ivoronline.springboot_dto_json_object_constructor.DTO;

public class PersonDTO {

  //PROPERTIES
  public String  name;
  public Integer age;

  //CONSTRUCTOR
  private PersonDTO(String  name, Integer age) {
    this.name = name;
    this.age  = age;
  }

}
