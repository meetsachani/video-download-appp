package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import o.C10323vs;
import o.C4128Rj1;
import o.C7177j10;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzyo extends zzyu implements zzlx {
    public static final zzfzn i = zzfzn.b(new Comparator() { // from class: com.google.android.gms.internal.ads.zzxo
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i2 = zzyo.j;
            if (num.intValue() == -1) {
                if (num2.intValue() != -1) {
                    return -1;
                }
                return 0;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });
    public static final /* synthetic */ int j = 0;
    public final Object c;
    @InterfaceC11300zs1
    public final Context d;
    @InterfaceC8710pF0("lock")
    public zzyc e;
    @InterfaceC11300zs1
    public zzyg f;
    public zze g;
    public final zzxk h;

    public zzyo(Context context) {
        Context context2;
        zzxk zzxkVar = new zzxk();
        zzyc zzycVar = zzyc.W;
        this.c = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.d = context2;
        this.h = zzxkVar;
        if (zzycVar != null) {
            this.e = zzycVar;
        } else {
            zzyb zzybVar = new zzyb(zzycVar, null);
            zzybVar.C(zzycVar);
            this.e = new zzyc(zzybVar);
        }
        this.g = zze.b;
        if (this.e.P && context == null) {
            zzdx.f(C7177j10.k, C7177j10.l);
        }
    }

    public static /* bridge */ /* synthetic */ int l(int i2, int i3) {
        if (i2 != 0 && i2 == i3) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i2 & i3);
    }

    public static int m(zzz zzzVar, @InterfaceC11300zs1 String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzzVar.d)) {
            return 4;
        }
        String p = p(str);
        String p2 = p(zzzVar.d);
        if (p2 != null && p != null) {
            if (!p2.startsWith(p) && !p.startsWith(p2)) {
                String str2 = zzeu.a;
                if (!p2.split("-", 2)[0].equals(p.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z || p2 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    @InterfaceC11300zs1
    public static String p(@InterfaceC11300zs1 String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, C10323vs.g1)) {
            return str;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ void q(zzyo zzyoVar) {
        zzyoVar.u();
    }

    public static /* synthetic */ boolean s(zzyo zzyoVar, zzyc zzycVar, zzz zzzVar) {
        zzyg zzygVar;
        zzyg zzygVar2;
        if (zzycVar.P) {
            int i2 = zzzVar.E;
            char c = 65535;
            if (i2 != -1 && i2 > 2) {
                String str = zzzVar.f301o;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (str.equals(C4128Rj1.S)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 187078296:
                            if (str.equals(C4128Rj1.Q)) {
                                c = 0;
                                break;
                            }
                            break;
                        case 187078297:
                            if (str.equals(C4128Rj1.T)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1504578661:
                            if (str.equals(C4128Rj1.R)) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if ((c == 0 || c == 1 || c == 2 || c == 3) && (Build.VERSION.SDK_INT < 32 || (zzygVar2 = zzyoVar.f) == null || !zzygVar2.e())) {
                        return true;
                    }
                }
                if (Build.VERSION.SDK_INT >= 32 && (zzygVar = zzyoVar.f) != null && zzygVar.e() && zzygVar.c() && zzyoVar.f.d() && zzyoVar.f.b(zzyoVar.g, zzzVar)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static void t(zzxe zzxeVar, zzbr zzbrVar, Map map) {
        for (int i2 = 0; i2 < zzxeVar.a; i2++) {
            if (((zzbn) zzbrVar.D.get(zzxeVar.b(i2))) != null) {
                throw null;
            }
        }
    }

    @InterfaceC11300zs1
    public static final Pair v(int i2, zzyt zzytVar, int[][][] iArr, zzyi zzyiVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzyt zzytVar2 = zzytVar;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < 2) {
            if (i2 == zzytVar2.c(i3)) {
                zzxe d = zzytVar2.d(i3);
                for (int i4 = 0; i4 < d.a; i4++) {
                    zzbm b = d.b(i4);
                    List a = zzyiVar.a(i3, b, iArr[i3][i4]);
                    int i5 = b.a;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        zzyj zzyjVar = (zzyj) a.get(i6);
                        int e = zzyjVar.e();
                        if (!zArr[i6] && e != 0) {
                            if (e == 1) {
                                randomAccess = zzfyc.G(zzyjVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzyjVar);
                                for (int i8 = i7; i8 < i5; i8++) {
                                    zzyj zzyjVar2 = (zzyj) a.get(i8);
                                    if (zzyjVar2.e() == 2 && zzyjVar.g(zzyjVar2)) {
                                        arrayList2.add(zzyjVar2);
                                        zArr[i8] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i6 = i7;
                    }
                }
            }
            i3++;
            zzytVar2 = zzytVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((zzyj) list.get(i9)).Z;
        }
        zzyj zzyjVar3 = (zzyj) list.get(0);
        return Pair.create(new zzyp(zzyjVar3.Y, iArr2, 0), Integer.valueOf(zzyjVar3.X));
    }

    @Override // com.google.android.gms.internal.ads.zzlx
    public final void a(zzlv zzlvVar) {
        synchronized (this.c) {
            boolean z = this.e.T;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyx
    @InterfaceC11300zs1
    public final zzlx b() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzyx
    public final void c() {
        zzyg zzygVar;
        if (Build.VERSION.SDK_INT >= 32 && (zzygVar = this.f) != null) {
            zzygVar.a();
        }
        super.c();
    }

    @Override // com.google.android.gms.internal.ads.zzyx
    public final void d(zze zzeVar) {
        if (this.g.equals(zzeVar)) {
            return;
        }
        this.g = zzeVar;
        u();
    }

    @Override // com.google.android.gms.internal.ads.zzyx
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final Pair k(zzyt zzytVar, int[][][] iArr, final int[] iArr2, zzvb zzvbVar, zzbl zzblVar) throws zzik {
        final zzyc zzycVar;
        int i2;
        final boolean z;
        final String str;
        final Point point;
        Pair pair;
        final String str2;
        zzlz zzlzVar;
        int[] iArr3;
        int length;
        zzyq a;
        zzyp zzypVar;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        synchronized (this.c) {
            zzycVar = this.e;
        }
        if (zzycVar.P && Build.VERSION.SDK_INT >= 32 && this.f == null) {
            this.f = new zzyg(this.d, this);
        }
        int i3 = 2;
        zzyp[] zzypVarArr = new zzyp[2];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = 1;
            if (i5 < 2) {
                if (zzytVar.c(i5) == 2 && zzytVar.d(i5).a > 0) {
                    z = true;
                    break;
                }
                i5++;
            } else {
                z = false;
                break;
            }
        }
        Pair v = v(1, zzytVar, iArr, new zzyi() { // from class: com.google.android.gms.internal.ads.zzxt
            @Override // com.google.android.gms.internal.ads.zzyi
            public final List a(int i6, zzbm zzbmVar, int[] iArr4) {
                final zzyo zzyoVar = zzyo.this;
                final zzyc zzycVar2 = zzycVar;
                zzfvd zzfvdVar = new zzfvd() { // from class: com.google.android.gms.internal.ads.zzxv
                    @Override // com.google.android.gms.internal.ads.zzfvd
                    public final boolean b(Object obj) {
                        return zzyo.s(zzyo.this, zzycVar2, (zzz) obj);
                    }
                };
                int i7 = iArr2[i6];
                int i8 = zzfyc.Z;
                zzfxz zzfxzVar = new zzfxz();
                for (int i9 = 0; i9 < zzbmVar.a; i9++) {
                    zzfxzVar.g(new zzxy(i6, zzbmVar, i9, zzycVar2, iArr4[i9], z, zzfvdVar, i7));
                }
                return zzfxzVar.j();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxy) Collections.max((List) obj)).h((zzxy) Collections.max((List) obj2));
            }
        });
        if (v != null) {
            zzypVarArr[((Integer) v.second).intValue()] = (zzyp) v.first;
        }
        if (v == null) {
            str = null;
        } else {
            Object obj = v.first;
            str = ((zzyp) obj).a.b(((zzyp) obj).b[0]).d;
        }
        int i6 = zzycVar.u.a;
        if (zzycVar.k && (context2 = this.d) != null) {
            point = zzeu.R(context2);
        } else {
            point = null;
        }
        Pair v2 = v(2, zzytVar, iArr, new zzyi() { // from class: com.google.android.gms.internal.ads.zzxr
            /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
            @Override // com.google.android.gms.internal.ads.zzyi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List a(int i7, zzbm zzbmVar, int[] iArr4) {
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                boolean z2;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                Point point2;
                int i18;
                boolean z3;
                boolean z4;
                zzbm zzbmVar2 = zzbmVar;
                int i19 = zzyo.j;
                zzyc zzycVar2 = zzyc.this;
                int i20 = iArr2[i7];
                Point point3 = point;
                if (point3 != null) {
                    i8 = point3.x;
                } else {
                    i8 = zzycVar2.i;
                }
                if (point3 != null) {
                    i9 = point3.y;
                } else {
                    i9 = zzycVar2.j;
                }
                boolean z5 = zzycVar2.l;
                if (i8 != Integer.MAX_VALUE) {
                    if (i9 == Integer.MAX_VALUE) {
                        i11 = Integer.MAX_VALUE;
                        i10 = -1;
                    } else {
                        int i21 = Integer.MAX_VALUE;
                        for (int i22 = 0; i22 < zzbmVar2.a; i22++) {
                            zzz b = zzbmVar2.b(i22);
                            int i23 = b.v;
                            if (i23 > 0 && (i13 = b.w) > 0) {
                                if (z5) {
                                    if (i23 <= i13) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (i8 <= i9) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z3 != z4) {
                                        i15 = i9;
                                        i14 = i8;
                                        if (i23 * i14 < i13 * i15) {
                                            String str3 = zzeu.a;
                                            point2 = new Point(i15, ((i17 + i23) - 1) / i23);
                                        } else {
                                            String str4 = zzeu.a;
                                            point2 = new Point(((i16 + i13) - 1) / i13, i14);
                                        }
                                        i18 = i23 * i13;
                                        if (i23 >= ((int) (point2.x * 0.98f)) && i13 >= ((int) (point2.y * 0.98f)) && i18 < i21) {
                                            i21 = i18;
                                        }
                                    }
                                }
                                i14 = i9;
                                i15 = i8;
                                if (i23 * i14 < i13 * i15) {
                                }
                                i18 = i23 * i13;
                                if (i23 >= ((int) (point2.x * 0.98f))) {
                                    i21 = i18;
                                }
                            }
                        }
                        i10 = -1;
                        i11 = i21;
                    }
                } else {
                    i10 = -1;
                    i11 = Integer.MAX_VALUE;
                }
                int i24 = zzfyc.Z;
                zzfxz zzfxzVar = new zzfxz();
                int i25 = 0;
                while (i25 < zzbmVar2.a) {
                    int a2 = zzbmVar2.b(i25).a();
                    if (i11 != Integer.MAX_VALUE) {
                        i12 = i10;
                        if (a2 == i12 || a2 > i11) {
                            z2 = false;
                            zzfxzVar.g(new zzym(i7, zzbmVar2, i25, zzycVar2, iArr4[i25], str, i20, z2));
                            i25++;
                            zzbmVar2 = zzbmVar;
                            i10 = i12;
                        }
                    } else {
                        i12 = i10;
                    }
                    z2 = true;
                    zzfxzVar.g(new zzym(i7, zzbmVar2, i25, zzycVar2, iArr4[i25], str, i20, z2));
                    i25++;
                    zzbmVar2 = zzbmVar;
                    i10 = i12;
                }
                return zzfxzVar.j();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxs
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                List list = (List) obj2;
                List list2 = (List) obj3;
                return zzfxr.i().c((zzym) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyk
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzym.i((zzym) obj4, (zzym) obj5);
                    }
                }), (zzym) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyk
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzym.i((zzym) obj4, (zzym) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyk
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzym.i((zzym) obj4, (zzym) obj5);
                    }
                }).b(list.size(), list2.size()).c((zzym) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyl
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzym.h((zzym) obj4, (zzym) obj5);
                    }
                }), (zzym) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyl
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzym.h((zzym) obj4, (zzym) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyl
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzym.h((zzym) obj4, (zzym) obj5);
                    }
                }).a();
            }
        });
        int i7 = 4;
        if (v2 == null) {
            pair = v(4, zzytVar, iArr, new zzyi() { // from class: com.google.android.gms.internal.ads.zzxp
                @Override // com.google.android.gms.internal.ads.zzyi
                public final List a(int i8, zzbm zzbmVar, int[] iArr4) {
                    int i9 = zzyo.j;
                    int i10 = zzfyc.Z;
                    zzfxz zzfxzVar = new zzfxz();
                    for (int i11 = 0; i11 < zzbmVar.a; i11++) {
                        zzfxzVar.g(new zzxz(i8, zzbmVar, i11, zzyc.this, iArr4[i11]));
                    }
                    return zzfxzVar.j();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return ((zzxz) ((List) obj2).get(0)).h((zzxz) ((List) obj3).get(0));
                }
            });
        } else {
            pair = null;
        }
        if (pair != null) {
            zzypVarArr[((Integer) pair.second).intValue()] = (zzyp) pair.first;
        } else if (v2 != null) {
            zzypVarArr[((Integer) v2.second).intValue()] = (zzyp) v2.first;
        }
        if (!zzycVar.x || (context = this.d) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str2 = null;
        } else {
            String str3 = zzeu.a;
            str2 = locale.toLanguageTag();
        }
        int i8 = 3;
        Pair v3 = v(3, zzytVar, iArr, new zzyi() { // from class: com.google.android.gms.internal.ads.zzxw
            @Override // com.google.android.gms.internal.ads.zzyi
            public final List a(int i9, zzbm zzbmVar, int[] iArr4) {
                int i10 = zzyo.j;
                int i11 = zzfyc.Z;
                zzfxz zzfxzVar = new zzfxz();
                for (int i12 = 0; i12 < zzbmVar.a; i12++) {
                    zzfxzVar.g(new zzyh(i9, zzbmVar, i12, zzyc.this, iArr4[i12], str, str2));
                }
                return zzfxzVar.j();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxx
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzyh) ((List) obj2).get(0)).h((zzyh) ((List) obj3).get(0));
            }
        });
        if (v3 != null) {
            zzypVarArr[((Integer) v3.second).intValue()] = (zzyp) v3.first;
        }
        int i9 = 0;
        while (i9 < i3) {
            int c = zzytVar.c(i9);
            if (c != i3 && c != i2 && c != i8 && c != i7) {
                zzxe d = zzytVar.d(i9);
                int[][] iArr4 = iArr[i9];
                int i10 = i4;
                int i11 = i10;
                zzbm zzbmVar = null;
                zzya zzyaVar = null;
                while (i10 < d.a) {
                    zzbm b = d.b(i10);
                    int[] iArr5 = iArr4[i10];
                    zzya zzyaVar2 = zzyaVar;
                    for (int i12 = i4; i12 < b.a; i12++) {
                        if (zzlw.a(iArr5[i12], zzycVar.Q)) {
                            zzya zzyaVar3 = new zzya(b.b(i12), iArr5[i12]);
                            if (zzyaVar2 == null || zzyaVar3.compareTo(zzyaVar2) > 0) {
                                zzbmVar = b;
                                zzyaVar2 = zzyaVar3;
                                i11 = i12;
                            }
                        }
                    }
                    i10++;
                    zzyaVar = zzyaVar2;
                    i4 = 0;
                }
                if (zzbmVar == null) {
                    zzypVar = null;
                } else {
                    zzypVar = new zzyp(zzbmVar, new int[]{i11}, 0);
                }
                zzypVarArr[i9] = zzypVar;
            }
            i9++;
            i3 = 2;
            i4 = 0;
            i8 = 3;
            i2 = 1;
            i7 = 4;
        }
        HashMap hashMap = new HashMap();
        int i13 = 2;
        for (int i14 = 0; i14 < 2; i14++) {
            t(zzytVar.d(i14), zzycVar, hashMap);
        }
        t(zzytVar.e(), zzycVar, hashMap);
        for (int i15 = 0; i15 < 2; i15++) {
            if (((zzbn) hashMap.get(Integer.valueOf(zzytVar.c(i15)))) != null) {
                throw null;
            }
        }
        int i16 = 0;
        while (i16 < i13) {
            zzxe d2 = zzytVar.d(i16);
            if (zzycVar.f(i16, d2)) {
                if (zzycVar.d(i16, d2) == null) {
                    zzypVarArr[i16] = null;
                } else {
                    throw null;
                }
            }
            i16++;
            i13 = 2;
        }
        int i17 = 0;
        while (i17 < i13) {
            int c2 = zzytVar.c(i17);
            if (zzycVar.e(i17) || zzycVar.E.contains(Integer.valueOf(c2))) {
                zzypVarArr[i17] = null;
            }
            i17++;
            i13 = 2;
        }
        zzxk zzxkVar = this.h;
        zzzf h = h();
        zzfyc a2 = zzxl.a(zzypVarArr);
        int i18 = 2;
        zzyq[] zzyqVarArr = new zzyq[2];
        int i19 = 0;
        while (i19 < i18) {
            zzyp zzypVar2 = zzypVarArr[i19];
            if (zzypVar2 != null && (length = (iArr3 = zzypVar2.b).length) != 0) {
                if (length == 1) {
                    a = new zzyr(zzypVar2.a, iArr3[0], 0, 0, null);
                } else {
                    a = zzxkVar.a(zzypVar2.a, iArr3, 0, h, (zzfyc) a2.get(i19));
                }
                zzyqVarArr[i19] = a;
            }
            i19++;
            i18 = 2;
        }
        zzlz[] zzlzVarArr = new zzlz[i18];
        for (int i20 = 0; i20 < i18; i20++) {
            int c3 = zzytVar.c(i20);
            if (zzycVar.e(i20) || zzycVar.E.contains(Integer.valueOf(c3)) || (zzytVar.c(i20) != -2 && zzyqVarArr[i20] == null)) {
                zzlzVar = null;
            } else {
                zzlzVar = zzlz.b;
            }
            zzlzVarArr[i20] = zzlzVar;
        }
        return Pair.create(zzlzVarArr, zzyqVarArr);
    }

    public final zzyc n() {
        zzyc zzycVar;
        synchronized (this.c) {
            zzycVar = this.e;
        }
        return zzycVar;
    }

    public final void r(zzyb zzybVar) {
        boolean equals;
        zzyc zzycVar = new zzyc(zzybVar);
        synchronized (this.c) {
            equals = this.e.equals(zzycVar);
            this.e = zzycVar;
        }
        if (!equals) {
            if (zzycVar.P && this.d == null) {
                zzdx.f(C7177j10.k, C7177j10.l);
            }
            j();
        }
    }

    public final void u() {
        boolean z;
        zzyg zzygVar;
        synchronized (this.c) {
            try {
                z = false;
                if (this.e.P && Build.VERSION.SDK_INT >= 32 && (zzygVar = this.f) != null && zzygVar.e()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            j();
        }
    }
}
