package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import javax.annotation.Nullable;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Xc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1183Xc {
    A0I(0),
    A0H(1),
    A0G(2),
    A0K(3),
    A0J(4),
    A0A(5, NativeAdBase.NativeComponentTag.AD_ICON),
    A0F(6, NativeAdBase.NativeComponentTag.AD_TITLE),
    A09(7, NativeAdBase.NativeComponentTag.AD_COVER_IMAGE),
    A0E(8, NativeAdBase.NativeComponentTag.AD_SUBTITLE),
    A06(9, NativeAdBase.NativeComponentTag.AD_BODY),
    A07(10, NativeAdBase.NativeComponentTag.AD_CALL_TO_ACTION),
    A0D(11, NativeAdBase.NativeComponentTag.AD_SOCIAL_CONTEXT),
    A08(12, NativeAdBase.NativeComponentTag.AD_CHOICES_ICON),
    A0B(13, NativeAdBase.NativeComponentTag.AD_MEDIA),
    A0C(12, NativeAdBase.NativeComponentTag.AD_OPTIONS_VIEW);
    
    public static int A02;
    public static byte[] A03;
    public static String[] A04 = {"mm8FkjmxkAn0ntAt6yMmjJOmEmwUFxWQ", "VQVAUr8hHMqZVaEwe8OtAk0HCVwVuT9q", "oClOzaysC8x4DOGoit7i4h3Gpfb0OXMF", "fuZWqRC62r9MuSCVvwKu5U60eWbDLskj", "2DvdeCnwUfm17kN5FHRDQx8hBER6C2qU", "K4oeerNs7A1VEBeDem7X4xZbHtBFCQWn", "JTXeDaIbilWka07jjSO5NeC2nexU0fdc", "Pjq84j8K1toDwE9n24Yhtzr00ksRVLD1"};
    public final int A00;
    @Nullable
    public final NativeAdBase.NativeComponentTag A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-22, -17, -11, -26, -13, -17, -30, -19, 0, -30, -27, 0, -29, -16, -27, -6, C8077mf.x, C8077mf.C, 31, C8077mf.r, C8077mf.G, C8077mf.C, C8077mf.n, C8077mf.A, 42, C8077mf.n, C8077mf.q, 42, C8077mf.p, C8077mf.n, C8077mf.A, C8077mf.A, 42, 31, C8077mf.D, 42, C8077mf.n, C8077mf.p, 31, C8077mf.x, C8077mf.D, C8077mf.C, -52, -47, -41, -56, -43, -47, -60, C2638Cg0.A7, -30, -60, C2638Cg0.u7, -30, C2638Cg0.t7, C2638Cg0.x7, -46, -52, C2638Cg0.t7, -56, -42, -30, -52, C2638Cg0.t7, -46, -47, -103, -98, -92, -107, -94, -98, -111, -100, -81, -111, -108, -81, -109, -97, -90, -107, -94, -81, -103, -99, -111, -105, -107, -1, 4, 10, -5, 8, 4, -9, 2, C8077mf.y, -9, -6, C8077mf.y, -1, -7, 5, 4, -99, -94, -88, -103, -90, -94, -107, -96, -77, -107, -104, -77, -95, -103, -104, -99, -107, 0, 5, C8077mf.m, -4, 9, 5, -8, 3, C8077mf.z, -8, -5, C8077mf.z, 6, 7, C8077mf.m, 0, 6, 5, 10, C8077mf.z, 13, 0, -4, C8077mf.p, C2638Cg0.v7, C2638Cg0.z7, -44, C2638Cg0.s7, -46, C2638Cg0.z7, C2638Cg0.p7, -52, -33, C2638Cg0.p7, -60, -33, -45, C2638Cg0.A7, C2638Cg0.r7, C2638Cg0.v7, C2638Cg0.p7, -52, -33, C2638Cg0.r7, C2638Cg0.A7, C2638Cg0.z7, -44, C2638Cg0.s7, C2638Cg0.n7, -44, C2638Cg0.z7, -45, C2638Cg0.E7, C2638Cg0.w7, -41, -45, C2638Cg0.t7, -47, -28, C2638Cg0.t7, C2638Cg0.v7, -28, C2638Cg0.n7, C2638Cg0.B7, C2638Cg0.u7, C2638Cg0.E7, C2638Cg0.z7, C2638Cg0.E7, -47, C2638Cg0.w7, -12, -7, -1, -16, -3, -7, -20, -9, 10, -20, -17, 10, -1, -12, -1, -9, -16, -89, -84, -78, -93, -80, -84, -97, -86, -67, -97, -82, -89, -67, -78, -83, -83, -67, -86, -83, -75, -20, -15, -9, -24, -11, -15, -28, -17, 2, -15, -14, 2, -26, -17, -20, -26, -18, 17, C8077mf.z, 28, 13, C8077mf.D, C8077mf.z, 9, C8077mf.x, C3307Iz.Z, C8077mf.z, C8077mf.A, C3307Iz.Z, 28, 9, C8077mf.q, 17, C8077mf.z, 28, 13, C8077mf.D, C8077mf.z, 9, C8077mf.x, C3307Iz.Z, C8077mf.z, C8077mf.G, C8077mf.x, C8077mf.x, C3307Iz.Z, C8077mf.H, 17, 13, 31, -4, 1, 7, -8, 5, 1, -12, -1, C8077mf.u, 10, 5, 2, 1, -6, C8077mf.u, 7, -12, -6, C8077mf.u, -10, -1, -12, 6, 6};
        String[] strArr = A04;
        if (strArr[0].charAt(5) != strArr[7].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "5kHbeeIehC4HjRV2XKp0gKWNT0mjCFu0";
        strArr2[5] = "V77oNHMbviq5SbxHHLaqMPGHTmS2Clc8";
        A03 = bArr;
    }

    static {
        A02();
        A02 = -1593835521;
    }

    EnumC1183Xc(int i) {
        this.A00 = i;
        this.A01 = null;
    }

    EnumC1183Xc(int i, NativeAdBase.NativeComponentTag nativeComponentTag) {
        this.A00 = i;
        this.A01 = nativeComponentTag;
    }

    @Nullable
    public static EnumC1183Xc A00(NativeAdBase.NativeComponentTag nativeComponentTag) {
        EnumC1183Xc[] values;
        for (EnumC1183Xc enumC1183Xc : values()) {
            if (enumC1183Xc.A01 == nativeComponentTag) {
                return enumC1183Xc;
            }
        }
        return null;
    }

    public static void A03(@Nullable View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
        EnumC1183Xc internalTag = A00(nativeComponentTag);
        if (view != null && internalTag != null) {
            view.setTag(A02, nativeComponentTag);
        }
    }

    public static void A04(@Nullable View view, @Nullable EnumC1183Xc enumC1183Xc) {
        if (view != null && enumC1183Xc != null) {
            view.setTag(A02, enumC1183Xc);
        }
    }

    public final int A06() {
        return this.A00;
    }
}
