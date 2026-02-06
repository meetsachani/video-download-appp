package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.2y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04302y {
    public final Uri A00;
    public final List<Integer> A01;
    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;
    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;
    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C04302y(C04292x c04292x) {
        boolean z;
        boolean z2;
        UUID uuid;
        Uri uri;
        Map<String, String> map;
        Map<String, String> map2;
        boolean z3;
        boolean z4;
        boolean z5;
        List<Integer> list;
        List<Integer> list2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        Uri uri2;
        z = c04292x.A04;
        if (z) {
            uri2 = c04292x.A00;
            if (uri2 == null) {
                z2 = false;
                AbstractC04543y.A08(z2);
                uuid = c04292x.A03;
                this.A05 = (UUID) AbstractC04543y.A01(uuid);
                this.A06 = this.A05;
                uri = c04292x.A00;
                this.A00 = uri;
                map = c04292x.A02;
                this.A04 = map;
                map2 = c04292x.A02;
                this.A03 = map2;
                z3 = c04292x.A05;
                this.A08 = z3;
                z4 = c04292x.A04;
                this.A07 = z4;
                z5 = c04292x.A06;
                this.A09 = z5;
                list = c04292x.A01;
                this.A02 = list;
                list2 = c04292x.A01;
                this.A01 = list2;
                bArr = c04292x.A07;
                if (bArr == null) {
                    bArr3 = c04292x.A07;
                    bArr4 = c04292x.A07;
                    bArr2 = Arrays.copyOf(bArr3, bArr4.length);
                } else {
                    bArr2 = null;
                }
                this.A0A = bArr2;
            }
        }
        z2 = true;
        AbstractC04543y.A08(z2);
        uuid = c04292x.A03;
        this.A05 = (UUID) AbstractC04543y.A01(uuid);
        this.A06 = this.A05;
        uri = c04292x.A00;
        this.A00 = uri;
        map = c04292x.A02;
        this.A04 = map;
        map2 = c04292x.A02;
        this.A03 = map2;
        z3 = c04292x.A05;
        this.A08 = z3;
        z4 = c04292x.A04;
        this.A07 = z4;
        z5 = c04292x.A06;
        this.A09 = z5;
        list = c04292x.A01;
        this.A02 = list;
        list2 = c04292x.A01;
        this.A01 = list2;
        bArr = c04292x.A07;
        if (bArr == null) {
        }
        this.A0A = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C04302y) {
            C04302y c04302y = (C04302y) obj;
            if (this.A05.equals(c04302y.A05) && C5C.A1E(this.A00, c04302y.A00) && C5C.A1E(this.A03, c04302y.A03) && this.A08 == c04302y.A08 && this.A07 == c04302y.A07 && this.A09 == c04302y.A09 && this.A01.equals(c04302y.A01) && Arrays.equals(this.A0A, c04302y.A0A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A05.hashCode();
        int i = result * 31;
        int result2 = this.A00 != null ? this.A00.hashCode() : 0;
        int result3 = this.A08 ? 1 : 0;
        int result4 = this.A09 ? 1 : 0;
        int result5 = Arrays.hashCode(this.A0A);
        return ((((((((((((i + result2) * 31) + this.A03.hashCode()) * 31) + result3) * 31) + (this.A07 ? 1 : 0)) * 31) + result4) * 31) + this.A01.hashCode()) * 31) + result5;
    }
}
