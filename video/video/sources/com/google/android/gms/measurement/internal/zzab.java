package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzob;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzab extends zzac {
    public zzew.zze g;
    public final /* synthetic */ zzt h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzt zztVar, String str, int i, zzew.zze zzeVar) {
        super(str, i);
        this.h = zztVar;
        this.g = zzeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzac
    public final int a() {
        return this.g.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzac
    public final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzac
    public final boolean j() {
        return true;
    }

    public final boolean k(Long l, Long l2, zzfi.zzn zznVar, boolean z) {
        byte b;
        byte b2;
        Object obj;
        if (zzob.a() && this.h.d().D(this.a, zzbi.h0)) {
            b = 1;
        } else {
            b = 0;
        }
        boolean L = this.g.L();
        boolean M = this.g.M();
        boolean N = this.g.N();
        if (!L && !M && !N) {
            b2 = 0;
        } else {
            b2 = 1;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && b2 == 0) {
            zzft K = this.h.j().K();
            Integer valueOf = Integer.valueOf(this.b);
            if (this.g.O()) {
                num = Integer.valueOf(this.g.m());
            }
            K.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        zzew.zzc H = this.g.H();
        boolean M2 = H.M();
        if (zznVar.d0()) {
            if (!H.O()) {
                this.h.j().L().b("No number filter for long property. property", this.h.g().g(zznVar.Y()));
            } else {
                bool = zzac.d(zzac.c(zznVar.T(), H.J()), M2);
            }
        } else if (zznVar.b0()) {
            if (!H.O()) {
                this.h.j().L().b("No number filter for double property. property", this.h.g().g(zznVar.Y()));
            } else {
                bool = zzac.d(zzac.b(zznVar.F(), H.J()), M2);
            }
        } else if (zznVar.g0()) {
            if (!H.Q()) {
                if (!H.O()) {
                    this.h.j().L().b("No string or number filter defined. property", this.h.g().g(zznVar.Y()));
                } else if (zzmz.f0(zznVar.Z())) {
                    bool = zzac.d(zzac.e(zznVar.Z(), H.J()), M2);
                } else {
                    this.h.j().L().c("Invalid user property value for Numeric number filter. property, value", this.h.g().g(zznVar.Y()), zznVar.Z());
                }
            } else {
                bool = zzac.d(zzac.g(zznVar.Z(), H.K(), this.h.j()), M2);
            }
        } else {
            this.h.j().L().b("User property has no value, property", this.h.g().g(zznVar.Y()));
        }
        zzft K2 = this.h.j().K();
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        K2.b("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (N && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.g.L()) {
            this.d = bool;
        }
        if (bool.booleanValue() && b2 != 0 && zznVar.f0()) {
            long V = zznVar.V();
            if (l != null) {
                V = l.longValue();
            }
            if (b != 0 && this.g.L() && !this.g.M() && l2 != null) {
                V = l2.longValue();
            }
            if (this.g.M()) {
                this.f = Long.valueOf(V);
            } else {
                this.e = Long.valueOf(V);
            }
        }
        return true;
    }
}
