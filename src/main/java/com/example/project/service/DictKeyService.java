package com.example.project.service;

import com.example.project.entity.DictKey;
import com.example.project.repository.DictKeyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictKeyService {

    private final DictKeyRepository dictKeyRepository;

    public DictKeyService(DictKeyRepository dictKeyRepository) {
        this.dictKeyRepository = dictKeyRepository;
    }

    public List<DictKey> getAllDictKeys() {
        return dictKeyRepository.findAll();
    }
}
