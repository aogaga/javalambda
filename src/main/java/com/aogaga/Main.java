package com.aogaga;

import java.util.function.Supplier;

public class Main {

  public static void main(String[] args) {
//    System.out.println("Hello world!");

    Supplier<String> strSupplier = ()-> " Hello";

    String supplierVal = strSupplier.get();
    System.out.println(supplierVal);
  }
}