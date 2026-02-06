package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes2.dex */
public final class zzr implements AppSetIdClient {
    public final AppSetIdClient a;
    public final AppSetIdClient b;

    public zzr(Context context) {
        this.a = new zzp(context, GoogleApiAvailabilityLight.i());
        this.b = zzl.d(context);
    }

    public static /* synthetic */ Task a(zzr zzrVar, Task task) {
        if (!task.v() && !task.t()) {
            Exception q = task.q();
            if (q instanceof ApiException) {
                int b = ((ApiException) q).b();
                if (b != 43001 && b != 43002 && b != 43003 && b != 17) {
                    if (b == 43000) {
                        return Tasks.f(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                    }
                    if (b == 15) {
                        return Tasks.f(new Exception("The operation to get app set ID timed out. Please try again later."));
                    }
                } else {
                    return zzrVar.b.b();
                }
            }
        }
        return task;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task<AppSetIdInfo> b() {
        return this.a.b().o(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            {
                zzr.this = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                return zzr.a(zzr.this, task);
            }
        });
    }
}
