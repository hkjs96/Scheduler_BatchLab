package com.example.batchprocessing;

import java.util.Date;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;

public class BatchExecuteJob {
	
	@Inject
	private JobLauncher jobLauncher;
	@Resource(name="personJob")
	private Job personJob;
	
	public void execute() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		JobParameters jobParameters = new JobParametersBuilder()
										.addDate("today", new Date())
										.toJobParameters();
		jobLauncher.run(personJob, jobParameters);
	}
}
