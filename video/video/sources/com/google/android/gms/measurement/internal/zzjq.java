package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzpr;

/* loaded from: classes3.dex */
final class zzjq implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcv X;
    public final /* synthetic */ zziq Y;

    public zzjq(zziq zziqVar, com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        this.Y = zziqVar;
        this.X = zzcvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long l;
        zzlx u = this.Y.u();
        if (zzpr.a() && u.d().s(zzbi.D0)) {
            if (!u.h().J().y()) {
                u.j().M().a("Analytics storage consent denied; will not get session id");
            } else if (!u.h().y(u.b().a()) && u.h().q.a() != 0) {
                l = Long.valueOf(u.h().q.a());
                if (l == null) {
                    this.Y.a.L().P(this.X, l.longValue());
                    return;
                }
                try {
                    this.X.v0(null);
                    return;
                } catch (RemoteException e) {
                    this.Y.a.j().G().b("getSessionId failed with exception", e);
                    return;
                }
            }
        } else {
            u.j().M().a("getSessionId has been disabled.");
        }
        l = null;
        if (l == null) {
        }
    }
}
