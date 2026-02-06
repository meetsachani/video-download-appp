package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C10664xF1;
import o.InterfaceC11300zs1;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class zzce {
    @InterfaceC11300zs1
    public static final Method b = e();
    @InterfaceC11300zs1
    public static final Method c = d();
    public final JobScheduler a;

    public zzce(JobScheduler jobScheduler) {
        this.a = jobScheduler;
    }

    public static int a() {
        Method method = c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, null);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) C10664xF1.E((JobScheduler) context.getSystemService("jobscheduler"));
        if (b != null && context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            return new zzce(jobScheduler).b(jobInfo, str, a(), str2);
        }
        return jobScheduler.schedule(jobInfo);
    }

    @InterfaceC11300zs1
    public static Method d() {
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
            return null;
        }
    }

    @InterfaceC11300zs1
    public static Method e() {
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                return null;
            }
            return null;
        }
    }

    public final int b(JobInfo jobInfo, String str, int i, String str2) {
        Method method = b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.a, jobInfo, str, Integer.valueOf(i), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.a.schedule(jobInfo);
    }
}
