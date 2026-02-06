package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.internal.ads.zzfdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzo extends WebViewClient {
    public final /* synthetic */ zzu a;

    public zzo(zzu zzuVar) {
        this.a = zzuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzbk zzbkVar;
        zzbk zzbkVar2;
        zzbk zzbkVar3;
        zzbk zzbkVar4;
        zzu zzuVar = this.a;
        zzbkVar = zzuVar.b1;
        if (zzbkVar != null) {
            try {
                zzbkVar2 = zzuVar.b1;
                zzbkVar2.G(zzfdq.d(1, null, null));
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
        }
        zzu zzuVar2 = this.a;
        zzbkVar3 = zzuVar2.b1;
        if (zzbkVar3 != null) {
            try {
                zzbkVar4 = zzuVar2.b1;
                zzbkVar4.E(0);
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbk zzbkVar;
        zzbk zzbkVar2;
        zzbk zzbkVar3;
        zzbk zzbkVar4;
        zzbk zzbkVar5;
        zzbk zzbkVar6;
        zzbk zzbkVar7;
        zzbk zzbkVar8;
        zzbk zzbkVar9;
        zzbk zzbkVar10;
        zzbk zzbkVar11;
        zzbk zzbkVar12;
        zzbk zzbkVar13;
        zzu zzuVar = this.a;
        if (str.startsWith(zzuVar.r())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzbkVar10 = zzuVar.b1;
            if (zzbkVar10 != null) {
                try {
                    zzbkVar11 = zzuVar.b1;
                    zzbkVar11.G(zzfdq.d(3, null, null));
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
                }
            }
            zzu zzuVar2 = this.a;
            zzbkVar12 = zzuVar2.b1;
            if (zzbkVar12 != null) {
                try {
                    zzbkVar13 = zzuVar2.b1;
                    zzbkVar13.E(3);
                } catch (RemoteException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e2);
                }
            }
            this.a.X7(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzu zzuVar3 = this.a;
            zzbkVar6 = zzuVar3.b1;
            if (zzbkVar6 != null) {
                try {
                    zzbkVar7 = zzuVar3.b1;
                    zzbkVar7.G(zzfdq.d(1, null, null));
                } catch (RemoteException e3) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e3);
                }
            }
            zzu zzuVar4 = this.a;
            zzbkVar8 = zzuVar4.b1;
            if (zzbkVar8 != null) {
                try {
                    zzbkVar9 = zzuVar4.b1;
                    zzbkVar9.E(0);
                } catch (RemoteException e4) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e4);
                }
            }
            this.a.X7(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            zzu zzuVar5 = this.a;
            zzbkVar4 = zzuVar5.b1;
            if (zzbkVar4 != null) {
                try {
                    zzbkVar5 = zzuVar5.b1;
                    zzbkVar5.i();
                } catch (RemoteException e5) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e5);
                }
            }
            zzu zzuVar6 = this.a;
            zzuVar6.X7(zzuVar6.I(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            zzu zzuVar7 = this.a;
            zzbkVar = zzuVar7.b1;
            if (zzbkVar != null) {
                try {
                    zzbkVar2 = zzuVar7.b1;
                    zzbkVar2.c();
                    zzbkVar3 = zzuVar7.b1;
                    zzbkVar3.h();
                } catch (RemoteException e6) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e6);
                }
            }
            zzu zzuVar8 = this.a;
            zzu.g8(zzuVar8, zzu.d8(zzuVar8, str));
            return true;
        }
    }
}
