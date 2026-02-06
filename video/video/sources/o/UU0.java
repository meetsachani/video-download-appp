package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

@ES1(api = 21)
/* loaded from: classes2.dex */
public class UU0 implements InterfaceC8257nN2 {
    public static final String d = "JobInfoScheduler";
    public static final String e = "attemptNumber";
    public static final String f = "backendName";
    public static final String g = "priority";
    public static final String h = "extras";
    public final Context a;
    public final InterfaceC4207Se0 b;
    public final AbstractC6822hY1 c;

    public UU0(Context context, InterfaceC4207Se0 interfaceC4207Se0, AbstractC6822hY1 abstractC6822hY1) {
        this.a = context;
        this.b = interfaceC4207Se0;
        this.c = abstractC6822hY1;
    }

    @Override // o.InterfaceC8257nN2
    public void a(Nt2 nt2, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int c = c(nt2);
        if (!z && d(jobScheduler, c, i)) {
            C7676l41.c(d, "Upload for context %s is already scheduled. Returning...", nt2);
            return;
        }
        long x0 = this.b.x0(nt2);
        JobInfo.Builder c2 = this.c.c(new JobInfo.Builder(c, componentName), nt2.d(), x0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", nt2.b());
        persistableBundle.putInt("priority", DH1.a(nt2.d()));
        if (nt2.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(nt2.c(), 0));
        }
        c2.setExtras(persistableBundle);
        C7676l41.e(d, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", nt2, Integer.valueOf(c), Long.valueOf(this.c.h(nt2.d(), x0, i)), Long.valueOf(x0), Integer.valueOf(i));
        jobScheduler.schedule(c2.build());
    }

    @Override // o.InterfaceC8257nN2
    public void b(Nt2 nt2, int i) {
        a(nt2, i, false);
    }

    @InterfaceC5056aJ2
    public int c(Nt2 nt2) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(nt2.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(DH1.a(nt2.d())).array());
        if (nt2.c() != null) {
            adler32.update(nt2.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i, int i2) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
            }
        }
        return false;
    }
}
