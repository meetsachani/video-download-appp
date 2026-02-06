package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class zzzz {
    public static final Comparator g = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzv
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzzx) obj).a - ((zzzx) obj2).a;
        }
    };
    public static final Comparator h = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzw
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzzx) obj).c, ((zzzx) obj2).c);
        }
    };
    public int d;
    public int e;
    public int f;
    public final zzzx[] b = new zzzx[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public zzzz(int i) {
    }

    public final float a(float f) {
        int i = 0;
        if (this.c != 0) {
            Collections.sort(this.a, h);
            this.c = 0;
        }
        float f2 = this.e;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                zzzx zzzxVar = (zzzx) arrayList.get(i);
                i2 += zzzxVar.b;
                if (i2 >= 0.5f * f2) {
                    return zzzxVar.c;
                }
                i++;
            } else if (arrayList.isEmpty()) {
                return Float.NaN;
            } else {
                return ((zzzx) arrayList.get(arrayList.size() - 1)).c;
            }
        }
    }

    public final void b(int i, float f) {
        zzzx zzzxVar;
        if (this.c != 1) {
            Collections.sort(this.a, g);
            this.c = 1;
        }
        int i2 = this.f;
        if (i2 > 0) {
            zzzx[] zzzxVarArr = this.b;
            int i3 = i2 - 1;
            this.f = i3;
            zzzxVar = zzzxVarArr[i3];
        } else {
            zzzxVar = new zzzx(null);
        }
        int i4 = this.d;
        this.d = i4 + 1;
        zzzxVar.a = i4;
        zzzxVar.b = i;
        zzzxVar.c = f;
        ArrayList arrayList = this.a;
        arrayList.add(zzzxVar);
        this.e += i;
        while (true) {
            int i5 = this.e;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                zzzx zzzxVar2 = (zzzx) arrayList.get(0);
                int i7 = zzzxVar2.b;
                if (i7 <= i6) {
                    this.e -= i7;
                    arrayList.remove(0);
                    int i8 = this.f;
                    if (i8 < 5) {
                        zzzx[] zzzxVarArr2 = this.b;
                        this.f = i8 + 1;
                        zzzxVarArr2[i8] = zzzxVar2;
                    }
                } else {
                    zzzxVar2.b = i7 - i6;
                    this.e -= i6;
                }
            } else {
                return;
            }
        }
    }

    public final void c() {
        this.a.clear();
        this.c = -1;
        this.d = 0;
        this.e = 0;
    }
}
