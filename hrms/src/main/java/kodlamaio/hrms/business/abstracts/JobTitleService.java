package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.JobTitles;

import java.util.List;

public interface JobTitleService {
    List<JobTitles> getAll();
}
