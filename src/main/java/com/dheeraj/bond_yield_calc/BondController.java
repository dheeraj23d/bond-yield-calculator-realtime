package com.dheeraj.bond_yield_calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bonds")
public class BondController {
   // @Autowired
    private BondService bondService = new BondService();

    @GetMapping("/sorted-by-yield")
    public List<Bond> getSortedBondsByYield() {
        // Sample bond data (this would come from an external API or database)
        List<Bond> bonds = List.of(
                new Bond(1000, 7.5, 950, 100),
                new Bond(1000, 0.04, 980, 500),
                new Bond(1000, 0.06, 920, 700)
        );

        return bondService.calculateBondYields(bonds);
    }
}