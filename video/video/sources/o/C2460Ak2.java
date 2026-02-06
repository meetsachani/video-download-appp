package o;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import o.C7746lM;

/* renamed from: o.Ak2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2460Ak2 {
    public static final String b = AbstractC6949i41.f("SystemJobInfoConverter");
    public static final String c = "EXTRA_WORK_SPEC_ID";
    public static final String d = "EXTRA_IS_PERIODIC";
    public final ComponentName a;

    /* renamed from: o.Ak2$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC3763Np1.values().length];
            a = iArr;
            try {
                iArr[EnumC3763Np1.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC3763Np1.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC3763Np1.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC3763Np1.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC3763Np1.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C2460Ak2(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri b(C7746lM.a trigger) {
        return new JobInfo.TriggerContentUri(trigger.a(), trigger.b() ? 1 : 0);
    }

    public static int c(EnumC3763Np1 networkType) {
        int i = a.a[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        AbstractC6949i41.c().a(b, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
        return 1;
    }

    public static void d(JobInfo.Builder builder, EnumC3763Np1 networkType) {
        if (Build.VERSION.SDK_INT >= 30 && networkType == EnumC3763Np1.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(c(networkType));
        }
    }

    public JobInfo a(C8501oN2 workSpec, int jobId) {
        int i;
        XK xk = workSpec.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(c, workSpec.a);
        persistableBundle.putBoolean(d, workSpec.d());
        JobInfo.Builder extras = new JobInfo.Builder(jobId, this.a).setRequiresCharging(xk.g()).setRequiresDeviceIdle(xk.h()).setExtras(persistableBundle);
        d(extras, xk.b());
        boolean z = false;
        if (!xk.h()) {
            if (workSpec.l == EnumC11023yk.LINEAR) {
                i = 0;
            } else {
                i = 1;
            }
            extras.setBackoffCriteria(workSpec.m, i);
        }
        long max = Math.max(workSpec.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.q) {
            extras.setImportantWhileForeground(true);
        }
        if (xk.e()) {
            for (C7746lM.a aVar : xk.a().b()) {
                extras.addTriggerContentUri(b(aVar));
            }
            extras.setTriggerContentUpdateDelay(xk.c());
            extras.setTriggerContentMaxDelay(xk.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(xk.f());
            extras.setRequiresStorageNotLow(xk.i());
        }
        if (workSpec.k > 0) {
            z = true;
        }
        if (C2775Dq.k() && workSpec.q && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
