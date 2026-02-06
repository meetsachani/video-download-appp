package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdv {
    public final Object a;
    public zzt b = new zzt();
    public boolean c;
    public boolean d;

    public zzdv(Object obj) {
        this.a = obj;
    }

    public final void a(int i, zzdt zzdtVar) {
        if (!this.d) {
            if (i != -1) {
                this.b.a(i);
            }
            this.c = true;
            zzdtVar.b(this.a);
        }
    }

    public final void b(zzdu zzduVar) {
        if (!this.d && this.c) {
            zzv b = this.b.b();
            this.b = new zzt();
            this.c = false;
            zzduVar.a(this.a, b);
        }
    }

    public final void c(zzdu zzduVar) {
        this.d = true;
        if (this.c) {
            this.c = false;
            zzduVar.a(this.a, this.b.b());
        }
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdv.class == obj.getClass()) {
            return this.a.equals(((zzdv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
