package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzamh implements zzakg {
    public final List a;
    public final long[] b;
    public final long[] c;

    public zzamh(List list) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            zzalw zzalwVar = (zzalw) list.get(i);
            long[] jArr = this.b;
            int i2 = i + i;
            jArr[i2] = zzalwVar.b;
            jArr[i2 + 1] = zzalwVar.c;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final int a() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final List b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                zzalw zzalwVar = (zzalw) list.get(i);
                zzcu zzcuVar = zzalwVar.a;
                if (zzcuVar.e == -3.4028235E38f) {
                    arrayList2.add(zzalwVar);
                } else {
                    arrayList.add(zzcuVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzamg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzalw) obj).b, ((zzalw) obj2).b);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zzcs b = ((zzalw) arrayList2.get(i3)).a.b();
            b.e((-1) - i3, 1);
            arrayList.add(b.p());
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final long z(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        long[] jArr = this.c;
        if (i < jArr.length) {
            z2 = true;
        }
        zzdc.d(z2);
        return jArr[i];
    }
}
