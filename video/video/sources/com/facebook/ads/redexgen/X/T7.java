package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;
import o.C10901yE;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class T7 {
    public static String[] A00 = {"WfUJfZecOVcHzzrBpx92ELEjWhu2m", "ABQQ5taiOepRv8Mi5iWio7B3aVpn", "lqinWbZDhv0Ny2jUIa5P6Phm3DGMmF2T", "dPu2X3zgdKacWkfyqxYrIyrhes", "b2oe8Nr0EFLLItrmCHMxvIgMHIYOeqfq", C10901yE.i, "yKBaB64vFuTn7zYoCnuYBPVEHVJ9GNEq", ""};
    public static final AtomicReference<C1669ge> A01 = new AtomicReference<>();

    public static C1669ge A00() {
        AtomicReference<C1669ge> atomicReference = A01;
        if (A00[2].charAt(13) != '2') {
            throw new RuntimeException();
        }
        A00[3] = "t";
        return atomicReference.get();
    }

    public static void A01(C1669ge c1669ge) {
        if (c1669ge == null) {
            return;
        }
        AbstractC0611An.A00(A01, null, c1669ge);
    }
}
