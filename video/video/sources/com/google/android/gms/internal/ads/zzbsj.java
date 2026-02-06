package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import o.C5445bv2;
import o.JT;

/* loaded from: classes2.dex */
public final class zzbsj extends zzbsp {
    public String c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Object k;
    public final zzcfb l;
    public final Activity m;
    public zzcgv n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView f230o;
    public LinearLayout p;
    public final zzbsq q;
    public PopupWindow r;
    public RelativeLayout s;
    public ViewGroup t;

    static {
        CollectionUtils.j("top-left", "top-right", "top-center", C5445bv2.m0, "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbsj(zzcfb zzcfbVar, zzbsq zzbsqVar) {
        super(zzcfbVar, "resize");
        this.c = "top-right";
        this.d = true;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = -1;
        this.k = new Object();
        this.l = zzcfbVar;
        this.m = zzcfbVar.i();
        this.q = zzbsqVar;
    }

    public final void i(final boolean z) {
        synchronized (this.k) {
            try {
                if (this.r != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.eb)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                        zzcaa.f.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsh
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzbsj.this.n(z);
                            }
                        });
                    } else {
                        n(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0273, code lost:
        c("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0279, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Map map) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (this.k) {
            try {
                Activity activity = this.m;
                if (activity == null) {
                    c("Not an activity context. Cannot resize.");
                    return;
                }
                zzcfb zzcfbVar = this.l;
                if (zzcfbVar.H() == null) {
                    c("Webview is not yet available, size is not set.");
                } else if (zzcfbVar.H().i()) {
                    c("Is interstitial. Cannot resize an interstitial.");
                } else if (zzcfbVar.j0()) {
                    c("Cannot resize an expanded banner.");
                } else {
                    if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                        com.google.android.gms.ads.internal.zzv.v();
                        this.j = com.google.android.gms.ads.internal.util.zzs.p((String) map.get("width"));
                    }
                    if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                        com.google.android.gms.ads.internal.zzv.v();
                        this.g = com.google.android.gms.ads.internal.util.zzs.p((String) map.get("height"));
                    }
                    if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                        com.google.android.gms.ads.internal.zzv.v();
                        this.h = com.google.android.gms.ads.internal.util.zzs.p((String) map.get("offsetX"));
                    }
                    if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                        com.google.android.gms.ads.internal.zzv.v();
                        this.i = com.google.android.gms.ads.internal.util.zzs.p((String) map.get("offsetY"));
                    }
                    if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                        this.d = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                    }
                    String str = (String) map.get("customClosePosition");
                    if (!TextUtils.isEmpty(str)) {
                        this.c = str;
                    }
                    if (this.j >= 0 && this.g >= 0) {
                        Window window = activity.getWindow();
                        if (window != null && window.getDecorView() != null) {
                            com.google.android.gms.ads.internal.zzv.v();
                            int[] w = com.google.android.gms.ads.internal.util.zzs.w(activity);
                            com.google.android.gms.ads.internal.zzv.v();
                            int[] s = com.google.android.gms.ads.internal.util.zzs.s(activity);
                            int i7 = w[0];
                            int i8 = w[1];
                            int i9 = this.j;
                            int[] iArr = null;
                            if (i9 >= 50 && i9 <= i7) {
                                z = false;
                                int i10 = this.g;
                                if (i10 < 50 || i10 > i8) {
                                    i = 50;
                                    int i11 = com.google.android.gms.ads.internal.util.zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.g("Height is too small or too large.");
                                } else if (i10 == i8 && i9 == i7) {
                                    int i12 = com.google.android.gms.ads.internal.util.zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.g("Cannot resize to a full-screen ad.");
                                    i = 50;
                                } else if (this.d) {
                                    String str2 = this.c;
                                    switch (str2.hashCode()) {
                                        case -1364013995:
                                            i = 50;
                                            if (str2.equals(C5445bv2.m0)) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1012429441:
                                            i = 50;
                                            if (str2.equals("top-left")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -655373719:
                                            i = 50;
                                            if (str2.equals("bottom-left")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1163912186:
                                            i = 50;
                                            if (str2.equals("bottom-right")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1288627767:
                                            i = 50;
                                            if (str2.equals("bottom-center")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1755462605:
                                            i = 50;
                                            if (str2.equals("top-center")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            i = 50;
                                            c = 65535;
                                            break;
                                    }
                                    if (c == 0) {
                                        i3 = this.e + this.h;
                                        i4 = this.f;
                                    } else if (c != 1) {
                                        if (c != 2) {
                                            if (c == 3) {
                                                i3 = this.e + this.h;
                                                i6 = this.f;
                                            } else if (c == 4) {
                                                i3 = ((this.e + this.h) + (i9 >> 1)) - 25;
                                                i6 = this.f;
                                            } else if (c != 5) {
                                                i3 = ((this.e + this.h) + i9) - 50;
                                                i4 = this.f;
                                            } else {
                                                i3 = ((this.e + this.h) + i9) - 50;
                                                i6 = this.f;
                                            }
                                            i5 = ((i6 + this.i) + i10) - 50;
                                        } else {
                                            i3 = ((this.e + this.h) + (i9 >> 1)) - 25;
                                            i5 = ((this.f + this.i) + (i10 >> 1)) - 25;
                                        }
                                        if (i3 >= 0 && i3 + 50 <= i7 && i5 >= s[0] && i5 + 50 <= s[1]) {
                                            iArr = new int[]{this.e + this.h, this.f + this.i};
                                        }
                                    } else {
                                        i3 = ((this.e + this.h) + (i9 >> 1)) - 25;
                                        i4 = this.f;
                                    }
                                    i5 = i4 + this.i;
                                    if (i3 >= 0) {
                                        iArr = new int[]{this.e + this.h, this.f + this.i};
                                    }
                                } else {
                                    i = 50;
                                    com.google.android.gms.ads.internal.zzv.v();
                                    int[] w2 = com.google.android.gms.ads.internal.util.zzs.w(activity);
                                    com.google.android.gms.ads.internal.zzv.v();
                                    int[] s2 = com.google.android.gms.ads.internal.util.zzs.s(activity);
                                    int i13 = w2[0];
                                    int i14 = this.e + this.h;
                                    int i15 = this.f + this.i;
                                    if (i14 < 0) {
                                        i2 = 0;
                                    } else {
                                        int i16 = this.j;
                                        i2 = i14 + i16 > i13 ? i13 - i16 : i14;
                                    }
                                    int i17 = s2[0];
                                    if (i15 < i17) {
                                        i15 = i17;
                                    } else {
                                        int i18 = this.g;
                                        int i19 = i15 + i18;
                                        int i20 = s2[1];
                                        if (i19 > i20) {
                                            i15 = i20 - i18;
                                        }
                                    }
                                    iArr = new int[]{i2, i15};
                                }
                            } else {
                                z = false;
                                i = 50;
                                int i21 = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.g("Width is too small or too large.");
                            }
                            com.google.android.gms.ads.internal.client.zzbb.b();
                            int D = com.google.android.gms.ads.internal.util.client.zzf.D(activity, this.j);
                            com.google.android.gms.ads.internal.client.zzbb.b();
                            int D2 = com.google.android.gms.ads.internal.util.client.zzf.D(activity, this.g);
                            ViewParent parent = ((View) zzcfbVar).getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ViewGroup viewGroup = (ViewGroup) parent;
                                viewGroup.removeView((View) zzcfbVar);
                                PopupWindow popupWindow = this.r;
                                if (popupWindow == null) {
                                    this.t = viewGroup;
                                    com.google.android.gms.ads.internal.zzv.v();
                                    ((View) zzcfbVar).setDrawingCacheEnabled(true);
                                    Bitmap createBitmap = Bitmap.createBitmap(((View) zzcfbVar).getDrawingCache());
                                    ((View) zzcfbVar).setDrawingCacheEnabled(z);
                                    ImageView imageView = new ImageView(activity);
                                    this.f230o = imageView;
                                    imageView.setImageBitmap(createBitmap);
                                    this.n = zzcfbVar.H();
                                    this.t.addView(this.f230o);
                                } else {
                                    popupWindow.dismiss();
                                }
                                RelativeLayout relativeLayout = new RelativeLayout(activity);
                                this.s = relativeLayout;
                                relativeLayout.setBackgroundColor(0);
                                this.s.setLayoutParams(new ViewGroup.LayoutParams(D, D2));
                                com.google.android.gms.ads.internal.zzv.v();
                                PopupWindow popupWindow2 = new PopupWindow((View) this.s, D, D2, false);
                                this.r = popupWindow2;
                                popupWindow2.setOutsideTouchable(false);
                                this.r.setTouchable(true);
                                this.r.setClippingEnabled(!this.d);
                                this.s.addView((View) zzcfbVar, -1, -1);
                                this.p = new LinearLayout(activity);
                                com.google.android.gms.ads.internal.client.zzbb.b();
                                int i22 = i;
                                int D3 = com.google.android.gms.ads.internal.util.client.zzf.D(activity, i22);
                                com.google.android.gms.ads.internal.client.zzbb.b();
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(D3, com.google.android.gms.ads.internal.util.client.zzf.D(activity, i22));
                                String str3 = this.c;
                                switch (str3.hashCode()) {
                                    case -1364013995:
                                        if (str3.equals(C5445bv2.m0)) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case -1012429441:
                                        if (str3.equals("top-left")) {
                                            z2 = false;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case -655373719:
                                        if (str3.equals("bottom-left")) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case 1163912186:
                                        if (str3.equals("bottom-right")) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case 1288627767:
                                        if (str3.equals("bottom-center")) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    case 1755462605:
                                        if (str3.equals("top-center")) {
                                            z2 = true;
                                            break;
                                        }
                                        z2 = true;
                                        break;
                                    default:
                                        z2 = true;
                                        break;
                                }
                                if (!z2) {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(9);
                                } else if (z2) {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(14);
                                } else if (z2) {
                                    layoutParams.addRule(13);
                                } else if (z2) {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(9);
                                } else if (z2) {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(14);
                                } else if (!z2) {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(11);
                                } else {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(11);
                                }
                                this.p.setOnClickListener(new zzbsi(this));
                                this.p.setContentDescription("Close button");
                                this.s.addView(this.p, layoutParams);
                                try {
                                    PopupWindow popupWindow3 = this.r;
                                    View decorView = window.getDecorView();
                                    com.google.android.gms.ads.internal.client.zzbb.b();
                                    int D4 = com.google.android.gms.ads.internal.util.client.zzf.D(activity, iArr[0]);
                                    com.google.android.gms.ads.internal.client.zzbb.b();
                                    popupWindow3.showAtLocation(decorView, 0, D4, com.google.android.gms.ads.internal.util.client.zzf.D(activity, iArr[1]));
                                    int i23 = iArr[0];
                                    int i24 = iArr[1];
                                    zzbsq zzbsqVar = this.q;
                                    if (zzbsqVar != null) {
                                        zzbsqVar.a(i23, i24, this.j, this.g);
                                    }
                                    this.l.b1(zzcgv.b(D, D2));
                                    int i25 = iArr[0];
                                    int i26 = iArr[1];
                                    com.google.android.gms.ads.internal.zzv.v();
                                    f(i25, i26 - com.google.android.gms.ads.internal.util.zzs.s(this.m)[0], this.j, this.g);
                                    g("resized");
                                    return;
                                } catch (RuntimeException e) {
                                    c("Cannot show popup window: " + e.getMessage());
                                    RelativeLayout relativeLayout2 = this.s;
                                    zzcfb zzcfbVar2 = this.l;
                                    relativeLayout2.removeView((View) zzcfbVar2);
                                    ViewGroup viewGroup2 = this.t;
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(this.f230o);
                                        this.t.addView((View) zzcfbVar2);
                                        zzcfbVar2.b1(this.n);
                                    }
                                    return;
                                }
                            }
                            c("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        c("Activity context is not ready, cannot get window or decor view.");
                        return;
                    }
                    c("Invalid width and height options. Cannot resize.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(int i, int i2, boolean z) {
        synchronized (this.k) {
            this.e = i;
            this.f = i2;
        }
    }

    public final void l(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.k) {
            if (this.r != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void n(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.fb)).booleanValue()) {
            this.s.removeView((View) this.l);
            this.r.dismiss();
        } else {
            this.r.dismiss();
            this.s.removeView((View) this.l);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.gb)).booleanValue()) {
            View view = (View) this.l;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.t;
        if (viewGroup != null) {
            viewGroup.removeView(this.f230o);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.hb)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.t;
                    zzcfb zzcfbVar = this.l;
                    viewGroup2.addView((View) zzcfbVar);
                    zzcfbVar.b1(this.n);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                ViewGroup viewGroup3 = this.t;
                zzcfb zzcfbVar2 = this.l;
                viewGroup3.addView((View) zzcfbVar2);
                zzcfbVar2.b1(this.n);
            }
        }
        if (z) {
            g(JT.d);
            zzbsq zzbsqVar = this.q;
            if (zzbsqVar != null) {
                zzbsqVar.b();
            }
        }
        this.r = null;
        this.s = null;
        this.t = null;
        this.p = null;
    }
}
