package com.example.demo.service;


import com.example.demo.domain.Customer;
import com.example.demo.domain.Url;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.UrlRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UrlService {

    private final UrlRepository urlRepository;
    private final CustomerRepository customerRepository;

    public Url create(Url url, String userId){

        Customer customer = customerRepository.findByUserId(userId).orElse(null);

        System.out.println("UrlSerice > userId  :  " +  userId);
        System.out.println("UrlSerice > create  :  " +  customer.getCustomer_id());

        if(customer != null){
            url.setCustomer(customer);
        }
        return urlRepository.save(url);
    }
}
