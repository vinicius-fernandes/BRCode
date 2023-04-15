package com.vfernandes.Models;


import com.vfernandes.Enums.PixKeyType;
import com.vfernandes.Utils.Validators.CNPJValidator;
import com.vfernandes.Utils.Validators.CPFValidator;
import com.vfernandes.Utils.Validators.EVPValidator;
import com.vfernandes.Utils.Validators.EmailValidator;
import com.vfernandes.Utils.Validators.PhoneValidator;

public class PixKey {
    private String key;
    private PixKeyType type;

    public PixKey(String key){
        this.key = key;
    }

    public String getKey(){
        return this.key;
    }
    public PixKeyType getType(){
        return this.type;
    }
    public void setKey(String key){
        this.key = key;
    }


    public boolean isCpf(){
        return CPFValidator.isValidCPF(this.key);
    }


    public boolean isCnpj(){
        return CNPJValidator.isValidCNPJ(key);
    }


    public boolean isPhone(){
        return PhoneValidator.isValidPhone(this.key);
    }


   
    public boolean isEmail(){
        return EmailValidator.isValidEmail(this.key);
    }


    public boolean isEvp(){
        return EVPValidator.isValidEVP(this.key);
    }


}
