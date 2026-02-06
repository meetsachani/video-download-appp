package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzt extends LinkedHashMap {
    public final /* synthetic */ zzv X;

    public zzt(zzv zzvVar) {
        this.X = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        zzv zzvVar = this.X;
        synchronized (zzvVar) {
            try {
                int size = size();
                i = zzvVar.a;
                boolean z = false;
                if (size > i) {
                    arrayDeque = zzvVar.f;
                    arrayDeque.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).b));
                    int size2 = size();
                    i2 = zzvVar.a;
                    if (size2 > i2) {
                        z = true;
                    }
                    return z;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
