package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.rP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2295rP<ModelType, StateType> {
    public final ModelType A03;
    public final StateType A04;
    public final String A05;
    public final String A06;
    public List<InterfaceC2298rS<ModelType, StateType>> A01 = null;
    public C2293rN A00 = C2293rN.A0B;
    public boolean A02 = false;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C2295rP(ModelType model, StateType state, String str) {
        this.A03 = model;
        this.A04 = state;
        this.A06 = str;
        this.A05 = str;
    }

    public static /* synthetic */ C2293rN A00(C2295rP c2295rP) {
        return c2295rP.A00;
    }

    public static /* synthetic */ Object A01(C2295rP c2295rP) {
        return c2295rP.A03;
    }

    public static /* synthetic */ Object A02(C2295rP c2295rP) {
        return c2295rP.A04;
    }

    public static /* synthetic */ String A03(C2295rP c2295rP) {
        return c2295rP.A06;
    }

    public static /* synthetic */ List A04(C2295rP c2295rP) {
        return c2295rP.A01;
    }

    public static /* synthetic */ boolean A05(C2295rP c2295rP) {
        return c2295rP.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rS != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C2295rP<ModelType, StateType> A06(InterfaceC2298rS<ModelType, StateType> interfaceC2298rS) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC2298rS);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C2293rN<ModelType, StateType> A07() {
        return new C2293rN<>(this);
    }
}
