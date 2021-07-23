package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.entities.concretes.JobTitles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/job_titles")
public class JobTitlesController {

    private JobTitleService jobTitleService;

    @Autowired
    public JobTitlesController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/getall")
    public List<JobTitles> getAll(){
        return this.jobTitleService.getAll();
    }

}
