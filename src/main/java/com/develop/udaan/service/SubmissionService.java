package com.develop.udaan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.udaan.repository.SubmissionRepository;

@Service
public class SubmissionService {

	@Autowired
	private SubmissionRepository submissionRepository;
}
