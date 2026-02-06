package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzvp implements zzuz, zzuy {
    public final zzuz[] X;
    public final boolean[] Y;
    @InterfaceC11300zs1
    public zzuy a1;
    @InterfaceC11300zs1
    public zzxe b1;
    public final ArrayList Y0 = new ArrayList();
    public final HashMap Z0 = new HashMap();
    public zzwv d1 = new zzul(zzfyc.F(), zzfyc.F());
    public final IdentityHashMap Z = new IdentityHashMap();
    public zzuz[] c1 = new zzuz[0];

    public zzvp(zzum zzumVar, long[] jArr, zzuz... zzuzVarArr) {
        this.X = zzuzVarArr;
        this.Y = new boolean[zzuzVarArr.length];
        for (int i = 0; i < zzuzVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.Y[i] = true;
                this.X[i] = new zzxb(zzuzVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final boolean a(zzkv zzkvVar) {
        ArrayList arrayList = this.Y0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((zzuz) arrayList.get(i)).a(zzkvVar);
            }
            return false;
        }
        return this.d1.a(zzkvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final long b() {
        return this.d1.b();
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final long c() {
        return this.d1.c();
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final void d(long j) {
        this.d1.d(j);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long e(long j, zzmd zzmdVar) {
        zzuz zzuzVar;
        zzuz[] zzuzVarArr = this.c1;
        if (zzuzVarArr.length > 0) {
            zzuzVar = zzuzVarArr[0];
        } else {
            zzuzVar = this.X[0];
        }
        return zzuzVar.e(j, zzmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long f() {
        zzuz[] zzuzVarArr;
        zzuz[] zzuzVarArr2;
        long j = -9223372036854775807L;
        for (zzuz zzuzVar : this.c1) {
            long f = zzuzVar.f();
            if (f != C10323vs.b) {
                if (j == C10323vs.b) {
                    for (zzuz zzuzVar2 : this.c1) {
                        if (zzuzVar2 == zzuzVar) {
                            break;
                        } else if (zzuzVar2.w(f) != f) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = f;
                } else if (f != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != C10323vs.b && zzuzVar.w(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final zzxe g() {
        zzxe zzxeVar = this.b1;
        zzxeVar.getClass();
        return zzxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final /* bridge */ /* synthetic */ void h(zzwv zzwvVar) {
        zzuz zzuzVar = (zzuz) zzwvVar;
        zzuy zzuyVar = this.a1;
        zzuyVar.getClass();
        zzuyVar.h(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void i(zzuz zzuzVar) {
        ArrayList arrayList = this.Y0;
        arrayList.remove(zzuzVar);
        if (!arrayList.isEmpty()) {
            return;
        }
        zzuz[] zzuzVarArr = this.X;
        int i = 0;
        for (zzuz zzuzVar2 : zzuzVarArr) {
            i += zzuzVar2.g().a;
        }
        zzbm[] zzbmVarArr = new zzbm[i];
        int i2 = 0;
        for (int i3 = 0; i3 < zzuzVarArr.length; i3++) {
            zzxe g = zzuzVarArr[i3].g();
            int i4 = g.a;
            int i5 = 0;
            while (i5 < i4) {
                zzbm b = g.b(i5);
                int i6 = b.a;
                zzz[] zzzVarArr = new zzz[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    zzz b2 = b.b(i7);
                    zzx b3 = b2.b();
                    String str = b2.a;
                    if (str == null) {
                        str = "";
                    }
                    b3.o(i3 + ":" + str);
                    zzzVarArr[i7] = b3.K();
                }
                zzbm zzbmVar = new zzbm(i3 + ":" + b.b, zzzVarArr);
                this.Z0.put(zzbmVar, b);
                zzbmVarArr[i2] = zzbmVar;
                i5++;
                i2++;
            }
        }
        this.b1 = new zzxe(zzbmVarArr);
        zzuy zzuyVar = this.a1;
        zzuyVar.getClass();
        zzuyVar.i(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void j() throws IOException {
        int i = 0;
        while (true) {
            zzuz[] zzuzVarArr = this.X;
            if (i < zzuzVarArr.length) {
                zzuzVarArr[i].j();
                i++;
            } else {
                return;
            }
        }
    }

    public final zzuz k(int i) {
        if (this.Y[i]) {
            return ((zzxb) this.X[i]).k();
        }
        return this.X[i];
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void m(zzuy zzuyVar, long j) {
        this.a1 = zzuyVar;
        ArrayList arrayList = this.Y0;
        zzuz[] zzuzVarArr = this.X;
        Collections.addAll(arrayList, zzuzVarArr);
        for (zzuz zzuzVar : zzuzVarArr) {
            zzuzVar.m(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final boolean o() {
        return this.d1.o();
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void p(long j, boolean z) {
        for (zzuz zzuzVar : this.c1) {
            zzuzVar.p(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long q(zzyq[] zzyqVarArr, boolean[] zArr, zzwt[] zzwtVarArr, boolean[] zArr2, long j) {
        int length;
        zzwt zzwtVar;
        int[] iArr;
        Integer num;
        int intValue;
        int length2 = zzyqVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzyqVarArr.length;
            if (i2 >= length) {
                break;
            }
            zzwt zzwtVar2 = zzwtVarArr[i2];
            if (zzwtVar2 == null) {
                num = null;
            } else {
                num = (Integer) this.Z.get(zzwtVar2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i2] = intValue;
            zzyq zzyqVar = zzyqVarArr[i2];
            if (zzyqVar != null) {
                String str = zzyqVar.c().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        IdentityHashMap identityHashMap = this.Z;
        identityHashMap.clear();
        zzuz[] zzuzVarArr = this.X;
        zzwt[] zzwtVarArr2 = new zzwt[length];
        zzwt[] zzwtVarArr3 = new zzwt[length];
        zzyq[] zzyqVarArr2 = new zzyq[length];
        ArrayList arrayList = new ArrayList(zzuzVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zzuzVarArr.length) {
            int i4 = i;
            while (i4 < zzyqVarArr.length) {
                if (iArr2[i4] == i3) {
                    zzwtVar = zzwtVarArr[i4];
                } else {
                    zzwtVar = null;
                }
                zzwtVarArr3[i4] = zzwtVar;
                if (iArr3[i4] == i3) {
                    zzyq zzyqVar2 = zzyqVarArr[i4];
                    zzyqVar2.getClass();
                    iArr = iArr3;
                    zzbm zzbmVar = (zzbm) this.Z0.get(zzyqVar2.c());
                    zzbmVar.getClass();
                    zzyqVarArr2[i4] = new zzvo(zzyqVar2, zzbmVar);
                } else {
                    iArr = iArr3;
                    zzyqVarArr2[i4] = null;
                }
                i4++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            long q = zzuzVarArr[i3].q(zzyqVarArr2, zArr, zzwtVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = q;
            } else if (q != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzyqVarArr.length; i6++) {
                boolean z2 = true;
                if (iArr4[i6] == i5) {
                    zzwt zzwtVar3 = zzwtVarArr3[i6];
                    zzwtVar3.getClass();
                    zzwtVarArr2[i6] = zzwtVar3;
                    identityHashMap.put(zzwtVar3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr2[i6] == i5) {
                    if (zzwtVarArr3[i6] != null) {
                        z2 = false;
                    }
                    zzdc.f(z2);
                }
            }
            if (z) {
                arrayList2.add(zzuzVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwtVarArr2, i7, zzwtVarArr, i7, length);
        this.c1 = (zzuz[]) arrayList3.toArray(new zzuz[i7]);
        this.d1 = new zzul(arrayList3, zzfys.b(arrayList3, new zzfur() { // from class: com.google.android.gms.internal.ads.zzvn
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return ((zzuz) obj).g().c();
            }
        }));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long w(long j) {
        long w = this.c1[0].w(j);
        int i = 1;
        while (true) {
            zzuz[] zzuzVarArr = this.c1;
            if (i < zzuzVarArr.length) {
                if (zzuzVarArr[i].w(w) == w) {
                    i++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return w;
            }
        }
    }
}
