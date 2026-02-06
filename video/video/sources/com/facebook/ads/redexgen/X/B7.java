package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public final class B7 {
    public static byte[] A06;
    public static String[] A07 = {"eoBlep8s1FBIN6Rt", "z5PVad8lFvymSbVcRUVN6mCVOAyUTpZZ", "CSzRbjHFCczJ9I", "vibjkM4Umklha9WpeyLj2yq757BqeZSZ", "UWrS", "", "nE8lp", "HlO2gnmnWOpwEq19Q9DE2Hcik4TJ8nc9"};
    public static final B7 A08;
    @Nullable
    public AbstractC1832jM A01;
    @Nullable
    public Boolean A02;
    public volatile Map<String, Set<B0>> A04 = new HashMap();
    public final B6 A03 = new B6(this);
    public int A00 = 0;
    public volatile long A05 = -1;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A06 = new byte[]{C2638Cg0.p7, -71, -56, -75, -126, -72, -75, C2638Cg0.w7, -123, -72, -126, -75, C2638Cg0.w7, -123, -126, -72, -71, -73, C2638Cg0.r7, -72, -71, C2638Cg0.t7};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0C(boolean z, C1836jQ c1836jQ, EnumC1831jL enumC1831jL, String str, B0 b0) {
        if (A0I(z, c1836jQ) && A0G(str, c1836jQ)) {
            boolean z2 = true;
            synchronized (this) {
                if (this.A00 < c1836jQ.A07) {
                    Set<B0> set = this.A04.get(str);
                    if (set == null) {
                        set = A06();
                        this.A04.put(str, set);
                    }
                    if (set.contains(b0)) {
                        z2 = false;
                    } else if (((z && c1836jQ.A0N) || (!z && c1836jQ.A0M)) && set.size() < c1836jQ.A06) {
                        set.add(b0);
                        this.A00++;
                        z2 = false;
                    }
                }
                if (!z2) {
                    try {
                        this.A05 = SystemClock.elapsedRealtime();
                        b0.reset();
                        A03().A09(enumC1831jL, b0.hashCode());
                        this.A05 = -1L;
                        return;
                    } catch (IllegalStateException unused) {
                        A0B(str, b0);
                        this.A05 = -1L;
                    }
                }
            }
        }
        try {
            if (!c1836jQ.A0R || (!z && !c1836jQ.A0Q)) {
                b0.stop();
            }
        } finally {
            A03().A08(enumC1831jL, b0.hashCode());
            b0.AHb();
            A03().A07(enumC1831jL, b0.hashCode());
        }
    }

    static {
        A08();
        A08 = new B7();
    }

    private B0 A01(boolean z, C1836jQ c1836jQ, EnumC1831jL enumC1831jL, String str) throws C1828jI {
        if (A0I(z, c1836jQ) && A0G(str, c1836jQ)) {
            synchronized (this) {
                Set<B0> set = this.A04.get(str);
                if (set != null && !set.isEmpty()) {
                    this.A00--;
                    Iterator<B0> it = set.iterator();
                    B0 ret = it.next();
                    it.remove();
                    A03().A0A(z, str, enumC1831jL, ret.hashCode());
                    return ret;
                }
            }
        }
        try {
            C1829jJ A05 = A03().A05(z, str, enumC1831jL);
            B0 A01 = B6.A01(this.A03, z, str);
            A03().A06(A05, A01.hashCode());
            return A01;
        } catch (Exception e) {
            throw new C1828jI(str, e);
        }
    }

    public static B7 A02() {
        B7 b7 = A08;
        String[] strArr = A07;
        if (strArr[6].length() != strArr[4].length()) {
            String[] strArr2 = A07;
            strArr2[6] = "gdX1n";
            strArr2[4] = "uqN6";
            return b7;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC1832jM A03() {
        if (this.A01 != null) {
            return this.A01;
        }
        return CD.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<B0> A06() {
        if (this.A02 != null && this.A02.booleanValue()) {
            return new CopyOnWriteArraySet();
        }
        return new HashSet();
    }

    private void A09(AbstractC1832jM abstractC1832jM) {
        if (this.A01 == null) {
            this.A01 = abstractC1832jM;
        }
    }

    private void A0A(C1836jQ c1836jQ) {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(c1836jQ.A0S);
                    if (this.A02.booleanValue()) {
                        this.A04 = new ConcurrentHashMap();
                    }
                }
            }
        }
    }

    private void A0B(String str, B0 b0) {
        Set<B0> set = this.A04.get(str);
        if (set != null && set.remove(b0)) {
            int i = this.A00;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[1].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "FxBrmOrzGAHEl951IE67fieu752sH0JZ";
            strArr2[1] = "QwM4isUBZzXVsf3PyxWpFGvjBfZOcOMZ";
            this.A00 = i - 1;
        }
    }

    public static boolean A0E(String str) {
        return str.equals(A05(0, 22, 10));
    }

    public static boolean A0G(String str, C1836jQ c1836jQ) {
        if (A0E(str) && c1836jQ.A0C) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z, C1836jQ c1836jQ) {
        if (c1836jQ.A0E && this.A05 != -1 && SystemClock.elapsedRealtime() - this.A05 > 5000) {
            return false;
        }
        return A0J(z, c1836jQ);
    }

    public static boolean A0J(boolean z, C1836jQ c1836jQ) {
        return (z && c1836jQ.A0N) || (!z && c1836jQ.A0M);
    }

    public final B0 A0K(boolean z, C1836jQ c1836jQ, AbstractC1832jM abstractC1832jM, EnumC1831jL enumC1831jL, String str) throws C1828jI {
        A09(abstractC1832jM);
        A0A(c1836jQ);
        if (c1836jQ.A0K) {
            B0 A00 = B6.A00(this.A03, z, c1836jQ, enumC1831jL, str);
            String[] strArr = A07;
            if (strArr[5].length() != strArr[0].length()) {
                String[] strArr2 = A07;
                strArr2[3] = "ttyEUrXfsAwEm9Eniby4AXTGkmRMb34Z";
                strArr2[1] = "BAFCEyHtTeugEvQpUcdazZ0OUcRhptwZ";
                return A00;
            }
            throw new RuntimeException();
        }
        return A01(z, c1836jQ, enumC1831jL, str);
    }

    public final void A0L(boolean z, C1836jQ c1836jQ, AbstractC1832jM abstractC1832jM, EnumC1831jL enumC1831jL, String str, B0 b0) {
        A09(abstractC1832jM);
        if (c1836jQ.A0K) {
            B6.A06(this.A03, z, c1836jQ, enumC1831jL, str, b0);
        } else {
            A0C(z, c1836jQ, enumC1831jL, str, b0);
        }
    }
}
