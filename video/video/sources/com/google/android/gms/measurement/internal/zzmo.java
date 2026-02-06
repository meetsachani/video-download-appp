package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzmo extends zzml {
    public boolean c;

    public zzmo(zzmp zzmpVar) {
        super(zzmpVar);
        this.b.r0();
    }

    public final void u() {
        if (w()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void v() {
        if (!this.c) {
            x();
            this.b.q0();
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean w() {
        if (this.c) {
            return true;
        }
        return false;
    }

    public abstract boolean x();
}
