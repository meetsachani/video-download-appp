package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzfnx {
    public static volatile int e = 1;
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final Executor b;
    public final Task c;
    public final boolean d;

    public zzfnx(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 Task task, boolean z) {
        this.a = context;
        this.b = executor;
        this.c = task;
        this.d = z;
    }

    public static zzfnx a(@InterfaceC5670cr1 final Context context, @InterfaceC5670cr1 Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnv
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzfnx.f;
                    taskCompletionSource.c(zzfpx.b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnw
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzfnx.f;
                    TaskCompletionSource.this.c(zzfpx.c());
                }
            });
        }
        return new zzfnx(context, executor, taskCompletionSource.a(), z);
    }

    public static void g(int i) {
        e = i;
    }

    public final Task b(int i, String str) {
        return h(i, 0L, null, null, null, str);
    }

    public final Task c(int i, long j, Exception exc) {
        return h(i, j, exc, null, null, null);
    }

    public final Task d(int i, long j) {
        return h(i, j, null, null, null, null);
    }

    public final Task e(int i, long j, String str) {
        return h(i, j, null, null, null, str);
    }

    public final Task f(int i, long j, String str, Map map) {
        return h(i, j, null, str, null, null);
    }

    public final Task h(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.d) {
            return this.c.n(this.b, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfnt
                @Override // com.google.android.gms.tasks.Continuation
                public final Object a(Task task) {
                    return Boolean.valueOf(task.v());
                }
            });
        }
        Context context = this.a;
        final zzarq s2 = zzaru.s2();
        s2.Y1(context.getPackageName());
        s2.c2(j);
        s2.e2(e);
        if (exc != null) {
            int i2 = zzfvz.b;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            s2.d2(stringWriter.toString());
            s2.b2(exc.getClass().getName());
        }
        if (str2 != null) {
            s2.Z1(str2);
        }
        if (str != null) {
            s2.a2(str);
        }
        return this.c.n(this.b, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfnu
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                int i3 = zzfnx.f;
                if (task.v()) {
                    int i4 = i;
                    zzfpv a = ((zzfpx) task.r()).a(((zzaru) zzarq.this.Q1()).b1());
                    a.a(i4);
                    a.c();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });
    }
}
