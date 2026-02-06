package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzob;
import java.util.HashSet;
import java.util.Iterator;
import o.C2531Be;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzz extends zzac {
    public zzew.zzb g;
    public final /* synthetic */ zzt h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzt zztVar, String str, int i, zzew.zzb zzbVar) {
        super(str, i);
        this.h = zztVar;
        this.g = zzbVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzac
    public final int a() {
        return this.g.K();
    }

    @Override // com.google.android.gms.measurement.internal.zzac
    public final boolean i() {
        return this.g.T();
    }

    @Override // com.google.android.gms.measurement.internal.zzac
    public final boolean j() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(Long l, Long l2, zzfi.zze zzeVar, long j, zzbc zzbcVar, boolean z) {
        Boolean e;
        byte b = (zzob.a() && this.h.d().D(this.a, zzbi.j0)) ? (byte) 1 : (byte) 0;
        long j2 = this.g.S() ? zzbcVar.e : j;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        Boolean bool = null;
        if (this.h.j().C(2)) {
            this.h.j().K().d("Evaluating filter. audience, filter, event", Integer.valueOf(this.b), this.g.U() ? Integer.valueOf(this.g.K()) : null, this.h.g().c(this.g.O()));
            this.h.j().K().b("Filter definition", this.h.o().I(this.g));
        }
        if (!this.g.U() || this.g.K() > 256) {
            this.h.j().L().c("Invalid event filter ID. appId, id", zzfr.v(this.a), String.valueOf(this.g.U() ? Integer.valueOf(this.g.K()) : null));
            return false;
        }
        byte b2 = (this.g.Q() || this.g.R() || this.g.S()) ? (byte) 1 : (byte) 0;
        if (z && b2 == 0) {
            this.h.j().K().c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.g.U() ? Integer.valueOf(this.g.K()) : null);
            return true;
        }
        zzew.zzb zzbVar = this.g;
        String b0 = zzeVar.b0();
        if (zzbVar.T()) {
            Boolean c = zzac.c(j2, zzbVar.N());
            if (c != null) {
                if (!c.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
            this.h.j().K().b("Event filter result", bool != null ? "null" : bool);
            if (bool != null) {
                return false;
            }
            Boolean bool2 = Boolean.TRUE;
            this.c = bool2;
            if (bool.booleanValue()) {
                this.d = bool2;
                if (b2 != 0 && zzeVar.g0()) {
                    Long valueOf = Long.valueOf(zzeVar.X());
                    if (this.g.R()) {
                        if (b == 0 || !this.g.T()) {
                            l = valueOf;
                        }
                        this.f = l;
                    } else {
                        if (b != 0 && this.g.T()) {
                            valueOf = l2;
                        }
                        this.e = valueOf;
                    }
                }
                return true;
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator<zzew.zzc> it = zzbVar.P().iterator();
        while (true) {
            if (it.hasNext()) {
                zzew.zzc next = it.next();
                if (next.L().isEmpty()) {
                    this.h.j().L().b("null or empty param name in filter. event", this.h.g().c(b0));
                    break;
                }
                hashSet.add(next.L());
            } else {
                C2531Be c2531Be = new C2531Be();
                Iterator<zzfi.zzg> it2 = zzeVar.c0().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zzfi.zzg next2 = it2.next();
                        if (hashSet.contains(next2.c0())) {
                            if (next2.i0()) {
                                c2531Be.put(next2.c0(), next2.i0() ? Long.valueOf(next2.W()) : null);
                            } else if (next2.g0()) {
                                c2531Be.put(next2.c0(), next2.g0() ? Double.valueOf(next2.F()) : null);
                            } else if (next2.k0()) {
                                c2531Be.put(next2.c0(), next2.d0());
                            } else {
                                this.h.j().L().c("Unknown value for param. event, param", this.h.g().c(b0), this.h.g().f(next2.c0()));
                                break;
                            }
                        }
                    } else {
                        Iterator<zzew.zzc> it3 = zzbVar.P().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                zzew.zzc next3 = it3.next();
                                boolean z2 = next3.N() && next3.M();
                                String L = next3.L();
                                if (L.isEmpty()) {
                                    this.h.j().L().b("Event has empty param name. event", this.h.g().c(b0));
                                    break;
                                }
                                Object obj = c2531Be.get(L);
                                if (obj instanceof Long) {
                                    if (!next3.O()) {
                                        this.h.j().L().c("No number filter for long param. event, param", this.h.g().c(b0), this.h.g().f(L));
                                        break;
                                    }
                                    Boolean c2 = zzac.c(((Long) obj).longValue(), next3.J());
                                    if (c2 == null) {
                                        break;
                                    } else if (c2.booleanValue() == z2) {
                                        bool = Boolean.FALSE;
                                        break;
                                    }
                                } else if (obj instanceof Double) {
                                    if (!next3.O()) {
                                        this.h.j().L().c("No number filter for double param. event, param", this.h.g().c(b0), this.h.g().f(L));
                                        break;
                                    }
                                    Boolean b3 = zzac.b(((Double) obj).doubleValue(), next3.J());
                                    if (b3 == null) {
                                        break;
                                    } else if (b3.booleanValue() == z2) {
                                        bool = Boolean.FALSE;
                                        break;
                                    }
                                } else if (obj instanceof String) {
                                    if (next3.Q()) {
                                        e = zzac.g((String) obj, next3.K(), this.h.j());
                                    } else if (next3.O()) {
                                        String str = (String) obj;
                                        if (zzmz.f0(str)) {
                                            e = zzac.e(str, next3.J());
                                        } else {
                                            this.h.j().L().c("Invalid param value for number filter. event, param", this.h.g().c(b0), this.h.g().f(L));
                                            break;
                                        }
                                    } else {
                                        this.h.j().L().c("No filter for String param. event, param", this.h.g().c(b0), this.h.g().f(L));
                                        break;
                                    }
                                    if (e == null) {
                                        break;
                                    } else if (e.booleanValue() == z2) {
                                        bool = Boolean.FALSE;
                                        break;
                                    }
                                } else if (obj == null) {
                                    this.h.j().K().c("Missing param for filter. event, param", this.h.g().c(b0), this.h.g().f(L));
                                    bool = Boolean.FALSE;
                                } else {
                                    this.h.j().L().c("Unknown param type. event, param", this.h.g().c(b0), this.h.g().f(L));
                                }
                            } else {
                                bool = Boolean.TRUE;
                                break;
                            }
                        }
                    }
                }
            }
        }
        this.h.j().K().b("Event filter result", bool != null ? "null" : bool);
        if (bool != null) {
        }
    }
}
