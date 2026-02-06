package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbad {
    @InterfaceC5056aJ2
    public static long a(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return ((i & 1) == 0 ? a(j2, i2) : j * (a(j2, i2) % 1073807359)) % 1073807359;
    }

    @InterfaceC5056aJ2
    public static String b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            int i4 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i3 - 1;
            if (i < i5) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i5]);
                return sb.toString();
            }
        }
    }

    public static void c(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            d(i, e(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long e = e(strArr, 0, 6);
        d(i, e, b(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 < length2 - 5) {
                String b = b(strArr, i3, 6);
                e = ((((((e + 1073807359) - ((a(16785407L, 5) * ((zzazz.a(strArr[i3 - 1]) + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((zzazz.a(strArr[i3 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
                d(i, e, b, length2, priorityQueue);
                i3++;
            } else {
                return;
            }
        }
    }

    @InterfaceC5056aJ2
    public static void d(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzbac zzbacVar = new zzbac(j, str, i2);
        if ((priorityQueue.size() != i || (((zzbac) priorityQueue.peek()).c <= zzbacVar.c && ((zzbac) priorityQueue.peek()).a <= zzbacVar.a)) && !priorityQueue.contains(zzbacVar)) {
            priorityQueue.add(zzbacVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static long e(String[] strArr, int i, int i2) {
        long a = (zzazz.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((zzazz.a(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
