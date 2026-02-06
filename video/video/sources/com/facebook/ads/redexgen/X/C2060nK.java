package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.nK */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2060nK extends C04373h {
    public static String[] A0G = {"svIlLfjydeGBu6G0UjrHSopJ4Ky0wypW", "Eix0ooWKKyHx1hOwK", "jEg8xHvrvI0NXBTEehRxqQQjEYaTbIQI", "2fo", "JdZ", "dfBQZRQYRFpeihXeeCDcyjRnxunK4YCt", "ZC", "go43CHW4mwtjJCZZxmpd9eXXAUtGDH29"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    @MetaExoPlayerCustomization("D25277746 - If all qualities are filtered out, do not use a fixed selection but differ to adaptive track selection in hero.")
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final SparseArray<Map<C2072nW, C2057nH>> A0E;
    public final SparseBooleanArray A0F;

    @Deprecated
    public C2060nK() {
        this.A0E = new SparseArray<>();
        this.A0F = new SparseBooleanArray();
        A0W();
    }

    public C2060nK(Context context) {
        super(context);
        this.A0E = new SparseArray<>();
        this.A0F = new SparseBooleanArray();
        A0W();
    }

    @MetaExoPlayerCustomization("Modified to support setExceedRendererCapabilitiesIfAllFilteredOut")
    public C2060nK(Bundle bundle) {
        super(bundle);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        A0W();
        C05889i c05889i = C05889i.A0J;
        str = C05889i.A0W;
        A17(bundle.getBoolean(str, c05889i.A0C));
        str2 = C05889i.A0Q;
        A11(bundle.getBoolean(str2, c05889i.A06));
        str3 = C05889i.A0R;
        A12(bundle.getBoolean(str3, c05889i.A07));
        A10(bundle.getBoolean(C05889i.A0H(), c05889i.A05));
        str4 = C05889i.A0T;
        A14(bundle.getBoolean(str4, c05889i.A09));
        A0x(bundle.getBoolean(C05889i.A0J(), c05889i.A02));
        str5 = C05889i.A0N;
        A0y(bundle.getBoolean(str5, c05889i.A03));
        str6 = C05889i.A0K;
        A0v(bundle.getBoolean(str6, c05889i.A00));
        str7 = C05889i.A0L;
        A0w(bundle.getBoolean(str7, c05889i.A01));
        str8 = C05889i.A0S;
        A13(bundle.getBoolean(str8, c05889i.A08));
        str9 = C05889i.A0V;
        A16(bundle.getBoolean(str9, c05889i.A0B));
        str10 = C05889i.A0b;
        A18(bundle.getBoolean(str10, c05889i.A0D));
        str11 = C05889i.A0O;
        A0z(bundle.getBoolean(str11, c05889i.A04));
        str12 = C05889i.A0U;
        A15(bundle.getBoolean(str12, c05889i.A0A));
        this.A0E = new SparseArray<>();
        A0X(bundle);
        str13 = C05889i.A0X;
        this.A0F = A0R(bundle.getIntArray(str13));
    }

    @MetaExoPlayerCustomization("To support exceedRendererCapabilitiesIfAllFilteredOut")
    public C2060nK(C05889i c05889i) {
        super(c05889i);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.A0C = c05889i.A0C;
        this.A06 = c05889i.A06;
        this.A07 = c05889i.A07;
        this.A05 = c05889i.A05;
        this.A09 = c05889i.A09;
        this.A02 = c05889i.A02;
        this.A03 = c05889i.A03;
        this.A00 = c05889i.A00;
        this.A01 = c05889i.A01;
        this.A08 = c05889i.A08;
        this.A0B = c05889i.A0B;
        this.A0D = c05889i.A0D;
        this.A04 = c05889i.A04;
        this.A0A = c05889i.A0A;
        sparseArray = c05889i.A0E;
        this.A0E = A0G(sparseArray);
        sparseBooleanArray = c05889i.A0F;
        this.A0F = sparseBooleanArray.clone();
    }

    public static SparseArray<Map<C2072nW, C2057nH>> A0G(SparseArray<Map<C2072nW, C2057nH>> sparseArray) {
        SparseArray<Map<C2072nW, C2057nH>> sparseArray2 = new SparseArray<>();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    private SparseBooleanArray A0R(int[] iArr) {
        if (iArr == null) {
            return new SparseBooleanArray();
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
        for (int i : iArr) {
            sparseBooleanArray.append(i, true);
        }
        return sparseBooleanArray;
    }

    @MetaExoPlayerCustomization("To support setting exceedRendererCapabilitiesIfAllFilteredOut")
    private void A0W() {
        this.A0C = true;
        this.A06 = false;
        this.A07 = true;
        this.A05 = false;
        this.A09 = true;
        this.A02 = false;
        this.A03 = false;
        this.A00 = false;
        this.A01 = false;
        this.A08 = true;
        this.A0B = true;
        this.A0D = false;
        this.A04 = true;
        this.A0A = false;
    }

    private void A0X(Bundle bundle) {
        BP A01;
        String str;
        SparseArray A00;
        int[] intArray = bundle.getIntArray(C05889i.A0B());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C05889i.A0C());
        if (parcelableArrayList == null) {
            A01 = BP.A03();
        } else {
            AnonymousClass23<C2072nW> anonymousClass23 = C2072nW.A05;
            String[] strArr = A0G;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[2] = "KlsLVpZXOsku5rL5eePguYtdE3UqynPn";
            strArr2[5] = "qpearOu2I9fJNwBbehSRgczBWJlsPwpY";
            A01 = AnonymousClass44.A01(anonymousClass23, parcelableArrayList);
        }
        str = C05889i.A0Y;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(str);
        if (sparseParcelableArray == null) {
            A00 = new SparseArray();
        } else {
            A00 = AnonymousClass44.A00(C2057nH.A05, sparseParcelableArray);
        }
        if (intArray == null || intArray.length != A01.size()) {
            return;
        }
        for (int i = 0; i < intArray.length; i++) {
            A0r(intArray[i], (C2072nW) A01.get(i), (C2057nH) A00.get(i));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C04373h
    /* renamed from: A0q */
    public final C2060nK A0m(int i, int i2, boolean z) {
        super.A0m(i, i2, z);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
        if (com.facebook.ads.redexgen.X.C5C.A1E(r4, r8) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
        if (com.facebook.ads.redexgen.X.C5C.A1E(r4, r8) != false) goto L15;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2060nK A0r(int i, C2072nW c2072nW, C2057nH c2057nH) {
        Map<C2072nW, C2057nH> map = this.A0E.get(i);
        if (map == null) {
            map = new HashMap<>();
            this.A0E.put(i, map);
        }
        boolean containsKey = map.containsKey(c2072nW);
        String[] strArr = A0G;
        if (strArr[4].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[2] = "Tjk1w46Zsfr3yClteaW3dwU9W0N7TL6X";
        strArr2[5] = "KoERYkShSHV4ud9Re9JlKSMcCXAYN5Cn";
        if (containsKey) {
            C2057nH c2057nH2 = map.get(c2072nW);
            String[] strArr3 = A0G;
            if (strArr3[0].charAt(28) != strArr3[7].charAt(28)) {
                String[] strArr4 = A0G;
                strArr4[1] = "d9Fp2lxah88hbF8VY";
                strArr4[6] = "He";
            } else {
                String[] strArr5 = A0G;
                strArr5[0] = "6G3DmRjovsWEEopHgL7H9VeUKDmRIoIA";
                strArr5[7] = "heYp32NvS9S7pouisOnfj6NnH9zTXJMv";
            }
        }
        map.put(c2072nW, c2057nH);
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C04373h
    /* renamed from: A0s */
    public final C2060nK A0n(Context context) {
        super.A0n(context);
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C04373h
    /* renamed from: A0t */
    public final C2060nK A0o(Context context, boolean z) {
        super.A0o(context, z);
        return this;
    }

    public final C2060nK A0u(C2201pc c2201pc) {
        super.A0W(c2201pc);
        return this;
    }

    public final C2060nK A0v(boolean z) {
        this.A00 = z;
        return this;
    }

    public final C2060nK A0w(boolean z) {
        this.A01 = z;
        return this;
    }

    public final C2060nK A0x(boolean z) {
        this.A02 = z;
        return this;
    }

    public final C2060nK A0y(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C2060nK A0z(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C2060nK A10(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C2060nK A11(boolean z) {
        this.A06 = z;
        return this;
    }

    public final C2060nK A12(boolean z) {
        this.A07 = z;
        return this;
    }

    public final C2060nK A13(boolean z) {
        this.A08 = z;
        return this;
    }

    public final C2060nK A14(boolean z) {
        this.A09 = z;
        return this;
    }

    @MetaExoPlayerCustomization("D25277746")
    public final C2060nK A15(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C2060nK A16(boolean z) {
        this.A0B = z;
        return this;
    }

    public final C2060nK A17(boolean z) {
        this.A0C = z;
        return this;
    }

    public final C2060nK A18(boolean z) {
        this.A0D = z;
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C04373h
    /* renamed from: A19 */
    public final C05889i A0p() {
        return new C05889i(this);
    }
}
