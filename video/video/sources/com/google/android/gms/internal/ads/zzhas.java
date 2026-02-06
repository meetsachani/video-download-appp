package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzhas {
    public final ArrayDeque a = new ArrayDeque();

    private zzhas() {
    }

    public static /* bridge */ /* synthetic */ zzgxk a(zzhas zzhasVar, zzgxk zzgxkVar, zzgxk zzgxkVar2) {
        zzhasVar.b(zzgxkVar);
        zzhasVar.b(zzgxkVar2);
        ArrayDeque arrayDeque = zzhasVar.a;
        zzgxk zzgxkVar3 = (zzgxk) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzgxkVar3 = new zzhav((zzgxk) arrayDeque.pop(), zzgxkVar3);
        }
        return zzgxkVar3;
    }

    public static final int c(int i) {
        int binarySearch = Arrays.binarySearch(zzhav.c1, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    public final void b(zzgxk zzgxkVar) {
        zzgxk zzgxkVar2;
        zzgxk zzgxkVar3;
        if (zzgxkVar.l()) {
            int c = c(zzgxkVar.i());
            ArrayDeque arrayDeque = this.a;
            int f0 = zzhav.f0(c + 1);
            if (!arrayDeque.isEmpty() && ((zzgxk) arrayDeque.peek()).i() < f0) {
                int f02 = zzhav.f0(c);
                zzgxk zzgxkVar4 = (zzgxk) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((zzgxk) arrayDeque.peek()).i() < f02) {
                    zzgxkVar4 = new zzhav((zzgxk) arrayDeque.pop(), zzgxkVar4);
                }
                zzhav zzhavVar = new zzhav(zzgxkVar4, zzgxkVar);
                while (!arrayDeque.isEmpty()) {
                    if (((zzgxk) arrayDeque.peek()).i() >= zzhav.f0(c(zzhavVar.i()) + 1)) {
                        break;
                    }
                    zzhavVar = new zzhav((zzgxk) arrayDeque.pop(), zzhavVar);
                }
                arrayDeque.push(zzhavVar);
                return;
            }
            arrayDeque.push(zzgxkVar);
        } else if (zzgxkVar instanceof zzhav) {
            zzhav zzhavVar2 = (zzhav) zzgxkVar;
            zzgxkVar2 = zzhavVar2.Y0;
            b(zzgxkVar2);
            zzgxkVar3 = zzhavVar2.Z0;
            b(zzgxkVar3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgxkVar.getClass())));
        }
    }

    public /* synthetic */ zzhas(zzhau zzhauVar) {
    }
}
