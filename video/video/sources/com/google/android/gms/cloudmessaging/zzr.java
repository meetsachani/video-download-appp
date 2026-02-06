package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzr {
    public final int a;
    public final TaskCompletionSource b = new TaskCompletionSource();
    public final int c;
    public final Bundle d;

    public zzr(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(zzs zzsVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj = toString();
            String obj2 = zzsVar.toString();
            Log.d("MessengerIpcClient", "Failing " + obj + " with " + obj2);
        }
        this.b.b(zzsVar);
    }

    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj2 = toString();
            String valueOf = String.valueOf(obj);
            Log.d("MessengerIpcClient", "Finishing " + obj2 + " with " + valueOf);
        }
        this.b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + b() + "}";
    }
}
