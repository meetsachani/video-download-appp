package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import o.C2638Cg0;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.hm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1738hm implements QP {
    public static byte[] A01;
    public final /* synthetic */ C7M A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, C8077mf.q, C8077mf.q, 8, 7, C2638Cg0.r7, 4, C8077mf.A, C8077mf.A, 4, 6, C8077mf.m, C2638Cg0.r7, C8077mf.u, 17, C2638Cg0.r7, 4, C2638Cg0.r7, 6, C8077mf.m, C8077mf.n, C8077mf.q, 7, C2638Cg0.r7, C8077mf.D, C8077mf.m, C8077mf.n, 6, C8077mf.m, C2638Cg0.r7, C8077mf.n, C8077mf.z, C2638Cg0.r7, 17, C8077mf.u, C8077mf.A, C2638Cg0.r7, 7, 8, C8077mf.A, 4, 6, C8077mf.m, 8, 7, -35, C2638Cg0.r7, C2638Cg0.x7, C2638Cg0.v7, -44, -44, C2638Cg0.y7, -52, -120, -52, C2638Cg0.y7, -36, C2638Cg0.v7, C2638Cg0.x7, -48, -120, -41, -42, -120, C2638Cg0.v7, -42, -120, C2638Cg0.v7, -44, C2638Cg0.B7, C2638Cg0.y7, C2638Cg0.v7, -52, C2638Cg0.C7, -120, -52, C2638Cg0.y7, -36, C2638Cg0.v7, C2638Cg0.x7, -48, C2638Cg0.y7, -52, -120, C2638Cg0.x7, -48, -47, -44, -52, -120};
    }

    public C1738hm(C7M c7m) {
        this.A00 = c7m;
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void A4K(View view, int i, ViewGroup.LayoutParams layoutParams) {
        RK A0F = C7M.A0F(view);
        if (A0F != null) {
            if (A0F.A0i() || A0F.A0l()) {
                A0F.A0V();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + A0F + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void A5w(int i) {
        RK A0F;
        View view = A7H(i);
        if (view != null && (A0F = C7M.A0F(view)) != null) {
            if (!A0F.A0i() || A0F.A0l()) {
                A0F.A0Z(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + A0F + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final View A7H(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final int A7I() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final RK A7L(View view) {
        return C7M.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final int AA7(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void ADo(View view) {
        RK A0F = C7M.A0F(view);
        if (A0F != null) {
            A0F.A0D(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void AEa(View view) {
        RK A0F = C7M.A0F(view);
        if (A0F != null) {
            A0F.A0E(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void AIQ() {
        int A7I = A7I();
        for (int i = 0; i < A7I; i++) {
            View A7H = A7H(i);
            this.A00.A1g(A7H);
            A7H.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void AIW(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1f(view);
    }
}
