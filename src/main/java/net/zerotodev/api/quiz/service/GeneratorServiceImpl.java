package net.zerotodev.api.quiz.service;

import net.zerotodev.api.quiz.domain.Factor;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.function.Function;

@Service
public class GeneratorServiceImpl implements GeneratorService{
    @Override
    public int randomFactor() {
        Function<String, Integer> function = Integer::parseInt;
        return new Random().nextInt(function.apply(Factor.MAXIMUM.toString())
                - function.apply(Factor.MINIMUN.toString()) + 1)
                + function.apply(Factor.MINIMUN.toString());
    }
}