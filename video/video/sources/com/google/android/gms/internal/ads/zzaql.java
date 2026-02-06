package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaql {
    public static final Comparator d = new zzaqk();
    public final List a = new ArrayList();
    public final List b = new ArrayList(64);
    public int c = 0;

    public zzaql(int i) {
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.a.add(bArr);
                List list = this.b;
                int binarySearch = Collections.binarySearch(list, bArr, d);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                list.add(binarySearch, bArr);
                this.c += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i) {
        int i2 = 0;
        while (true) {
            List list = this.b;
            if (i2 < list.size()) {
                byte[] bArr = (byte[]) list.get(i2);
                int length = bArr.length;
                if (length >= i) {
                    this.c -= length;
                    list.remove(i2);
                    this.a.remove(bArr);
                    return bArr;
                }
                i2++;
            } else {
                return new byte[i];
            }
        }
    }

    public final synchronized void c() {
        while (this.c > 4096) {
            byte[] bArr = (byte[]) this.a.remove(0);
            this.b.remove(bArr);
            this.c -= bArr.length;
        }
    }
}
