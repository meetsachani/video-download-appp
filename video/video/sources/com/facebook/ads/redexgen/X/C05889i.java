package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05889i extends C2201pc implements AnonymousClass24 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    @MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final SparseArray<Map<C2072nW, C2057nH>> A0E;
    public final SparseBooleanArray A0F;
    public static String[] A0G = {"aGn7PxmzFVI8pseTQREUgmPTmRn3c3Qe", "IWvjCaXZ0UNcR9QsrMbq4cwMoqcNO01w", "zzFjDnJDYUSk81dZD4bwc1a4UEkJCW7c", "AfyHMFnboWczrAj6gDYBkfictlCviIiz", "ZudaxJy5LTgucmpkRl3p1l6eoKWNEQ3P", "dJwbxLQye6WGEEeA8Aa4EZe7IW3A7RwI", "l9ypC7Hglf3jtTkN6zxYkfXofkc9mvwo", "bL7rVgPoAdAWEHuIi5lDma"};
    public static final C05889i A0J = new C2060nK().A0p();
    @Deprecated
    public static final C05889i A0I = A0J;
    public static final String A0W = C5C.A0h(1000);
    public static final String A0Q = C5C.A0h(1001);
    public static final String A0R = C5C.A0h(1002);
    public static final String A0T = C5C.A0h(1003);
    public static final String A0M = C5C.A0h(1004);
    public static final String A0N = C5C.A0h(1005);
    public static final String A0K = C5C.A0h(1006);
    public static final String A0V = C5C.A0h(1007);
    public static final String A0b = C5C.A0h(1008);
    public static final String A0O = C5C.A0h(1009);
    public static final String A0Z = C5C.A0h(1010);
    public static final String A0a = C5C.A0h(1011);
    public static final String A0Y = C5C.A0h(1012);
    public static final String A0X = C5C.A0h(1013);
    public static final String A0P = C5C.A0h(1014);
    public static final String A0L = C5C.A0h(1015);
    public static final String A0S = C5C.A0h(1016);
    public static final String A0U = C5C.A0h(1017);
    public static final AnonymousClass23<C05889i> A0H = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.nL
        @Override // com.facebook.ads.redexgen.X.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            C05889i A0p;
            A0p = new C2060nK(bundle).A0p();
            return A0p;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0M(SparseArray<Map<C2072nW, C2057nH>> sparseArray, SparseArray<Map<C2072nW, C2057nH>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
            if (indexOfKey < 0 || !A0O(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0O(Map<C2072nW, C2057nH> map, Map<C2072nW, C2057nH> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<C2072nW, C2057nH> entry : map.entrySet()) {
            C2072nW key = entry.getKey();
            if (!map2.containsKey(key) || !C5C.A1E(entry.getValue(), map2.get(key))) {
                return false;
            }
            while (r3.hasNext()) {
            }
        }
        return true;
    }

    public C05889i(C2060nK c2060nK) {
        super(c2060nK);
        this.A0C = C2060nK.A0Y(c2060nK);
        this.A06 = C2060nK.A0Z(c2060nK);
        this.A07 = C2060nK.A0a(c2060nK);
        this.A05 = C2060nK.A0b(c2060nK);
        this.A09 = C2060nK.A0c(c2060nK);
        this.A02 = C2060nK.A0d(c2060nK);
        this.A03 = C2060nK.A0e(c2060nK);
        this.A00 = C2060nK.A0f(c2060nK);
        this.A01 = C2060nK.A0g(c2060nK);
        this.A08 = C2060nK.A0h(c2060nK);
        this.A0B = C2060nK.A0i(c2060nK);
        this.A0D = C2060nK.A0j(c2060nK);
        this.A04 = C2060nK.A0k(c2060nK);
        this.A0E = C2060nK.A0P(c2060nK);
        this.A0F = C2060nK.A0Q(c2060nK);
        this.A0A = C2060nK.A0l(c2060nK);
    }

    public static C05889i A02(Context context) {
        return new C2060nK(context).A0p();
    }

    public static /* synthetic */ String A0B() {
        String str = A0Z;
        String[] strArr = A0G;
        if (strArr[0].charAt(18) != strArr[1].charAt(18)) {
            A0G[2] = "q21ODw35C4tKhNLL23C7ozdatpTCdbhY";
            return str;
        }
        throw new RuntimeException();
    }

    public static /* synthetic */ String A0C() {
        String str = A0a;
        if (A0G[2].charAt(14) != 'E') {
            String[] strArr = A0G;
            strArr[3] = "0vyQVqHCYWPXhQOTbdu3xGlynIqeANBb";
            strArr[6] = "GRyh1cWelO50ilzlDGPvyp85W4uMwhgp";
            return str;
        }
        throw new RuntimeException();
    }

    public static /* synthetic */ String A0H() {
        String str = A0P;
        String[] strArr = A0G;
        if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[7] = "pTwWTj5vm";
        return str;
    }

    public static /* synthetic */ String A0J() {
        String str = A0M;
        String[] strArr = A0G;
        if (strArr[3].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A0G[7] = "PzaI";
        return str;
    }

    public static boolean A0N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final C2060nK A0P() {
        return new C2060nK(this);
    }

    @Deprecated
    public final C2057nH A0Q(int i, C2072nW c2072nW) {
        Map<C2072nW, C2057nH> map = this.A0E.get(i);
        if (map != null) {
            return map.get(c2072nW);
        }
        return null;
    }

    public final boolean A0R(int i) {
        return this.A0F.get(i);
    }

    @Deprecated
    public final boolean A0S(int i, C2072nW c2072nW) {
        Map<C2072nW, C2057nH> map = this.A0E.get(i);
        return map != null && map.containsKey(c2072nW);
    }

    @Override // com.facebook.ads.redexgen.X.C2201pc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A0G;
            if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[0] = "DcJRbXEfPLE5m3v2P2UTupH85cHshXE1";
            strArr2[1] = "UExlWRKDpxUDxSKj0OTM8Ioa8cI6hcv0";
            if (cls == cls2) {
                C05889i c05889i = (C05889i) obj;
                if (super.equals(c05889i) && this.A0C == c05889i.A0C && this.A06 == c05889i.A06 && this.A07 == c05889i.A07 && this.A05 == c05889i.A05 && this.A09 == c05889i.A09 && this.A02 == c05889i.A02 && this.A03 == c05889i.A03 && this.A00 == c05889i.A00 && this.A01 == c05889i.A01 && this.A08 == c05889i.A08 && this.A0B == c05889i.A0B && this.A0D == c05889i.A0D && this.A04 == c05889i.A04 && A0N(this.A0F, c05889i.A0F) && A0M(this.A0E, c05889i.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C2201pc
    public final int hashCode() {
        int result = super.hashCode();
        int result2 = this.A06 ? 1 : 0;
        int result3 = this.A05 ? 1 : 0;
        int result4 = this.A02 ? 1 : 0;
        int result5 = this.A00 ? 1 : 0;
        int result6 = this.A08 ? 1 : 0;
        int result7 = this.A0D ? 1 : 0;
        return (((((((((((((((((((((((((((1 * 31) + result) * 31) + (this.A0C ? 1 : 0)) * 31) + result2) * 31) + (this.A07 ? 1 : 0)) * 31) + result3) * 31) + (this.A09 ? 1 : 0)) * 31) + result4) * 31) + (this.A03 ? 1 : 0)) * 31) + result5) * 31) + (this.A01 ? 1 : 0)) * 31) + result6) * 31) + (this.A0B ? 1 : 0)) * 31) + result7) * 31) + (this.A04 ? 1 : 0);
    }
}
