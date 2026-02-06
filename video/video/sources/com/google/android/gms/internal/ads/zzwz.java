package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
final class zzwz {
    public int a;
    public final SparseArray b;
    public final zzdk c;

    public zzwz() {
        this(new zzdk() { // from class: com.google.android.gms.internal.ads.zzwy
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void b(Object obj) {
            }
        });
    }

    public final Object a(int i) {
        SparseArray sparseArray;
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 > 0 && i < this.b.keyAt(i2)) {
                this.a--;
            }
        }
        while (true) {
            int i3 = this.a;
            sparseArray = this.b;
            if (i3 >= sparseArray.size() - 1 || i < sparseArray.keyAt(this.a + 1)) {
                break;
            }
            this.a++;
        }
        return sparseArray.valueAt(this.a);
    }

    public final Object b() {
        SparseArray sparseArray = this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void c(int i, Object obj) {
        boolean z;
        boolean z2 = true;
        if (this.a == -1) {
            if (this.b.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            zzdc.f(z);
            this.a = 0;
        }
        SparseArray sparseArray = this.b;
        if (sparseArray.size() > 0) {
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i < keyAt) {
                z2 = false;
            }
            zzdc.d(z2);
            if (keyAt == i) {
                this.c.b(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i, obj);
    }

    public final void d() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i < sparseArray.size()) {
                this.c.b(sparseArray.valueAt(i));
                i++;
            } else {
                this.a = -1;
                sparseArray.clear();
                return;
            }
        }
    }

    public final void e(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i2 < sparseArray.size() - 1) {
                int i3 = i2 + 1;
                if (i >= sparseArray.keyAt(i3)) {
                    this.c.b(sparseArray.valueAt(i2));
                    sparseArray.removeAt(i2);
                    int i4 = this.a;
                    if (i4 > 0) {
                        this.a = i4 - 1;
                    }
                    i2 = i3;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean f() {
        if (this.b.size() == 0) {
            return true;
        }
        return false;
    }

    public zzwz(zzdk zzdkVar) {
        this.b = new SparseArray();
        this.c = zzdkVar;
        this.a = -1;
    }
}
