package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import o.InterfaceC5056aJ2;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class zzftl {
    public static final zzfud c = new zzfud("OverlayDisplayService");
    public static final Intent d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    public static final /* synthetic */ int e = 0;
    @InterfaceC5056aJ2
    public final zzfuc a;
    public final String b;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzfth] */
    public zzftl(Context context) {
        if (zzfuf.a(context)) {
            this.a = new zzfuc(context.getApplicationContext(), c, "OverlayDisplayService", d, new Object() { // from class: com.google.android.gms.internal.ads.zzfth
            });
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }

    public static /* synthetic */ void a(zzftl zzftlVar, zzfts zzftsVar, int i, zzftq zzftqVar) {
        try {
            zzfuc zzfucVar = zzftlVar.a;
            if (zzfucVar != null) {
                zzfsc zzfscVar = (zzfsc) zzfucVar.c();
                if (zzfscVar == null) {
                    return;
                }
                String str = zzftlVar.b;
                final Bundle bundle = new Bundle();
                bundle.putString("callerPackage", str);
                bundle.putInt("displayMode", i);
                i(zzftsVar.b(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsw
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i2 = zzftl.e;
                        bundle.putString("sessionToken", (String) obj);
                    }
                });
                i(zzftsVar.a(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzftc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i2 = zzftl.e;
                        bundle.putString(RemoteConfigConstants.RequestFieldKey.W, (String) obj);
                    }
                });
                zzfscVar.m5(bundle, new zzftk(zzftlVar, zzftqVar));
                return;
            }
            throw null;
        } catch (RemoteException e2) {
            c.b(e2, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), zzftlVar.b);
        }
    }

    public static /* synthetic */ void b(zzftl zzftlVar, zzfss zzfssVar, zzftq zzftqVar) {
        try {
            zzfuc zzfucVar = zzftlVar.a;
            if (zzfucVar != null) {
                zzfsc zzfscVar = (zzfsc) zzfucVar.c();
                if (zzfscVar == null) {
                    return;
                }
                String str = zzftlVar.b;
                final Bundle bundle = new Bundle();
                bundle.putString("callerPackage", str);
                i(zzfssVar.b(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfte
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = zzftl.e;
                        bundle.putString("sessionToken", (String) obj);
                    }
                });
                i(zzfssVar.a(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzftf
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = zzftl.e;
                        bundle.putString(RemoteConfigConstants.RequestFieldKey.W, (String) obj);
                    }
                });
                zzfscVar.m6(bundle, new zzftk(zzftlVar, zzftqVar));
                return;
            }
            throw null;
        } catch (RemoteException e2) {
            c.b(e2, "dismiss overlay display from: %s", zzftlVar.b);
        }
    }

    public static /* synthetic */ void c(zzftl zzftlVar, zzftn zzftnVar, zzftq zzftqVar) {
        try {
            zzfuc zzfucVar = zzftlVar.a;
            if (zzfucVar != null) {
                zzfsc zzfscVar = (zzfsc) zzfucVar.c();
                if (zzfscVar == null) {
                    return;
                }
                String str = zzftlVar.b;
                final Bundle bundle = new Bundle();
                bundle.putString("callerPackage", str);
                bundle.putBinder("windowToken", zzftnVar.f());
                i(zzftnVar.g(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzftj
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = zzftl.e;
                        bundle.putString("adFieldEnifd", (String) obj);
                    }
                });
                bundle.putInt("layoutGravity", zzftnVar.c());
                bundle.putFloat("layoutVerticalMargin", zzftnVar.a());
                bundle.putInt("displayMode", 0);
                bundle.putInt("triggerMode", 0);
                bundle.putInt("windowWidthPx", zzftnVar.e());
                i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsx
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = zzftl.e;
                        bundle.putString("deeplinkUrl", (String) obj);
                    }
                });
                i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsy
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = zzftl.e;
                        bundle.putString("sessionToken", (String) obj);
                    }
                });
                i(zzftnVar.h(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfsz
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = zzftl.e;
                        bundle.putString(RemoteConfigConstants.RequestFieldKey.W, (String) obj);
                    }
                });
                i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfta
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i = zzftl.e;
                        bundle.putString("thirdPartyAuthCallerId", (String) obj);
                    }
                });
                bundle.putBoolean("stableSessionToken", true);
                zzfscVar.R6(str, bundle, new zzftk(zzftlVar, zzftqVar));
                return;
            }
            throw null;
        } catch (RemoteException e2) {
            c.b(e2, "show overlay display from: %s", zzftlVar.b);
        }
    }

    public static /* synthetic */ boolean h(String str) {
        if (!k(str)) {
            return true;
        }
        return false;
    }

    public static void i(String str, Consumer consumer) {
        if (!k(str)) {
            str.getClass();
            consumer.accept(str.trim());
        }
    }

    public static boolean j(zzftq zzftqVar, String str, List list) {
        if (list.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.zzfti
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return zzftl.h((String) obj);
            }
        })) {
            return true;
        }
        c.a(str, new Object[0]);
        zzfto c2 = zzftp.c();
        c2.b(8160);
        zzftqVar.a(c2.c());
        return false;
    }

    public static boolean k(String str) {
        return zzfvt.c(str).trim().isEmpty();
    }

    public final void d() {
        zzfuc zzfucVar = this.a;
        if (zzfucVar == null) {
            return;
        }
        c.c("unbind LMD display overlay service", new Object[0]);
        zzfucVar.n();
    }

    public final void e(final zzfss zzfssVar, final zzftq zzftqVar) {
        zzfuc zzfucVar = this.a;
        if (zzfucVar == null) {
            c.a("error: %s", "Play Store not found.");
        } else if (!j(zzftqVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzfssVar.b(), zzfssVar.a()))) {
        } else {
            zzfucVar.m(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftb
                @Override // java.lang.Runnable
                public final void run() {
                    zzftl.b(zzftl.this, zzfssVar, zzftqVar);
                }
            });
        }
    }

    public final void f(final zzftn zzftnVar, final zzftq zzftqVar) {
        zzfuc zzfucVar = this.a;
        if (zzfucVar == null) {
            c.a("error: %s", "Play Store not found.");
        } else if (!j(zzftqVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzftnVar.h()))) {
        } else {
            zzfucVar.m(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftg
                @Override // java.lang.Runnable
                public final void run() {
                    zzftl.c(zzftl.this, zzftnVar, zzftqVar);
                }
            });
        }
    }

    public final void g(final zzfts zzftsVar, final zzftq zzftqVar, final int i) {
        zzfuc zzfucVar = this.a;
        if (zzfucVar == null) {
            c.a("error: %s", "Play Store not found.");
        } else if (!j(zzftqVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzftsVar.b(), zzftsVar.a()))) {
        } else {
            zzfucVar.m(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftd
                @Override // java.lang.Runnable
                public final void run() {
                    zzftl.a(zzftl.this, zzftsVar, i, zzftqVar);
                }
            });
        }
    }
}
