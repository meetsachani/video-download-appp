package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpy;
import com.google.firebase.messaging.Constants;
import o.C9998uW1;
import o.InterfaceC10389w71;
import o.InterfaceC5056aJ2;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC5056aJ2
@InterfaceC10389w71
/* loaded from: classes3.dex */
public final class zzjx implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ zziq X;

    public zzjx(zziq zziqVar) {
        this.X = zziqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[Catch: RuntimeException -> 0x0027, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0027, blocks: (B:3:0x000b, B:5:0x0017, B:11:0x002b, B:13:0x0031, B:17:0x0042, B:47:0x00c8, B:49:0x00d4, B:53:0x00e5, B:55:0x00eb, B:60:0x00ff, B:62:0x0105, B:65:0x0112, B:67:0x0118, B:68:0x012b, B:69:0x0137, B:72:0x013f, B:76:0x0162, B:78:0x017e, B:77:0x016f, B:80:0x0185, B:82:0x018b, B:84:0x0191, B:86:0x0197, B:88:0x019d, B:90:0x01a5, B:92:0x01ad, B:94:0x01b3, B:96:0x01ba, B:21:0x0057, B:24:0x005f, B:26:0x0067, B:28:0x006d, B:30:0x0073, B:32:0x0079, B:34:0x0081, B:36:0x0089, B:39:0x0093, B:41:0x009b, B:42:0x00a7, B:44:0x00bf), top: B:100:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f A[Catch: RuntimeException -> 0x0027, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0027, blocks: (B:3:0x000b, B:5:0x0017, B:11:0x002b, B:13:0x0031, B:17:0x0042, B:47:0x00c8, B:49:0x00d4, B:53:0x00e5, B:55:0x00eb, B:60:0x00ff, B:62:0x0105, B:65:0x0112, B:67:0x0118, B:68:0x012b, B:69:0x0137, B:72:0x013f, B:76:0x0162, B:78:0x017e, B:77:0x016f, B:80:0x0185, B:82:0x018b, B:84:0x0191, B:86:0x0197, B:88:0x019d, B:90:0x01a5, B:92:0x01ad, B:94:0x01b3, B:96:0x01ba, B:21:0x0057, B:24:0x005f, B:26:0x0067, B:28:0x006d, B:30:0x0073, B:32:0x0079, B:34:0x0081, B:36:0x0089, B:39:0x0093, B:41:0x009b, B:42:0x00a7, B:44:0x00bf), top: B:100:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(zzjx zzjxVar, boolean z, Uri uri, String str, String str2) {
        Bundle C;
        zzjxVar.X.n();
        try {
            zznd i = zzjxVar.X.i();
            boolean z2 = zzpy.a() && zzjxVar.X.d().s(zzbi.E0);
            boolean z3 = zzoi.a() && zzjxVar.X.d().s(zzbi.Z0);
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.contains("gclid") && ((!z3 || !str2.contains("gbraid")) && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && (!z2 || !str2.contains("sfmc_id")))) {
                    i.j().F().a("Activity created with data 'referrer' without required params");
                } else {
                    C = i.C(Uri.parse("https://google.com/search?" + str2), z2, z3);
                    if (C != null) {
                        C.putString("_cis", "referrer");
                    }
                    if (z) {
                        Bundle C2 = zzjxVar.X.i().C(uri, zzpy.a() && zzjxVar.X.d().s(zzbi.E0), zzoi.a() && zzjxVar.X.d().s(zzbi.Z0));
                        if (C2 != null) {
                            C2.putString("_cis", C9998uW1.R);
                            if (!C2.containsKey("gclid") && C != null && C.containsKey("gclid")) {
                                C2.putString("_cer", String.format("gclid=%s", C.getString("gclid")));
                            }
                            zzjxVar.X.A0(str, Constants.ScionAnalytics.l, C2);
                            zzjxVar.X.n.b(str, C2);
                        }
                    }
                    if (TextUtils.isEmpty(str2)) {
                        zzjxVar.X.j().F().b("Activity created with referrer", str2);
                        if (zzjxVar.X.d().s(zzbi.l0)) {
                            if (C != null) {
                                zzjxVar.X.A0(str, Constants.ScionAnalytics.l, C);
                                zzjxVar.X.n.b(str, C);
                            } else {
                                zzjxVar.X.j().F().b("Referrer does not contain valid parameters", str2);
                            }
                            zzjxVar.X.c0("auto", "_ldl", null, true);
                            return;
                        } else if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                            if (TextUtils.isEmpty(str2)) {
                                return;
                            }
                            zzjxVar.X.c0("auto", "_ldl", str2, true);
                            return;
                        } else {
                            zzjxVar.X.j().F().a("Activity created with data 'referrer' without required params");
                            return;
                        }
                    }
                    return;
                }
            }
            C = null;
            if (z) {
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (RuntimeException e) {
            zzjxVar.X.j().G().b("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzjx zzjxVar;
        String str;
        boolean z;
        try {
            try {
                this.X.j().K().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    this.X.s().F(activity, bundle);
                    return;
                }
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                        }
                    }
                    data = null;
                }
                Uri uri = data;
                if (uri != null && uri.isHierarchical()) {
                    this.X.i();
                    if (zznd.e0(intent)) {
                        str = "gs";
                    } else {
                        str = "auto";
                    }
                    String str2 = str;
                    String queryParameter = uri.getQueryParameter("referrer");
                    if (bundle == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = z;
                    zzjxVar = this;
                    try {
                        this.X.l().D(new zzka(zzjxVar, z2, uri, str2, queryParameter));
                        zzjxVar.X.s().F(activity, bundle);
                        return;
                    } catch (RuntimeException e) {
                        e = e;
                        zzjxVar.X.j().G().b("Throwable caught in onActivityCreated", e);
                        zzjxVar.X.s().F(activity, bundle);
                        return;
                    }
                }
                this.X.s().F(activity, bundle);
            } catch (RuntimeException e2) {
                e = e2;
                zzjxVar = this;
            } catch (Throwable th) {
                th = th;
                this.X.s().F(activity, bundle);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.X.s().F(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.X.s().E(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @InterfaceC10389w71
    public final void onActivityPaused(Activity activity) {
        this.X.s().Q(activity);
        zzlx u = this.X.u();
        u.l().D(new zzlz(u, u.b().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @InterfaceC10389w71
    public final void onActivityResumed(Activity activity) {
        zzlx u = this.X.u();
        u.l().D(new zzma(u, u.b().b()));
        this.X.s().S(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.X.s().R(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
