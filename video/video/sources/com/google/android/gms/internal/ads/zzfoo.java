package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzfoo {
    public final Context a;
    public final Executor b;
    public final zzfnx c;
    public final zzfon d;
    public Task e;

    @InterfaceC5056aJ2
    public zzfoo(Context context, Executor executor, zzfnx zzfnxVar, zzfnz zzfnzVar, zzfom zzfomVar) {
        this.a = context;
        this.b = executor;
        this.c = zzfnxVar;
        this.d = zzfomVar;
    }

    public static /* synthetic */ zzath a(zzfoo zzfooVar) {
        Context context = zzfooVar.a;
        return zzfof.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public static zzfoo c(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 zzfnx zzfnxVar, @InterfaceC5670cr1 zzfnz zzfnzVar) {
        final zzfoo zzfooVar = new zzfoo(context, executor, zzfnxVar, zzfnzVar, new zzfom());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfok
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfoo.a(zzfoo.this);
            }
        };
        Executor executor2 = zzfooVar.b;
        zzfooVar.e = Tasks.d(executor2, callable).i(executor2, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfol
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void e(Exception exc) {
                zzfoo.d(zzfoo.this, exc);
            }
        });
        return zzfooVar;
    }

    public static /* synthetic */ void d(zzfoo zzfooVar, Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        zzfooVar.c.c(2025, -1L, exc);
    }

    public final zzath b() {
        zzfon zzfonVar = this.d;
        Task task = this.e;
        zzath a = zzfonVar.a();
        if (!task.v()) {
            return a;
        }
        return (zzath) task.r();
    }
}
