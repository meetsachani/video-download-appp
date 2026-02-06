package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes2.dex */
public final class zzazy {
    public final int a;
    public final zzazv b = new zzbaa();

    public zzazy(int i) {
        this.a = i;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzazx zzazxVar = new zzazx();
        int i2 = this.a;
        PriorityQueue priorityQueue = new PriorityQueue(i2, new zzazw(this));
        for (String str : split) {
            String[] b = zzazz.b(str, false);
            if (b.length != 0) {
                zzbad.c(b, i2, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzazxVar.b.write(this.b.b(((zzbac) it.next()).b));
            } catch (IOException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error while writing hash to byteStream", e);
            }
        }
        return zzazxVar.toString();
    }
}
