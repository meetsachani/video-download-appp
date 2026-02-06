package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.b;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.messaging.FirebaseMessaging;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.C10901yE;
import o.C4551Vr1;
import o.C9743tT;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceFutureC8411o11;
import o.W12;

/* loaded from: classes2.dex */
public final class zzbki implements zzbjw {
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.zzb a;
    @InterfaceC11300zs1
    public final zzdsd b;
    @InterfaceC11300zs1
    public final zzbsj d;
    @InterfaceC11300zs1
    public final zzebt e;
    @InterfaceC11300zs1
    public final zzcmn f;
    public com.google.android.gms.ads.internal.overlay.zzaa g = null;
    public final zzgdj h = zzcaa.g;
    public final com.google.android.gms.ads.internal.util.client.zzu c = new com.google.android.gms.ads.internal.util.client.zzu(null);

    public zzbki(com.google.android.gms.ads.internal.zzb zzbVar, zzbsj zzbsjVar, zzebt zzebtVar, zzdsd zzdsdVar, zzcmn zzcmnVar) {
        this.a = zzbVar;
        this.d = zzbsjVar;
        this.e = zzebtVar;
        this.b = zzdsdVar;
        this.f = zzcmnVar;
    }

    public static int b(Map map) {
        String str = (String) map.get(W12.e);
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if (C10901yE.l.equalsIgnoreCase(str)) {
                return 6;
            }
            if ("c".equalsIgnoreCase(str)) {
                return 14;
            }
            return -1;
        }
        return -1;
    }

    @InterfaceC5056aJ2
    public static Uri c(Context context, zzavl zzavlVar, Uri uri, View view, @InterfaceC11300zs1 Activity activity, @InterfaceC11300zs1 zzfct zzfctVar) {
        if (zzavlVar != null) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.nc)).booleanValue() && zzfctVar != null) {
                    if (zzavlVar.e(uri)) {
                        return zzfctVar.a(uri, context, view, activity);
                    }
                } else if (zzavlVar.e(uri)) {
                    return zzavlVar.a(uri, context, view, activity);
                }
            } catch (zzavm unused) {
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    @InterfaceC5056aJ2
    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
            return uri;
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error adding click uptime parameter to url: ".concat(valueOf), e);
            return uri;
        }
    }

    public static boolean f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceFutureC8411o11 h;
        zzcmn zzcmnVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcfb zzcfbVar = (zzcfb) zzaVar;
        if (zzcfbVar.F() != null) {
            hashMap = zzcfbVar.F().w0;
        }
        String c = zzbyl.c(str, zzcfbVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.a;
        if (zzbVar != null && !zzbVar.c()) {
            zzbVar.b(c);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.qa)).booleanValue() && (zzcmnVar = this.f) != null && zzcmn.j(c)) {
            h = zzcmnVar.e(c, com.google.android.gms.ads.internal.client.zzbb.e());
        } else {
            h = zzgcy.h(c);
        }
        zzgcy.r(h, new zzbke(this, map, zzaVar, str2), this.h);
    }

    public final void h(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str4;
        boolean z5;
        Map map2 = map;
        zzcfb zzcfbVar = (zzcfb) zzaVar;
        zzfbu F = zzcfbVar.F();
        zzfbx I = zzcfbVar.I();
        boolean z6 = false;
        if (F == null || I == null) {
            str3 = "";
            z = false;
        } else {
            str3 = I.b;
            z = F.b();
        }
        boolean z7 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Za)).booleanValue() && map2.containsKey("sc") && ((String) map2.get("sc")).equals("0")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Yc)).booleanValue() && map2.containsKey("ig_cl") && ((String) map2.get("ig_cl")).equals("true")) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcfbVar.j0()) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Cannot expand WebView that is already expanded.");
                return;
            }
            k(false);
            ((zzcgl) zzaVar).b(f(map2), b(map2), z2);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            k(false);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.jc)).booleanValue() && Objects.equals(map2.get("is_allowed_for_lock_screen"), "1")) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (str != null) {
                ((zzcgl) zzaVar).N0(f(map2), b(map2), str, z2, z5);
            } else {
                ((zzcgl) zzaVar).W0(f(map2), b(map2), (String) map2.get("html"), (String) map2.get("baseurl"), z2);
            }
        } else {
            Intent intent = null;
            if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
                Context context = zzcfbVar.getContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V4)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.k("User opt out chrome custom tab.");
                    m(10);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q4)).booleanValue()) {
                        if (C9743tT.h(context, null) != null) {
                            z6 = true;
                        }
                    } else {
                        z6 = zzbdw.g(context);
                    }
                    if (!z6) {
                        m(4);
                    } else {
                        k(true);
                        if (TextUtils.isEmpty(str)) {
                            int i2 = com.google.android.gms.ads.internal.util.zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.g("Cannot open browser with null or empty url");
                            m(7);
                            return;
                        }
                        Uri d = d(c(zzcfbVar.getContext(), zzcfbVar.D(), Uri.parse(str), zzcfbVar.U(), zzcfbVar.i(), zzcfbVar.s0()));
                        if (!z || this.e == null || !l(zzaVar, zzcfbVar.getContext(), d.toString(), str3)) {
                            this.g = new zzbkf(this);
                            ((zzcgl) zzaVar).n1(new com.google.android.gms.ads.internal.overlay.zzc(null, d.toString(), null, null, null, null, null, null, ObjectWrapper.V3(this.g).asBinder(), true), z2, z3, str3);
                            return;
                        }
                        return;
                    }
                }
                map2.put("use_first_package", "true");
                map2.put("use_running_process", "true");
                j(zzaVar, map2, z, str3, z2, z3);
            } else if (!FirebaseMessaging.r.equalsIgnoreCase(str2) || !"true".equalsIgnoreCase((String) map2.get("system_browser"))) {
                boolean z8 = z2;
                boolean z9 = z;
                com.google.android.gms.ads.internal.client.zza zzaVar2 = zzaVar;
                boolean z10 = z3;
                String str5 = str3;
                if ("open_app".equalsIgnoreCase(str2)) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z8)).booleanValue()) {
                        k(true);
                        String str6 = (String) map2.get("p");
                        if (str6 == null) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.g("Package name missing from open app action.");
                            return;
                        } else if (!z9 || this.e == null || !l(zzaVar2, zzcfbVar.getContext(), str6, str5)) {
                            PackageManager packageManager = zzcfbVar.getContext().getPackageManager();
                            if (packageManager == null) {
                                int i4 = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.g("Cannot get package manager from open app action.");
                                return;
                            }
                            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                            if (launchIntentForPackage != null) {
                                ((zzcgl) zzaVar2).n1(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.g), z8, z10, str5);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                k(true);
                String str7 = (String) map2.get("intent_url");
                if (!TextUtils.isEmpty(str7)) {
                    try {
                        intent = Intent.parseUri(str7, 0);
                    } catch (URISyntaxException e) {
                        String valueOf = String.valueOf(str7);
                        int i5 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.e("Error parsing the url: ".concat(valueOf), e);
                    }
                }
                if (intent != null && intent.getData() != null) {
                    Uri data = intent.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri d2 = d(c(zzcfbVar.getContext(), zzcfbVar.D(), data, zzcfbVar.U(), zzcfbVar.i(), zzcfbVar.s0()));
                        if (!TextUtils.isEmpty(intent.getType())) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A8)).booleanValue()) {
                                intent.setDataAndType(d2, intent.getType());
                            }
                        }
                        intent.setData(d2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V8)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id")) {
                    z4 = z8;
                } else {
                    z4 = z8;
                    z7 = false;
                }
                HashMap hashMap = new HashMap();
                if (z7) {
                    zzbkg zzbkgVar = new zzbkg(this, z4, zzaVar2, hashMap, map2);
                    zzaVar2 = zzaVar2;
                    map2 = map2;
                    this.g = zzbkgVar;
                } else {
                    z6 = z4;
                }
                if (intent != null) {
                    if (z9 && this.e != null && l(zzaVar2, zzcfbVar.getContext(), intent.getData().toString(), str5)) {
                        if (z7) {
                            hashMap.put((String) map2.get("event_id"), Boolean.TRUE);
                            ((zzbmr) zzaVar2).q("openIntentAsync", hashMap);
                            return;
                        }
                        return;
                    }
                    ((zzcgl) zzaVar2).n1(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.g), z6, z10, str5);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    str4 = d(c(zzcfbVar.getContext(), zzcfbVar.D(), Uri.parse(str), zzcfbVar.U(), zzcfbVar.i(), zzcfbVar.s0())).toString();
                } else {
                    str4 = str;
                }
                if (z9 && this.e != null && l(zzaVar2, zzcfbVar.getContext(), str4, str5)) {
                    if (z7) {
                        hashMap.put((String) map2.get("event_id"), Boolean.TRUE);
                        ((zzbmr) zzaVar2).q("openIntentAsync", hashMap);
                        return;
                    }
                    return;
                }
                ((zzcgl) zzaVar2).n1(new com.google.android.gms.ads.internal.overlay.zzc((String) map2.get("i"), str4, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get(W12.i), this.g), z6, z10, str5);
            } else {
                j(zzaVar, map2, z, str3, z2, z3);
            }
        }
    }

    public final void i(Context context, String str, String str2) {
        zzebt zzebtVar = this.e;
        zzebtVar.f(str);
        zzdsd zzdsdVar = this.b;
        if (zzdsdVar != null) {
            zzece.e8(context, zzdsdVar, zzebtVar, str, "dialog_not_shown", zzfyf.e("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fe, code lost:
        if (com.google.android.gms.internal.ads.zzbkh.c(r13, r8, r9, r10, r11) == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2, boolean z3) {
        boolean z4;
        Uri uri;
        ResolveInfo d;
        zzcfb zzcfbVar;
        Intent b;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo c;
        k(true);
        zzcfb zzcfbVar2 = (zzcfb) zzaVar;
        Context context = zzcfbVar2.getContext();
        zzavl D = zzcfbVar2.D();
        View U = zzcfbVar2.U();
        zzfct s0 = zzcfbVar2.s0();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(b.r);
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            zzcfbVar = zzcfbVar2;
            b = null;
        } else {
            Uri d2 = d(c(context, D, Uri.parse(str2), U, null, s0));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M4)).booleanValue()) {
                    z4 = false;
                    if (!"http".equalsIgnoreCase(d2.getScheme())) {
                        uri = d2.buildUpon().scheme("https").build();
                    } else if ("https".equalsIgnoreCase(d2.getScheme())) {
                        uri = d2.buildUpon().scheme("http").build();
                    } else {
                        uri = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    Intent a = zzbkh.a(d2, context, D, U, s0);
                    Intent a2 = zzbkh.a(uri, context, D, U, s0);
                    if (z4) {
                        com.google.android.gms.ads.internal.zzv.v();
                        com.google.android.gms.ads.internal.util.zzs.V(context, a);
                        com.google.android.gms.ads.internal.zzv.v();
                        com.google.android.gms.ads.internal.util.zzs.V(context, a2);
                    }
                    d = zzbkh.d(a, arrayList, context, D, U, s0);
                    if (d == null) {
                        b = zzbkh.b(a, d, context, D, U, s0);
                    } else {
                        if (a2 != null && (c = zzbkh.c(a2, context, D, U, s0)) != null) {
                            b = zzbkh.b(a, c, context, D, U, s0);
                        }
                        if (arrayList.isEmpty()) {
                            zzcfbVar = zzcfbVar2;
                        } else {
                            if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                                int size = arrayList.size();
                                int i = 0;
                                loop0: while (i < size) {
                                    ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                    while (true) {
                                        int i2 = i + 1;
                                        if (it.hasNext()) {
                                            zzcfbVar = zzcfbVar2;
                                            if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                                b = zzbkh.b(a, resolveInfo, context, D, U, s0);
                                                break loop0;
                                            }
                                            zzcfbVar2 = zzcfbVar;
                                        }
                                    }
                                }
                            }
                            zzcfbVar = zzcfbVar2;
                            if (parseBoolean) {
                                b = zzbkh.b(a, (ResolveInfo) arrayList.get(0), context, D, U, s0);
                            }
                        }
                        b = a;
                    }
                    zzcfbVar = zzcfbVar2;
                }
            }
            z4 = true;
            if (!"http".equalsIgnoreCase(d2.getScheme())) {
            }
            ArrayList arrayList2 = new ArrayList();
            Intent a3 = zzbkh.a(d2, context, D, U, s0);
            Intent a22 = zzbkh.a(uri, context, D, U, s0);
            if (z4) {
            }
            d = zzbkh.d(a3, arrayList2, context, D, U, s0);
            if (d == null) {
            }
            zzcfbVar = zzcfbVar2;
        }
        if (z && this.e != null && b != null && l(zzaVar, zzcfbVar.getContext(), b.getData().toString(), str)) {
            return;
        }
        try {
            ((zzcgl) zzaVar).n1(new com.google.android.gms.ads.internal.overlay.zzc(b, this.g), z2, z3, str);
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g(message);
        }
    }

    public final void k(boolean z) {
        zzbsj zzbsjVar = this.d;
        if (zzbsjVar != null) {
            zzbsjVar.i(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.P8)).booleanValue() != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
        if (r4 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean booleanValue;
        zzbtr zzbtrVar;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar;
        zzdsd zzdsdVar = this.b;
        if (zzdsdVar != null) {
            zzece.d8(context, zzdsdVar, this.e, str2, "offline_open");
        }
        if (com.google.android.gms.ads.internal.zzv.t().a(context)) {
            this.e.l(this.c, str2);
            return false;
        }
        zzcfb zzcfbVar = (zzcfb) zzaVar;
        zzfbu F = zzcfbVar.F();
        if (F != null && (zzwVar = F.y0) != null && !zzwVar.c()) {
            z = true;
        } else {
            z = false;
        }
        if (F != null && (zzbtrVar = F.d0) != null && zzbtrVar.a && zzbtrVar.b != null && zzbtrVar.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (z2) {
            }
            com.google.android.gms.ads.internal.zzv.v();
            com.google.android.gms.ads.internal.util.zzbr a = com.google.android.gms.ads.internal.util.zzs.a(context);
            com.google.android.gms.ads.internal.zzv.v();
            boolean a2 = C4551Vr1.q(context).a();
            boolean h = com.google.android.gms.ads.internal.zzv.w().h(context, "offline_notification_channel");
            if (zzcfbVar.H().i() && zzcfbVar.i() == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!a2) {
                com.google.android.gms.ads.internal.zzv.v();
                if (!C4551Vr1.q(context).a()) {
                    if (Build.VERSION.SDK_INT < 33) {
                        booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.K8)).booleanValue();
                    } else {
                        booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J8)).booleanValue();
                    }
                }
                i(context, str2, "notifications_disabled");
                return false;
            }
            if (h) {
                i(context, str2, "notification_channel_disabled");
                return false;
            } else if (a == null) {
                i(context, str2, "work_manager_unavailable");
                return false;
            } else if (z3) {
                i(context, str2, "ad_no_activity");
                return false;
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H8)).booleanValue()) {
                i(context, str2, "notification_flow_disabled");
                return false;
            } else {
                if (zzcfbVar.J() != null && zzcfbVar.i() != null) {
                    zzecf e = zzecg.e();
                    e.a(zzcfbVar.i());
                    e.b(null);
                    e.c(str2);
                    e.d(str);
                    try {
                        zzcfbVar.J().f8(e.e());
                    } catch (Exception e2) {
                        i(context, str2, e2.getMessage());
                        return false;
                    }
                } else {
                    ((zzcgl) zzaVar).k1(str2, str, 14);
                }
                zzaVar.y();
                return true;
            }
        }
        zzdsd zzdsdVar2 = this.b;
        if (zzdsdVar2 != null) {
            zzece.d8(context, zzdsdVar2, this.e, str2, "onfs");
        }
        return false;
    }

    public final void m(int i) {
        zzdsd zzdsdVar;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P4)).booleanValue() && (zzdsdVar = this.b) != null) {
            zzdsc a = zzdsdVar.a();
            a.b("action", "cct_action");
            switch (i) {
                case 2:
                    str = "CONTEXT_NOT_AN_ACTIVITY";
                    break;
                case 3:
                    str = "CONTEXT_NULL";
                    break;
                case 4:
                    str = "CCT_NOT_SUPPORTED";
                    break;
                case 5:
                    str = "CCT_READY_TO_OPEN";
                    break;
                case 6:
                    str = "ACTIVITY_NOT_FOUND";
                    break;
                case 7:
                    str = "EMPTY_URL";
                    break;
                case 8:
                    str = "UNKNOWN";
                    break;
                case 9:
                    str = "WRONG_EXP_SETUP";
                    break;
                default:
                    str = "OPT_OUT";
                    break;
            }
            a.b("cct_open_status", str);
            a.j();
        }
    }
}
