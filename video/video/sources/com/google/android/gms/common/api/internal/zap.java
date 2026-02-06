package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicReference;
import o.C6515gH1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean Y;
    public final Handler Y0;
    public final AtomicReference<zam> Z;
    public final GoogleApiAvailability Z0;

    @VisibleForTesting
    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.Z = new AtomicReference<>(null);
        this.Y0 = new com.google.android.gms.internal.base.zaq(Looper.getMainLooper());
        this.Z0 = googleApiAvailability;
    }

    public static final int q(@InterfaceC11300zs1 zam zamVar) {
        if (zamVar == null) {
            return -1;
        }
        return zamVar.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(int i, int i2, Intent intent) {
        zam zamVar = this.Z.get();
        if (i != 1) {
            if (i == 2) {
                int j = this.Z0.j(b());
                if (j == 0) {
                    p();
                    return;
                } else if (zamVar != null) {
                    if (zamVar.b().m0() == 18 && j == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            p();
            return;
        } else if (i2 == 0) {
            if (zamVar != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m(new ConnectionResult(i3, null, zamVar.b().toString()), q(zamVar));
                return;
            }
            return;
        }
        if (zamVar != null) {
            m(zamVar.b(), zamVar.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g(@InterfaceC11300zs1 Bundle bundle) {
        zam zamVar;
        super.g(bundle);
        if (bundle != null) {
            AtomicReference<zam> atomicReference = this.Z;
            if (bundle.getBoolean("resolving_error", false)) {
                zamVar = new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                zamVar = null;
            }
            atomicReference.set(zamVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j(Bundle bundle) {
        super.j(bundle);
        zam zamVar = this.Z.get();
        if (zamVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zamVar.a());
        bundle.putInt("failed_status", zamVar.b().m0());
        bundle.putParcelable("failed_resolution", zamVar.b().E0());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.Y = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void l() {
        super.l();
        this.Y = false;
    }

    public final void m(ConnectionResult connectionResult, int i) {
        this.Z.set(null);
        n(connectionResult, i);
    }

    public abstract void n(ConnectionResult connectionResult, int i);

    public abstract void o();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m(new ConnectionResult(13, null), q(this.Z.get()));
    }

    public final void p() {
        this.Z.set(null);
        o();
    }

    public final void t(ConnectionResult connectionResult, int i) {
        zam zamVar = new zam(connectionResult, i);
        if (C6515gH1.a(this.Z, null, zamVar)) {
            this.Y0.post(new zao(this, zamVar));
        }
    }
}
