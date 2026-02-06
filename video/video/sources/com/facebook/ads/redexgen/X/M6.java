package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.List;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class M6 extends LinearLayout implements InterfaceC1316av {
    public static byte[] A0E;
    public static String[] A0F = {"SfnKd94fp0LIHLn5JRYBcVoydcWvvWC", "zcIUR0bnd2fDOpnzxhHInmQw6nqRGEtO", "", "Rlzv6bB7Czucpp1t79MjvCXFuIOZg8dc", "c1MACJD11uXVhN3Ickl6ZqMudEgzXQA", "WTgVZUaV9yT0hbCJXLqGbS", "77CVi", "3ZIeaeVMqGSC8jDTqrHFXNca0PmxnycW"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final Uri A0L;
    public static final View.OnTouchListener A0M;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public C1308an A05;
    public InterfaceC1315au A06;
    public String A07;
    public final WebView A08;
    public final C1673gi A09;
    public final InterfaceC1312ar A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0E = new byte[]{-23, 8, 10, C8077mf.u, -114, -73, -70, -66, -80, -22, 19, C8077mf.z, C8077mf.E, 5, C8077mf.z, 8, -74, -41, -52, -43, -121, -43, -56, -37, -48, -35, -52, -121, C2638Cg0.v7, C2638Cg0.E7, -42, -34, C2638Cg0.B7, -52, C2638Cg0.E7, -6, -5, 8, C8077mf.p, 13, -45, -5, 5, -6, 7, 4, C8077mf.A, 36, C8077mf.D, 40, C3307Iz.X, 31, C8077mf.D, -28, 31, 36, 42, C8077mf.E, 36, 42, -28, C8077mf.A, C8077mf.C, 42, 31, C3307Iz.X, 36, -28, C8077mf.n, -1, -5, 13, C8077mf.u, C8077mf.H, 28, -35, C8077mf.r, C8077mf.G, 19, C3307Iz.V, C8077mf.H, C8077mf.B, 19, -35, C8077mf.u, C8077mf.A, C3307Iz.V, C8077mf.H, 28, C8077mf.x, -68, -56, -56, -60, -114, -125, -125, C2638Cg0.x7, C2638Cg0.x7, C2638Cg0.x7, -126, -70, -75, -73, -71, -74, C2638Cg0.r7, C2638Cg0.r7, -65, -126, -73, C2638Cg0.r7, C2638Cg0.p7};
    }

    static {
        A0A();
        A0I = Color.rgb(224, 224, 224);
        A0L = XB.A00(A06(90, 23, 25));
        A0M = new View$OnTouchListenerC1297ac();
        A0K = Color.argb(34, 0, 0, 0);
        A0G = XV.A0P;
        A0H = XV.A0I;
        A0J = XV.A0A;
    }

    public M6(C1673gi c1673gi, WebView webView) {
        this(c1673gi, webView, false, false);
    }

    public M6(C1673gi c1673gi, WebView webView, boolean z, boolean z2) {
        super(c1673gi);
        this.A0A = new M7(this);
        this.A08 = webView;
        this.A09 = c1673gi;
        this.A0B = AbstractC1124Uq.A06(c1673gi);
        this.A0D = z;
        this.A0C = z2;
        A08();
        if (z2) {
            A0C(false);
        }
    }

    private void A08() {
        float f;
        YB.A0N(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A09);
        this.A01.setContentDescription(A06(4, 5, 16));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0G, A0G);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(YN.A01(YM.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0M);
        this.A01.setOnClickListener(new View$OnClickListenerC1298ad(this));
        addView(this.A01, layoutParams);
        if (this.A0B && !C1123Up.A2w(this.A09)) {
            this.A00 = new ImageView(this.A09);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 108));
            LinearLayout.LayoutParams backButtonParams = new LinearLayout.LayoutParams(A0G, A0G);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(YN.A01(YM.BACK_ARROW));
            this.A00.setOnTouchListener(A0M);
            this.A00.setOnClickListener(new View$OnClickListenerC1299ae(this));
            addView(this.A00, backButtonParams);
        }
        this.A05 = new C1308an(this.A09);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        if (this.A0B || C1123Up.A2w(this.A09)) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        layoutParams2.weight = f;
        this.A05.setGravity(17);
        if (C1123Up.A2w(this.A09) && !this.A0D) {
            this.A04 = new LinearLayout(this.A09);
            this.A04.setOrientation(1);
            this.A04.setPadding(0, A0J, 0, A0J);
            layoutParams2.setMarginStart(0);
            addView(this.A04, layoutParams2);
            ImageView imageView = new ImageView(this.A09);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(YN.A01(YM.HANDLER));
            imageView.setPadding(0, A0H, 0, A0H);
            LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(imageView, closeButtonParams);
            LinearLayout.LayoutParams titleViewsParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(this.A05, titleViewsParams);
        } else {
            addView(this.A05, layoutParams2);
        }
        if (this.A0B && !C1123Up.A2w(this.A09)) {
            this.A02 = new ImageView(this.A09);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 105));
            LinearLayout.LayoutParams titleViewsParams2 = new LinearLayout.LayoutParams(A0G, A0G);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(YN.A02(YM.BACK_ARROW));
            this.A02.setOnTouchListener(A0M);
            this.A02.setOnClickListener(new View$OnClickListenerC1300af(this));
            addView(this.A02, titleViewsParams2);
        }
        this.A03 = new ImageView(this.A09);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0G, A0G);
        this.A03.setContentDescription(A06(16, 19, 44));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0M);
        this.A03.setOnClickListener(new View$OnClickListenerC1301ag(this));
        addView(this.A03, layoutParams3);
        A09();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
        if (A06(72, 18, 116).equals(r3.activityInfo.packageName) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
        r3 = com.facebook.ads.redexgen.X.YN.A01(com.facebook.ads.redexgen.X.YM.BROWSER_LAUNCH_CHROME);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
        if (A06(72, 18, 116).equals(r3.activityInfo.packageName) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09() {
        PackageManager packageManager;
        Bitmap bitmap = null;
        boolean A0k = C1123Up.A0k(this.A09);
        if (!A0k && (packageManager = this.A09.getPackageManager()) != null) {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent(A06(46, 26, 123), A0L), 65536);
            if (queryIntentActivities.isEmpty()) {
                this.A03.setVisibility(8);
            } else {
                if (queryIntentActivities.size() == 1) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(0);
                    String[] strArr = A0F;
                    if (strArr[4].length() != strArr[0].length()) {
                        throw new RuntimeException();
                    }
                    A0F[6] = "Y9G9nX";
                    if (resolveInfo.activityInfo != null) {
                        ResolveInfo resolveInfo2 = queryIntentActivities.get(0);
                        if (A0F[2].length() != 9) {
                            String[] strArr2 = A0F;
                            strArr2[7] = "hqSHhnICOqiHaN8u87jsv4Qx8TBqcflH";
                            strArr2[3] = "kBU630hheaj535sYoezwG0Sk33mkxVnX";
                        }
                    }
                }
                bitmap = getExternalBrowserBitmap();
            }
        }
        if (C1123Up.A2w(this.A09) || A0k) {
            this.A03.setVisibility(0);
            bitmap = getExternalBrowserBitmap();
        }
        this.A03.setImageBitmap(bitmap);
    }

    private void A0C(boolean z) {
        int i = z ? 0 : 8;
        ImageView imageView = this.A00;
        if (A0F[1].charAt(15) == 'W') {
            throw new RuntimeException();
        }
        A0F[2] = "nknH3C2";
        if (imageView != null) {
            this.A00.setVisibility(i);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        if (z) {
            A0C(true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1316av
    public InterfaceC1312ar getBrowserNavigationListener() {
        return this.A0A;
    }

    private Bitmap getExternalBrowserBitmap() {
        if (this.A0C) {
            return YN.A01(YM.BROWSER_LAUNCH_NATIVE_V2);
        }
        return YN.A01(YM.BROWSER_LAUNCH_NATIVE);
    }

    public void setCloseButtonVisibility(int i) {
        this.A01.setVisibility(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1316av
    public void setListener(InterfaceC1315au interfaceC1315au) {
        this.A06 = interfaceC1315au;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1316av
    public void setTitle(String str) {
        this.A05.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1316av
    public void setUrl(String str) {
        this.A07 = str;
        if (TextUtils.isEmpty(this.A07) || A06(35, 11, 94).equals(this.A07)) {
            this.A05.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0I, PorterDuff.Mode.SRC_IN));
            return;
        }
        this.A05.setSubtitle(this.A07);
        this.A03.setEnabled(true);
        this.A03.setColorFilter((ColorFilter) null);
    }
}
