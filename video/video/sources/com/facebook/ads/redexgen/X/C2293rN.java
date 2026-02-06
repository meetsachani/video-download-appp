package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.rN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2293rN<ModelType, StateType> {
    public static byte[] A0A;
    public static final C2293rN A0B;
    public EnumC2294rO A00;
    public EnumC2284rE A01;
    public String A02;
    public boolean A03;
    public final boolean A04;
    public final C2293rN A05;
    public final ModelType A06;
    public final StateType A07;
    public final String A08;
    public final List<InterfaceC2298rS<ModelType, StateType>> A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{78, 113, 125, 111, 104, 119, 113, 118, 108, 92, 121, 108, 121, 56, 107, 112, 119, 109, 116, 124, 56, 118, 119, 108, 56, 123, 119, 118, 108, 121, 113, 118, 56, 121, 56, 110, 113, 125, 111, 56, 121, 107, 56, 117, 119, 124, 125, 116, 83, 91, 70, 66, 79};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A03(InterfaceC2283rD interfaceC2283rD) {
        for (InterfaceC2298rS<ModelType, StateType> interfaceC2298rS : this.A09) {
            interfaceC2298rS.A6R(this, interfaceC2283rD);
        }
        EnumC2284rE A9U = interfaceC2283rD.A9U(this);
        this.A01 = A9U;
        if (A9U == EnumC2284rE.A02) {
            this.A03 = true;
        }
    }

    static {
        A02();
        A0B = new C2293rN(null, null, A01(48, 5, 44), A01(48, 5, 44), Collections.emptyList(), A0B, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2293rN(C2295rP<ModelType, StateType> c2295rP) {
        this(r1, r2, r3, r4, r5, C2295rP.A00(c2295rP), C2295rP.A05(c2295rP));
        List A04;
        Object A01 = C2295rP.A01(c2295rP);
        Object A02 = C2295rP.A02(c2295rP);
        String A03 = C2295rP.A03(c2295rP);
        String A032 = C2295rP.A03(c2295rP);
        if (C2295rP.A04(c2295rP) == null) {
            A04 = Collections.emptyList();
        } else {
            A04 = C2295rP.A04(c2295rP);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C2293rN(ModelType modeltype, StateType statetype, String str, String str2, List<InterfaceC2298rS<ModelType, StateType>> list, C2293rN c2293rN, boolean z) {
        this.A00 = EnumC2294rO.A02;
        if (!(modeltype instanceof View)) {
            this.A06 = modeltype;
            this.A07 = statetype;
            this.A08 = str;
            this.A02 = str2;
            this.A05 = c2293rN;
            this.A03 = false;
            this.A09 = list;
            this.A04 = z;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 2));
    }

    public static <ModelType, StateType> C2295rP<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C2295rP<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A03;
    }
}
