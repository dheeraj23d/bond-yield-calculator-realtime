package com.dheeraj.bond_yield_calc;

import java.util.List;
import java.util.stream.Collectors;

public class BondService {
    public List<Bond> calculateBondYields(List<Bond> bonds) {
        return bonds.stream()
                .map(bond -> {
                    bond.setYield(bond.calculateYield());
                    return bond;
                })
                .sorted((b1, b2) -> Double.compare(b2.getYield(), b1.getYield())) // Sort by yield
                .collect(Collectors.toList());
    }
}
