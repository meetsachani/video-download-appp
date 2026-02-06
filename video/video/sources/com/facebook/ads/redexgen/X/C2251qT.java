package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import o.C10323vs;

/* renamed from: com.facebook.ads.redexgen.X.qT */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2251qT implements AnonymousClass24 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final boolean A04;
    public final int[] A05;
    public final long[] A06;
    public final Uri[] A07;
    public static String[] A08 = {"OkxecgD0Gv2GK", "dTJXSSjTvXtvCpVWxsqZ6", "wYzs5zgiK5G18", "klAEANkVopL6T8N0G4GCOYVrDlyPlXqI", "4WcRthq3aJhjltodanyM1lxGrZBe12qe", "Nzs6zPyAK9Q7ZYWQPcJbQV1Iqfi6la98", "CqWpbShPfJkKIhE6JIbgz0xValvGrdcB", "ap1AkjUIhWjw5r6nQb"};
    public static final String A0G = C5C.A0h(0);
    public static final String A0B = C5C.A0h(1);
    public static final String A0H = C5C.A0h(2);
    public static final String A0F = C5C.A0h(3);
    public static final String A0C = C5C.A0h(4);
    public static final String A0A = C5C.A0h(5);
    public static final String A0D = C5C.A0h(6);
    public static final String A0E = C5C.A0h(7);
    public static final AnonymousClass23<C2251qT> A09 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qU
        @Override // com.facebook.ads.redexgen.X.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2251qT.A01(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2251qT A00(Bundle bundle) {
        long j = bundle.getLong(A0G);
        int i = bundle.getInt(A0B);
        int i2 = bundle.getInt(A0E);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A0H);
        int[] intArray = bundle.getIntArray(A0F);
        long[] longArray = bundle.getLongArray(A0C);
        long j2 = bundle.getLong(A0A);
        boolean z = bundle.getBoolean(A0D);
        if (intArray == null) {
            intArray = new int[0];
        }
        Uri[] uriArr = new Uri[0];
        String[] strArr = A08;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[2] = "h5Cz72DlneqkJ";
        strArr2[0] = "HzHttfqxNoxwC";
        if (parcelableArrayList != null) {
            uriArr = (Uri[]) parcelableArrayList.toArray(uriArr);
        }
        if (longArray == null) {
            longArray = new long[0];
        }
        return new C2251qT(j, i, i2, intArray, uriArr, longArray, j2, z);
    }

    public static /* synthetic */ C2251qT A01(Bundle bundle) {
        return A00(bundle);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final C2251qT A06(int i) {
        int[] A02 = A02(this.A05, i);
        long[] A03 = A03(this.A06, i);
        return new C2251qT(this.A03, i, this.A01, A02, (Uri[]) Arrays.copyOf(this.A07, i), A03, this.A02, this.A04);
    }

    public C2251qT(long j) {
        this(j, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public C2251qT(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        AbstractC04543y.A07(iArr.length == uriArr.length);
        this.A03 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = iArr;
        this.A07 = uriArr;
        this.A06 = jArr;
        this.A02 = j2;
        this.A04 = z;
    }

    public static int[] A02(int[] iArr, int i) {
        int length = iArr.length;
        int max = Math.max(i, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        return copyOf;
    }

    public static long[] A03(long[] jArr, int i) {
        int length = jArr.length;
        int max = Math.max(i, length);
        long[] copyOf = Arrays.copyOf(jArr, max);
        Arrays.fill(copyOf, length, max, (long) C10323vs.b);
        return copyOf;
    }

    public final int A04() {
        return A05(-1);
    }

    public final int A05(int i) {
        int i2 = i + 1;
        while (true) {
            int[] iArr = this.A05;
            String[] strArr = A08;
            String str = strArr[3];
            String str2 = strArr[4];
            int charAt = str.charAt(30);
            int nextAdIndexToPlay = str2.charAt(30);
            if (charAt == nextAdIndexToPlay) {
                A08[6] = "Wtq62hhDQ1jo9VyQ6cIhlPoFSuywDvdH";
                int nextAdIndexToPlay2 = iArr.length;
                if (i2 >= nextAdIndexToPlay2 || this.A04) {
                    break;
                }
                int nextAdIndexToPlay3 = this.A05[i2];
                if (nextAdIndexToPlay3 == 0 || this.A05[i2] == 1) {
                    break;
                }
                i2++;
            } else {
                throw new RuntimeException();
            }
        }
        return i2;
    }

    /* JADX WARN: Incorrect condition in loop: B:26:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A07() {
        if (this.A00 == -1) {
            return true;
        }
        for (int i = 0; i < i; i++) {
            int i2 = this.A05[i];
            if (i2 != 0) {
                int i3 = this.A05[i];
                if (i3 != 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A08() {
        return this.A00 == -1 || A04() < this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2251qT c2251qT = (C2251qT) obj;
        if (this.A03 == c2251qT.A03 && this.A00 == c2251qT.A00 && this.A01 == c2251qT.A01 && Arrays.equals(this.A07, c2251qT.A07) && Arrays.equals(this.A05, c2251qT.A05) && Arrays.equals(this.A06, c2251qT.A06)) {
            long j = this.A02;
            if (A08[5].charAt(25) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[3] = "oTIVhrwO4wW48XZtZFkmZHaHYFeLbVqJ";
            strArr[4] = "xLWtDigMD9KXXhkKgPNBVDDiVfKu3Nqc";
            if (j == c2251qT.A02 && this.A04 == c2251qT.A04) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i = result * 31;
        int result2 = this.A01;
        int result3 = (((i + result2) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31;
        int result4 = Arrays.hashCode(this.A07);
        int result5 = Arrays.hashCode(this.A06);
        int result6 = (((((((result3 + result4) * 31) + Arrays.hashCode(this.A05)) * 31) + result5) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31;
        int result7 = this.A04 ? 1 : 0;
        return result6 + result7;
    }
}
