package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.C4500Ve2;
import o.InterfaceC11300zs1;
import o.TD0;

/* loaded from: classes2.dex */
public final class zak extends zap {
    public final SparseArray<zaj> a1;

    public zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.x());
        this.a1 = new SparseArray<>();
        this.X.a("AutoManageHelper", this);
    }

    public static zak u(LifecycleActivity lifecycleActivity) {
        LifecycleFragment e = LifecycleCallback.e(lifecycleActivity);
        zak zakVar = (zak) e.c("AutoManageHelper", zak.class);
        if (zakVar != null) {
            return zakVar;
        }
        return new zak(e);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.a1.size(); i++) {
            zaj x = x(i);
            if (x != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(x.X);
                printWriter.println(":");
                x.Y.j(String.valueOf(str).concat(TD0.a.Y0), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        boolean z = this.Y;
        String valueOf = String.valueOf(this.a1);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(C4500Ve2.b);
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.Z.get() == null) {
            for (int i = 0; i < this.a1.size(); i++) {
                zaj x = x(i);
                if (x != null) {
                    x.Y.g();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void l() {
        super.l();
        for (int i = 0; i < this.a1.size(); i++) {
            zaj x = x(i);
            if (x != null) {
                x.Y.i();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void n(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaj zajVar = this.a1.get(i);
        if (zajVar != null) {
            w(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zajVar.Z;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.o1(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void o() {
        for (int i = 0; i < this.a1.size(); i++) {
            zaj x = x(i);
            if (x != null) {
                x.Y.g();
            }
        }
    }

    public final void v(int i, GoogleApiClient googleApiClient, @InterfaceC11300zs1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean z;
        Preconditions.s(googleApiClient, "GoogleApiClient instance cannot be null");
        if (this.a1.indexOfKey(i) < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        Preconditions.y(z, sb.toString());
        zam zamVar = this.Z.get();
        boolean z2 = this.Y;
        String valueOf = String.valueOf(zamVar);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(C4500Ve2.b);
        sb2.append(z2);
        sb2.append(C4500Ve2.b);
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        zaj zajVar = new zaj(this, i, googleApiClient, onConnectionFailedListener);
        googleApiClient.C(zajVar);
        this.a1.put(i, zajVar);
        if (this.Y && zamVar == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.g();
        }
    }

    public final void w(int i) {
        zaj zajVar = this.a1.get(i);
        this.a1.remove(i);
        if (zajVar != null) {
            zajVar.Y.G(zajVar);
            zajVar.Y.i();
        }
    }

    @InterfaceC11300zs1
    public final zaj x(int i) {
        if (this.a1.size() <= i) {
            return null;
        }
        SparseArray<zaj> sparseArray = this.a1;
        return sparseArray.get(sparseArray.keyAt(i));
    }
}
