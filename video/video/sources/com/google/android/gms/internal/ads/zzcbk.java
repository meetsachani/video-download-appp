package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;
import o.InterfaceMenuC9553sh2;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzcbk extends FrameLayout implements zzcbb {
    public final zzcbw Y0;
    public final FrameLayout Z0;
    public final View a1;
    public final zzbdk b1;
    @InterfaceC5056aJ2
    public final zzcby c1;
    public final long d1;
    @InterfaceC11300zs1
    public final zzcbc e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public long j1;
    public long k1;
    public String l1;
    public String[] m1;
    public Bitmap n1;
    public final ImageView o1;
    public boolean p1;

    public zzcbk(Context context, zzcbw zzcbwVar, int i, boolean z, zzbdk zzbdkVar, zzcbv zzcbvVar, @InterfaceC11300zs1 zzdsd zzdsdVar) {
        super(context);
        zzcbc zzcbaVar;
        zzbdk zzbdkVar2;
        zzcbc zzcbcVar;
        String str;
        this.Y0 = zzcbwVar;
        this.b1 = zzbdkVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z0 = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.r(zzcbwVar.j());
        zzcbd zzcbdVar = zzcbwVar.j().a;
        zzcbx zzcbxVar = new zzcbx(context, zzcbwVar.m(), zzcbwVar.s(), zzbdkVar, zzcbwVar.k());
        if (i == 3) {
            zzcbcVar = new zzceq(context, zzcbxVar);
            zzbdkVar2 = zzbdkVar;
        } else {
            if (i == 2) {
                zzcbaVar = new zzcco(context, zzcbxVar, zzcbwVar, z, zzcbd.a(zzcbwVar), zzcbvVar, zzdsdVar);
                zzbdkVar2 = zzbdkVar;
            } else {
                zzbdkVar2 = zzbdkVar;
                zzcbaVar = new zzcba(context, zzcbwVar, z, zzcbd.a(zzcbwVar), zzcbvVar, new zzcbx(context, zzcbwVar.m(), zzcbwVar.s(), zzbdkVar, zzcbwVar.k()), zzdsdVar);
            }
            zzcbcVar = zzcbaVar;
        }
        this.e1 = zzcbcVar;
        View view = new View(context);
        this.a1 = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcbcVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S)).booleanValue()) {
            A();
        }
        this.o1 = new ImageView(context);
        this.d1 = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U)).booleanValue();
        this.i1 = booleanValue;
        if (zzbdkVar2 != null) {
            if (true != booleanValue) {
                str = "0";
            } else {
                str = "1";
            }
            zzbdkVar2.d("spinner_used", str);
        }
        this.c1 = new zzcby(this);
        zzcbcVar.w(this);
    }

    public final void A() {
        String string;
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        TextView textView = new TextView(zzcbcVar.getContext());
        Resources f = com.google.android.gms.ads.internal.zzv.t().f();
        if (f == null) {
            string = "AdMob - ";
        } else {
            string = f.getString(R.string.watermark_label_prefix);
        }
        textView.setText(String.valueOf(string).concat(zzcbcVar.s()));
        textView.setTextColor(InterfaceMenuC9553sh2.c);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.Z0;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void B() {
        this.c1.a();
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar != null) {
            zzcbcVar.y();
        }
        s();
    }

    public final void C(Integer num) {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.l1)) {
            zzcbcVar.h(this.l1, this.m1, num);
        } else {
            t("no_src", new String[0]);
        }
    }

    public final void D() {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.Z0.d(true);
        zzcbcVar.n();
    }

    public final void E() {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar != null) {
            long i = zzcbcVar.i();
            if (this.j1 != i && i > 0) {
                float f = ((float) i) / 1000.0f;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue()) {
                    t("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzcbcVar.r()), "qoeCachedBytes", String.valueOf(zzcbcVar.o()), "qoeLoadedBytes", String.valueOf(zzcbcVar.p()), "droppedFrames", String.valueOf(zzcbcVar.j()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzv.d().a()));
                } else {
                    t("timeupdate", "time", String.valueOf(f));
                }
                this.j1 = i;
            }
        }
    }

    public final void F() {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.t();
    }

    public final void G() {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.u();
    }

    public final void H(int i) {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.v(i);
    }

    public final void I(MotionEvent motionEvent) {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.dispatchTouchEvent(motionEvent);
    }

    public final void J(int i) {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.B(i);
    }

    public final void K(int i) {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.C(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e2)).booleanValue()) {
            this.c1.a();
        }
        t("ended", new String[0]);
        s();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void b(int i, int i2) {
        if (this.i1) {
            zzbcm zzbcmVar = zzbcv.W;
            int max = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), 1);
            Bitmap bitmap = this.n1;
            if (bitmap != null && bitmap.getWidth() == max && this.n1.getHeight() == max2) {
                return;
            }
            this.n1 = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.p1 = false;
        }
    }

    public final void c(int i) {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.D(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void d() {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e2)).booleanValue()) {
            this.c1.b();
        }
        zzcbw zzcbwVar = this.Y0;
        if (zzcbwVar.i() != null && !this.g1) {
            if ((zzcbwVar.i().getWindow().getAttributes().flags & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.h1 = z;
            if (!z) {
                zzcbwVar.i().getWindow().addFlags(128);
                this.g1 = true;
            }
        }
        this.f1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void e() {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar != null && this.k1 == 0) {
            t("canplaythrough", "duration", String.valueOf(zzcbcVar.k() / 1000.0f), "videoWidth", String.valueOf(zzcbcVar.m()), "videoHeight", String.valueOf(zzcbcVar.l()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void f() {
        t("pause", new String[0]);
        s();
        this.f1 = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.c1.a();
            final zzcbc zzcbcVar = this.e1;
            if (zzcbcVar != null) {
                zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbe
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbc.this.y();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void g() {
        this.a1.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbf
            @Override // java.lang.Runnable
            public final void run() {
                zzcbk.this.t("firstFrameRendered", new String[0]);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void h() {
        this.c1.b();
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzcbh(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void i() {
        if (this.p1 && this.n1 != null && !v()) {
            ImageView imageView = this.o1;
            imageView.setImageBitmap(this.n1);
            imageView.invalidate();
            FrameLayout frameLayout = this.Z0;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.c1.a();
        this.k1 = this.j1;
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzcbi(this));
    }

    public final void j(int i) {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.f(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void k() {
        if (this.f1 && v()) {
            this.Z0.removeView(this.o1);
        }
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar != null && this.n1 != null) {
            long b = com.google.android.gms.ads.internal.zzv.d().b();
            if (zzcbcVar.getBitmap(this.n1) != null) {
                this.p1 = true;
            }
            long b2 = com.google.android.gms.ads.internal.zzv.d().b() - b;
            if (com.google.android.gms.ads.internal.util.zze.m()) {
                com.google.android.gms.ads.internal.util.zze.k("Spinner frame grab took " + b2 + "ms");
            }
            if (b2 > this.d1) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.i1 = false;
                this.n1 = null;
                zzbdk zzbdkVar = this.b1;
                if (zzbdkVar != null) {
                    zzbdkVar.d("spinner_jank", Long.toString(b2));
                }
            }
        }
    }

    public final void l(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V)).booleanValue()) {
            this.Z0.setBackgroundColor(i);
            this.a1.setBackgroundColor(i);
        }
    }

    public final void m(int i) {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.g(i);
    }

    public final void n(String str, String[] strArr) {
        this.l1 = str;
        this.m1 = strArr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void n1(String str, @InterfaceC11300zs1 String str2) {
        t("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void o(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.m()) {
            com.google.android.gms.ads.internal.util.zze.k("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.Z0.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.c1.b();
        } else {
            this.c1.a();
            this.k1 = this.j1;
        }
        com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbg
            @Override // java.lang.Runnable
            public final void run() {
                zzcbk.this.t("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcbb
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.c1.b();
            z = true;
        } else {
            this.c1.a();
            this.k1 = this.j1;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzcbj(this, z));
    }

    public final void p(float f) {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.Z0.e(f);
        zzcbcVar.n();
    }

    public final void q(float f, float f2) {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar != null) {
            zzcbcVar.z(f, f2);
        }
    }

    public final void r() {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar == null) {
            return;
        }
        zzcbcVar.Z0.d(false);
        zzcbcVar.n();
    }

    public final void s() {
        zzcbw zzcbwVar = this.Y0;
        if (zzcbwVar.i() != null && this.g1 && !this.h1) {
            zzcbwVar.i().getWindow().clearFlags(128);
            this.g1 = false;
        }
    }

    public final void t(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer w = w();
        if (w != null) {
            hashMap.put("playerId", w.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.Y0.q("onVideoEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void u(String str, @InterfaceC11300zs1 String str2) {
        t("error", "what", str, "extra", str2);
    }

    public final boolean v() {
        if (this.o1.getParent() != null) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public final Integer w() {
        zzcbc zzcbcVar = this.e1;
        if (zzcbcVar != null) {
            return zzcbcVar.A();
        }
        return null;
    }
}
