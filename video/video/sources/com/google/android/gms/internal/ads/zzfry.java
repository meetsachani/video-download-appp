package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfry {
    public static InterfaceFutureC8411o11 a(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfrx zzfrxVar = new zzfrx(task, null);
        task.f(zzgdq.c(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfrw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void a(Task task2) {
                zzfrx zzfrxVar2 = zzfrx.this;
                if (task2.t()) {
                    zzfrxVar2.cancel(false);
                } else if (task2.v()) {
                    zzfrxVar2.l(task2.r());
                } else {
                    Exception q = task2.q();
                    if (q != null) {
                        zzfrxVar2.m(q);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return zzfrxVar;
    }
}
