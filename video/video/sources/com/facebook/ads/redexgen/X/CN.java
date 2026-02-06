package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network/classes2.dex */
public class CN implements InterfaceC1625fw {
    public final /* synthetic */ C2U A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public CN(C2U c2u, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c2u;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1625fw
    public final void ADR(InterfaceC1623fu interfaceC1623fu) {
        C2U.A06(interfaceC1623fu.A73(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1625fw
    public final void ADq(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
