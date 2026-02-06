package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.UUID;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.C9276rZ;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.6r  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05256r extends C0710Ek {
    public static byte[] A0F;
    public static String[] A0G = {"Cb7nBOTqt", "Uv90YERdy9SZ9btNePue9j4WSufKww0d", "5tFdsnJl1aHC8QazlewrqKxrXvRcdsO5", "4XUHzfDXngka", "6zmG8GCKaenNI", "iTvfTfiU680tAW5ZUJpNe0fUcB62AaOp", "iIjhxtVkNHrsB", "9VdyyBhNHsky"};
    public static final String A0H;
    public Uri A00;
    public NativeAd A01;
    public VA A02;
    public InterfaceC1228Yv A03;
    public C0720Eu A04;
    public C4L A05;
    public String A06;
    public String A07;
    public String A08;
    public final NL A09;
    public final C1673gi A0A;
    public final EA A0B;
    public final E4 A0C;
    public final E2 A0D;
    public final String A0E;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A0G[0].length() == 17) {
                throw new RuntimeException();
            }
            A0G[2] = "GV7dEmS9dQikFIsLGq03TvmmBp0PGqms";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{32, 2, 13, 68, C8077mf.A, 67, C8077mf.r, C8077mf.A, 2, 17, C8077mf.A, 67, 34, C8077mf.z, 7, 10, 6, 13, 0, 6, C3307Iz.e0, 6, C8077mf.A, C8077mf.x, C8077mf.n, 17, 8, 34, 0, C8077mf.A, 10, C8077mf.y, 10, C8077mf.A, C8077mf.D, 77, 67, C3307Iz.f0, 2, 8, 6, 67, C8077mf.r, C8077mf.z, 17, 6, 67, C8077mf.A, C8077mf.m, 2, C8077mf.A, 67, 10, C8077mf.A, 68, C8077mf.r, 67, 10, 13, 67, C8077mf.D, C8077mf.n, C8077mf.z, 17, 67, 34, 13, 7, 17, C8077mf.n, 10, 7, C3307Iz.f0, 2, 13, 10, 5, 6, C8077mf.r, C8077mf.A, 77, C8077mf.E, C8077mf.p, C8077mf.q, 67, 5, 10, C8077mf.q, 6, 77, C8077mf.G, 42, 42, 55, 42, 98, QC1.w, 35, C3307Iz.Z, 36, C8077mf.r, 1, C8077mf.n, 0, C8077mf.m, 6, 0, C3307Iz.c0, 0, 17, C8077mf.u, 10, C8077mf.A, C8077mf.p, C8077mf.y, C3307Iz.e0, C3307Iz.c0, C3307Iz.d0, QC1.w, C3307Iz.c0, C4715Xk.i, C3307Iz.d0, C8077mf.E, 52, 49, C4715Xk.i, 54, C3307Iz.d0, C8077mf.n, 55, 51, C4715Xk.i, 54, QC1.w, 62, 49, 42, C3307Iz.c0, C3307Iz.d0, 3, 59, C4715Xk.i, 58, 110, C4715Xk.i, C3307Iz.c0, 58, C8077mf.B, C3307Iz.Z, 42, C3307Iz.c0, C3307Iz.V, C8077mf.E, 28, 7, 110, C3307Iz.V, 60, 110, C4715Xk.i, C3307Iz.c0, 58, C8077mf.B, C3307Iz.Z, 42, C3307Iz.c0, C3307Iz.V, 3, C8077mf.H, 10, 110, 40, C3307Iz.Z, 60, C4715Xk.i, 58, C8077mf.H, 17, 32, C8077mf.H, 28, C8077mf.m, C8077mf.z, 9, C8077mf.z, C8077mf.m, 6, 51, 60, 57, 53, 62, 36, 4, ED2.a, 59, 53, 62, 62, 47, 60, C4715Xk.i, C3307Iz.Z, 32, C3307Iz.a0, C8077mf.A, C8077mf.y, 2, 3, 2, 1, C8077mf.p, 9, 2, 3, 40, C8077mf.y, C8077mf.p, 2, 9, 19, 6, 19, C8077mf.p, 8, 9, C3307Iz.d0, 2, C8077mf.H, 86, 77, 74, 82, 86, 70, 106, 71, 42, C3307Iz.d0, 58, 17, 62, C3307Iz.c0, 54, C3307Iz.a0, 58, 28, C3307Iz.c0, 62, C8077mf.G, 42, C3307Iz.c0, C3307Iz.c0, 48, 49, 117, 106, 103, 102, 108, 79, 108, 100, 100, 102, 113, 85, 74, 71, 70, 76, 110, 115, 103, 66, 93, 80, 81, 91, 103, 81, 81, 95, 96, 93, 89, 81, 99, 124, 113, 112, 122, 64, 71, 89, 17, C8077mf.p, 3, 2, 8, 56, 19, C8077mf.p, 10, 2, 56, C8077mf.A, 8, C8077mf.m, C8077mf.m, C8077mf.p, 9, 0, 56, C8077mf.p, 9, 19, 2, C8077mf.y, 17, 6, C8077mf.m, 19, C8077mf.n, 0, C8077mf.u, 49, 28, C8077mf.y, 0};
    }

    static {
        A03();
        A0H = C05256r.class.getSimpleName();
    }

    public C05256r(C1673gi c1673gi) {
        super(c1673gi);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E3 e3) {
                InterfaceC1228Yv interfaceC1228Yv;
                InterfaceC1228Yv interfaceC1228Yv2;
                interfaceC1228Yv = C05256r.this.A03;
                if (interfaceC1228Yv != null) {
                    interfaceC1228Yv2 = C05256r.this.A03;
                    interfaceC1228Yv2.AFC();
                }
            }
        };
        this.A0C = new E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4B c4b) {
                InterfaceC1228Yv interfaceC1228Yv;
                InterfaceC1228Yv interfaceC1228Yv2;
                interfaceC1228Yv = C05256r.this.A03;
                if (interfaceC1228Yv != null) {
                    interfaceC1228Yv2 = C05256r.this.A03;
                    interfaceC1228Yv2.onPause();
                }
            }
        };
        this.A0B = new EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4K c4k) {
                InterfaceC1228Yv interfaceC1228Yv;
                InterfaceC1228Yv interfaceC1228Yv2;
                interfaceC1228Yv = C05256r.this.A03;
                if (interfaceC1228Yv != null) {
                    interfaceC1228Yv2 = C05256r.this.A03;
                    interfaceC1228Yv2.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new NL(this, c1673gi);
        this.A0A = c1673gi;
        A02();
    }

    public C05256r(C1673gi c1673gi, AttributeSet attributeSet) {
        super(c1673gi, attributeSet);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E3 e3) {
                InterfaceC1228Yv interfaceC1228Yv;
                InterfaceC1228Yv interfaceC1228Yv2;
                interfaceC1228Yv = C05256r.this.A03;
                if (interfaceC1228Yv != null) {
                    interfaceC1228Yv2 = C05256r.this.A03;
                    interfaceC1228Yv2.AFC();
                }
            }
        };
        this.A0C = new E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4B c4b) {
                InterfaceC1228Yv interfaceC1228Yv;
                InterfaceC1228Yv interfaceC1228Yv2;
                interfaceC1228Yv = C05256r.this.A03;
                if (interfaceC1228Yv != null) {
                    interfaceC1228Yv2 = C05256r.this.A03;
                    interfaceC1228Yv2.onPause();
                }
            }
        };
        this.A0B = new EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4K c4k) {
                InterfaceC1228Yv interfaceC1228Yv;
                InterfaceC1228Yv interfaceC1228Yv2;
                interfaceC1228Yv = C05256r.this.A03;
                if (interfaceC1228Yv != null) {
                    interfaceC1228Yv2 = C05256r.this.A03;
                    interfaceC1228Yv2.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new NL(this, c1673gi);
        this.A0A = c1673gi;
        A02();
    }

    public C05256r(C1673gi c1673gi, AttributeSet attributeSet, int i) {
        super(c1673gi, attributeSet, i);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E3 e3) {
                InterfaceC1228Yv interfaceC1228Yv;
                InterfaceC1228Yv interfaceC1228Yv2;
                interfaceC1228Yv = C05256r.this.A03;
                if (interfaceC1228Yv != null) {
                    interfaceC1228Yv2 = C05256r.this.A03;
                    interfaceC1228Yv2.AFC();
                }
            }
        };
        this.A0C = new E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4B c4b) {
                InterfaceC1228Yv interfaceC1228Yv;
                InterfaceC1228Yv interfaceC1228Yv2;
                interfaceC1228Yv = C05256r.this.A03;
                if (interfaceC1228Yv != null) {
                    interfaceC1228Yv2 = C05256r.this.A03;
                    interfaceC1228Yv2.onPause();
                }
            }
        };
        this.A0B = new EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4K c4k) {
                InterfaceC1228Yv interfaceC1228Yv;
                InterfaceC1228Yv interfaceC1228Yv2;
                interfaceC1228Yv = C05256r.this.A03;
                if (interfaceC1228Yv != null) {
                    interfaceC1228Yv2 = C05256r.this.A03;
                    interfaceC1228Yv2.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new NL(this, c1673gi);
        this.A0A = c1673gi;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0D, this.A0C, this.A0B);
    }

    private void A04(Intent intent) {
        if (this.A05 == null) {
            A05(A01(114, 25, 92));
        } else if (this.A00 == null && this.A08 == null) {
            A05(A01(C3503Kz.c0, 37, 74));
            String[] strArr = A0G;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "rwc2";
        } else {
            intent.putExtra(A01(237, 18, 91), this.A07);
            intent.putExtra(A01(322, 8, 97), WK.A09);
            intent.putExtra(A01(287, 8, 17), this.A00.toString());
            intent.putExtra(A01(C10997yd1.l2, 11, 84), this.A06 == null ? A01(0, 0, 6) : this.A06);
            intent.putExtra(A01(266, 8, 39), this.A08);
            intent.putExtra(A01(205, 24, 99), XX.A00(this.A0A));
            intent.putExtra(A01(C9276rZ.q, 13, 48), getCurrentPositionInMillis());
            String[] strArr2 = A0G;
            if (strArr2[7].length() != strArr2[3].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "bFTSk0Gp6QusC65PcsD";
            intent.putExtra(A01(229, 8, 39), this.A0E);
            intent.putExtra(A01(255, 11, 7), this.A05.A0c());
            intent.putExtra(A01(295, 27, 99), getVideoProgressReportIntervalMs());
            intent.addFlags(268435456);
        }
    }

    private void A05(String str) {
        this.A0A.A08().ABC(A01(198, 7, 74), AbstractC1085Td.A28, new C1086Te(AdErrorType.PARSER_FAILURE.getDefaultErrorMessage(), A01(90, 7, 92) + str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(A0H, str);
        }
    }

    public final void A0r() {
        if (this.A01 != null) {
            this.A01.onCtaBroadcast();
        }
    }

    public final void A0s() {
        AdActivityIntent A05 = C1177Wu.A05(this.A0A);
        A04(A05);
        try {
            A0i(false, 6);
            setVisibility(8);
            C1177Wu.A0B(this.A0A, A05);
        } catch (Exception e) {
            this.A0A.A08().ABC(A01(176, 11, 123), AbstractC1085Td.A0D, new C1086Te(e));
            Log.e(A01(97, 17, 97), A01(0, 90, 103), e);
        }
    }

    public InterfaceC1228Yv getListener() {
        return this.A03;
    }

    public String getUniqueId() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.C0710Ek, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.X.C0710Ek, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A09.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(VA va) {
        this.A02 = va;
    }

    public void setClientToken(String str) {
        C4L c4l;
        if (this.A04 != null) {
            C0720Eu c0720Eu = this.A04;
            String[] strArr = A0G;
            if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[2] = "geldSN57Uojbab2WOS9MzcIW4E8sQ4xA";
            c0720Eu.A07();
        }
        if (this.A05 != null) {
            this.A05.A0p();
        }
        this.A06 = str;
        C0720Eu c0720Eu2 = null;
        if (str != null) {
            c4l = new C4L(this.A0A, this.A02, this, str);
        } else {
            c4l = null;
        }
        this.A05 = c4l;
        if (this.A05 != null && C1123Up.A20(this.A0A)) {
            if (str != null) {
                c0720Eu2 = new C0720Eu(this.A0A, this.A02, this, str, false, this.A05, null);
            }
            this.A04 = c0720Eu2;
            return;
        }
        this.A04 = null;
    }

    public void setEnableBackgroundVideo(boolean z) {
        super.A0E.setBackgroundPlaybackEnabled(z);
    }

    public void setListener(InterfaceC1228Yv interfaceC1228Yv) {
        this.A03 = interfaceC1228Yv;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(String str) {
        this.A07 = str;
    }

    @Override // com.facebook.ads.redexgen.X.C0710Ek
    public void setVideoMPD(String str) {
        if (str != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A08 = str;
        String[] strArr = A0G;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[4] = "ao7Mn74HmNnh4";
        strArr2[6] = "E6rOC8IWnX5Ja";
        super.setVideoMPD(str);
    }

    @Override // com.facebook.ads.redexgen.X.C0710Ek
    public void setVideoURI(Uri uri) {
        if (uri != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A00 = uri;
        super.setVideoURI(uri);
        String[] strArr = A0G;
        if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
            throw new RuntimeException();
        }
        A0G[0] = "z2OQUaNXEwktMvnJ8h1OzGBt0";
    }
}
