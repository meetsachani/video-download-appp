package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.gj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1674gj implements T1 {
    public final Map<String, Set<String>> A00 = new HashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.T1
    public final synchronized boolean AAM(String str, String str2) {
        boolean z;
        Set<String> set = this.A00.get(str2);
        if (set != null) {
            z = set.contains(str);
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.T1
    public final synchronized void A4z(String str) {
        this.A00.remove(str);
    }

    @Override // com.facebook.ads.redexgen.X.T1
    public final synchronized void AJE(String str, String str2) {
        Set<String> set = this.A00.get(str2);
        if (set == null) {
            set = new HashSet<>();
            this.A00.put(str2, set);
        }
        set.add(str);
    }
}
