package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzduy;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzgdj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o.C2638Cg0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzau {
    public final Context a;
    public final zzdvc b;
    public String c;
    public String d;
    public String e;
    @InterfaceC11300zs1
    public String f;
    public int g;
    public int h;
    public PointF i;
    public PointF j;
    public Handler k;
    public Runnable l;

    public zzau(Context context) {
        this.g = 0;
        this.l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
            @Override // java.lang.Runnable
            public final void run() {
                zzau.i(zzau.this);
            }
        };
        this.a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzv.z().b();
        this.k = com.google.android.gms.ads.internal.zzv.z().a();
        this.b = com.google.android.gms.ads.internal.zzv.y().a();
    }

    public static /* synthetic */ void a(zzau zzauVar) {
        zzay y = com.google.android.gms.ads.internal.zzv.y();
        String str = zzauVar.d;
        String str2 = zzauVar.e;
        String str3 = zzauVar.f;
        boolean m = y.m();
        Context context = zzauVar.a;
        y.h(y.j(context, str, str2));
        if (y.m()) {
            if (!m && !TextUtils.isEmpty(str3)) {
                y.e(context, str2, str3, str);
            }
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Device is linked for debug signals.");
            y.i(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        y.d(context, str, str2);
    }

    public static /* synthetic */ void c(final zzau zzauVar, int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 == i) {
            Context context = zzauVar.a;
            if (!(context instanceof Activity)) {
                int i7 = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.f("Can not create dialog without Activity Context");
                return;
            }
            String str = zzauVar.c;
            final String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                com.google.android.gms.ads.internal.zzv.v();
                Map q = zzs.q(build);
                for (String str3 : q.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append((String) q.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            com.google.android.gms.ads.internal.zzv.v();
            AlertDialog.Builder l = zzs.l(context);
            l.setMessage(str2);
            l.setTitle("Ad Information");
            l.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzah
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i8) {
                    zzau.g(zzau.this, str2, dialogInterface2, i8);
                }
            });
            l.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzai
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i8) {
                }
            });
            l.create().show();
        } else if (i6 == i2) {
            int i8 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Debug mode [Creative Preview] selected.");
            zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                @Override // java.lang.Runnable
                public final void run() {
                    zzau.j(zzau.this);
                }
            });
        } else if (i6 == i3) {
            int i9 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Debug mode [Troubleshooting] selected.");
            zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzat
                @Override // java.lang.Runnable
                public final void run() {
                    zzau.a(zzau.this);
                }
            });
        } else if (i6 == i4) {
            zzdvc zzdvcVar = zzauVar.b;
            final zzgdj zzgdjVar = zzcaa.f;
            zzgdj zzgdjVar2 = zzcaa.a;
            if (zzdvcVar.r()) {
                zzgdjVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.internal.zzv.y().c(zzau.this.a);
                    }
                });
            } else {
                zzgdjVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.l(zzau.this, zzgdjVar);
                    }
                });
            }
        } else if (i6 == i5) {
            zzdvc zzdvcVar2 = zzauVar.b;
            final zzgdj zzgdjVar3 = zzcaa.f;
            zzgdj zzgdjVar4 = zzcaa.a;
            if (zzdvcVar2.r()) {
                zzgdjVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.s(zzau.this.a);
                    }
                });
            } else {
                zzgdjVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.d(zzau.this, zzgdjVar3);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void d(final zzau zzauVar, zzgdj zzgdjVar) {
        zzay y = com.google.android.gms.ads.internal.zzv.y();
        Context context = zzauVar.a;
        if (!y.j(context, zzauVar.d, zzauVar.e)) {
            com.google.android.gms.ads.internal.zzv.y().d(context, zzauVar.d, zzauVar.e);
        } else {
            zzgdjVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzak
                @Override // java.lang.Runnable
                public final void run() {
                    r0.s(zzau.this.a);
                }
            });
        }
    }

    public static /* synthetic */ void f(zzau zzauVar, AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                zzauVar.b.n(zzduy.SHAKE);
            } else if (atomicInteger.get() == i3) {
                zzauVar.b.n(zzduy.FLICK);
            } else {
                zzauVar.b.n(zzduy.NONE);
            }
        }
        zzauVar.r();
    }

    public static /* synthetic */ void g(zzau zzauVar, String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzv.v();
        zzs.u(zzauVar.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public static /* synthetic */ void i(zzau zzauVar) {
        zzauVar.g = 4;
        zzauVar.r();
    }

    public static /* synthetic */ void j(zzau zzauVar) {
        zzay y = com.google.android.gms.ads.internal.zzv.y();
        Context context = zzauVar.a;
        String str = zzauVar.d;
        String str2 = zzauVar.e;
        if (!y.k(context, str, str2)) {
            y.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if (C2638Cg0.Y4.equals(y.f)) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Creative is not pushed for this device.");
            y.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(y.f)) {
            int i2 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("The app is not linked for creative preview.");
            y.d(context, str, str2);
        } else if ("0".equals(y.f)) {
            int i3 = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Device is linked for in app preview.");
            y.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public static /* synthetic */ void l(final zzau zzauVar, zzgdj zzgdjVar) {
        zzay y = com.google.android.gms.ads.internal.zzv.y();
        Context context = zzauVar.a;
        if (!y.j(context, zzauVar.d, zzauVar.e)) {
            com.google.android.gms.ads.internal.zzv.y().d(context, zzauVar.d, zzauVar.e);
        } else {
            zzgdjVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaj
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzv.y().c(zzau.this.a);
                }
            });
        }
    }

    public static final int u(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final void m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.g;
        if (i != -1) {
            if (i == 0) {
                if (actionMasked == 5) {
                    this.g = 5;
                    this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.k.postDelayed(this.l, ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d5)).longValue());
                }
            } else if (i == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z = false;
                        for (int i2 = 0; i2 < historySize; i2++) {
                            z |= !t(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                        }
                        if (t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.g = -1;
                this.k.removeCallbacks(this.l);
            }
        }
    }

    public final void n(String str) {
        this.d = str;
    }

    public final void o(String str) {
        this.e = str;
    }

    public final void p(String str) {
        this.c = str;
    }

    public final void q(String str) {
        this.f = str;
    }

    public final void r() {
        try {
            Context context = this.a;
            if (!(context instanceof Activity)) {
                int i = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.y().b())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != com.google.android.gms.ads.internal.zzv.y().m()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            final int u = u(arrayList, "Ad information", true);
            final int u2 = u(arrayList, str, true);
            final int u3 = u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y9)).booleanValue();
            final int u4 = u(arrayList, "Open ad inspector", booleanValue);
            final int u5 = u(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.zzv.v();
            AlertDialog.Builder l = zzs.l(context);
            l.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzam
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    zzau.c(zzau.this, u, u2, u3, u4, u5, dialogInterface, i2);
                }
            });
            l.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.l("", e);
        }
    }

    public final void s(Context context) {
        final int i;
        ArrayList arrayList = new ArrayList();
        int u = u(arrayList, "None", true);
        final int u2 = u(arrayList, "Shake", true);
        final int u3 = u(arrayList, "Flick", true);
        int ordinal = this.b.b().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                i = u;
            } else {
                i = u3;
            }
        } else {
            i = u2;
        }
        com.google.android.gms.ads.internal.zzv.v();
        AlertDialog.Builder l = zzs.l(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        l.setTitle("Setup gesture");
        l.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        l.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzau.this.r();
            }
        });
        l.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzau.f(zzau.this, atomicInteger, i, u2, u3, dialogInterface, i2);
            }
        });
        l.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzau.this.r();
            }
        });
        l.create().show();
    }

    public final boolean t(float f, float f2, float f3, float f4) {
        if (Math.abs(this.i.x - f) < this.h && Math.abs(this.i.y - f2) < this.h && Math.abs(this.j.x - f3) < this.h && Math.abs(this.j.y - f4) < this.h) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public zzau(Context context, String str) {
        this(context);
        this.c = str;
    }
}
