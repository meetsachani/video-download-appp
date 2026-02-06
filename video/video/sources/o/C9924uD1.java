package o;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;

@ES1(21)
@Deprecated
/* renamed from: o.uD1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9924uD1 implements InterfaceC6324fY1 {
    public static final String d = "PlatformScheduler";
    public static final String e = "service_action";
    public static final String f = "service_package";
    public static final String g = "requirements";
    public static final int h;
    public final int a;
    public final ComponentName b;
    public final JobScheduler c;

    /* renamed from: o.uD1$a */
    /* loaded from: classes2.dex */
    public static final class a extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int d = new AS1(extras.getInt("requirements")).d(this);
            if (d == 0) {
                TD2.M1(this, new Intent((String) C9542sf.g(extras.getString(C9924uD1.e))).setPackage((String) C9542sf.g(extras.getString(C9924uD1.f))));
                return false;
            }
            I31.n(C9924uD1.d, "Requirements not met: " + d);
            jobFinished(jobParameters, true);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        int i;
        if (TD2.a >= 26) {
            i = 16;
        } else {
            i = 0;
        }
        h = i | 15;
    }

    @KS1("android.permission.RECEIVE_BOOT_COMPLETED")
    public C9924uD1(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.a = i;
        this.b = new ComponentName(applicationContext, a.class);
        this.c = (JobScheduler) C9542sf.g((JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    public static JobInfo c(int i, ComponentName componentName, AS1 as1, String str, String str2) {
        AS1 b = as1.b(h);
        if (!b.equals(as1)) {
            I31.n(d, "Ignoring unsupported requirements: " + (b.e() ^ as1.e()));
        }
        JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
        if (as1.s()) {
            builder.setRequiredNetworkType(2);
        } else if (as1.n()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(as1.k());
        builder.setRequiresCharging(as1.f());
        if (TD2.a >= 26 && as1.q()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(e, str);
        persistableBundle.putString(f, str2);
        persistableBundle.putInt("requirements", as1.e());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    @Override // o.InterfaceC6324fY1
    public boolean a(AS1 as1, String str, String str2) {
        if (this.c.schedule(c(this.a, this.b, as1, str2, str)) == 1) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6324fY1
    public AS1 b(AS1 as1) {
        return as1.b(h);
    }

    @Override // o.InterfaceC6324fY1
    public boolean cancel() {
        this.c.cancel(this.a);
        return true;
    }
}
