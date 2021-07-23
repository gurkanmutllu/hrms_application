package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService{
    private JobTitleDao jobTitleDao;

    public JobTitleManager(JobTitleDao jobTitleDao){this.jobTitleDao = jobTitleDao;}


    @Override
    public List<JobTitles> getAll() {
        return this.jobTitleDao.findAll();
    }
}
