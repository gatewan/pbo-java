package com.gatewan.aplikasi1;

public class Kendaraan {
  public static int jumlah;
  //static jika di akses di class lain tidak perlu membuat object dulu 
  //melainkan dapat dipanggil langsung.
  public Kendaraan(){
  jumlah++;
  }
  public void maju(){
      System.out.println("Kendaraan Maju");
  } 
  
  public void mundur(){
      System.out.println("Kendaraan Mundur");
  } 
  //protected hanya dapat diakses dalam class yang beersangkutan
  //dan class turunan dalam satu package
  protected void berhenti(){
      System.out.println("Kendaraan Berhenti");
  } 
}
