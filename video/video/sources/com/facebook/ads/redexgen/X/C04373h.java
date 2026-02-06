package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import o.C3307Iz;
import o.C4715Xk;
import o.ED2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.3h */
/* loaded from: assets/audience_network/classes2.dex */
public class C04373h {
    public static byte[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public HashMap<C2205pg, C2203pe> A0G;
    public HashSet<Integer> A0H;
    public List<String> A0I;
    public List<String> A0J;
    public List<String> A0K;
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public List<String> A0L;
    public List<String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0P();
    }

    public static String A0H(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0R, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A0R = new byte[]{ED2.a, C4715Xk.i, C3307Iz.d0, 40, 53, 51, 50, 53, 50, 59};
    }

    @Deprecated
    public C04373h() {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = C1840jW.A01();
        this.A0D = 0;
        this.A0L = C1840jW.A01();
        this.A0I = C1840jW.A01();
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = C1840jW.A01();
        this.A0K = C1840jW.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap<>();
        this.A0H = new HashSet<>();
    }

    public C04373h(Context context) {
        this();
        A0n(context);
        A0o(context, true);
    }

    public C04373h(Bundle bundle) {
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
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        List A01;
        String str25;
        str = C2201pc.A0e;
        this.A06 = bundle.getInt(str, C2201pc.A0U.A06);
        str2 = C2201pc.A0d;
        this.A05 = bundle.getInt(str2, C2201pc.A0U.A05);
        str3 = C2201pc.A0c;
        this.A04 = bundle.getInt(str3, C2201pc.A0U.A04);
        str4 = C2201pc.A0b;
        this.A03 = bundle.getInt(str4, C2201pc.A0U.A03);
        str5 = C2201pc.A0i;
        this.A0A = bundle.getInt(str5, C2201pc.A0U.A0A);
        str6 = C2201pc.A0h;
        this.A09 = bundle.getInt(str6, C2201pc.A0U.A09);
        this.A08 = bundle.getInt(C2201pc.A0n(), C2201pc.A0U.A08);
        str7 = C2201pc.A0f;
        this.A07 = bundle.getInt(str7, C2201pc.A0U.A07);
        str8 = C2201pc.A0v;
        this.A0F = bundle.getInt(str8, C2201pc.A0U.A0F);
        str9 = C2201pc.A0t;
        this.A0E = bundle.getInt(str9, C2201pc.A0U.A0E);
        str10 = C2201pc.A0u;
        this.A0Q = bundle.getBoolean(str10, C2201pc.A0U.A0Q);
        str11 = C2201pc.A0p;
        this.A0M = BP.A07((String[]) AbstractC1905ka.A00(bundle.getStringArray(str11), new String[0]));
        str12 = C2201pc.A0q;
        this.A0D = bundle.getInt(str12, C2201pc.A0U.A0D);
        str13 = C2201pc.A0o;
        String[] preferredVideoLanguages1 = (String[]) AbstractC1905ka.A00(bundle.getStringArray(str13), new String[0]);
        this.A0L = A0G(preferredVideoLanguages1);
        str14 = C2201pc.A0j;
        String[] stringArray = bundle.getStringArray(str14);
        String[] preferredVideoLanguages12 = new String[0];
        this.A0I = A0G((String[]) AbstractC1905ka.A00(stringArray, preferredVideoLanguages12));
        str15 = C2201pc.A0l;
        this.A0B = bundle.getInt(str15, C2201pc.A0U.A0B);
        str16 = C2201pc.A0a;
        this.A02 = bundle.getInt(str16, C2201pc.A0U.A02);
        str17 = C2201pc.A0Z;
        this.A01 = bundle.getInt(str17, C2201pc.A0U.A01);
        str18 = C2201pc.A0k;
        String[] stringArray2 = bundle.getStringArray(str18);
        String[] preferredVideoLanguages13 = new String[0];
        this.A0J = BP.A07((String[]) AbstractC1905ka.A00(stringArray2, preferredVideoLanguages13));
        str19 = C2201pc.A0m;
        String[] stringArray3 = bundle.getStringArray(str19);
        String[] preferredVideoLanguages14 = new String[0];
        this.A0K = A0G((String[]) AbstractC1905ka.A00(stringArray3, preferredVideoLanguages14));
        str20 = C2201pc.A0n;
        this.A0C = bundle.getInt(str20, C2201pc.A0U.A0C);
        this.A00 = bundle.getInt(C2201pc.A0e(), C2201pc.A0U.A00);
        str21 = C2201pc.A0s;
        this.A0P = bundle.getBoolean(str21, C2201pc.A0U.A0P);
        str22 = C2201pc.A0X;
        this.A0O = bundle.getBoolean(str22, C2201pc.A0U.A0O);
        str23 = C2201pc.A0W;
        this.A0N = bundle.getBoolean(str23, C2201pc.A0U.A0N);
        str24 = C2201pc.A0r;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(str24);
        if (parcelableArrayList == null) {
            A01 = C1840jW.A01();
        } else {
            A01 = AnonymousClass44.A01(C2203pe.A02, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i = 0; i < A01.size(); i++) {
            C2203pe c2203pe = (C2203pe) A01.get(i);
            this.A0G.put(c2203pe.A00, c2203pe);
        }
        str25 = C2201pc.A0V;
        int[] iArr = (int[]) AbstractC1905ka.A00(bundle.getIntArray(str25), new int[0]);
        this.A0H = new HashSet<>();
        for (int i2 : iArr) {
            this.A0H.add(Integer.valueOf(i2));
        }
    }

    public C04373h(C2201pc c2201pc) {
        A0R(c2201pc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static BP<String> A0G(String[] strArr) {
        C2K A01 = BP.A01();
        for (String str : (String[]) AbstractC04543y.A01(strArr)) {
            A01.A04(C5C.A0k((String) AbstractC04543y.A01(str)));
        }
        return A01.A05();
    }

    private void A0Q(Context context) {
        CaptioningManager captioningManager;
        if ((C5C.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0H(0, 10, 126))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = BP.A04(C5C.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0R(C2201pc c2201pc) {
        this.A06 = c2201pc.A06;
        this.A05 = c2201pc.A05;
        this.A04 = c2201pc.A04;
        this.A03 = c2201pc.A03;
        this.A0A = c2201pc.A0A;
        this.A09 = c2201pc.A09;
        this.A08 = c2201pc.A08;
        this.A07 = c2201pc.A07;
        this.A0F = c2201pc.A0F;
        this.A0E = c2201pc.A0E;
        this.A0Q = c2201pc.A0Q;
        this.A0M = c2201pc.A0M;
        this.A0D = c2201pc.A0D;
        this.A0L = c2201pc.A0L;
        this.A0I = c2201pc.A0I;
        this.A0B = c2201pc.A0B;
        this.A02 = c2201pc.A02;
        this.A01 = c2201pc.A01;
        this.A0J = c2201pc.A0J;
        this.A0K = c2201pc.A0K;
        this.A0C = c2201pc.A0C;
        this.A00 = c2201pc.A00;
        this.A0P = c2201pc.A0P;
        this.A0O = c2201pc.A0O;
        this.A0N = c2201pc.A0N;
        this.A0H = new HashSet<>(c2201pc.A0H);
        this.A0G = new HashMap<>(c2201pc.A0G);
    }

    public C04373h A0W(C2201pc c2201pc) {
        A0R(c2201pc);
        return this;
    }

    public C04373h A0m(int i, int i2, boolean z) {
        this.A0F = i;
        this.A0E = i2;
        this.A0Q = z;
        return this;
    }

    public C04373h A0n(Context context) {
        if (C5C.A02 >= 19) {
            A0Q(context);
        }
        return this;
    }

    public C04373h A0o(Context context, boolean z) {
        Point viewportSize = C5C.A0W(context);
        return A0m(viewportSize.x, viewportSize.y, z);
    }

    public C2201pc A0p() {
        return new C2201pc(this);
    }
}
