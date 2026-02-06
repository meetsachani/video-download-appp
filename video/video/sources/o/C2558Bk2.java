package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.TM2;

/* renamed from: o.Bk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2558Bk2 implements InterfaceC6579gY1 {
    public static final String Z0 = AbstractC6949i41.f("SystemJobScheduler");
    public final Context X;
    public final JobScheduler Y;
    public final C2460Ak2 Y0;
    public final ZM2 Z;

    public C2558Bk2(Context context, ZM2 workManager) {
        this(context, workManager, (JobScheduler) context.getSystemService("jobscheduler"), new C2460Ak2(context));
    }

    public static void b(Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g = g(context, jobScheduler)) != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                e(jobScheduler, jobInfo.getId());
            }
        }
    }

    public static void e(JobScheduler jobScheduler, int id) {
        try {
            jobScheduler.cancel(id);
        } catch (Throwable th) {
            AbstractC6949i41.c().b(Z0, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(id)), th);
        }
    }

    public static List<Integer> f(Context context, JobScheduler jobScheduler, String workSpecId) {
        List<JobInfo> g = g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g) {
            if (workSpecId.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC6949i41.c().b(Z0, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey(C2460Ak2.c)) {
                    return extras.getString(C2460Ak2.c);
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(Context context, ZM2 workManager) {
        int i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = g(context, jobScheduler);
        List<String> b = workManager.M().I().b();
        boolean z = false;
        if (g != null) {
            i = g.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (g != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                String h = h(jobInfo);
                if (!TextUtils.isEmpty(h)) {
                    hashSet.add(h);
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    AbstractC6949i41.c().a(Z0, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase M = workManager.M();
            M.c();
            try {
                InterfaceC8744pN2 L = M.L();
                for (String str : b) {
                    L.q(str, -1L);
                }
                M.A();
                M.i();
                return z;
            } catch (Throwable th) {
                M.i();
                throw th;
            }
        }
        return z;
    }

    @Override // o.InterfaceC6579gY1
    public void a(C8501oN2... workSpecs) {
        int d;
        WorkDatabase M = this.Z.M();
        OL0 ol0 = new OL0(M);
        for (C8501oN2 c8501oN2 : workSpecs) {
            M.c();
            try {
                C8501oN2 j = M.L().j(c8501oN2.a);
                if (j == null) {
                    AbstractC6949i41.c().h(Z0, "Skipping scheduling " + c8501oN2.a + " because it's no longer in the DB", new Throwable[0]);
                    M.A();
                } else if (j.b != TM2.a.ENQUEUED) {
                    AbstractC6949i41.c().h(Z0, "Skipping scheduling " + c8501oN2.a + " because it is no longer enqueued", new Throwable[0]);
                    M.A();
                } else {
                    C9565sk2 a = M.I().a(c8501oN2.a);
                    if (a != null) {
                        d = a.b;
                    } else {
                        d = ol0.d(this.Z.F().i(), this.Z.F().g());
                    }
                    if (a == null) {
                        this.Z.M().I().c(new C9565sk2(c8501oN2.a, d));
                    }
                    j(c8501oN2, d);
                    M.A();
                }
            } finally {
                M.i();
            }
        }
    }

    @Override // o.InterfaceC6579gY1
    public void c(String workSpecId) {
        List<Integer> f = f(this.X, this.Y, workSpecId);
        if (f != null && !f.isEmpty()) {
            for (Integer num : f) {
                e(this.Y, num.intValue());
            }
            this.Z.M().I().d(workSpecId);
        }
    }

    @Override // o.InterfaceC6579gY1
    public boolean d() {
        return true;
    }

    public void j(C8501oN2 workSpec, int jobId) {
        int i;
        JobInfo a = this.Y0.a(workSpec, jobId);
        AbstractC6949i41 c = AbstractC6949i41.c();
        String str = Z0;
        c.a(str, String.format("Scheduling work ID %s Job ID %s", workSpec.a, Integer.valueOf(jobId)), new Throwable[0]);
        try {
            if (this.Y.schedule(a) == 0) {
                AbstractC6949i41.c().h(str, String.format("Unable to schedule work ID %s", workSpec.a), new Throwable[0]);
                if (workSpec.q && workSpec.r == EnumC2505Aw1.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.q = false;
                    AbstractC6949i41.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.a), new Throwable[0]);
                    j(workSpec, jobId);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> g = g(this.X, this.Y);
            if (g != null) {
                i = g.size();
            } else {
                i = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i), Integer.valueOf(this.Z.M().L().e().size()), Integer.valueOf(this.Z.F().h()));
            AbstractC6949i41.c().b(Z0, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            AbstractC6949i41.c().b(Z0, String.format("Unable to schedule %s", workSpec), th);
        }
    }

    public C2558Bk2(Context context, ZM2 workManager, JobScheduler jobScheduler, C2460Ak2 systemJobInfoConverter) {
        this.X = context;
        this.Z = workManager;
        this.Y = jobScheduler;
        this.Y0 = systemJobInfoConverter;
    }
}
