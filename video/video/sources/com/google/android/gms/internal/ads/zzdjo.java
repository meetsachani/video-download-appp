package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import o.C2638Cg0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzdjo {
    public static final ImageView.ScaleType k = ImageView.ScaleType.CENTER_INSIDE;
    public final com.google.android.gms.ads.internal.util.zzg a;
    public final zzfcp b;
    public final zzdit c;
    public final zzdio d;
    @InterfaceC11300zs1
    public final zzdkc e;
    @InterfaceC11300zs1
    public final zzdkk f;
    public final Executor g;
    public final Executor h;
    public final zzbfv i;
    public final zzdil j;

    public zzdjo(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfcp zzfcpVar, zzdit zzditVar, zzdio zzdioVar, @InterfaceC11300zs1 zzdkc zzdkcVar, @InterfaceC11300zs1 zzdkk zzdkkVar, Executor executor, Executor executor2, zzdil zzdilVar) {
        this.a = zzgVar;
        this.b = zzfcpVar;
        this.i = zzfcpVar.i;
        this.c = zzditVar;
        this.d = zzdioVar;
        this.e = zzdkcVar;
        this.f = zzdkkVar;
        this.g = executor;
        this.h = executor2;
        this.j = zzdilVar;
    }

    public static /* synthetic */ void a(zzdjo zzdjoVar, ViewGroup viewGroup) {
        boolean z;
        zzdio zzdioVar = zzdjoVar.d;
        if (zzdioVar.S() != null) {
            if (viewGroup != null) {
                z = true;
            } else {
                z = false;
            }
            if (zzdioVar.P() != 2 && zzdioVar.P() != 1) {
                if (zzdioVar.P() == 6) {
                    com.google.android.gms.ads.internal.util.zzg zzgVar = zzdjoVar.a;
                    String str = zzdjoVar.b.f;
                    zzgVar.a0(str, C2638Cg0.Y4, z);
                    zzgVar.a0(str, "1", z);
                    return;
                }
                return;
            }
            zzdjoVar.a.a0(zzdjoVar.b.f, String.valueOf(zzdioVar.P()), z);
        }
    }

    public static /* synthetic */ void b(final zzdjo zzdjoVar, zzdkm zzdkmVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbgd a;
        Drawable drawable;
        zzdit zzditVar = zzdjoVar.c;
        Context context = null;
        if (zzditVar.f() || zzditVar.e()) {
            String[] strArr = {NativeAd.a, "3011"};
            for (int i = 0; i < 2; i++) {
                View f0 = zzdkmVar.f0(strArr[i]);
                if (f0 != null && (f0 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) f0;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context2 = zzdkmVar.e().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdio zzdioVar = zzdjoVar.d;
        if (zzdioVar.R() != null) {
            view = zzdioVar.R();
            zzbfv zzbfvVar = zzdjoVar.i;
            if (zzbfvVar != null && viewGroup == null) {
                h(layoutParams, zzbfvVar.Z0);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (!(zzdioVar.Y() instanceof zzbfq)) {
            view = null;
        } else {
            zzbfq zzbfqVar = (zzbfq) zzdioVar.Y();
            if (viewGroup == null) {
                h(layoutParams, zzbfqVar.c());
                viewGroup = null;
            }
            View zzbfrVar = new zzbfr(context2, zzbfqVar, layoutParams);
            zzbfrVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d4));
            view = zzbfrVar;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdkmVar.e().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout h = zzdkmVar.h();
                if (h != null) {
                    h.addView(zzaVar);
                }
            }
            zzdkmVar.B5(zzdkmVar.k(), view, true);
        }
        zzfyc zzfycVar = zzdjk.j1;
        int size = zzfycVar.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                View f02 = zzdkmVar.f0((String) zzfycVar.get(i2));
                i2++;
                if (f02 instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) f02;
                    break;
                }
            } else {
                viewGroup2 = null;
                break;
            }
        }
        zzdjoVar.h.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjl
            @Override // java.lang.Runnable
            public final void run() {
                zzdjo.a(zzdjo.this, viewGroup2);
            }
        });
        if (viewGroup2 != null) {
            if (zzdjoVar.i(viewGroup2, true)) {
                if (zzdioVar.f0() != null) {
                    zzdioVar.f0().p1(new zzdjn(zzdkmVar, viewGroup2));
                }
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.pa)).booleanValue() && zzdjoVar.i(viewGroup2, false)) {
                if (zzdioVar.d0() != null) {
                    zzdioVar.d0().p1(new zzdjn(zzdkmVar, viewGroup2));
                }
            } else {
                viewGroup2.removeAllViews();
                View e = zzdkmVar.e();
                if (e != null) {
                    context = e.getContext();
                }
                if (context != null && (a = zzdjoVar.j.a()) != null) {
                    try {
                        IObjectWrapper i3 = a.i();
                        if (i3 != null && (drawable = (Drawable) ObjectWrapper.o1(i3)) != null) {
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(drawable);
                            IObjectWrapper j = zzdkmVar.j();
                            if (j != null) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r6)).booleanValue()) {
                                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.o1(j));
                                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView);
                                }
                            }
                            imageView.setScaleType(k);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Could not get main image drawable");
                    }
                }
            }
        }
    }

    public static void h(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    return;
                }
                layoutParams.addRule(12);
                layoutParams.addRule(9);
                return;
            }
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            return;
        }
        layoutParams.addRule(10);
        layoutParams.addRule(9);
    }

    public final void c(@InterfaceC11300zs1 zzdkm zzdkmVar) {
        zzdkc zzdkcVar;
        if (zzdkmVar != null && (zzdkcVar = this.e) != null && zzdkmVar.h() != null && this.c.g()) {
            try {
                zzdkmVar.h().addView(zzdkcVar.a());
            } catch (zzcfn e) {
                com.google.android.gms.ads.internal.util.zze.l("web view can not be obtained", e);
            }
        }
    }

    public final void d(@InterfaceC11300zs1 zzdkm zzdkmVar) {
        if (zzdkmVar != null) {
            Context context = zzdkmVar.e().getContext();
            if (com.google.android.gms.ads.internal.util.zzbv.i(context, this.c.a)) {
                if (!(context instanceof Activity)) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("Activity context is needed for policy validator.");
                    return;
                }
                zzdkk zzdkkVar = this.f;
                if (zzdkkVar != null && zzdkmVar.h() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(zzdkkVar.a(zzdkmVar.h(), windowManager), com.google.android.gms.ads.internal.util.zzbv.b());
                    } catch (zzcfn e) {
                        com.google.android.gms.ads.internal.util.zze.l("web view can not be obtained", e);
                    }
                }
            }
        }
    }

    public final void e(final zzdkm zzdkmVar) {
        this.g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjm
            @Override // java.lang.Runnable
            public final void run() {
                zzdjo.b(zzdjo.this, zzdkmVar);
            }
        });
    }

    public final boolean f(@InterfaceC5670cr1 ViewGroup viewGroup) {
        return i(viewGroup, false);
    }

    public final boolean g(@InterfaceC5670cr1 ViewGroup viewGroup) {
        return i(viewGroup, true);
    }

    public final boolean i(@InterfaceC5670cr1 ViewGroup viewGroup, boolean z) {
        View T;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            T = this.d.S();
        } else {
            T = this.d.T();
        }
        if (T == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (T.getParent() instanceof ViewGroup) {
            ((ViewGroup) T.getParent()).removeView(T);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f4)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(T, layoutParams);
        return true;
    }
}
