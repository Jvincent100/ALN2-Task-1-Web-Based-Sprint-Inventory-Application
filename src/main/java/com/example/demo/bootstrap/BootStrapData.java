package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, InhousePartRepository inhousePartRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Add InhouseParts
        InhousePart ip1 = new InhousePart();
        ip1.setId(100L);
        ip1.setName("fudge brownie");
        ip1.setPrice(7.00);
        ip1.setInv(8);
        ip1.setMinInv(1);
        ip1.setMaxInv(100);
        inhousePartRepository.save(ip1);

        InhousePart ip2 = new InhousePart();
        ip2.setId(200L);
        ip2.setName("carmel brownie");
        ip2.setPrice(5.00);
        ip2.setInv(11);
        ip2.setMinInv(1);
        ip2.setMaxInv(100);
        inhousePartRepository.save(ip2);

        List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
        for (InhousePart part : inhouseParts) {
            System.out.println(part.getName() + " " + part.getId());
        }

        // Add OutsourcedParts
        OutsourcedPart op1 = new OutsourcedPart();
        op1.setCompanyName("Manchesters Farm");
        op1.setName("lemon bar");
        op1.setInv(10);
        op1.setPrice(10.00);
        op1.setId(201L);
        op1.setMinInv(1);
        op1.setMaxInv(100);
        outsourcedPartRepository.save(op1);

        OutsourcedPart op2 = new OutsourcedPart();
        op2.setCompanyName("Jet-puffed");
        op2.setName("rice krispy treats");
        op2.setInv(13);
        op2.setPrice(4.00);
        op2.setId(202L);
        op2.setMinInv(1);
        op2.setMaxInv(100);
        outsourcedPartRepository.save(op2);

        OutsourcedPart op5 = new OutsourcedPart();
        op5.setCompanyName("Nestle");
        op5.setName("chocolate chip cookies");
        op5.setInv(15);
        op5.setPrice(3.00);
        op5.setId(203L);
        op5.setMinInv(1);
        op5.setMaxInv(100);
        outsourcedPartRepository.save(op5);

        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }

        // Add Products
        Product vCake = new Product("Vanilla Cake", 40.00, 7);
        Product cCake = new Product("Chocolate Cake", 60.00, 5);
        Product caCake = new Product("Carmel Cake", 45.00, 6);
        Product sCake = new Product("Strawberry Cake", 50.00, 2);
        Product rvCake = new Product("Red Velvet Cake", 60.00, 4);

        productRepository.save(vCake);
        productRepository.save(cCake);
        productRepository.save(caCake);
        productRepository.save(sCake);
        productRepository.save(rvCake);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products: " + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts: " + partRepository.count());
        System.out.println(partRepository.findAll());
    }
}
