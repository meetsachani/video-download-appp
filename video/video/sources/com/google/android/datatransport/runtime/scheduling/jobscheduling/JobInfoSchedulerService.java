package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import o.DH1;
import o.ES1;
import o.Nt2;
import o.Ut2;

@ES1(api = 21)
/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        Ut2.f(getApplicationContext());
        Nt2.a d = Nt2.a().b(string).d(DH1.b(i));
        if (string2 != null) {
            d.c(Base64.decode(string2, 0));
        }
        Ut2.c().e().m(d.a(), i2, new Runnable() { // from class: o.VU0
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
