package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zzyu extends zzyx {
    @Override // com.google.android.gms.internal.ads.zzyx
    public final zzyy f(zzly[] zzlyVarArr, zzxe zzxeVar, zzvb zzvbVar, zzbl zzblVar) throws zzik {
        boolean z;
        List[] listArr;
        boolean z2;
        zzfyc F;
        int[] iArr;
        boolean z3;
        int[] iArr2 = new int[3];
        zzbm[][] zzbmVarArr = new zzbm[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzxeVar.a;
            zzbmVarArr[i] = new zzbm[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzlyVarArr[i4].d();
        }
        int i5 = 0;
        while (i5 < zzxeVar.a) {
            zzbm b = zzxeVar.b(i5);
            int i6 = b.c;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z4 = true;
            while (i8 < i3) {
                zzly zzlyVar = zzlyVarArr[i8];
                int i10 = 0;
                for (int i11 = 0; i11 < b.a; i11++) {
                    i10 = Math.max(i10, zzlyVar.k(b.b(i11)) & 7);
                }
                if (iArr2[i8] == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i10 <= i9) {
                    if (i10 == i9 && i6 == 5 && !z4 && z3) {
                        i7 = i8;
                        i9 = i10;
                        z4 = true;
                    }
                } else {
                    z4 = z3;
                    i7 = i8;
                    i9 = i10;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[b.a];
            } else {
                zzly zzlyVar2 = zzlyVarArr[i7];
                int i12 = b.a;
                int[] iArr5 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr5[i13] = zzlyVar2.k(b.b(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i7];
            zzbmVarArr[i7][i14] = b;
            iArr3[i7][i14] = iArr;
            iArr2[i7] = i14 + 1;
            i5++;
            i3 = 2;
        }
        zzxe[] zzxeVarArr = new zzxe[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i15 = 0;
        while (i15 < i3) {
            int i16 = iArr2[i15];
            zzxeVarArr[i15] = new zzxe((zzbm[]) zzeu.q(zzbmVarArr[i15], i16));
            iArr3[i15] = (int[][]) zzeu.q(iArr3[i15], i16);
            strArr[i15] = zzlyVarArr[i15].X();
            iArr6[i15] = zzlyVarArr[i15].b();
            i15++;
            i3 = 2;
        }
        int i17 = i3;
        zzyt zzytVar = new zzyt(strArr, iArr6, zzxeVarArr, iArr4, iArr3, new zzxe((zzbm[]) zzeu.q(zzbmVarArr[i17], iArr2[i17])));
        Pair k = k(zzytVar, iArr3, iArr4, zzvbVar, zzblVar);
        zzyv[] zzyvVarArr = (zzyv[]) k.second;
        List[] listArr2 = new List[zzyvVarArr.length];
        for (int i18 = 0; i18 < zzyvVarArr.length; i18++) {
            zzyv zzyvVar = zzyvVarArr[i18];
            if (zzyvVar != null) {
                F = zzfyc.G(zzyvVar);
            } else {
                F = zzfyc.F();
            }
            listArr2[i18] = F;
        }
        zzfxz zzfxzVar = new zzfxz();
        for (int i19 = 0; i19 < 2; i19++) {
            zzxe d = zzytVar.d(i19);
            List list = listArr2[i19];
            int i20 = 0;
            while (i20 < d.a) {
                zzbm b2 = d.b(i20);
                if (zzytVar.a(i19, i20, false) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i21 = b2.a;
                int[] iArr7 = new int[i21];
                boolean[] zArr = new boolean[i21];
                int i22 = 0;
                while (i22 < i21) {
                    iArr7[i22] = zzytVar.b(i19, i20, i22) & 7;
                    int i23 = 0;
                    while (true) {
                        if (i23 < list.size()) {
                            zzyv zzyvVar2 = (zzyv) list.get(i23);
                            listArr = listArr2;
                            if (zzyvVar2.c().equals(b2) && zzyvVar2.A(i22) != -1) {
                                z2 = true;
                                break;
                            }
                            i23++;
                            listArr2 = listArr;
                        } else {
                            listArr = listArr2;
                            z2 = false;
                            break;
                        }
                    }
                    zArr[i22] = z2;
                    i22++;
                    listArr2 = listArr;
                }
                zzfxzVar.g(new zzbs(b2, z, iArr7, zArr));
                i20++;
                listArr2 = listArr2;
            }
        }
        zzxe e = zzytVar.e();
        for (int i24 = 0; i24 < e.a; i24++) {
            zzbm b3 = e.b(i24);
            int i25 = b3.a;
            int[] iArr8 = new int[i25];
            Arrays.fill(iArr8, 0);
            zzfxzVar.g(new zzbs(b3, false, iArr8, new boolean[i25]));
        }
        return new zzyy((zzlz[]) k.first, (zzyq[]) k.second, new zzbt(zzfxzVar.j()), zzytVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyx
    public final void g(@InterfaceC11300zs1 Object obj) {
        zzyt zzytVar = (zzyt) obj;
    }

    public abstract Pair k(zzyt zzytVar, int[][][] iArr, int[] iArr2, zzvb zzvbVar, zzbl zzblVar) throws zzik;
}
