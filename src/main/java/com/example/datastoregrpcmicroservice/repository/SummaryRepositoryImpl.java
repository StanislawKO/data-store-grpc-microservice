package com.example.datastoregrpcmicroservice.repository;

import com.example.datastoregrpcmicroservice.config.RedisSchema;
import com.example.datastoregrpcmicroservice.model.Data;
import com.example.datastoregrpcmicroservice.model.Summary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Optional;
import java.util.Set;

@Repository
@RequiredArgsConstructor
public class SummaryRepositoryImpl implements SummaryRepository {

    

}
