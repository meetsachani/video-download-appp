package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzkp<T> implements zzlb<T> {
    public final zzkj a;
    public final zzma<?, ?> b;
    public final boolean c;
    public final zzim<?> d;

    public zzkp(zzma<?, ?> zzmaVar, zzim<?> zzimVar, zzkj zzkjVar) {
        this.b = zzmaVar;
        this.c = zzimVar.h(zzkjVar);
        this.d = zzimVar;
        this.a = zzkjVar;
    }

    public static <T> zzkp<T> k(zzma<?, ?> zzmaVar, zzim<?> zzimVar, zzkj zzkjVar) {
        return new zzkp<>(zzmaVar, zzimVar, zzkjVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final T a() {
        zzkj zzkjVar = this.a;
        if (zzkjVar instanceof zzix) {
            return (T) ((zzix) zzkjVar).y();
        }
        return (T) zzkjVar.e().a0();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final int b(T t) {
        zzma<?, ?> zzmaVar = this.b;
        int k = zzmaVar.k(zzmaVar.q(t));
        if (this.c) {
            return k + this.d.b(t).a();
        }
        return k;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final int c(T t) {
        int hashCode = this.b.q(t).hashCode();
        if (this.c) {
            return (hashCode * 53) + this.d.b(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final boolean d(T t) {
        return this.d.b(t).t();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final void e(T t, zzlc zzlcVar, zzik zzikVar) throws IOException {
        boolean z;
        zzma<?, ?> zzmaVar = this.b;
        zzim<?> zzimVar = this.d;
        Object o2 = zzmaVar.o(t);
        zziq<?> i = zzimVar.i(t);
        do {
            try {
                if (zzlcVar.c() == Integer.MAX_VALUE) {
                    zzmaVar.n(t, o2);
                    return;
                }
                int f = zzlcVar.f();
                if (f != 11) {
                    if ((f & 7) == 2) {
                        Object c = zzimVar.c(zzikVar, this.a, f >>> 3);
                        if (c != null) {
                            zzimVar.f(zzlcVar, c, zzikVar, i);
                        } else {
                            z = zzmaVar.j(o2, zzlcVar);
                            continue;
                        }
                    } else {
                        z = zzlcVar.v();
                        continue;
                    }
                } else {
                    Object obj = null;
                    int i2 = 0;
                    zzhm zzhmVar = null;
                    while (zzlcVar.c() != Integer.MAX_VALUE) {
                        int f2 = zzlcVar.f();
                        if (f2 == 16) {
                            i2 = zzlcVar.j();
                            obj = zzimVar.c(zzikVar, this.a, i2);
                        } else if (f2 == 26) {
                            if (obj != null) {
                                zzimVar.f(zzlcVar, obj, zzikVar, i);
                            } else {
                                zzhmVar = zzlcVar.o();
                            }
                        } else if (!zzlcVar.v()) {
                            break;
                        }
                    }
                    if (zzlcVar.f() == 12) {
                        if (zzhmVar != null) {
                            if (obj != null) {
                                zzimVar.e(zzhmVar, obj, zzikVar, i);
                            } else {
                                zzmaVar.f(o2, i2, zzhmVar);
                            }
                        }
                    } else {
                        throw zzji.b();
                    }
                }
                z = true;
                continue;
            } catch (Throwable th) {
                zzmaVar.n(t, o2);
                throw th;
            }
        } while (z);
        zzmaVar.n(t, o2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final void f(T t) {
        this.b.s(t);
        this.d.j(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final void g(T t, T t2) {
        zzld.n(this.b, t, t2);
        if (this.c) {
            zzld.l(this.d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final void h(T t, zzmw zzmwVar) throws IOException {
        Iterator<Map.Entry<?, Object>> q = this.d.b(t).q();
        while (q.hasNext()) {
            Map.Entry<?, Object> next = q.next();
            zzis zzisVar = (zzis) next.getKey();
            if (zzisVar.c() == zzmx.MESSAGE && !zzisVar.d() && !zzisVar.f()) {
                if (next instanceof zzjm) {
                    zzmwVar.p(zzisVar.a(), ((zzjm) next).a().d());
                } else {
                    zzmwVar.p(zzisVar.a(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzma<?, ?> zzmaVar = this.b;
        zzmaVar.h(zzmaVar.q(t), zzmwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1 A[EDGE_INSN: B:60:0x00a1->B:35:0x00a1 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(T t, byte[] bArr, int i, int i2, zzhl zzhlVar) throws IOException {
        int i3;
        zzix zzixVar = (zzix) t;
        zzlz zzlzVar = zzixVar.zzb;
        if (zzlzVar == zzlz.k()) {
            zzlzVar = zzlz.l();
            zzixVar.zzb = zzlzVar;
        }
        zzlz zzlzVar2 = zzlzVar;
        ((zzix.zzd) t).F();
        zzix.zzf zzfVar = null;
        while (i < i2) {
            int p = zzhi.p(bArr, i, zzhlVar);
            int i4 = zzhlVar.a;
            if (i4 != 11) {
                if ((i4 & 7) == 2) {
                    zzfVar = (zzix.zzf) this.d.c(zzhlVar.d, this.a, i4 >>> 3);
                    if (zzfVar == null) {
                        i = zzhi.d(i4, bArr, p, i2, zzlzVar2, zzhlVar);
                    } else {
                        zzkx.a();
                        throw new NoSuchMethodError();
                    }
                } else {
                    i = zzhi.b(i4, bArr, p, i2, zzhlVar);
                }
            } else {
                byte[] bArr2 = bArr;
                int i5 = i2;
                zzhl zzhlVar2 = zzhlVar;
                int i6 = 0;
                zzhm zzhmVar = null;
                while (true) {
                    if (p < i5) {
                        i3 = zzhi.p(bArr2, p, zzhlVar2);
                        int i7 = zzhlVar2.a;
                        int i8 = i7 >>> 3;
                        int i9 = i7 & 7;
                        if (i8 != 2) {
                            if (i8 == 3) {
                                if (zzfVar == null) {
                                    if (i9 == 2) {
                                        p = zzhi.k(bArr2, i3, zzhlVar2);
                                        zzhmVar = (zzhm) zzhlVar2.c;
                                    }
                                } else {
                                    zzkx.a();
                                    throw new NoSuchMethodError();
                                }
                            }
                            if (i7 != 12) {
                                break;
                            }
                            p = zzhi.b(i7, bArr2, i3, i5, zzhlVar2);
                        } else if (i9 == 0) {
                            p = zzhi.p(bArr2, i3, zzhlVar2);
                            i6 = zzhlVar2.a;
                            zzfVar = (zzix.zzf) this.d.c(zzhlVar2.d, this.a, i6);
                        } else if (i7 != 12) {
                        }
                    } else {
                        i3 = p;
                        break;
                    }
                }
                if (zzhmVar != null) {
                    zzlzVar2.e((i6 << 3) | 2, zzhmVar);
                }
                i = i3;
                bArr = bArr2;
                i2 = i5;
                zzhlVar = zzhlVar2;
            }
        }
        if (i == i2) {
            return;
        }
        throw zzji.g();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final boolean j(T t, T t2) {
        if (!this.b.q(t).equals(this.b.q(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.b(t).equals(this.d.b(t2));
        }
        return true;
    }
}
