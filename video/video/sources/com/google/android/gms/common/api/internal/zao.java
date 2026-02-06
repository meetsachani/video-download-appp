package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC10389w71;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zao implements Runnable {
    public final zam X;
    public final /* synthetic */ zap Y;

    public zao(zap zapVar, zam zamVar) {
        this.Y = zapVar;
        this.X = zamVar;
    }

    @Override // java.lang.Runnable
    @InterfaceC10389w71
    public final void run() {
        if (!this.Y.Y) {
            return;
        }
        ConnectionResult b = this.X.b();
        if (b.G0()) {
            zap zapVar = this.Y;
            zapVar.X.startActivityForResult(GoogleApiActivity.a(zapVar.b(), (PendingIntent) Preconditions.r(b.E0()), this.X.a(), false), 1);
            return;
        }
        zap zapVar2 = this.Y;
        if (zapVar2.Z0.e(zapVar2.b(), b.m0(), null) != null) {
            zap zapVar3 = this.Y;
            zapVar3.Z0.K(zapVar3.b(), this.Y.X, b.m0(), 2, this.Y);
        } else if (b.m0() != 18) {
            this.Y.m(b, this.X.a());
        } else {
            zap zapVar4 = this.Y;
            Dialog F = zapVar4.Z0.F(zapVar4.b(), this.Y);
            zap zapVar5 = this.Y;
            zapVar5.Z0.G(zapVar5.b().getApplicationContext(), new zan(this, F));
        }
    }
}
