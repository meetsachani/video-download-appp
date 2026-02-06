package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzic extends zzid {
    public boolean b;

    public zzic(zzhf zzhfVar) {
        super(zzhfVar);
        this.a.n();
    }

    public final void o() {
        if (r()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void p() {
        if (!this.b) {
            if (!s()) {
                this.a.R();
                this.b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void q() {
        if (!this.b) {
            t();
            this.a.R();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean r() {
        if (this.b) {
            return true;
        }
        return false;
    }

    public abstract boolean s();

    public void t() {
    }
}
