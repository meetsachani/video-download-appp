package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3503Kz;
import o.Xu2;

/* loaded from: classes2.dex */
final class zzaoa implements zzans {
    public final zzej a = new zzej(new byte[5], 5);
    public final SparseArray b = new SparseArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    public final /* synthetic */ zzaob e;

    public zzaoa(zzaob zzaobVar, int i) {
        this.e = zzaobVar;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void a(zzer zzerVar, zzadq zzadqVar, zzaof zzaofVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void b(zzek zzekVar) {
        List list;
        SparseArray sparseArray;
        int i;
        zzadq zzadqVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzadq zzadqVar2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        zzaoe zzaoeVar;
        zzaob zzaobVar;
        int i2;
        zzej zzejVar;
        int i3;
        int i4;
        if (zzekVar.G() == 2) {
            zzaob zzaobVar2 = this.e;
            list = zzaobVar2.b;
            zzer zzerVar = (zzer) list.get(0);
            if ((zzekVar.G() & 128) != 0) {
                zzekVar.m(1);
                int K = zzekVar.K();
                int i5 = 3;
                zzekVar.m(3);
                zzej zzejVar2 = this.a;
                zzekVar.g(zzejVar2, 2);
                zzejVar2.n(3);
                int i6 = 13;
                zzaobVar2.r = zzejVar2.d(13);
                zzekVar.g(zzejVar2, 2);
                int i7 = 4;
                zzejVar2.n(4);
                int i8 = 12;
                zzekVar.m(zzejVar2.d(12));
                SparseArray sparseArray3 = this.b;
                sparseArray3.clear();
                SparseIntArray sparseIntArray = this.c;
                sparseIntArray.clear();
                int u = zzekVar.u();
                while (u > 0) {
                    int i9 = 5;
                    zzekVar.g(zzejVar2, 5);
                    int d = zzejVar2.d(8);
                    zzejVar2.n(i5);
                    int d2 = zzejVar2.d(i6);
                    zzejVar2.n(i7);
                    int d3 = zzejVar2.d(i8);
                    int w = zzekVar.w();
                    int i10 = w + d3;
                    String str = null;
                    ArrayList arrayList = null;
                    int i11 = -1;
                    int i12 = 0;
                    while (zzekVar.w() < i10) {
                        int G = zzekVar.G();
                        int w2 = zzekVar.w() + zzekVar.G();
                        if (w2 > i10) {
                            break;
                        }
                        if (G == i9) {
                            long O = zzekVar.O();
                            if (O != Xu2.X) {
                                if (O != Xu2.Y) {
                                    if (O != Xu2.Z) {
                                        if (O == Xu2.a0) {
                                            i4 = 36;
                                            zzaobVar = zzaobVar2;
                                            i11 = i4;
                                            i2 = w2;
                                            zzejVar = zzejVar2;
                                            i3 = u;
                                        }
                                        zzaobVar = zzaobVar2;
                                        i2 = w2;
                                        zzejVar = zzejVar2;
                                        i3 = u;
                                    }
                                    zzaobVar = zzaobVar2;
                                    i2 = w2;
                                    zzejVar = zzejVar2;
                                    i3 = u;
                                    i11 = 172;
                                }
                                zzaobVar = zzaobVar2;
                                zzejVar = zzejVar2;
                                i3 = u;
                                i11 = 135;
                                i2 = w2;
                                zzekVar.m(i2 - zzekVar.w());
                                u = i3;
                                zzejVar2 = zzejVar;
                                zzaobVar2 = zzaobVar;
                                i9 = 5;
                            }
                            zzaobVar = zzaobVar2;
                            i2 = w2;
                            zzejVar = zzejVar2;
                            i3 = u;
                            i11 = 129;
                        } else {
                            if (G != 106) {
                                if (G != 122) {
                                    if (G == 127) {
                                        int G2 = zzekVar.G();
                                        if (G2 != 21) {
                                            if (G2 == 14) {
                                                i4 = 136;
                                            } else {
                                                if (G2 == 33) {
                                                    i4 = C3503Kz.c0;
                                                }
                                                zzaobVar = zzaobVar2;
                                                i2 = w2;
                                                zzejVar = zzejVar2;
                                                i3 = u;
                                            }
                                        }
                                        zzaobVar = zzaobVar2;
                                        i2 = w2;
                                        zzejVar = zzejVar2;
                                        i3 = u;
                                        i11 = 172;
                                    } else if (G == 123) {
                                        i4 = 138;
                                    } else if (G == 10) {
                                        String trim = zzekVar.b(3, StandardCharsets.UTF_8).trim();
                                        i12 = zzekVar.G();
                                        zzaobVar = zzaobVar2;
                                        str = trim;
                                        i2 = w2;
                                        zzejVar = zzejVar2;
                                        i3 = u;
                                    } else {
                                        if (G == 89) {
                                            ArrayList arrayList2 = new ArrayList();
                                            while (zzekVar.w() < w2) {
                                                int i13 = w2;
                                                String trim2 = zzekVar.b(3, StandardCharsets.UTF_8).trim();
                                                int G3 = zzekVar.G();
                                                int i14 = u;
                                                byte[] bArr = new byte[4];
                                                zzekVar.h(bArr, 0, 4);
                                                arrayList2.add(new zzaoc(trim2, G3, bArr));
                                                u = i14;
                                                w2 = i13;
                                                zzejVar2 = zzejVar2;
                                                zzaobVar2 = zzaobVar2;
                                            }
                                            zzaobVar = zzaobVar2;
                                            i2 = w2;
                                            zzejVar = zzejVar2;
                                            i3 = u;
                                            arrayList = arrayList2;
                                            i11 = 89;
                                        } else {
                                            zzaobVar = zzaobVar2;
                                            i2 = w2;
                                            zzejVar = zzejVar2;
                                            i3 = u;
                                            if (G == 111) {
                                                i11 = 257;
                                            }
                                        }
                                        zzekVar.m(i2 - zzekVar.w());
                                        u = i3;
                                        zzejVar2 = zzejVar;
                                        zzaobVar2 = zzaobVar;
                                        i9 = 5;
                                    }
                                    zzaobVar = zzaobVar2;
                                    i11 = i4;
                                    i2 = w2;
                                    zzejVar = zzejVar2;
                                    i3 = u;
                                }
                                zzaobVar = zzaobVar2;
                                zzejVar = zzejVar2;
                                i3 = u;
                                i11 = 135;
                                i2 = w2;
                                zzekVar.m(i2 - zzekVar.w());
                                u = i3;
                                zzejVar2 = zzejVar;
                                zzaobVar2 = zzaobVar;
                                i9 = 5;
                            }
                            zzaobVar = zzaobVar2;
                            i2 = w2;
                            zzejVar = zzejVar2;
                            i3 = u;
                            i11 = 129;
                        }
                        zzekVar.m(i2 - zzekVar.w());
                        u = i3;
                        zzejVar2 = zzejVar;
                        zzaobVar2 = zzaobVar;
                        i9 = 5;
                    }
                    zzaob zzaobVar3 = zzaobVar2;
                    zzej zzejVar3 = zzejVar2;
                    int i15 = u;
                    zzekVar.l(i10);
                    zzaod zzaodVar = new zzaod(i11, str, i12, arrayList, Arrays.copyOfRange(zzekVar.n(), w, i10));
                    if (d == 6 || d == 5) {
                        d = zzaodVar.a;
                    }
                    u = i15 - (d3 + 5);
                    sparseBooleanArray3 = zzaobVar3.h;
                    if (!sparseBooleanArray3.get(d2)) {
                        zzaoeVar = zzaobVar3.e;
                        zzaog b = zzaoeVar.b(d, zzaodVar);
                        sparseIntArray.put(d2, d2);
                        sparseArray3.put(d2, b);
                    }
                    i7 = 4;
                    zzejVar2 = zzejVar3;
                    zzaobVar2 = zzaobVar3;
                    i5 = 3;
                    i6 = 13;
                    i8 = 12;
                }
                zzaob zzaobVar4 = zzaobVar2;
                int size = sparseIntArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    int keyAt = sparseIntArray.keyAt(i16);
                    int valueAt = sparseIntArray.valueAt(i16);
                    sparseBooleanArray = zzaobVar4.h;
                    sparseBooleanArray.put(keyAt, true);
                    sparseBooleanArray2 = zzaobVar4.i;
                    sparseBooleanArray2.put(valueAt, true);
                    zzaog zzaogVar = (zzaog) sparseArray3.valueAt(i16);
                    if (zzaogVar != null) {
                        zzadqVar2 = zzaobVar4.l;
                        zzaogVar.a(zzerVar, zzadqVar2, new zzaof(K, keyAt, 8192));
                        sparseArray2 = zzaobVar4.g;
                        sparseArray2.put(valueAt, zzaogVar);
                    }
                }
                int i17 = this.d;
                sparseArray = zzaobVar4.g;
                sparseArray.remove(i17);
                zzaobVar4.m = 0;
                i = zzaobVar4.m;
                if (i == 0) {
                    zzadqVar = zzaobVar4.l;
                    zzadqVar.N();
                    zzaobVar4.n = true;
                }
            }
        }
    }
}
