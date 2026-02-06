package com.google.android.gms.measurement.internal;

import o.InterfaceC10697xN2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zze extends zzf {
    public boolean b;

    public zze(zzhf zzhfVar) {
        super(zzhfVar);
        this.a.n();
    }

    public abstract boolean A();

    public final void v() {
        if (z()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void w() {
        if (!this.b) {
            if (!A()) {
                this.a.R();
                this.b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void x() {
        if (!this.b) {
            y();
            this.a.R();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    @InterfaceC10697xN2
    public void y() {
    }

    public final boolean z() {
        if (this.b) {
            return true;
        }
        return false;
    }
}
