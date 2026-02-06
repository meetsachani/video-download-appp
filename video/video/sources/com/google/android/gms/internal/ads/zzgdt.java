package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgdt implements Runnable {
    public zzgdw X;

    public zzgdt(zzgdw zzgdwVar) {
        this.X = zzgdwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0006, code lost:
        r1 = r0.c1;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        InterfaceFutureC8411o11 interfaceFutureC8411o11;
        ScheduledFuture scheduledFuture;
        zzgdw zzgdwVar = this.X;
        if (zzgdwVar != null && interfaceFutureC8411o11 != null) {
            this.X = null;
            if (interfaceFutureC8411o11.isDone()) {
                zzgdwVar.v(interfaceFutureC8411o11);
                return;
            }
            try {
                scheduledFuture = zzgdwVar.d1;
                zzgdwVar.d1 = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                zzgdwVar.m(new zzgdu(str + ": " + interfaceFutureC8411o11.toString(), null));
            } finally {
                interfaceFutureC8411o11.cancel(true);
            }
        }
    }
}
