package net.zerotodev.api.quiz.service;

import net.zerotodev.api.quiz.domain.Quiz;
import reactor.core.publisher.Mono;

public interface QuizService {
    Mono<Quiz> createQuiz();
}