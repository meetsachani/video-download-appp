package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC6949i41;
import o.C2460Ak2;
import o.InterfaceC5625cg0;
import o.ZM2;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC5625cg0 {
    public static final String Z = AbstractC6949i41.f("SystemJobService");
    public ZM2 X;
    public final Map<String, JobParameters> Y = new HashMap();

    public static String a(JobParameters parameters) {
        try {
            PersistableBundle extras = parameters.getExtras();
            if (extras != null && extras.containsKey(C2460Ak2.c)) {
                return extras.getString(C2460Ak2.c);
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // o.InterfaceC5625cg0
    public void e(String workSpecId, boolean needsReschedule) {
        JobParameters remove;
        AbstractC6949i41.c().a(Z, String.format("%s executed on JobScheduler", workSpecId), new Throwable[0]);
        synchronized (this.Y) {
            remove = this.Y.remove(workSpecId);
        }
        if (remove != null) {
            jobFinished(remove, needsReschedule);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            ZM2 H = ZM2.H(getApplicationContext());
            this.X = H;
            H.J().c(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                AbstractC6949i41.c().h(Z, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ZM2 zm2 = this.X;
        if (zm2 != null) {
            zm2.J().j(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        Network network;
        if (this.X == null) {
            AbstractC6949i41.c().a(Z, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(params, true);
            return false;
        }
        String a = a(params);
        if (TextUtils.isEmpty(a)) {
            AbstractC6949i41.c().b(Z, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.Y) {
            try {
                if (this.Y.containsKey(a)) {
                    AbstractC6949i41.c().a(Z, String.format("Job is already being executed by SystemJobService: %s", a), new Throwable[0]);
                    return false;
                }
                AbstractC6949i41.c().a(Z, String.format("onStartJob for %s", a), new Throwable[0]);
                this.Y.put(a, params);
                int i = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (params.getTriggeredContentUris() != null) {
                    aVar.b = Arrays.asList(params.getTriggeredContentUris());
                }
                if (params.getTriggeredContentAuthorities() != null) {
                    aVar.a = Arrays.asList(params.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    network = params.getNetwork();
                    aVar.c = network;
                }
                this.X.V(a, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        if (this.X == null) {
            AbstractC6949i41.c().a(Z, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a = a(params);
        if (TextUtils.isEmpty(a)) {
            AbstractC6949i41.c().b(Z, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        AbstractC6949i41.c().a(Z, String.format("onStopJob for %s", a), new Throwable[0]);
        synchronized (this.Y) {
            this.Y.remove(a);
        }
        this.X.X(a);
        return !this.X.J().g(a);
    }
}
