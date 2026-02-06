package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaqf {
    public static final boolean c = zzaqg.b;
    public final List a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(String str, long j) {
        if (!this.b) {
            this.a.add(new zzaqe(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void b(String str) {
        long j;
        this.b = true;
        List<zzaqe> list = this.a;
        if (list.size() == 0) {
            j = 0;
        } else {
            j = ((zzaqe) list.get(list.size() - 1)).c - ((zzaqe) list.get(0)).c;
        }
        if (j > 0) {
            long j2 = ((zzaqe) list.get(0)).c;
            zzaqg.a("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzaqe zzaqeVar : list) {
                long j3 = zzaqeVar.c;
                zzaqg.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzaqeVar.b), zzaqeVar.a);
                j2 = j3;
            }
        }
    }

    public final void finalize() throws Throwable {
        if (!this.b) {
            b("Request on the loose");
            zzaqg.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
