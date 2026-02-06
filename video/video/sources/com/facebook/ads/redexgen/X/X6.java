package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.facebook.internal.C2372q;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.C9680tD0;
import o.ED2;
import o.InterfaceC8148mw2;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class X6 {
    public static byte[] A00;
    public static String[] A01 = {"T4dPy6oALRnRtXie0LYtNa7PXoaz5xNV", "GuB", "", "N5ZcwGbFLOfjQt8i7LOYdNhhAY9bfZ8J", "XGEF2r9HzP4eyBZiq0puzcaX55o", "r68Pu4BAqG0jUrZ19Ek7iVXcY822rh1q", "w97ZnD7u", "Y1Vl"};

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{77, 66, 83, 74, 78, 56, 77, 83, 95, 73, 79, 89, 94, 73, 83, 88, 67, 71, 73, 66, 84, 91, 74, 82, 69, 70, 74, 84, 81, 74, 86, 90, 91, 65, 80, 91, 65, 85, 87, 90, 90, 83, 68, 73, 82, 89, 91, 87, 95, 88, 88, 122, 117, 60, 111, 59, 104, 111, 122, 105, 111, 59, 90, 110, Byte.MAX_VALUE, 114, 126, 117, QC1.w, 126, 85, 126, 111, 108, 116, 105, 112, 90, QC1.w, 111, 114, 109, 114, 111, 98, 53, 59, 86, 122, 112, 126, 59, 104, 110, 105, 126, 59, 111, 115, 122, 111, 59, 114, 111, 60, 104, 59, 114, 117, 59, 98, 116, 110, 105, 59, 90, 117, Byte.MAX_VALUE, 105, 116, 114, Byte.MAX_VALUE, 86, 122, 117, 114, 125, 126, 104, 111, 53, 99, 118, 119, 59, 125, 114, 119, 126, 53, 28, 1, 13, C8077mf.m, C8077mf.B, 6, C8077mf.n, C8077mf.m, C8077mf.y, C8077mf.y, 17, C8077mf.u, C3307Iz.Y, 55, 58, 54, C4715Xk.i, 48, 54, C8077mf.G, 54, C3307Iz.Z, 36, 60, C3307Iz.V, 56, C8077mf.D, 104, 64, 79, 126, 64, 66, 85, 72, 87, 72, 85, 88, C3307Iz.a0, C3307Iz.Y, C3307Iz.d0, 58, C3307Iz.Z, C3307Iz.V, C3307Iz.d0, 36, C3307Iz.c0, C3307Iz.V, 55, 42, C3307Iz.d0, C3307Iz.V, 107, C3307Iz.d0, C3307Iz.c0, 49, 32, C3307Iz.c0, 49, 107, 36, C3307Iz.Y, 49, C3307Iz.d0, 42, C3307Iz.c0, 107, 19, C8077mf.n, 0, C8077mf.u, 58, 53, ED2.a, C3307Iz.a0, 52, 50, ED2.a, 117, 50, 53, 47, 62, 53, 47, 117, 56, 58, 47, 62, 60, 52, C3307Iz.a0, 34, 117, C8077mf.C, 9, C8077mf.x, C8077mf.n, 8, C8077mf.D, C8077mf.C, C8077mf.A, C8077mf.H, 112, 125, 125, 126, 70, 86, 75, 83, 87, 65, 86, 113, 118, 104, 50, 48, C4715Xk.i, C4715Xk.i, 52, 35, C8077mf.B, 53, C8077mf.x, C8077mf.z, C8077mf.E, C8077mf.E, C8077mf.u, 5, 35, C8077mf.p, 7, C8077mf.u, 54, 57, 60, 48, 59, C3307Iz.V, 1, 58, 62, 48, 59, 113, 125, Byte.MAX_VALUE, 60, 115, 124, 118, 96, 125, 123, 118, 60, 112, 96, 125, 101, 97, 119, 96, 60, 115, 98, 98, 126, 123, 113, 115, 102, 123, 125, 124, 77, 123, 118, C8077mf.q, 3, 1, 66, 13, 2, 8, C8077mf.H, 3, 5, 8, 66, C8077mf.D, 9, 2, 8, 5, 2, C8077mf.m, 103, 107, 105, 42, 98, 101, 103, 97, 102, 107, 107, 111, 42, 99, 107, 107, 99, 104, 97, 116, 104, 101, 125, 119, 112, 107, 118, 97, 101, 106, 42, 67, 107, 107, 99, 104, 97, 84, 104, 101, 125, 87, 112, 107, 118, 97, 69, 74, 75, 114, 97, 118, 104, 101, 125, 65, 124, 112, 97, 118, 106, 101, 104, 69, 103, 112, 109, 114, 109, 112, 125, 109, 97, 99, 32, 104, 111, 109, 107, 108, 97, 97, 101, 32, 101, 111, 122, 111, 96, 111, 66, 78, 79, 71, 72, 70, 126, 82, 84, 81, 81, 78, 83, 85, 82, 108, 84, 77, 85, 72, 118, 72, 79, 69, 78, 86, 3, C8077mf.q, C8077mf.p, 6, 9, 7, ED2.a, 19, C8077mf.y, C8077mf.r, C8077mf.r, C8077mf.q, C8077mf.u, C8077mf.x, 19, 51, C8077mf.r, C8077mf.n, 9, C8077mf.x, 51, 3, C8077mf.u, 5, 5, C8077mf.p, C3307Iz.e0, C8077mf.y, C8077mf.n, C8077mf.x, 9, 55, 9, C8077mf.p, 4, C8077mf.q, C8077mf.A, 5, C8077mf.x, 3, 7, C8077mf.u, 3, 57, 8, 3, 17, 57, C8077mf.u, 7, 4, 75, 79, 4, C8077mf.m, C8077mf.p, C8077mf.z, 7, C8077mf.r, 7, 6, C4715Xk.i, 1, C8077mf.p, C8077mf.m, 1, 9, C4715Xk.i, 6, 7, C8077mf.p, 3, C8077mf.E, C4715Xk.i, C8077mf.q, 17, C3307Iz.Z, C3307Iz.f0, C3307Iz.V, C3307Iz.c0, 35, 42, C4715Xk.i, C8077mf.E, C3307Iz.Y, 34, 42, C8077mf.A, C8077mf.m, C8077mf.m, C8077mf.q, 36, 56, 56, 60, 118, 99, 99, 60, 32, C3307Iz.e0, 53, 98, C3307Iz.c0, 35, 35, C3307Iz.c0, 32, C3307Iz.a0, 98, 47, 35, C3307Iz.V, 99, ED2.a, 56, 35, 62, C3307Iz.a0, 99, C3307Iz.e0, 60, 60, ED2.a, 99, C3307Iz.Y, 58, 58, 62, C4715Xk.i, 82, 78, 78, 74, 73, 0, C8077mf.y, C8077mf.y, 74, 86, 91, 67, C8077mf.x, 93, 85, 85, 93, 86, 95, C8077mf.x, 89, 85, 87, C8077mf.y, 94, 5, C8077mf.B, C8077mf.y, 64, 71, 90, 93, 72, 71, 93, 118, 78, 72, 68, 76, 90, C4715Xk.i, C3307Iz.Z, C8077mf.m, 55, 53, 55, C8077mf.m, 50, C4715Xk.i, 56, 32, 49, C3307Iz.Y, C8077mf.m, 55, 56, C4715Xk.i, 55, ED2.a, C3307Iz.Z, C8077mf.m, 59, 58, C8077mf.m, 55, 32, 53, 13, C8077mf.A, 59, 7, C8077mf.z, 1, 5, C8077mf.r, 13, C8077mf.u, 1, 59, 5, C8077mf.A, 59, 7, C8077mf.r, 5, 59, C8077mf.u, 86, 110, 116, 88, 113, 53, 88, 99, 98, 116, 110, 96, 105, 87, 91, 72, 81, 95, 78, C3307Iz.Y, ED2.a, C3307Iz.d0, 59, C3307Iz.X, 40, 48, 55, C3307Iz.c0, C3307Iz.Y, 62, 105, 32, 40, 40, 32, C3307Iz.c0, 34, 105, 36, 40, 42, 36, 51, C3307Iz.X, ED2.a, C3307Iz.d0, 51, C8077mf.E, 57, 50, 51, 66, 89, 94, 70, 66, 82, 126, 83, 125, 98, 110, 124, 95, 114, 123, 110};
    }

    static {
        A09();
    }

    private int A00(C1673gi c1673gi) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = c1673gi.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(A07(C2372q.n, 19, 65), 0)) != null && !TextUtils.isEmpty(packageInfo.versionName)) {
                return Integer.parseInt(packageInfo.versionName.split(A07(C10997yd1.t1, 2, 9), 2)[0]);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            return -1;
        }
    }

    public static Intent A01(Uri uri) {
        Intent intent = new Intent(A07(C10997yd1.Q1, 26, 10), uri);
        intent.setComponent(null);
        intent.setSelector(null);
        return intent;
    }

    public static Intent A02(C1673gi c1673gi, Uri uri) {
        Intent A012 = A01(uri);
        A012.addCategory(A07(212, 33, 20));
        A012.addFlags(268435456);
        A012.putExtra(A07(288, 34, 93), c1673gi.getPackageName());
        A012.putExtra(A07(494, 14, 41), false);
        if (C1123Up.A24(c1673gi)) {
            if (A07(InterfaceC8148mw2.g.p, 2, 98).equals(uri.getScheme())) {
                A012.setPackage(A07(C2372q.n, 19, 65));
            }
        }
        return A012;
    }

    public static Intent A03(C1673gi c1673gi, Uri uri) {
        Intent A012 = A01(uri);
        A012.setPackage(A07(322, 19, 35));
        A012.putExtra(A07(259, 8, 30), c1673gi.getPackageName());
        A012.putExtra(A07(694, 7, 6), true);
        return A012;
    }

    public static Uri A04(C1673gi c1673gi, Uri uri) {
        boolean equals = A07(688, 6, 117).equals(uri.getScheme());
        String A07 = A07(587, 26, 117);
        if (equals) {
            return XB.A00(A07 + uri.getEncodedQuery());
        }
        if (uri.toString().startsWith(A07)) {
            return uri;
        }
        c1673gi.A0F().ABH(5);
        return null;
    }

    private final EnumC0922Mq A05(C1673gi c1673gi, Uri uri, String str, Map<String, String> map) throws C1175Ws {
        boolean A05 = AbstractC1124Uq.A05(c1673gi);
        boolean isInAppBrowserEnabled = A0F(uri);
        if (isInAppBrowserEnabled && A05) {
            A0C(c1673gi, uri, str, map);
            EnumC0922Mq enumC0922Mq = EnumC0922Mq.A08;
            if (A01[7].length() != 30) {
                String[] strArr = A01;
                strArr[2] = "";
                strArr[1] = "Q7p";
                return enumC0922Mq;
            }
            throw new RuntimeException();
        }
        c1673gi.A0F().A9x(A05);
        A0A(c1673gi, uri);
        return EnumC0922Mq.A07;
    }

    public static EnumC0922Mq A06(X6 x6, C1673gi c1673gi, Uri uri, String str, Map<String, String> extraData) throws C1175Ws {
        boolean z = A0F(uri) && A07(InterfaceC8148mw2.h.k, 15, 8).equals(uri.getHost());
        boolean isGooglePlayWebLink = A07(688, 6, 117).equals(uri.getScheme());
        if (!isGooglePlayWebLink && !z) {
            return x6.A05(c1673gi, uri, str, extraData);
        }
        try {
            x6.A0B(c1673gi, uri, str);
            return EnumC0922Mq.A03;
        } catch (X4 unused) {
            return x6.A05(c1673gi, uri, str, extraData);
        }
    }

    private String A08(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    private void A0A(C1673gi c1673gi, Uri uri) throws C1175Ws {
        C1177Wu.A0D(c1673gi, A02(c1673gi, uri));
    }

    private final void A0B(C1673gi c1673gi, Uri uri, String str) throws X4, C1175Ws {
        if (A0H(c1673gi)) {
            if (C1123Up.A1I(c1673gi)) {
                String queryParameter = uri.getQueryParameter(A07(613, 2, 62));
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (A01[3].charAt(29) != 'Z') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[4] = "AXwrjbGi2NqoDqohSkmHlyhQGK6";
                    strArr[6] = "xSKC0PNk";
                    String A07 = A07(615, 13, 102);
                    String packageName = uri.toString();
                    AbstractC0957Oa.A03(queryParameter, A07, packageName);
                }
            }
            boolean z = (c1673gi.A0H().A01() && C1123Up.A1g(c1673gi)) || (C1123Up.A25(c1673gi) && A0I(c1673gi));
            if (!z) {
                boolean shouldTryToOpenSplitScreen = C1123Up.A2S(c1673gi);
                if (shouldTryToOpenSplitScreen) {
                    boolean shouldTryToOpenSplitScreen2 = C1177Wu.A0E(c1673gi, A03(c1673gi, uri));
                    if (shouldTryToOpenSplitScreen2) {
                        return;
                    }
                }
            }
            boolean A0M = A0M(c1673gi, uri, str);
            if (A01[3].charAt(29) != 'Z') {
                A01[7] = "w5Gj6271lmeoEbiTTMEsWTdaWp";
                if (A0M) {
                    return;
                }
            } else {
                A01[3] = "TMuIQjN9vpUXBqY7VYY4Z8DVMg5lcZnK";
                if (A0M) {
                    return;
                }
            }
            boolean shouldTryToOpenSplitScreen3 = A0K(c1673gi, uri);
            if (shouldTryToOpenSplitScreen3) {
                return;
            }
            Intent A02 = A02(c1673gi, uri);
            A02.setPackage(A07(322, 19, 35));
            if (Build.VERSION.SDK_INT >= 24 && z) {
                A02.addFlags(268472320);
            }
            C1177Wu.A0D(c1673gi, A02);
            return;
        }
        throw new X4();
    }

    private void A0C(C1673gi c1673gi, Uri uri, String str, Map<String, String> extraData) {
        AdActivityIntent A05 = C1177Wu.A05(c1673gi);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            A05.addFlags(268435456);
        }
        A05.putExtra(A07(734, 8, 68), WK.A03);
        A05.putExtra(A07(C9680tD0.j, 10, 107), uri.toString());
        A05.putExtra(A07(277, 11, 26), str);
        A05.putExtra(A07(533, 11, 0), System.currentTimeMillis());
        if (extraData != null) {
            String A07 = A07(267, 10, 56);
            A05.putExtra(A07, extraData.get(A07));
            String A072 = A07(655, 21, 43);
            A05.putExtra(A072, extraData.get(A072));
            String A073 = A07(628, 27, 27);
            A05.putExtra(A073, extraData.get(A073));
            String A074 = A07(InterfaceC8148mw2.g.r, 23, 45);
            A05.putExtra(A074, extraData.get(A074));
            String A075 = A07(726, 8, 120);
            String str2 = extraData.get(A075);
            if (str2 != null) {
                A05.putExtra(A075, str2);
            }
            String[] strArr = A01;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "O2ZHG0wvVecFW0SnbGPXrhKJPtS";
            strArr2[6] = "QZ4K1TQ8";
            String A076 = A07(676, 12, 72);
            String str3 = extraData.get(A076);
            if (str3 != null) {
                A05.putExtra(A076, Boolean.valueOf(str3));
            }
        }
        try {
            C1177Wu.A0B(c1673gi, A05);
        } catch (C1175Ws e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            c1673gi.A08().ABC(A07(168, 11, 110), AbstractC1085Td.A0D, new C1086Te(th));
            Log.e(A07(149, 17, 28), A07(50, 90, 84), th);
        }
    }

    public static void A0D(X6 x6, C1673gi c1673gi, Uri uri, String str) {
        x6.A0N(c1673gi, uri, str);
    }

    public static void A0E(X6 x6, C1673gi c1673gi, Uri uri, String str) throws C1175Ws {
        A06(x6, c1673gi, uri, str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0F(Uri uri) {
        boolean isHttpPermitted = Build.VERSION.SDK_INT < 24 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(uri.getHost());
        String scheme = uri.getScheme();
        if (isHttpPermitted) {
            boolean isHttpPermitted2 = A07(544, 4, 48).equalsIgnoreCase(scheme);
        }
        boolean isHttpPermitted3 = A07(582, 5, 1).equalsIgnoreCase(scheme);
        return isHttpPermitted3;
    }

    private boolean A0G(C1673gi c1673gi) {
        if (C1123Up.A1F(c1673gi)) {
            int deviceFBVersion = C1123Up.A0E(c1673gi);
            int A002 = A00(c1673gi);
            if (deviceFBVersion == -1 || A002 == -1 || deviceFBVersion > A002) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[6];
            int length = str.length();
            int fbVersionWithGPOverlay = str2.length();
            if (length != fbVersionWithGPOverlay) {
                A01[7] = "9F";
                if (i < 28) {
                    return false;
                }
                String[] strArr2 = A01;
                String str3 = strArr2[2];
                String str4 = strArr2[1];
                int length2 = str3.length();
                int fbVersionWithGPOverlay2 = str4.length();
                if (length2 != fbVersionWithGPOverlay2) {
                    String[] strArr3 = A01;
                    strArr3[4] = "HTEWLbQNfCJbfH7LEcJTogLCYG9";
                    strArr3[6] = "jIuteURS";
                    return true;
                }
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    private boolean A0H(C1673gi c1673gi) {
        Intent playStoreIntent = new Intent(A07(C10997yd1.Q1, 26, 10), XB.A00(A07(548, 34, 3)));
        Iterator<ResolveInfo> it = c1673gi.getPackageManager().queryIntentActivities(playStoreIntent, 0).iterator();
        do {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NqbTETCkL6wtg2G74gvKWlTJws9";
            strArr2[6] = "JszVyiBC";
            if (!hasNext) {
                return false;
            }
        } while (!it.next().activityInfo.applicationInfo.packageName.equals(A07(322, 19, 35)));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r0 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        r9 = android.content.res.Resources.getSystem().getBoolean(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
        r1 = r4.getIdentifier(A07(457, 37, 47), r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
        if (r1 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
        r10 = android.content.res.Resources.getSystem().getBoolean(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
        r11 = com.facebook.ads.redexgen.X.XK.A0C(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
        if (r9 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
        if (r10 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
        if (r11 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        r8 = r8 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r0 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0I(C1673gi c1673gi) {
        String A07;
        String A072;
        int identifier;
        boolean supportsSplitScreenMultiWindow = true;
        boolean z = Build.VERSION.SDK_INT >= 24;
        boolean A0J = A0J(c1673gi);
        String[] strArr = A01;
        if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "";
        strArr2[1] = "LeI";
        boolean z2 = z && A0J;
        boolean z3 = true;
        boolean supportsSplitScreenMultiWindow2 = true;
        boolean appResizingSupported = true;
        boolean onAndAboveNOS = C1123Up.A2F(c1673gi);
        if (onAndAboveNOS) {
            Resources system = Resources.getSystem();
            String[] strArr3 = A01;
            if (strArr3[5].charAt(7) != strArr3[0].charAt(7)) {
                String A073 = A07(431, 26, 110);
                A07 = A07(245, 4, 93);
                A072 = A07(179, 7, 7);
                identifier = system.getIdentifier(A073, A07, A072);
            } else {
                String[] strArr4 = A01;
                strArr4[2] = "";
                strArr4[1] = "Rqc";
                String A074 = A07(431, 26, 110);
                A07 = A07(245, 4, 93);
                A072 = A07(179, 7, 7);
                identifier = system.getIdentifier(A074, A07, A072);
            }
        }
        c1673gi.A0F().AC6(A0J, z2, z3, supportsSplitScreenMultiWindow2, appResizingSupported);
        return z2;
    }

    public static boolean A0J(C1673gi c1673gi) {
        Activity A0E;
        PackageManager packageManager;
        ActivityInfo activityInfo;
        try {
            A0E = c1673gi.A0E();
            packageManager = c1673gi.getPackageManager();
        } catch (PackageManager.NameNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            c1673gi.A0F().AC5(e.getMessage());
        }
        if (A0E == null || packageManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 32) {
            activityInfo = packageManager.getActivityInfo(A0E.getComponentName(), PackageManager.ComponentInfoFlags.of(0L));
        } else {
            activityInfo = packageManager.getActivityInfo(A0E.getComponentName(), 128);
        }
        Field declaredField = ActivityInfo.class.getDeclaredField(A07(716, 10, 25));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(activityInfo);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        return false;
    }

    public static boolean A0K(C1673gi c1673gi, Uri uri) {
        String A07 = A07(322, 19, 35);
        if (C1123Up.A1H(c1673gi)) {
            if (Build.VERSION.SDK_INT < 23) {
                c1673gi.A0F().ABH(1);
                return false;
            }
            PackageManager packageManager = c1673gi.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(A07, 0);
                if (packageInfo != null && !TextUtils.isEmpty(packageInfo.versionName)) {
                    String[] split = packageInfo.versionName.split(A07(C10997yd1.t1, 2, 9), 2);
                    if (split.length < 1) {
                        c1673gi.A0F().ABH(2);
                        return false;
                    } else if (Integer.parseInt(split[0]) < C1123Up.A0G(c1673gi)) {
                        c1673gi.A0F().ABH(3);
                        return false;
                    }
                }
                Intent intent = new Intent(A07(C10997yd1.Q1, 26, 10));
                String packageName = c1673gi.getPackageName();
                intent.setPackage(A07);
                Uri hsdpUri = A04(c1673gi, uri);
                if (hsdpUri == null) {
                    return false;
                }
                intent.setData(hsdpUri);
                intent.putExtra(A07(694, 7, 6), true);
                intent.putExtra(A07(259, 8, 30), packageName);
                if (intent.resolveActivity(packageManager) != null) {
                    Activity A0E = c1673gi.A0E();
                    if (A0E == null) {
                        A0E = ActivityUtils.A00();
                    }
                    if (A0E != null) {
                        A0E.startActivityForResult(intent, 945321098);
                        c1673gi.A0F().ABH(0);
                        return true;
                    }
                    c1673gi.A0F().ABH(7);
                    return false;
                }
                InterfaceC0899Lt A0F = c1673gi.A0F();
                String[] strArr = A01;
                if (strArr[2].length() != strArr[1].length()) {
                    String[] strArr2 = A01;
                    strArr2[2] = "";
                    strArr2[1] = "uL3";
                    A0F.ABH(6);
                    return false;
                }
                throw new RuntimeException();
            } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
                c1673gi.A0F().ABH(4);
                return false;
            }
        }
        return false;
    }

    private boolean A0L(C1673gi c1673gi, Uri uri, String str) throws C1175Ws {
        try {
            Activity A0E = c1673gi.A0E();
            String uri2 = uri.toString();
            if (A0E != null && !TextUtils.isEmpty(uri2)) {
                Intent fbIntent = new Intent();
                if (C1123Up.A1G(c1673gi)) {
                    String A06 = AbstractC1847jd.A06(str);
                    if (TextUtils.isEmpty(A06)) {
                        return false;
                    }
                    fbIntent.putExtra(A07(0, 20, 67), A08(A06));
                }
                fbIntent.setComponent(new ComponentName(A07(C2372q.n, 19, 65), A07(C2372q.f116o, 71, 75)));
                fbIntent.putExtra(A07(C3503Kz.d0, 9, 22), uri2);
                fbIntent.putExtra(A07(37, 13, 89), A08(A07(20, 17, 90)));
                if (!C1177Wu.A0E(c1673gi, fbIntent)) {
                    A0E.startActivityForResult(fbIntent, 2);
                    return true;
                }
                return true;
            }
            return false;
        } catch (ActivityNotFoundException | IllegalStateException e) {
            c1673gi.A0F().ABG(e.getMessage());
            return false;
        }
    }

    private boolean A0M(C1673gi c1673gi, Uri uri, String str) throws C1175Ws {
        return A0G(c1673gi) && A0L(c1673gi, uri, str);
    }

    private final boolean A0N(C1673gi c1673gi, Uri uri, String str) {
        return C1177Wu.A0G(c1673gi, uri, str);
    }

    public static boolean A0O(X6 x6, C1673gi c1673gi, Uri uri, String str) {
        try {
            A0E(x6, c1673gi, uri, str);
            return true;
        } catch (C1175Ws e) {
            Throwable cause = e.getCause();
            Throwable exceptionToLog = e;
            if (cause != null) {
                exceptionToLog = e.getCause();
            }
            c1673gi.A08().ABC(A07(168, 11, 110), AbstractC1085Td.A05, new C1086Te(exceptionToLog));
            return false;
        }
    }
}
