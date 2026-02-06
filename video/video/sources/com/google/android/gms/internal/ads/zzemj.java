package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;
import o.C5581cT2;
import o.C5824dT2;
import o.C6066eT2;
import o.C6309fT2;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzemj implements zzetv {
    public final zzetv a;
    public final zzfcp b;
    public final Context c;
    public final zzbzn d;

    public zzemj(zzeon zzeonVar, zzfcp zzfcpVar, Context context, zzbzn zzbznVar) {
        this.a = zzeonVar;
        this.b = zzfcpVar;
        this.c = context;
        this.d = zzbznVar;
    }

    public static /* synthetic */ zzemk c(zzemj zzemjVar, zzeue zzeueVar) {
        String str;
        boolean z;
        Insets insets;
        String str2;
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int statusBars;
        int displayCutout;
        int navigationBars;
        int captionBar;
        Insets insets2;
        int i4;
        int i5;
        int i6;
        int i7;
        DisplayMetrics displayMetrics;
        zzfcp zzfcpVar = zzemjVar.b;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfcpVar.e;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.b1;
        if (zzrVarArr == null) {
            str = zzrVar.X;
            z = zzrVar.d1;
        } else {
            str = null;
            z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z4 = zzrVar2.d1;
                if (!z4 && !z2) {
                    str = zzrVar2.X;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z = true;
                    }
                    z3 = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        }
        Context context = zzemjVar.c;
        Resources resources = context.getResources();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            insets = C5581cT2.a();
        } else {
            insets = null;
        }
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzbzn zzbznVar = zzemjVar.d;
            f = displayMetrics.density;
            i2 = displayMetrics.widthPixels;
            int i9 = displayMetrics.heightPixels;
            str2 = zzbznVar.j().j();
            i = i9;
        } else {
            str2 = null;
            i = 0;
            i2 = 0;
            f = 0.0f;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.zd)).booleanValue() && i8 >= 35) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null && f != 0.0f) {
                WindowInsets a = C6309fT2.a(C6066eT2.a(windowManager));
                statusBars = WindowInsets.Type.statusBars();
                displayCutout = WindowInsets.Type.displayCutout();
                int i10 = statusBars | displayCutout;
                navigationBars = WindowInsets.Type.navigationBars();
                int i11 = i10 | navigationBars;
                captionBar = WindowInsets.Type.captionBar();
                insets2 = a.getInsets(i11 | captionBar);
                i4 = insets2.left;
                int ceil = (int) Math.ceil(i4 / f);
                i5 = insets2.top;
                i6 = insets2.right;
                f2 = 0.0f;
                i3 = i2;
                i7 = insets2.bottom;
                insets = C5824dT2.a(ceil, (int) Math.ceil(i5 / f), (int) Math.ceil(i6 / f), (int) Math.ceil(i7 / f));
            } else {
                f2 = 0.0f;
                i3 = i2;
                insets = C5581cT2.a();
            }
        } else {
            f2 = 0.0f;
            i3 = i2;
        }
        StringBuilder sb = new StringBuilder();
        if (zzrVarArr != null) {
            int i12 = 0;
            boolean z5 = false;
            while (i12 < zzrVarArr.length) {
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVarArr[i12];
                float f3 = f2;
                if (zzrVar3.d1) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i13 = zzrVar3.Z0;
                    if (i13 == -1) {
                        if (f != f3) {
                            i13 = (int) (zzrVar3.a1 / f);
                        } else {
                            i13 = -1;
                        }
                    }
                    sb.append(i13);
                    sb.append("x");
                    int i14 = zzrVar3.Y;
                    if (i14 == -2) {
                        if (f != f3) {
                            i14 = (int) (zzrVar3.Z / f);
                        } else {
                            i14 = -2;
                        }
                    }
                    sb.append(i14);
                }
                i12++;
                f2 = f3;
            }
            if (z5) {
                if (sb.length() != 0) {
                    sb.insert(0, "|");
                }
                sb.insert(0, "320x50");
            }
        }
        return new zzemk(zzrVar, str, z, sb.toString(), f, i3, i, str2, zzfcpVar.q, insets);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return zzgcy.m(this.a.b(), new zzfur() { // from class: com.google.android.gms.internal.ads.zzemi
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return zzemj.c(zzemj.this, (zzeue) obj);
            }
        }, zzcaa.g);
    }
}
