package com.example.batchprocessing;

import java.util.Collections;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/resources/com/example/batchprocessing/conf/*-context.xml")
public class Reader_Processor_WriterTest {

	@Inject
	FlatFileItemReader<Person> itemReader;
	@Inject
	PersonItemProcessor itemProcessor;
	@Inject
	JdbcBatchItemWriter<Person> itemWriter;
	
	@Test
	public void test() throws UnexpectedInputException, ParseException, Exception {
		itemReader.open(new ExecutionContext());
		Person person = itemReader.read();
		System.out.println(person);
		Person tranformedPerson = itemProcessor.process(person);
		System.out.println(tranformedPerson);
		itemWriter.write(Collections.singletonList(tranformedPerson));
	}

}
