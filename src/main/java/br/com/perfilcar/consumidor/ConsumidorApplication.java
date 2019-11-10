package br.com.perfilcar.consumidor;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.perfilcar.consumidor.models.Log;

@SpringBootApplication
public class ConsumidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumidorApplication.class, args);	
    
        String topicName = "PerfilCarLog";
        
        Log log = new Log();

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092,localhost:9093");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "SupplierDeserializer");


        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Arrays.asList(topicName));

        while (true){
                ConsumerRecords<String, String> records = consumer.poll(100);
                for (ConsumerRecord<String, String> record : records){
                        System.out.println("dados registro= " + String.valueOf(record.value()));
                        
                        logRepository.save(log);
                        
                }
        }
		
	}

}
