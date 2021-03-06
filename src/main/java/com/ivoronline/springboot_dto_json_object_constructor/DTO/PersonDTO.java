package com.ivoronline.springboot_dto_json_object_constructor.DTO;

public class PersonDTO {

  //PROPERTIES ARE NOT USED FOR DESERIALIZATION IF THERE IS CONSTRUCTOR
  private String  name;
  private Integer age;

  //SETTERS
  public String  getName() { return name; }
  public Integer getAge () { return age;  }

  //CONSTRUCTOR IS USED FOR DESERIALIZATION
  PersonDTO(String  name, Integer age) {
    this.name = name;
    this.age  = age;
  }

}
