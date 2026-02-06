package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
final class zzaqn {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaqn(String str, zzapd zzapdVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzapdVar.b;
        long j = zzapdVar.c;
        long j2 = zzapdVar.d;
        long j3 = zzapdVar.e;
        long j4 = zzapdVar.f;
        List list = zzapdVar.h;
        if (list == null) {
            Map map = zzapdVar.g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzapm((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public static zzaqn a(zzaqo zzaqoVar) throws IOException {
        List arrayList;
        if (zzaqq.d(zzaqoVar) == 538247942) {
            String g = zzaqq.g(zzaqoVar);
            String g2 = zzaqq.g(zzaqoVar);
            long e = zzaqq.e(zzaqoVar);
            long e2 = zzaqq.e(zzaqoVar);
            long e3 = zzaqq.e(zzaqoVar);
            long e4 = zzaqq.e(zzaqoVar);
            int d = zzaqq.d(zzaqoVar);
            if (d >= 0) {
                if (d == 0) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i = 0; i < d; i++) {
                    list.add(new zzapm(zzaqq.g(zzaqoVar).intern(), zzaqq.g(zzaqoVar).intern()));
                }
                return new zzaqn(g, g2, e, e2, e3, e4, list);
            }
            throw new IOException("readHeaderList size=" + d);
        }
        throw new IOException();
    }

    public zzaqn(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
