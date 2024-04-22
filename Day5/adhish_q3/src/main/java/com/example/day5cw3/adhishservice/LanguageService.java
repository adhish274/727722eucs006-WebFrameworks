package com.example.day5cw3.adhishservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.adhishmodel.adhishLanguage;
import com.example.day5cw3.adhishrepository.adhishLanguageRepo;

@Service
public class LanguageService {
    private adhishLanguageRepo languageRepo;
    public LanguageService(adhishLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(adhishLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<adhishLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,adhishLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public adhishLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
