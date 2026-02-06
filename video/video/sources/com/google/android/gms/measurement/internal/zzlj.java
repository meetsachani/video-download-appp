package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlj implements Runnable {
    public final /* synthetic */ AtomicReference X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Y0;
    public final /* synthetic */ String Z;
    public final /* synthetic */ zzo Z0;
    public final /* synthetic */ boolean a1;
    public final /* synthetic */ zzkp b1;

    public zzlj(zzkp zzkpVar, AtomicReference atomicReference, String str, String str2, String str3, zzo zzoVar, boolean z) {
        this.b1 = zzkpVar;
        this.X = atomicReference;
        this.Y = str;
        this.Z = str2;
        this.Y0 = str3;
        this.Z0 = zzoVar;
        this.a1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        synchronized (this.X) {
            try {
                zzfkVar = this.b1.d;
            } catch (RemoteException e) {
                this.b1.j().G().d("(legacy) Failed to get user properties; remote exception", zzfr.v(this.Y), this.Z, e);
                this.X.set(Collections.EMPTY_LIST);
                this.X.notify();
            }
            if (zzfkVar == null) {
                this.b1.j().G().d("(legacy) Failed to get user properties; not connected to service", zzfr.v(this.Y), this.Z, this.Y0);
                this.X.set(Collections.EMPTY_LIST);
                this.X.notify();
                return;
            }
            if (TextUtils.isEmpty(this.Y)) {
                Preconditions.r(this.Z0);
                this.X.set(zzfkVar.e7(this.Z, this.Y0, this.a1, this.Z0));
            } else {
                this.X.set(zzfkVar.X1(this.Y, this.Z, this.Y0, this.a1));
            }
            this.b1.h0();
            this.X.notify();
        }
    }
}
