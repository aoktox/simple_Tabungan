/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabungan;

/**
 *
 * @author Agus
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(){
    }
    
    public Tabungan(int input,String id){
        switch(id){
            case "IDR" : this.saldo=idrtousd(input);break;
            case "JPY" : this.saldo=jpytousd(input);break;
        }
        
    }

    public void setSaldo(int input, String id) {
        switch(id){
            case "IDR" : this.saldo=idrtousd(input);break;
            case "JPY" : this.saldo=jpytousd(input);break;
        }
        
    }

    public int getSaldo(String id) {
        if ("IDR".equals(id))
            return usdtoidr(this.saldo);
        else if ("JPY".equals(id))
            return usdtojpy(this.saldo);
        else return 0;
        
    }
    
    private int idrtousd(int input){
        return input/10000;
    }
    
    private int usdtoidr(int input){
        return input*10000;
    }
    
    private int jpytousd(int input){
        return input/150;
    }
    
    private int usdtojpy(int input){
        return input*150;
    }
    
    public void simpan(int input, String id){
        if (id=="IDR")
            this.saldo+=idrtousd(input);
        else if (id=="JPY")
            this.saldo+=jpytousd(input);
    }
    
    public void ambil(int input, String id){
        if (id=="IDR"){
            if(status(input, id))
               this.saldo-=idrtousd(input);
            else
                System.out.println("Saldo tidak mencukupi.");
        }
        else if (id=="JPY"){
            if(status(input, id))
               this.saldo-=jpytousd(input);
            else
                System.out.println("ID salah.");
        }
    }
    
    private boolean status(int input, String id){
        if (id=="IDR")
            return saldo>idrtousd(input);
        else if (id=="JPY")
            return saldo>jpytousd(input);
        else{ 
            System.out.println("saldo tidak cukup.");
            return false;
        }
    }
}