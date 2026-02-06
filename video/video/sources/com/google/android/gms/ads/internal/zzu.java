package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzavl;
import com.google.android.gms.internal.ads.zzavm;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbtu;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbwd;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.Map;
import java.util.concurrent.Future;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzu extends zzbw {
    public final VersionInfoParcel X;
    public final com.google.android.gms.ads.internal.client.zzr Y;
    public final Context Y0;
    public final Future Z = zzcaa.a.I2(new zzq(this));
    public final zzs Z0;
    @InterfaceC11300zs1
    public WebView a1;
    @InterfaceC11300zs1
    public zzbk b1;
    @InterfaceC11300zs1
    public zzavl c1;
    public AsyncTask d1;

    public zzu(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, VersionInfoParcel versionInfoParcel) {
        this.Y0 = context;
        this.X = versionInfoParcel;
        this.Y = zzrVar;
        this.a1 = new WebView(context);
        this.Z0 = new zzs(context, str);
        X7(0);
        this.a1.setVerticalScrollBarEnabled(false);
        this.a1.getSettings().setJavaScriptEnabled(true);
        this.a1.setWebViewClient(new zzo(this));
        this.a1.setOnTouchListener(new zzp(this));
    }

    public static /* bridge */ /* synthetic */ String d8(zzu zzuVar, String str) {
        if (zzuVar.c1 != null) {
            Uri parse = Uri.parse(str);
            try {
                parse = zzuVar.c1.a(parse, zzuVar.Y0, null, null);
            } catch (zzavm e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Unable to process ad data", e);
            }
            return parse.toString();
        }
        return str;
    }

    public static /* bridge */ /* synthetic */ void g8(zzu zzuVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzuVar.Y0.startActivity(intent);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void A5(zzx zzxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void C() throws RemoteException {
        Preconditions.k("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void C1(zzbdq zzbdqVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean C3(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        Preconditions.s(this.a1, "This Search Ad has already been torn down");
        this.Z0.f(zzmVar, this.X);
        this.d1 = new zzr(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void D4(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void G3(zzbtx zzbtxVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @InterfaceC5056aJ2
    public final int I(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzbb.b();
            return com.google.android.gms.ads.internal.util.client.zzf.D(this.Y0, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void J1(zzbwd zzbwdVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void L() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void L2(zzee zzeeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void M3(zzcb zzcbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void P4(zzcl zzclVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void Q5(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R() throws RemoteException {
        Preconditions.k("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R5(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void R7(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void T1(zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void V() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @InterfaceC5056aJ2
    public final void X7(int i) {
        if (this.a1 == null) {
            return;
        }
        this.a1.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void b2(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean c0() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void c7(zzbtu zzbtuVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle f() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzr g() throws RemoteException {
        return this.Y;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzbk i() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void i7(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzcl j() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final zzdx k() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void k7(zzbaq zzbaqVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final zzea l() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean l0() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void m7(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper n() throws RemoteException {
        Preconditions.k("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.V3(this.a1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void n6(zzbk zzbkVar) throws RemoteException {
        this.b1 = zzbkVar;
    }

    @InterfaceC5056aJ2
    public final String o() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbeh.d.e());
        zzs zzsVar = this.Z0;
        builder.appendQueryParameter(SearchIntents.b, zzsVar.d());
        builder.appendQueryParameter("pubId", zzsVar.c());
        builder.appendQueryParameter("mappver", zzsVar.a());
        Map e = zzsVar.e();
        for (String str : e.keySet()) {
            builder.appendQueryParameter(str, (String) e.get(str));
        }
        Uri build = builder.build();
        zzavl zzavlVar = this.c1;
        if (zzavlVar != null) {
            try {
                build = zzavlVar.b(build, this.Y0);
            } catch (zzavm e2) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Unable to process ad data", e2);
            }
        }
        String r = r();
        String encodedQuery = build.getEncodedQuery();
        return r + "#" + encodedQuery;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void o6(zzcp zzcpVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @InterfaceC5056aJ2
    public final String r() {
        String b = this.Z0.b();
        if (true == TextUtils.isEmpty(b)) {
            b = "www.google.com";
        }
        return "https://" + b + ((String) zzbeh.d.e());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final String s() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    @InterfaceC11300zs1
    public final String v() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void v6(zzfw zzfwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String x() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void y() throws RemoteException {
        Preconditions.k("destroy must be called on the main UI thread.");
        this.d1.cancel(true);
        this.Z.cancel(false);
        this.a1.destroy();
        this.a1 = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void y7(zzbh zzbhVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean z0() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void z2(com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }
}
