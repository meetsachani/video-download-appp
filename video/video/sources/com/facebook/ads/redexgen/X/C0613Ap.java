package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ap  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0613Ap implements InterfaceC2288rI {
    public final /* synthetic */ C0612Ao A00;

    public C0613Ap(C0612Ao c0612Ao) {
        this.A00 = c0612Ao;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2288rI
    public final void AFq() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList<Runnable> arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC2288rI interfaceC2288rI;
        InterfaceC2288rI interfaceC2288rI2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        for (Runnable runnable2 : arrayList) {
            runnable2.run();
        }
        interfaceC2288rI = this.A00.A01;
        if (interfaceC2288rI != null) {
            interfaceC2288rI2 = this.A00.A01;
            interfaceC2288rI2.AFq();
        }
    }
}
