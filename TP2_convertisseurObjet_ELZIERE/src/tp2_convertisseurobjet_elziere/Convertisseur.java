/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_elziere;

/**
 *
 * @author elena
 */
public class Convertisseur {
    int nbConversions;
         public Convertisseur () {
         nbConversions = 0 ;
}
    
    
    public double CelciusVersKelvin(double tempCelcius) { 
    double tempK;
    tempK=tempCelcius + 273;
    nbConversions += 1;
    return (tempK);
    
    }

public double KelvinVersCelcius(double tempKelvin) { 
    double tempC;
    tempC=tempKelvin - 273;
    nbConversions += 1;
    return (tempC);
    
}
    
public double FarenheitVersCelcius(double tempFarenheit) { 
    double tempC2;
    tempC2=tempFarenheit-32;
    tempC2=tempC2/1.8;
    nbConversions += 1;
    return (tempC2);

}

public double CelciusVersFarenheit(double tempCelcius) { 
    double tempF2;
    tempF2=tempCelcius*1.8;
    tempF2=tempF2+32;
    nbConversions += 1;
    return (tempF2);

}

public double KelvinVersFarenheit(double tempKelvin) { 
    double tempF3;
    tempF3=KelvinVersCelcius(tempKelvin);
    tempF3=CelciusVersFarenheit(tempF3);
    nbConversions += 1;
    return (tempF3);
}

public double FarenheitVersKelvin(double tempFarenheit) { 
    double tempK4;
    tempK4=FarenheitVersCelcius(tempFarenheit);
    tempK4=CelciusVersKelvin(tempK4);
    nbConversions += 1;
    return (tempK4);
    

}
public String toString () {
  return "nb de conversions"+ nbConversions;
}

}
