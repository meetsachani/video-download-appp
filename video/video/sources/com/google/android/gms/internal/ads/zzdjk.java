package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdjk extends zzbgj implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkm {
    public static final zzfyc j1 = zzfyc.J("2011", "1009", "3010");
    public final String X;
    public FrameLayout Y0;
    public FrameLayout Z;
    public final zzgdj Z0;
    public View a1;
    public zzdij c1;
    public zzayv d1;
    public zzbgd f1;
    public boolean g1;
    public GestureDetector i1;
    public Map Y = new HashMap();
    public IObjectWrapper e1 = null;
    public boolean h1 = false;
    public final int b1 = ModuleDescriptor.MODULE_VERSION;

    public zzdjk(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.Z = frameLayout;
        this.Y0 = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.X = str;
        com.google.android.gms.ads.internal.zzv.D();
        zzcan.a(frameLayout, this);
        com.google.android.gms.ads.internal.zzv.D();
        zzcan.b(frameLayout, this);
        this.Z0 = zzcaa.f;
        this.d1 = new zzayv(this.Z.getContext(), this.Z);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void B4(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.Y0.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.Y0.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.h("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.Y0.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void Y7(zzdjk zzdjkVar) {
        if (zzdjkVar.a1 == null) {
            View view = new View(zzdjkVar.Z.getContext());
            zzdjkVar.a1 = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (zzdjkVar.Z != zzdjkVar.a1.getParent()) {
            zzdjkVar.Z.addView(zzdjkVar.a1);
        }
    }

    private final synchronized void q() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Pb)).booleanValue() && this.c1.J() != 0) {
            this.i1 = new GestureDetector(this.Z.getContext(), new zzdjs(this.c1, this));
        }
    }

    private final synchronized void t() {
        this.Z0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjj
            @Override // java.lang.Runnable
            public final void run() {
                zzdjk.Y7(zzdjk.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized void B5(String str, View view, boolean z) {
        if (!this.h1) {
            if (view == null) {
                this.Y.remove(str);
                return;
            }
            this.Y.put(str, new WeakReference(view));
            if (!NativeAd.a.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbv.j(this.b1)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final synchronized void C5(String str, IObjectWrapper iObjectWrapper) {
        B5(str, (View) ObjectWrapper.o1(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final synchronized IObjectWrapper I(String str) {
        return ObjectWrapper.V3(f0(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void L0(IObjectWrapper iObjectWrapper) {
        onTouch(this.Z, (MotionEvent) ObjectWrapper.o1(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final synchronized void L6(IObjectWrapper iObjectWrapper) {
        if (this.h1) {
            return;
        }
        this.e1 = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final synchronized void N5(zzbgd zzbgdVar) {
        if (!this.h1) {
            this.g1 = true;
            this.f1 = zzbgdVar;
            zzdij zzdijVar = this.c1;
            if (zzdijVar != null) {
                zzdijVar.S().b(zzbgdVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final synchronized void P1(IObjectWrapper iObjectWrapper) {
        this.c1.w((View) ObjectWrapper.o1(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final synchronized void T6(IObjectWrapper iObjectWrapper) {
        if (this.h1) {
            return;
        }
        Object o1 = ObjectWrapper.o1(iObjectWrapper);
        if (!(o1 instanceof zzdij)) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdij zzdijVar = this.c1;
        if (zzdijVar != null) {
            zzdijVar.C(this);
        }
        t();
        zzdij zzdijVar2 = (zzdij) o1;
        this.c1 = zzdijVar2;
        zzdijVar2.B(this);
        this.c1.t(this.Z);
        this.c1.h0(this.Y0);
        if (this.g1) {
            this.c1.S().b(this.f1);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i4)).booleanValue() && !TextUtils.isEmpty(this.c1.W())) {
            B4(this.c1.W());
        }
        q();
    }

    public final FrameLayout X7() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final synchronized void c() {
        try {
            if (this.h1) {
                return;
            }
            zzdij zzdijVar = this.c1;
            if (zzdijVar != null) {
                zzdijVar.C(this);
                this.c1 = null;
            }
            this.Y.clear();
            this.Z.removeAllViews();
            this.Y0.removeAllViews();
            this.Y = null;
            this.Z = null;
            this.Y0 = null;
            this.a1 = null;
            this.d1 = null;
            this.h1 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final /* synthetic */ View e() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final synchronized View f0(String str) {
        WeakReference weakReference;
        if (!this.h1 && (weakReference = (WeakReference) this.Y.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final FrameLayout h() {
        return this.Y0;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final zzayv i() {
        return this.d1;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final IObjectWrapper j() {
        return this.e1;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized String k() {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized Map l() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized Map m() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final synchronized Map n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final synchronized JSONObject o() {
        zzdij zzdijVar = this.c1;
        if (zzdijVar != null) {
            return zzdijVar.Z(this.Z, l(), m());
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdij zzdijVar = this.c1;
        if (zzdijVar != null && zzdijVar.E()) {
            this.c1.i();
            this.c1.l(view, this.Z, l(), m(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdij zzdijVar = this.c1;
        if (zzdijVar != null) {
            FrameLayout frameLayout = this.Z;
            zzdijVar.j(frameLayout, l(), m(), zzdij.H(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdij zzdijVar = this.c1;
        if (zzdijVar != null) {
            FrameLayout frameLayout = this.Z;
            zzdijVar.j(frameLayout, l(), m(), zzdij.H(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdij zzdijVar = this.c1;
        if (zzdijVar != null) {
            zzdijVar.u(view, motionEvent, this.Z);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Pb)).booleanValue() && this.i1 != null && this.c1.J() != 0) {
                this.i1.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final synchronized JSONObject p() {
        zzdij zzdijVar = this.c1;
        if (zzdijVar != null) {
            return zzdijVar.Y(this.Z, l(), m());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final synchronized void p2(IObjectWrapper iObjectWrapper, int i) {
    }
}
