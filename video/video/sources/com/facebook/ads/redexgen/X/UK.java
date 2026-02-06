package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.AdClosedListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import o.C2638Cg0;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public final class UK implements com.facebook.ads.Ad, NativeAdBaseApi, Repairable, InterfaceC1142Vi {
    public static C1079Sx A0o;
    public static byte[] A0p;
    public static String[] A0q = {"0QrYY16WpsBKaBkyPEA33iBIoR05UhVT", "YnnsFrkLVth43aFbA8XanJ7Af1ELV", "Oxqa2FUUnPLQ7GUfsty3Y0efzjvyqNtk", "SIKP4BEcnF1kam64buW5uj4ZKlEjFxDR", "vEVPI6RQ4lovzpZyrpWOxFDddvUHwWNp", "NGWOmnzpb", "djSS0JJWnZq1rlBsvyeXY9GnDKzed", "NhvbMWoFDj5W6o0bWnGe4dztWB8buZER"};
    public static final String A0r;
    public static final WeakHashMap<View, WeakReference<UK>> A0s;
    public long A00;
    public Drawable A01;
    public View.OnTouchListener A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public AdClosedListener A07;
    public NativeAdLayout A08;
    public NE A09;
    public C1853jj A0A;
    public C05407g A0B;
    public C1804iu A0C;
    public T3 A0D;
    public C1105Tx A0E;
    public VI A0F;
    public VW A0G;
    public View$OnClickListenerC1111Ud A0H;
    public InterfaceC1103Tv A0I;
    public C1137Vd A0J;
    public EnumC1138Ve A0K;
    public EnumC1148Vq A0L;
    public ZT A0M;
    public InterfaceC1235Zc A0N;
    public C1327b6 A0O;
    public C1457dC A0P;
    public C1521eF A0Q;
    public AbstractC1617fo A0R;
    public AbstractC1617fo A0S;
    public C1618fp A0T;
    public C1618fp A0U;
    public String A0V;
    public String A0W;
    public WeakReference<C1720hT> A0X;
    public WeakReference<AbstractC1617fo> A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public C1864ju A0e;
    public final C1079Sx A0f;
    public final C1673gi A0g;
    public final InterfaceC1134Va A0h;
    public final C1144Vk A0i;
    public final Y2 A0j;
    public final String A0k;
    public final String A0l;
    public final List<View> A0m;
    public volatile boolean A0n;

    public static String A0W(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0p, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A0e() {
        A0p = new byte[]{-32, C8077mf.D, C3307Iz.Y, 31, C8077mf.H, -19, -14, -13, -16, C8077mf.H, -18, -15, -16, -24, -27, C8077mf.z, -24, -26, -19, C8077mf.A, -27, -74, -74, -71, -76, -70, -72, -29, -29, C3307Iz.Y, 73, 5, 83, 84, 89, 5, 81, 84, 70, 73, 74, 73, -25, 10, -6, C8077mf.m, 19, C8077mf.z, C8077mf.u, 7, C8077mf.D, C8077mf.m, C2638Cg0.t7, C2638Cg0.y7, C2638Cg0.x7, C8077mf.C, C2638Cg0.y7, C2638Cg0.t7, C8077mf.q, C8077mf.C, C2638Cg0.t7, C8077mf.x, C8077mf.y, C8077mf.D, C2638Cg0.t7, 7, C2638Cg0.t7, C8077mf.x, 7, C8077mf.D, C8077mf.q, 28, C8077mf.m, C2638Cg0.t7, 7, 10, -33, -37, C2638Cg0.B7, C8077mf.p, -3, 2, -2, 7, -4, -2, -25, -2, 13, C8077mf.r, 8, C8077mf.m, 4, -27, 0, 8, C8077mf.m, 4, 3, -65, 19, C8077mf.p, -65, C8077mf.m, C8077mf.p, 0, 3, -65, -20, 4, 3, 8, 0, C2638Cg0.y7, -16, C8077mf.m, 19, C8077mf.z, C8077mf.q, C8077mf.p, C2638Cg0.w7, C8077mf.H, C8077mf.C, C2638Cg0.w7, C8077mf.C, C8077mf.n, C8077mf.H, C8077mf.m, 19, C8077mf.B, C2638Cg0.w7, C8077mf.H, C8077mf.q, C8077mf.A, C8077mf.D, C8077mf.z, C8077mf.m, C8077mf.H, C8077mf.q, C2638Cg0.w7, -13, -18, C2638Cg0.w7, C8077mf.r, 28, C8077mf.C, C8077mf.A, C2638Cg0.w7, C8077mf.n, 19, C8077mf.p, C2638Cg0.w7, C8077mf.D, C8077mf.m, 35, C8077mf.z, C8077mf.C, C8077mf.m, C8077mf.p, C2638Cg0.w7, -47, C2638Cg0.A7, C8077mf.G, -47, -23, C8077mf.p, C8077mf.x, 5, C8077mf.u, C8077mf.p, 1, C8077mf.n, C2638Cg0.o7, 5, C8077mf.u, C8077mf.u, C8077mf.q, C8077mf.u, C2638Cg0.z7, -86, C8077mf.H, 67, 75, 54, 65, 62, 57, -11, 72, 58, 73, -11, 68, 59, -11, 56, 65, 62, 56, 64, 54, 55, 65, 58, -11, 75, 62, 58, 76, 72, 0, C8077mf.B, C8077mf.A, 28, C8077mf.x, 9, 28, C8077mf.B, 42, -45, C8077mf.C, 34, C3307Iz.X, -45, 28, C8077mf.z, 34, C3307Iz.V, -45, 28, C3307Iz.Y, -45, 28, C3307Iz.Y, -45, 32, 28, C3307Iz.Y, C3307Iz.Y, 28, C3307Iz.V, C8077mf.D, C2638Cg0.C7, C8077mf.G, 53, 52, 57, 49, C3307Iz.Y, 57, 53, 71, -16, 57, 67, -16, C4715Xk.i, 57, 67, 67, 57, 62, 55, -2, 51, 91, 89, 90, 6, 86, 88, 85, 92, 79, 74, 75, 6, 71, 6, 60, 79, 75, 93, 35, 54, 73, 62, 75, 58, -11, C8077mf.z, 57, -11, 76, 54, 72, -11, 54, 65, 71, 58, 54, 57, 78, -11, 71, 58, 60, 62, 72, 73, 58, 71, 58, 57, -11, 76, 62, 73, C4715Xk.i, -11, 54, -11, C3307Iz.c0, 62, 58, 76, 3, -11, C8077mf.z, 74, 73, 68, -11, 74, 67, 71, 58, 60, 62, 72, 73, 58, 71, 62, 67, 60, -11, 54, 67, 57, -11, 69, 71, 68, 56, 58, 58, 57, 62, 67, 60, 3, C2638Cg0.v7, -36, -17, -28, -15, -32, -101, -36, -33, -101, -33, -32, -18, -17, -19, -22, -12, -32, -33, C2638Cg0.E7, -20, -1, -12, 1, -16, -85, -20, -17, -85, -9, -6, -20, -17, -85, -3, -16, -4, 0, -16, -2, -1, -16, -17, -22, -3, -7, C8077mf.m, -76, -11, 0, 6, -7, -11, -8, 13, -76, 6, -7, -5, -3, 7, 8, -7, 6, -7, -8, -76, C8077mf.m, -3, 8, -4, -76, -11, -76, -30, -11, 8, -3, 10, -7, -43, -8, C2638Cg0.q7, -76, -43, 9, 8, 3, -76, 9, 2, 6, -7, -5, -3, 7, 8, -7, 6, -3, 2, -5, -76, -11, 2, -8, -76, 4, 6, 3, -9, -7, -7, -8, -3, 2, -5, C2638Cg0.q7, -1, C8077mf.u, C8077mf.p, 32, C2638Cg0.v7, C8077mf.A, C8077mf.B, C8077mf.G, C2638Cg0.v7, C8077mf.E, C8077mf.p, C8077mf.r, C8077mf.u, 28, C8077mf.G, C8077mf.p, C8077mf.E, C8077mf.p, 13, C2638Cg0.v7, 32, C8077mf.u, C8077mf.G, 17, C2638Cg0.v7, C8077mf.G, 17, C8077mf.u, 28, C2638Cg0.v7, -9, 10, C8077mf.G, C8077mf.u, 31, C8077mf.p, -22, 13, C3307Iz.f0, 49, -19, 58, 50, 49, 54, C3307Iz.f0, -19, 65, 70, C4715Xk.i, 50, -19, 54, 64, -19, 59, 60, 65, -19, 64, 66, C4715Xk.i, C4715Xk.i, 60, ED2.a, 65, 50, 49, -5, 54, 69, 62, 51, 52, 66, 67, 65, 62, 72, 81, 84, 70, 73, C3307Iz.Y, 73, 69, 72, 58, C4715Xk.i, C8077mf.D, C4715Xk.i, 1, 2, -7, 60, 58, 69, 69, 62, C4715Xk.i, -7, 70, 72, 75, 62, -7, 77, 65, 58, 71, -7, 72, 71, 60, 62, -27, C2638Cg0.n7, -21, -32, -19, -36};
        String[] strArr = A0q;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0q[3] = "WbNUBB1XQVUYjPuN5kyqwH0pcEyoS9gz";
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c9, code lost:
        if (r6.A0S() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02cb, code lost:
        r12.A0R = new com.facebook.ads.redexgen.X.VE(r12);
        r12.A0T = new com.facebook.ads.redexgen.X.C1618fp(r13, 1, new java.lang.ref.WeakReference(r12.A0R), r12.A0g);
        r12.A0T.A0Y(false);
        r12.A0T.A0X(r6.A09());
        r12.A0T.A0U();
        r12.A0g.A0F().ACY();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fe, code lost:
        r1 = new java.util.ArrayList(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0305, code lost:
        if (r12.A05 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0307, code lost:
        r7 = r12.A05;
        r4 = com.facebook.ads.redexgen.X.UK.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x031a, code lost:
        if (r4[2].charAt(3) == r4[7].charAt(3)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x031c, code lost:
        r4 = com.facebook.ads.redexgen.X.UK.A0q;
        r4[0] = "7BxfhPTBtrovnc2SNqJYjum2f5qDPcpL";
        r4[4] = "Q5pxYg7VFdMmLRDnYTITcnTwa1eIsVWj";
        r1.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x032b, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0333, code lost:
        if (r2.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0335, code lost:
        A1Q((android.view.View) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x033f, code lost:
        r0 = A13();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0343, code lost:
        if (r16 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0345, code lost:
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034b, code lost:
        if (r0.A1f() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x034d, code lost:
        A1Q(r13);
        r1.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0353, code lost:
        r7 = A00();
        r12.A0S = new com.facebook.ads.redexgen.X.C1129Uv(r12, r14, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0360, code lost:
        if ((r14 instanceof com.facebook.ads.internal.api.AdNativeComponentView) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0362, code lost:
        r12.A03 = ((com.facebook.ads.internal.api.AdNativeComponentView) r14).getAdContentsView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0370, code lost:
        if (com.facebook.ads.redexgen.X.C1123Up.A1z(r12.A0g) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0372, code lost:
        r4 = A1H();
        r6 = A16().A0B();
        r5 = r12.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0380, code lost:
        if (r4 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0382, code lost:
        r4 = A0W(0, 0, 121);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x038a, code lost:
        r6.AKo(r5, r4, r12.A03 instanceof com.facebook.ads.redexgen.X.C1557eq, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0392, code lost:
        r12.A0U = new com.facebook.ads.redexgen.X.C1618fp(r12.A03, r7, A03(), true, new java.lang.ref.WeakReference(r12.A0S), r12.A0g);
        r12.A0U.A0Y(!A0r());
        r12.A0U.A0W(A01());
        r12.A0U.A0X(A02());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03ca, code lost:
        if ((r12.A03 instanceof com.facebook.ads.redexgen.X.C1317aw) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03cc, code lost:
        r5 = (com.facebook.ads.redexgen.X.C1317aw) r12.A03;
        r4 = com.facebook.ads.redexgen.X.UK.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03e2, code lost:
        if (r4[0].charAt(21) == r4[4].charAt(21)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03e4, code lost:
        com.facebook.ads.redexgen.X.UK.A0q[3] = "9jWMkBrIWAaQq3BshIoiK9kOFApm7Mnb";
        r5.A06(r12.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03f0, code lost:
        r12.A0A = new com.facebook.ads.redexgen.X.C1853jj(r12.A0g, new com.facebook.ads.redexgen.X.UY(r12, null), r12.A0U, r12.A0e);
        r12.A0A.A0H(r1);
        com.facebook.ads.redexgen.X.UK.A0s.put(r13, new java.lang.ref.WeakReference<>(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0418, code lost:
        if (com.facebook.ads.redexgen.X.C1123Up.A1C(r12.A0g) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x041a, code lost:
        r12.A0O = new com.facebook.ads.redexgen.X.C1327b6();
        r12.A0O.A0C(r12.A0k);
        r12.A0O.A0B(r12.A0g.getPackageName());
        r12.A0O.A0A(r12.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x043c, code lost:
        if (r12.A0e == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0448, code lost:
        if (r12.A0e.A0E().A03() <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x044a, code lost:
        r0 = r12.A0e.A0E();
        r12.A0O.A08(r0.A03(), r0.A04());
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x045d, code lost:
        r4 = r12.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x046b, code lost:
        if (com.facebook.ads.redexgen.X.UK.A0q[3].charAt(5) == 'B') goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x046d, code lost:
        if (r4 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x046f, code lost:
        r12.A0O.A09(r12.A0E.A0C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x047a, code lost:
        r12.A04.getOverlay().add(r12.A0O);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0485, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0486, code lost:
        r2 = com.facebook.ads.redexgen.X.UK.A0q;
        r2[6] = "iJInlaPqSCsodlo1snRpIwz9DPt1A";
        r2[1] = "DYzZZFtfMBLderHMiZZFXfgJZWHC0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0492, code lost:
        if (r4 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0497, code lost:
        if (r12.A0B == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x049f, code lost:
        if (r12.A0B.A0J() == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04a1, code lost:
        r12.A0O.A09(r12.A0B.A0J().A0C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04b1, code lost:
        r12.A03 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0225, code lost:
        if (r8 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0227, code lost:
        android.util.Log.w(com.facebook.ads.redexgen.X.UK.A0r, A0W(283, 80, 101));
        unregisterView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0239, code lost:
        r8 = com.facebook.ads.redexgen.X.UK.A0s.containsKey(r13);
        r2 = com.facebook.ads.redexgen.X.UK.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x024f, code lost:
        if (r2[6].length() == r2[1].length()) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0256, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x025e, code lost:
        if (r8 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0261, code lost:
        r2 = com.facebook.ads.redexgen.X.UK.A0q;
        r2[0] = "r1dCEV0W05obqeylsxysUOCLLtyqbDkO";
        r2[4] = "jsU6g8E1kSPqSuKqGJQzSRDrUMjHNr5E";
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x026d, code lost:
        if (r8 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x027b, code lost:
        if (com.facebook.ads.redexgen.X.UK.A0s.get(r13).get() == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027d, code lost:
        android.util.Log.w(com.facebook.ads.redexgen.X.UK.A0r, A0W(406, 75, 36));
        com.facebook.ads.redexgen.X.UK.A0s.get(r13).get().unregisterView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x029d, code lost:
        r12.A0H = new com.facebook.ads.redexgen.X.View$OnClickListenerC1111Ud(r12, r12.A0g, null);
        r12.A04 = r13;
        r12.A06 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ad, code lost:
        if ((r13 instanceof android.view.ViewGroup) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02af, code lost:
        r12.A0M = new com.facebook.ads.redexgen.X.ZT(r12.A0g, new com.facebook.ads.redexgen.X.VG(r12));
        ((android.view.ViewGroup) r13).addView(r12.A0M);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0g(View view, View view2, List<View> list, boolean z) {
        if (!A0r()) {
            this.A0g.A0F().AHa();
        }
        if (view == null) {
            String A0W = A0W(264, 19, 118);
            if (!A0r()) {
                this.A0g.A0F().AHZ(A0W);
            }
            throw new IllegalArgumentException(A0W);
        } else if (list == null || list.size() == 0) {
            String A0W2 = A0W(180, 30, 101);
            if (!A0r()) {
                this.A0g.A0F().AHZ(A0W2);
            }
            throw new IllegalArgumentException(A0W2);
        } else {
            C1864ju A0C = A0C();
            if (A0C == null) {
                String A0W3 = A0W(29, 13, 117);
                if (!A0r()) {
                    this.A0g.A0F().AHZ(A0W3);
                }
                Log.e(A0r, A0W3);
                C1145Vm c1145Vm = new C1145Vm(AdErrorType.NATIVE_AD_IS_NOT_LOADED, A0W3);
                A16().A0F().A3N(Y1.A01(this.A00), c1145Vm.A03().getErrorCode(), c1145Vm.A04());
                if (!C1123Up.A2n(this.A0g) || this.A0I == null) {
                    return;
                }
                this.A0I.ADp(c1145Vm);
                return;
            }
            String str = this.A0W;
            if ((view instanceof FrameLayout) && str != null) {
                A0h((FrameLayout) view, str);
            }
            if (this.A08 != null) {
                C1702hB c1702hB = (C1702hB) this.A08.getNativeAdLayoutApi();
                c1702hB.A03();
                c1702hB.A02();
            }
            C1720hT c1720hT = this.A0X.get();
            if (c1720hT != null && A0C.A08() == 1) {
                c1720hT.A0E(YM.AN_INFO_ICON);
            }
            if (view2 != null) {
                boolean z2 = (view2 instanceof AdNativeComponentView) && ((AdNativeComponentView) view2).getAdContentsView() != null;
                boolean z3 = z && (view2 instanceof ImageView);
                if (!z2 && !z3) {
                    if (this.A0I != null) {
                        C1145Vm c1145Vm2 = new C1145Vm(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0W(519, 31, 93));
                        A16().A0F().A3N(Y1.A01(this.A00), c1145Vm2.A03().getErrorCode(), c1145Vm2.A04());
                        this.A0I.ADp(c1145Vm2);
                        return;
                    }
                    return;
                }
                View view3 = this.A04;
                if (A0q[3].charAt(5) != 'B') {
                    String[] strArr = A0q;
                    strArr[6] = "BCYbWK19bS9ET6nCyqUucyCTxntwC";
                    strArr[1] = "hUEQWKvNS0BeeCCeuSbrKV1BB6cqb";
                } else {
                    A0q[3] = "VFOGhBJepBYKNQ0g15YaI4y2lFqguygQ";
                }
            } else if (this.A0L != EnumC1148Vq.A06) {
                AdErrorType adErrorType = AdErrorType.NO_MEDIAVIEW_IN_NATIVEBANNERAD;
                String A0W4 = A0W(210, 33, 67);
                C1145Vm c1145Vm3 = new C1145Vm(adErrorType, A0W4);
                A16().A0F().A3N(Y1.A01(this.A00), c1145Vm3.A03().getErrorCode(), c1145Vm3.A04());
                if (this.A0I != null) {
                    this.A0I.ADp(c1145Vm3);
                }
                if (AdInternalSettings.isDebugBuild()) {
                    String str2 = A0r;
                    if (A0q[3].charAt(5) == 'B') {
                        A0q[3] = "KISMvB3VNIc1t4pH9OUWIwxPU7abTBQu";
                        Log.e(str2, A0W4);
                        return;
                    }
                    String[] strArr2 = A0q;
                    strArr2[2] = "I0o2CociGt9PfWtihtc1uzdPzn26Oc3b";
                    strArr2[7] = "DL9r7FwT46CQ5uSYOng5HfHjynm8xWWf";
                    Log.e(str2, A0W4);
                    return;
                }
                return;
            } else {
                AdErrorType adErrorType2 = AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
                String A0W5 = A0W(243, 21, 96);
                C1145Vm c1145Vm4 = new C1145Vm(adErrorType2, A0W5);
                A16().A0F().A3N(Y1.A01(this.A00), c1145Vm4.A03().getErrorCode(), c1145Vm4.A04());
                if (this.A0I != null) {
                    this.A0I.ADp(c1145Vm4);
                }
                if (!AdInternalSettings.isDebugBuild()) {
                    return;
                }
                String str3 = A0r;
                if (A0q[5].length() != 3) {
                    String[] strArr3 = A0q;
                    strArr3[0] = "ymh7ZtbYw7oyMwS2HukMuI2t1Xj3fY7y";
                    strArr3[4] = "GGURsKjIWyfUU1Vu9BOr0pf9u6pcVKo4";
                    Log.e(str3, A0W5);
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    static {
        A0e();
        A0r = UK.class.getSimpleName();
        A0s = new WeakHashMap<>();
    }

    public UK(Context context, String str, InterfaceC1134Va interfaceC1134Va, boolean z) {
        this.A0l = UUID.randomUUID().toString();
        this.A0L = EnumC1148Vq.A06;
        this.A0G = VW.A04;
        this.A09 = NE.A03;
        this.A0X = new WeakReference<>(null);
        this.A0m = new ArrayList();
        this.A0j = new Y2();
        this.A0d = false;
        this.A0c = false;
        this.A00 = -1L;
        this.A0Z = false;
        if (context instanceof C1673gi) {
            this.A0g = (C1673gi) context;
        } else if (!z) {
            this.A0g = C1046Rp.A04(context);
        } else {
            this.A0g = C1046Rp.A03(context);
        }
        this.A0g.A0O(this);
        this.A0k = str;
        this.A0h = interfaceC1134Va;
        if (A0o != null) {
            this.A0f = A0o;
        } else {
            this.A0f = new C1079Sx(this.A0g);
        }
        this.A05 = new View(context);
        this.A0i = new C1144Vk(this.A0g, this);
    }

    public UK(UK uk) {
        this((Context) uk.A0g, (String) null, uk.A0h, true);
        this.A0E = uk.A0E;
        this.A0e = uk.A0e;
        this.A0C = uk.A0C;
        this.A0n = true;
        this.A05 = new View(this.A0g);
    }

    public UK(C1673gi c1673gi, C1864ju c1864ju, C1105Tx c1105Tx, InterfaceC1134Va interfaceC1134Va) {
        this((Context) c1673gi, (String) null, interfaceC1134Va, true);
        this.A0e = c1864ju;
        this.A0E = c1105Tx;
        this.A0n = true;
        this.A05 = new View(c1673gi);
    }

    public UK(C1673gi c1673gi, C1864ju c1864ju, C1105Tx c1105Tx, InterfaceC1134Va interfaceC1134Va, C1804iu c1804iu) {
        this(c1673gi, c1864ju, c1105Tx, interfaceC1134Va);
        this.A0C = c1804iu;
    }

    private int A00() {
        if (this.A0E != null) {
            return this.A0E.A04();
        }
        if (this.A0B == null || this.A0B.A0J() == null) {
            return 1;
        }
        C1105Tx A0J = this.A0B.A0J();
        String[] strArr = A0q;
        String str = strArr[6];
        String str2 = strArr[1];
        int length = str.length();
        int viewabilityThreshold = str2.length();
        if (length != viewabilityThreshold) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0q;
        strArr2[2] = "P5kYLn6xwAUrjDfDuw88TuaVt88D3vtD";
        strArr2[7] = "ZJzVQNISDO4cH7XUZ38T2d7bCdM1k8uN";
        return A0J.A04();
    }

    private int A01() {
        if (this.A0E != null) {
            return this.A0E.A07();
        }
        if (this.A0e != null) {
            return this.A0e.A0C();
        }
        if (this.A0B != null && this.A0B.A0J() != null) {
            return this.A0B.A0J().A07();
        }
        return 0;
    }

    private int A02() {
        if (this.A0E != null) {
            return this.A0E.A08();
        }
        if (this.A0e != null) {
            return this.A0e.A0D();
        }
        if (this.A0B != null && this.A0B.A0J() != null) {
            return this.A0B.A0J().A08();
        }
        return 1000;
    }

    private int A03() {
        if (this.A0E != null) {
            return this.A0E.A09();
        }
        C05407g c05407g = this.A0B;
        if (A0q[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        A0q[5] = "Xt";
        if (c05407g == null || this.A0B.A0J() == null) {
            return 0;
        }
        return this.A0B.A0J().A09();
    }

    public static Drawable A05(C1673gi c1673gi, Bitmap bitmap, boolean z, String str) {
        BitmapDrawable A00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c1673gi.getResources(), bitmap);
        if (!z || (A00 = AbstractC1520eE.A00(c1673gi, str)) == null) {
            return bitmapDrawable;
        }
        Drawable iconViewDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, A00});
        return iconViewDrawable;
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws C1146Vn {
        EnumC1148Vq A00 = C1152Vu.A00(str2);
        if (A00 != null) {
            EnumC1148Vq template = EnumC1148Vq.A05;
            if (A00 == template) {
                return new NativeBannerAd(context, str);
            }
            EnumC1148Vq template2 = EnumC1148Vq.A06;
            if (A00 == template2) {
                return new NativeAd(context, str);
            }
            throw new C1146Vn(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(42, 34, 54), A00));
        }
        throw new C1146Vn(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(114, 50, 58), str2));
    }

    private final C1864ju A0C() {
        C1864ju c1864ju = this.A0e;
        if (c1864ju != null && c1864ju.A0R()) {
            return c1864ju;
        }
        return null;
    }

    private C1852ji A0F() {
        return A0G(false);
    }

    private C1852ji A0G(boolean z) {
        if (this.A0e != null) {
            C1864ju c1864ju = this.A0e;
            if (A0q[3].charAt(5) == 'B') {
                String[] strArr = A0q;
                strArr[0] = "rkQiEYXoMEhriwkmxTS9YqbekXjRctvV";
                strArr[4] = "aQIgqL6bCxVEsMgFZvYj1f08oAvgjHgO";
                if (c1864ju.A0R()) {
                    if (z) {
                        C1864ju c1864ju2 = this.A0e;
                        if (A0q[3].charAt(5) == 'B') {
                            A0q[3] = "EWl26Bqfon8mX0lHHC6z05409Pwx5AXq";
                            c1864ju2.A0I();
                        }
                    }
                    return this.A0e.A0E();
                }
            }
            throw new RuntimeException();
        }
        return new C1852ji();
    }

    public static C1118Uk A0K() {
        return new C1118Uk();
    }

    public static UK A0L(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (UK) ((RZ) Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (UK) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A0M */
    public final C1135Vb getAdChoicesIcon() {
        return A0F().A0G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A0O */
    public final C1136Vc getAdStarRating() {
        return A0F().A0J();
    }

    private AdPlacementType A0R() {
        if (this.A0L == EnumC1148Vq.A06) {
            return AdPlacementType.NATIVE;
        }
        return AdPlacementType.NATIVE_BANNER;
    }

    private void A0a() {
        for (View view : this.A0m) {
            view.setOnClickListener(null);
            if (A0q[3].charAt(5) != 'B') {
                throw new RuntimeException();
            }
            A0q[3] = "reBfvBMaH6BqwlxZ2WqAQZq3knZpIvyz";
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0m.clear();
    }

    private void A0b() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            X6.A0O(new X6(), this.A0g, XB.A00(getAdChoicesLinkUrl()), A1H());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        this.A0j.A05();
        this.A0i.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d() {
        if (this.A0T != null) {
            this.A0T.A0V();
            this.A0g.A0F().ACZ();
            this.A0T = null;
        }
    }

    public static void A0f(Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (A0q[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        String[] strArr = A0q;
        strArr[6] = "LXDT52DRzEPuIKBbeK5QN38hLQjcy";
        strArr[1] = "Z1aNossC2MxjaxQyIIrn4vHalGw3J";
        imageView.setBackground(null);
    }

    private void A0h(FrameLayout frameLayout, String str) {
        if (this.A0Q != null) {
            frameLayout.removeView(this.A0Q);
        }
        this.A0Q = AbstractC1520eE.A01(C1046Rp.A03(this.A0g), str);
        if (this.A0Q != null) {
            frameLayout.addView(this.A0Q, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0Q);
        }
    }

    private void A0i(C1864ju c1864ju, boolean z) {
        Iterator<UK> it;
        if (c1864ju == null) {
            return;
        }
        boolean equals = this.A0G.equals(VW.A04);
        String A0W = A0W(596, 6, 7);
        if (equals) {
            C1852ji A0E = c1864ju.A0E();
            AbstractC1847jd A0F = A0E.A0F();
            if (A0F != null) {
                O0.A00(A0F, this.A0f, A0W);
            }
            String A7O = c1864ju.A7O();
            if (A0q[3].charAt(5) != 'B') {
                throw new RuntimeException();
            }
            String[] strArr = A0q;
            strArr[6] = "lK6BgrMvSH2F6L4J2jXYHYWLLMocG";
            strArr[1] = "r7RKa3WPMM0ePgLxUrWU6ktCTFHYt";
            if (!TextUtils.isEmpty(A7O)) {
                this.A0F = new VI(A7O, this.A0g.A0A());
                this.A0f.A0e(this.A0F);
            }
            if (A0E.A0I() != null) {
                C1077Sv c1077Sv = new C1077Sv(A0E.A0I().getUrl(), A0E.A0I().getHeight(), A0E.A0I().getWidth(), c1864ju.A0G(), A0W(596, 6, 7));
                c1077Sv.A01 = this.A0D;
                this.A0f.A0W();
                this.A0f.A0c(c1077Sv);
            }
            if (!this.A0L.equals(EnumC1148Vq.A05)) {
                if (A0E.A0H() != null) {
                    this.A0f.A0c(new C1077Sv(A0E.A0H().getUrl(), A0E.A0H().getHeight(), A0E.A0H().getWidth(), c1864ju.A0G(), A0W(596, 6, 7)));
                }
                if (c1864ju.A0H() != null) {
                    List<UK> A0H = c1864ju.A0H();
                    String[] strArr2 = A0q;
                    String clientToken = strArr2[2];
                    if (clientToken.charAt(3) != strArr2[7].charAt(3)) {
                        String[] strArr3 = A0q;
                        strArr3[6] = "77gx94UEEewpboaJzdp5NkxYfy9yz";
                        strArr3[1] = "VW3IQGZLEm7XJQdY3dbeWOHCgy17v";
                        it = A0H.iterator();
                    } else {
                        String[] strArr4 = A0q;
                        strArr4[0] = "SnanODICAbTvQWDZLrONkEMoieoDOxdU";
                        strArr4[4] = "rm0yXzoJreTTXaU8PcTY1VhnZxiHPX84";
                        it = A0H.iterator();
                    }
                    while (it.hasNext()) {
                        UK next = it.next();
                        if (next.getAdCoverImage() != null) {
                            this.A0f.A0c(new C1077Sv(next.getAdCoverImage().getUrl(), next.getAdCoverImage().getHeight(), next.getAdCoverImage().getWidth(), c1864ju.A0G(), A0W(596, 6, 7)));
                        }
                    }
                }
                String A0e = A0E.A0e();
                if (!TextUtils.isEmpty(A0e)) {
                    this.A0f.A0b(new C1075St(A0e, c1864ju.A0G(), A0W(596, 6, 7), A0E.A0D()));
                }
            }
            if (A0F != null && A0F.A1g()) {
                C1075St cacheFileData = new C1075St(A0F.A0x(), A0F.A1D(), A0W);
                cacheFileData.A04 = true;
                cacheFileData.A03 = A0W(0, 5, 66);
                this.A0f.A0Y(cacheFileData);
            }
        }
        this.A0f.A0X(new VZ(this, c1864ju, z), new C1072Sq(c1864ju.A0G(), A0W));
    }

    private void A0j(NG ng) {
        if (this.A0e == null) {
            return;
        }
        this.A0e.A0K(ng);
    }

    public static void A0k(NativeAdImageApi nativeAdImageApi, ImageView imageView, C1673gi c1673gi) {
        if (nativeAdImageApi != null && imageView != null) {
            new LM(imageView, c1673gi).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0n(InterfaceC1103Tv interfaceC1103Tv) {
        this.A0I = interfaceC1103Tv;
    }

    private final void A0o(String str) {
        this.A0V = str;
    }

    private void A0p(List<View> list, View view) {
        if (this.A0h != null && this.A0h.AJx(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A0p(list, viewGroup.getChildAt(i));
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A1D() == EnumC1139Vf.A05 || A1D() == EnumC1139Vf.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0r() {
        return A0F().A0j();
    }

    public final int A0y() {
        return A0F().A06();
    }

    public final int A0z() {
        return A0F().A07();
    }

    public final int A10() {
        if (this.A0e != null && !TextUtils.isEmpty(this.A0e.A0E().A0e())) {
            return this.A0e.A0E().A0A();
        }
        return -1;
    }

    public final long A11() {
        return this.A00;
    }

    public final C1864ju A12() {
        return this.A0e;
    }

    public final AbstractC1847jd A13() {
        return A0F().A0F();
    }

    public final C1079Sx A14() {
        return this.A0f;
    }

    public final C1673gi A15() {
        return this.A0g;
    }

    public final C1673gi A16() {
        return this.A0g;
    }

    public final View$OnClickListenerC1111Ud A17() {
        return this.A0H;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A18 */
    public final C1135Vb getAdCoverImage() {
        return A0F().A0H();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A19 */
    public final C1135Vb getAdIcon() {
        return A0F().A0I();
    }

    public final InterfaceC1103Tv A1A() {
        return this.A0I;
    }

    public final C1137Vd A1B() {
        return this.A0J;
    }

    public final EnumC1138Ve A1C() {
        return this.A0K;
    }

    public final EnumC1139Vf A1D() {
        return A0F().A0K();
    }

    public final Y2 A1E() {
        return this.A0j;
    }

    public final C1264a5 A1F() {
        if (A13() == null || !A13().A2U()) {
            return null;
        }
        C1264a5 c1264a5 = new C1264a5(this.A0g, EnumC1281aM.A05);
        c1264a5.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.VY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UK.this.A1R(view);
            }
        });
        return c1264a5;
    }

    public final C1618fp A1G() {
        return this.A0U;
    }

    public final String A1H() {
        if (this.A0e == null || !isAdLoaded()) {
            return null;
        }
        return this.A0e.A7O();
    }

    public final String A1I() {
        return this.A0W;
    }

    public final String A1J() {
        return A0G(true).A0Q();
    }

    public final String A1K() {
        return A0G(true).A0R();
    }

    public final String A1L() {
        return A0F().A0d();
    }

    public final String A1M() {
        if (this.A0e == null || TextUtils.isEmpty(this.A0e.A0E().A0e())) {
            return null;
        }
        return this.A0f.A0T(this.A0e.A0E().A0e());
    }

    public final List<UK> A1N() {
        if (this.A0e == null || !isAdLoaded()) {
            return null;
        }
        return this.A0e.A0H();
    }

    public final void A1O() {
        if (!AbstractC0964Oh.A00(this.A0g.A02()).A0O(this.A0g, false)) {
            A0b();
            if (A0q[5].length() == 3) {
                throw new RuntimeException();
            }
            A0q[3] = "yREZ0BSYt8CSunaR9f1myx0zIAs3a5bO";
            return;
        }
        AbstractC1236Zd A01 = AbstractC1237Ze.A01(this.A0g, this.A0g.A0A(), A1H(), this.A08);
        if (A01 == null) {
            A0b();
            return;
        }
        ((C1702hB) this.A08.getNativeAdLayoutApi()).A05(A01);
        if (!C1123Up.A22(this.A0g)) {
            C1673gi A15 = A15();
            String[] strArr = A0q;
            if (strArr[6].length() != strArr[1].length()) {
                A15.A0F().ABW();
                A01.setOnAdClosedListener(this.A07);
            } else {
                A0q[5] = "wIzlh5hd";
                A15.A0F().ABW();
                A01.setOnAdClosedListener(this.A07);
            }
        }
        A01.setAdReportingCallbackListener(this.A0N);
        A01.A0N();
    }

    public final void A1P(Drawable drawable) {
        this.A01 = drawable;
        A1o(drawable != null, true);
    }

    public final void A1Q(View view) {
        this.A0m.add(view);
        view.setOnClickListener(this.A0H);
        view.setOnTouchListener(this.A0H);
        if (C1123Up.A1C(view.getContext())) {
            view.setOnLongClickListener(this.A0H);
        }
    }

    public final /* synthetic */ void A1R(View view) {
        this.A0g.A0F().AAy(EnumC1281aM.A05.name().toLowerCase(Locale.US));
        A1O();
    }

    public final void A1S(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, imageView, arrayList, true);
    }

    public final void A1T(View view, ImageView imageView, List<View> clickableViews) {
        A0g(view, imageView, clickableViews, true);
    }

    public final void A1U(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, adNativeComponentView, arrayList, false);
    }

    public final void A1V(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews) {
        A0g(view, adNativeComponentView, clickableViews, false);
    }

    public final void A1W(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews, boolean z) {
        A0g(view, adNativeComponentView, clickableViews, z);
    }

    public final void A1X(View view, AdNativeComponentView adNativeComponentView, boolean z) {
        List<View> clickableViews = new ArrayList<>();
        A0p(clickableViews, view);
        A0g(view, adNativeComponentView, clickableViews, z);
    }

    public final void A1Y(AdClosedListener adClosedListener) {
        A15().A0F().ABX();
        this.A07 = adClosedListener;
    }

    public final void A1Z(MediaView mediaView) {
        if (mediaView != null) {
            this.A0c = true;
        }
    }

    public final void A1a(MediaView mediaView) {
        if (mediaView != null) {
            this.A0d = true;
        }
    }

    public final void A1b(NativeAdBase nativeAdBase, NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0n(new C05326y(nativeAdListener, nativeAdBase));
    }

    public final void A1c(NativeAdLayout nativeAdLayout) {
        this.A08 = nativeAdLayout;
    }

    public final void A1d(C1864ju c1864ju) {
        A0i(c1864ju, true);
        if (this.A0I != null && c1864ju.A0H() != null) {
            C1153Vv c1153Vv = new C1153Vv(this);
            for (UK uk : c1864ju.A0H()) {
                if (A0q[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0q;
                strArr[0] = "7JUEXy8BV6wMe69mvRG8Hisl1h58kfsH";
                strArr[4] = "Ag7M0cktqfZPxcWhbEyn8XCMGlxm5ALn";
                uk.A0j(c1153Vv);
            }
        }
    }

    public final void A1e(C1720hT c1720hT) {
        this.A0X = new WeakReference<>(c1720hT);
    }

    public final void A1f(VW vw, String str, T3 t3) {
        if (str == null) {
            this.A0g.A0F().A3Q();
        } else {
            this.A0g.A0F().A3P();
        }
        this.A00 = System.currentTimeMillis();
        boolean z = this.A0n;
        String[] strArr = A0q;
        if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
            String[] strArr2 = A0q;
            strArr2[0] = "knecuAJjZigTf7VsFCGhTGCW7dxKplKn";
            strArr2[4] = "uRrNlLGUJL1gxvEKewtOLFu1Ztix0dl1";
            if (z) {
                AdSettings.IntegrationErrorMode A00 = OA.A00(this.A0g);
                String A0W = A0W(566, 30, 105);
                AdSettings.IntegrationErrorMode integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
                if (!integrationErrorMode.equals(A00)) {
                    C1145Vm c1145Vm = new C1145Vm(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(566, 30, 105));
                    A16().A0F().A3N(Y1.A01(this.A00), c1145Vm.A03().getErrorCode(), c1145Vm.A04());
                    if (this.A0I != null) {
                        this.A0I.ADp(c1145Vm);
                    } else {
                        Log.e(A0W(76, 17, 41), A0W);
                    }
                    C1086Te c1086Te = new C1086Te(A0W);
                    A16().A08().ABC(A0W(550, 3, 101), AbstractC1085Td.A0c, c1086Te);
                } else {
                    throw new OF(A0W);
                }
            }
            this.A0n = true;
            this.A0G = vw;
            if (vw.equals(VW.A05)) {
                NE ne = NE.A05;
                if (A0q[3].charAt(5) == 'B') {
                    A0q[3] = "N11XMBa1eBkGGouoRChlRsXEwEtHvHDZ";
                    this.A09 = ne;
                }
            }
            this.A0D = t3;
            O7 o7 = new O7(this.A0k, this.A0L, A0R(), null, 1, new C1793ij());
            o7.A05(vw);
            o7.A06(this.A0V);
            o7.A07(this.A0W);
            this.A0B = new C05407g(this.A0g, o7);
            this.A0B.A0S(new C1154Vw(this));
            this.A0B.A0W(str);
            return;
        }
        throw new RuntimeException();
    }

    public final void A1g(C1137Vd c1137Vd) {
        this.A0J = c1137Vd;
    }

    public final void A1h(EnumC1138Ve enumC1138Ve) {
        this.A0K = enumC1138Ve;
    }

    public final void A1i(EnumC1148Vq enumC1148Vq) {
        if (!A0r()) {
            if (EnumC1148Vq.A05.equals(enumC1148Vq)) {
                this.A0g.A0F().A3T(AdPlacementType.NATIVE_BANNER.toString(), this.A0k);
            } else {
                this.A0g.A0F().A3T(AdPlacementType.NATIVE.toString(), this.A0k);
            }
        }
        this.A0L = enumC1148Vq;
    }

    public final void A1j(InterfaceC1235Zc interfaceC1235Zc) {
        this.A0N = interfaceC1235Zc;
    }

    public final void A1k(AbstractC1617fo abstractC1617fo) {
        this.A0Y = new WeakReference<>(abstractC1617fo);
    }

    public final void A1l(boolean z) {
        this.A0a = z;
    }

    public final void A1m(boolean z) {
        this.A0Z = z;
    }

    public final void A1n(boolean z) {
        this.A0b = z;
    }

    public final void A1o(boolean z, boolean z2) {
        String A0W;
        if (z) {
            if (this.A0G.equals(VW.A05)) {
                boolean A0r2 = A0r();
                if (A0q[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0q;
                strArr[6] = "maLBxQjysuwmJ75m3YPaJDHU5JlBu";
                strArr[1] = "hXXEi4DazsshJWFEyRiAh7tUxgC1d";
                if (!A0r2 && this.A0I != null) {
                    this.A0I.AEq();
                }
            }
            if (this.A0U != null) {
                this.A0U.A0U();
                this.A0i.A09();
                return;
            }
            return;
        }
        if (this.A0U != null) {
            C1864ju adapter = A12();
            if (adapter != null) {
                A0W = adapter.A0G();
            } else if (A0q[5].length() != 3) {
                String[] strArr2 = A0q;
                strArr2[2] = "2ETmOz1YodPf8MKRGGB9YcIoy7FDTpAq";
                strArr2[7] = "k5VZ8yDbY0Zqj8FxkeEerY08JJe7M6tR";
                A0W = A0W(0, 0, 121);
            } else {
                String[] strArr3 = A0q;
                strArr3[0] = "JjUCnZOckAfeDcKZajvIf0dyi7sruRRg";
                strArr3[4] = "GlO3j5qd4HFQ8L5mPWBpkp3onxgG8Q98";
                A0W = A0W(0, 0, 121);
            }
            this.A0i.A0C(this.A0g, A0W);
            this.A0U.A0V();
        }
        if (this.A0I != null && z2) {
            C1145Vm A01 = C1145Vm.A01(AdErrorType.BROKEN_MEDIA_ERROR, A0W(93, 21, 47));
            A16().A0F().A3N(Y1.A01(this.A00), A01.A03().getErrorCode(), A01.A04());
            this.A0I.ADp(A01);
        }
    }

    public final boolean A1p() {
        return this.A0Z;
    }

    public final boolean A1q() {
        return A0F().A0h();
    }

    public final boolean A1r() {
        return A0F().A0g();
    }

    public final boolean A1s() {
        return this.A0L == EnumC1148Vq.A05;
    }

    public final boolean A1t() {
        return this.A08 == null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1142Vi
    public final int A7d() {
        View view = this.A06;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof C1557eq) {
                return ((C1557eq) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new C1140Vg(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        AbstractC1156Vy.A05(A0W(553, 7, 95), A0W(363, 19, 11), A0W(21, 8, 17));
        if (C1123Up.A1z(this.A0g)) {
            A16().A0B().AKU(this.A03);
        }
        if (!A0r()) {
            this.A0g.A0F().A3U();
        }
        if (this.A0B != null) {
            this.A0B.A0Y(true);
            this.A0B.A0K();
            this.A0B = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0G.equals(VW.A05)) {
            this.A09 = NE.A04;
        }
        this.A0G = VW.A04;
        A0i(this.A0e, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdBodyText() {
        return A0G(true).A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdCallToAction() {
        return A0G(true).A0Z();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        return getAdChoicesIcon().getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesLinkUrl() {
        return A0F().A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesText() {
        return A0F().A0N();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdHeadline() {
        return A0G(true).A0O();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdLinkDescription() {
        return A0G(true).A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdSocialContext() {
        return A0G(true).A0T();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdTranslation() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdUntrimmedBodyText() {
        return A0G(true).A0X();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdvertiserName() {
        return A0G(true).A0Y();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        C1135Vb nativeAdImage;
        if (this.A0e == null || (nativeAdImage = this.A0e.A0E().A0H()) == null) {
            return 0.0f;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        if (height > 0) {
            float f = width;
            float f2 = height;
            String[] strArr = A0q;
            if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                A0q[3] = "OUTl4BjdLTzCi4kmpI6eA9pKBM08eKMp";
                return f / f2;
            }
            throw new RuntimeException();
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0l;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0k;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final Drawable getPreloadedIconViewDrawable() {
        C1135Vb A0I;
        Bitmap A0N;
        C1864ju adapter = this.A0e;
        if (adapter != null && (A0I = A0F().A0I()) != null && (A0N = this.A0f.A0N(A0I.getUrl())) != null) {
            return A05(A16(), A0N, A1t(), A1I());
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getPromotedTranslation() {
        return A0G(true).A0S();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getSponsoredTranslation() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        return this.A0e != null && this.A0e.A0Q();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z = true;
        if (this.A0B != null) {
            C05407g c05407g = this.A0B;
            String[] strArr = A0q;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0q;
            strArr2[2] = "gqyuy6F7WThaJUOfAsIyr4sziGGBhw0f";
            strArr2[7] = "L6lbko7Rv34huPFym8TvMBezY1vQkdWf";
            z = c05407g.A0Z();
        } else if (this.A0C != null) {
            z = this.A0C.A0A();
        }
        this.A0g.A0F().A5f(z);
        return z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        return this.A0e != null && this.A0e.A0R();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        AbstractC1156Vy.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(13, 8, 68));
        A1f(VW.A00(NativeAdBase.MediaCacheFlag.ALL), null, new T3(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        AbstractC1156Vy.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(5, 8, 76));
        ((C1140Vg) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        if (this.A05 != null) {
            this.A05.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A04 != null) {
            this.A04.post(new C1155Vx(this));
        }
        String str = A0W(164, 16, 48) + AbstractC1200Xt.A03(this.A0g, th);
        A16().A0F().A3N(Y1.A01(this.A00), 2001, str);
        if (this.A0I != null) {
            this.A0I.ADp(new C1145Vm(2001, str));
        }
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0o(extraHints.getHints());
        this.A0W = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void unregisterView() {
        C1521eF c1521eF = this.A0Q;
        if (c1521eF != null) {
            ViewParent parent = c1521eF.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c1521eF);
            }
            this.A0Q = null;
        }
        if (this.A04 == null || this.A06 == null) {
            return;
        }
        if (!A0r()) {
            InterfaceC0899Lt A0F = this.A0g.A0F();
            String[] strArr = A0q;
            if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                A0q[3] = "w9n8TBisrss8zAM8EiwpgeUnlq2PaQ6F";
                A0F.unregisterView();
            }
            throw new RuntimeException();
        }
        if (C1123Up.A1z(this.A0g)) {
            A16().A0B().AKU(this.A03);
        }
        if (A0s.containsKey(this.A04) && A0s.get(this.A04).get() == this) {
            View view = this.A04;
            String[] strArr2 = A0q;
            if (strArr2[2].charAt(3) != strArr2[7].charAt(3)) {
                String[] strArr3 = A0q;
                strArr3[6] = "1kkuB6xtwDeF3EtU3aavEsH64nQcK";
                strArr3[1] = "rb6NM7K87kMKFcLdVL5rugEXgDuZd";
                if ((view instanceof ViewGroup) && this.A0M != null) {
                    ((ViewGroup) this.A04).removeView(this.A0M);
                    this.A0M = null;
                }
                if (this.A0e != null) {
                    this.A0e.A0J();
                }
                if (this.A0O != null && C1123Up.A1C(this.A0g)) {
                    this.A0O.A07();
                    View view2 = this.A04;
                    String[] strArr4 = A0q;
                    if (strArr4[2].charAt(3) == strArr4[7].charAt(3)) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A0q;
                    strArr5[0] = "4gE9LeNlQroHqEeWf1EzJsbNX9PRfDme";
                    strArr5[4] = "TBDkrxJbHtSaZ13hkNs0RNY8SzE0jpKy";
                    view2.getOverlay().remove(this.A0O);
                }
                A0s.remove(this.A04);
                A0a();
                this.A04 = null;
                this.A06 = null;
                if (this.A0U != null) {
                    this.A0U.A0V();
                    this.A0U = null;
                }
                A0d();
                this.A0A = null;
                this.A0Z = false;
                return;
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException(A0W(481, 38, 57));
    }
}
