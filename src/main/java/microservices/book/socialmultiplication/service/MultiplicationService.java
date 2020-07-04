package microservices.book.socialmultiplication.service;

import microservices.book.socialmultiplication.domain.Multiplication;

public interface MultiplicationService {
    Multiplication createRandomMultiplication();
}
