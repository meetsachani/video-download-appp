package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.1u  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04021u implements InterfaceC0609Al {
    public static byte[] A09;
    public static String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final String A0B;
    public long A00;
    public InterfaceC2290rK A01;
    public final InterfaceC2289rJ A02;
    public final C2281rB A03;
    public final C2281rB A04;
    public final List<Rect> A05;
    public final Map<String, C2280rA> A06;
    public final boolean A07;
    public final boolean A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A03() {
        A09 = new byte[]{C8077mf.x, 40, C3307Iz.a0, 51, 96, 54, C3307Iz.a0, C3307Iz.X, 55, 48, 47, C3307Iz.a0, C3307Iz.f0, 52, 96, 40, C3307Iz.V, 51, 96, C3307Iz.f0, 47, 52, 96, 34, C3307Iz.X, C3307Iz.X, C3307Iz.f0, 96, C3307Iz.e0, C3307Iz.X, C3307Iz.V, 51, 53, 50, C3307Iz.X, 36, 96, 47, 50, 96, C3307Iz.a0, 51, 96, C3307Iz.V, 96, C3307Iz.Z, 50, 47, 53, 48, 96, 55, 40, C3307Iz.a0, 35, 40, 96, 55, C3307Iz.a0, C3307Iz.d0, C3307Iz.d0, 96, C3307Iz.f0, C3307Iz.X, 54, C3307Iz.X, 50, 96, 50, C3307Iz.X, 52, 53, 50, C3307Iz.f0, 96, C3307Iz.V, 96, C3307Iz.e0, C3307Iz.X, C3307Iz.V, 51, 53, 50, C3307Iz.X, C3307Iz.e0, C3307Iz.X, C3307Iz.f0, 52, 96, 51, C3307Iz.a0, C3307Iz.f0, 35, C3307Iz.X, 96, C3307Iz.a0, 52, 103, 51, 96, C3307Iz.e0, C3307Iz.V, 36, C3307Iz.X, 96, 53, 48, 96, 47, C3307Iz.Y, 96, 51, 53, 34, 54, C3307Iz.a0, C3307Iz.X, 55, 51, 96, 52, 40, C3307Iz.V, 52, 96, 35, 47, 53, C3307Iz.d0, 36, 96, 34, C3307Iz.X, 96, 47, C3307Iz.Y, C3307Iz.Y, 51, 35, 50, C3307Iz.X, C3307Iz.X, C3307Iz.f0, C8077mf.r, C8077mf.E, 9, C3307Iz.e0, C8077mf.G, 31, C8077mf.r, C4715Xk.i, C3307Iz.Y, ED2.a, ED2.a, 115, C3307Iz.X, 58, 54, 36, 115, 35, C3307Iz.V, 60, 35, 54, C3307Iz.V, C3307Iz.Z, 42, 115, 53, 60, C3307Iz.V, 115, C3307Iz.V, 54, 62, 60, C3307Iz.X, 54, 55, 115, 58, C3307Iz.Z, 54, 62, 115, C8077mf.H, 2, C8077mf.m, C8077mf.C, ED2.a, 8, C8077mf.G, 2, 31, C8077mf.C};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0609Al
    public final void A6P(List<C2293rN<?, ?>> list) {
        if (list != null && !list.isEmpty()) {
            A06(list);
        }
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            new C2279r9(toString(), this, this.A05, C2281rB.A03(this.A04), C2281rB.A03(this.A03));
            throw new NullPointerException(A02(C3503Kz.g0, 7, 55));
        }
    }

    static {
        A03();
        A0B = C04021u.class.getSimpleName();
    }

    public C04021u(InterfaceC2289rJ interfaceC2289rJ) {
        this(interfaceC2289rJ, false, false);
    }

    public C04021u(InterfaceC2289rJ interfaceC2289rJ, boolean z, boolean z2) {
        this.A06 = new HashMap();
        this.A04 = new C2281rB();
        this.A03 = new C2281rB();
        this.A05 = new ArrayList(1);
        this.A02 = interfaceC2289rJ;
        this.A08 = z;
        this.A07 = z2;
    }

    public static Rect A00(C2280rA c2280rA) {
        if (c2280rA != null && C2280rA.A00(c2280rA).top != Integer.MIN_VALUE && C2280rA.A00(c2280rA).left != Integer.MIN_VALUE && C2280rA.A00(c2280rA).right != Integer.MIN_VALUE && C2280rA.A00(c2280rA).bottom != Integer.MIN_VALUE) {
            return C2280rA.A00(c2280rA);
        }
        throw new IllegalStateException(A02(0, C3503Kz.g0, 9));
    }

    private C2280rA A01(C2293rN c2293rN, Rect rect, Rect rect2) {
        C2280rA c2280rA = this.A06.get(c2293rN.A02);
        if (C2281rB.A07(this.A04, c2293rN)) {
            if (c2280rA == null) {
                c2280rA = C2280rA.A04(this.A00);
                this.A06.put(c2293rN.A02, c2280rA);
            } else {
                C2280rA.A02(c2280rA, EnumC2284rE.A04);
            }
        }
        if (c2280rA != null) {
            C2280rA.A00(c2280rA).set(rect2);
            C2280rA.A05(c2280rA).add(new Rect(rect));
        }
        return c2280rA;
    }

    private void A04(C2281rB c2281rB) {
        for (C2293rN c2293rN : C2281rB.A02(c2281rB)) {
            C2280rA c2280rA = this.A06.get(c2293rN.A02);
            if (c2280rA != null) {
                C2280rA.A02(c2280rA, EnumC2284rE.A03);
                C2280rA.A05(c2280rA).clear();
                if (A07(c2293rN)) {
                    c2293rN.A03(this);
                }
                if (this.A08) {
                    this.A06.remove(c2280rA);
                }
            } else if (0 != 0) {
                String str = A02(150, 36, 26) + c2293rN.A02;
                throw new NullPointerException(A02(C10997yd1.Q1, 10, 36));
            }
        }
    }

    private void A05(C2281rB c2281rB) {
        for (C2293rN visible : C2281rB.A03(c2281rB)) {
            if (A07(visible)) {
                visible.A03(this);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(List<C2293rN<?, ?>> list) {
        for (C2293rN<?, ?> c2293rN : list) {
            if (this.A06.get(c2293rN.A02) != null) {
                boolean z = c2293rN.A04;
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[7] = "nPwsVC";
                if (z) {
                    EnumC2284rE enumC2284rE = c2293rN.A01;
                    String[] strArr = A0A;
                    if (strArr[5].length() != strArr[6].length()) {
                        A0A[0] = "zj";
                        if (enumC2284rE != null) {
                            if (c2293rN.A01 == EnumC2284rE.A03) {
                                c2293rN.A03(this);
                            }
                        }
                    } else {
                        String[] strArr2 = A0A;
                        strArr2[4] = "4Gl";
                        strArr2[2] = "t26";
                        if (enumC2284rE != null) {
                            if (c2293rN.A01 == EnumC2284rE.A03) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public static boolean A07(C2293rN<?, ?> c2293rN) {
        if (c2293rN.A04) {
            EnumC2294rO enumC2294rO = c2293rN.A00;
            EnumC2294rO enumC2294rO2 = EnumC2294rO.A04;
            String[] strArr = A0A;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0A[7] = "iICfc1p4CYNR1vFaz";
            if (enumC2294rO == enumC2294rO2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
        if (r4 != false) goto L22;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0609Al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A46(C2293rN c2293rN, Rect rect, Rect rect2, boolean z) {
        A01(c2293rN, rect, rect2);
        C2293rN c2293rN2 = c2293rN.A05;
        C2293rN parentViewpointData = C2293rN.A0B;
        if (c2293rN2 != parentViewpointData && c2293rN2 != null) {
            boolean A07 = C2281rB.A07(this.A03, c2293rN2);
            C2280rA c2280rA = this.A06.get(c2293rN2.A02);
            if (A07) {
                if (c2280rA != null) {
                    C2280rA.A05(c2280rA).clear();
                    if (this.A07) {
                        boolean A04 = c2293rN2.A04();
                        if (A0A[0].length() != 2) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0A;
                        strArr[5] = "H54AceamXdthsYm78mtSydojeY2Fx6Sn";
                        strArr[6] = "PVfiJKIqQ6L9JP1UYx1CLIU2NiQOo1Yq";
                    }
                    EnumC2284rE enumC2284rE = EnumC2284rE.A04;
                    if (A0A[7].length() == 26) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0A;
                    strArr2[5] = "tsuWg7tiHeCbTZ79GKvfVJLQxaexBCGH";
                    strArr2[6] = "f1Y9d3aTAam6AIKjxx39fqUFlMtOCeIE";
                    C2280rA.A02(c2280rA, enumC2284rE);
                } else {
                    c2280rA = C2280rA.A04(this.A00);
                    C2280rA.A00(c2280rA).set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    this.A06.put(c2293rN2.A02, c2280rA);
                }
                if (z) {
                    C2280rA.A00(c2280rA).set(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
            } else if (z && c2280rA != null) {
                C2280rA.A00(c2280rA).set(Math.min(rect2.left, C2280rA.A00(c2280rA).left), Math.min(rect2.top, C2280rA.A00(c2280rA).top), Math.max(rect2.right, C2280rA.A00(c2280rA).right), Math.max(rect2.bottom, C2280rA.A00(c2280rA).bottom));
            }
            if (c2280rA == null) {
                return;
            }
            C2280rA.A05(c2280rA).add(new Rect(rect));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0609Al
    public final void A4h(long j, List<Rect> list) {
        this.A00 = j;
        this.A05.clear();
        Iterator<Rect> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (hasNext) {
                this.A05.add(new Rect(it.next()));
            } else {
                Iterator it2 = C2281rB.A02(this.A04).iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!hasNext2) {
                            break;
                        }
                        this.A06.remove(((C2293rN) it2.next()).A02);
                    } else if (!hasNext2) {
                        break;
                    } else {
                        this.A06.remove(((C2293rN) it2.next()).A02);
                    }
                }
                Collection<C2293rN> A02 = C2281rB.A02(this.A03);
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[0] = "Au";
                for (C2293rN viewpointData : A02) {
                    this.A06.remove(viewpointData.A02);
                }
                for (C2280rA c2280rA : this.A06.values()) {
                    C2280rA.A05(c2280rA).clear();
                }
                C2281rB.A05(this.A04);
                C2281rB.A05(this.A03);
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2283rD
    public final void A8D(C2293rN c2293rN, Rect rect) {
        if (!this.A06.containsKey(c2293rN.A02)) {
            return;
        }
        rect.setEmpty();
        for (Rect rect2 : C2280rA.A05(this.A06.get(c2293rN.A02))) {
            if (A0A[7].length() == 26) {
                throw new RuntimeException();
            }
            A0A[7] = "8y";
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2283rD
    public final EnumC2284rE A9U(C2293rN c2293rN) {
        if (!this.A06.containsKey(c2293rN.A02)) {
            return EnumC2284rE.A02;
        }
        EnumC2284rE A01 = C2280rA.A01(this.A06.get(c2293rN.A02));
        if (c2293rN.A04) {
            if (c2293rN.A00 == EnumC2294rO.A04) {
                EnumC2284rE viewState = EnumC2284rE.A03;
                return viewState;
            }
            EnumC2284rE viewState2 = EnumC2284rE.A04;
            if (A01 == viewState2 && !c2293rN.A04()) {
                EnumC2284rE viewState3 = EnumC2284rE.A02;
                return viewState3;
            }
        }
        return A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2283rD
    public final void A9W(Rect rect) {
        rect.setEmpty();
        for (Rect rect2 : this.A05) {
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2283rD
    public final float A9X(C2293rN c2293rN) {
        C2280rA c2280rA = this.A06.get(c2293rN.A02);
        if (c2280rA != null) {
            Rect A00 = A00(c2280rA);
            int height = A00.height() * A00.width();
            int totalVisibleArea = 0;
            for (Rect rect : C2280rA.A05(c2280rA)) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / height;
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0609Al
    public final void AJu(InterfaceC2290rK interfaceC2290rK) {
        this.A01 = interfaceC2290rK;
    }
}
