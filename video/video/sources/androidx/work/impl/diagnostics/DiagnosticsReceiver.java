package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import o.AbstractC6949i41;
import o.C11069yv1;
import o.YM2;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = AbstractC6949i41.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC6949i41.c().a(a, "Requesting diagnostics", new Throwable[0]);
        try {
            YM2.p(context).k(C11069yv1.f(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            AbstractC6949i41.c().b(a, "WorkManager is not initialized", e);
        }
    }
}
