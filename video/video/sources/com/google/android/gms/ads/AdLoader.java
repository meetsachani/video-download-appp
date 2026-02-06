package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbik;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbta;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.KS1;

/* loaded from: classes2.dex */
public class AdLoader {
    public final zzq a;
    public final Context b;
    public final zzbq c;

    /* loaded from: classes2.dex */
    public static class Builder {
        public final Context a;
        public final zzbt b;

        public Builder(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
            zzbt d = zzbb.a().d(context, str, new zzbph());
            this.a = (Context) Preconditions.s(context, "context cannot be null");
            this.b = d;
        }

        @InterfaceC5670cr1
        public AdLoader a() {
            try {
                return new AdLoader(this.a, this.b.d(), zzq.a);
            } catch (RemoteException e) {
                zzo.e("Failed to build AdLoader.", e);
                return new AdLoader(this.a, new zzfe().X7(), zzq.a);
            }
        }

        @InterfaceC5670cr1
        public Builder b(@InterfaceC5670cr1 OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @InterfaceC5670cr1 AdSize... adSizeArr) {
            if (adSizeArr != null && adSizeArr.length > 0) {
                try {
                    this.b.n7(new zzbij(onAdManagerAdViewLoadedListener), new zzr(this.a, adSizeArr));
                    return this;
                } catch (RemoteException e) {
                    zzo.h("Failed to add Google Ad Manager banner ad listener", e);
                    return this;
                }
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        @InterfaceC5670cr1
        public Builder c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @InterfaceC11300zs1 NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbsy zzbsyVar = new zzbsy(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.b.Y3(str, zzbsyVar.b(), zzbsyVar.a());
                return this;
            } catch (RemoteException e) {
                zzo.h("Failed to add custom format ad listener", e);
                return this;
            }
        }

        @InterfaceC5670cr1
        public Builder d(@InterfaceC5670cr1 NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.b.q7(new zzbta(onNativeAdLoadedListener));
                return this;
            } catch (RemoteException e) {
                zzo.h("Failed to add google native ad listener", e);
                return this;
            }
        }

        @InterfaceC5670cr1
        public Builder e(@InterfaceC5670cr1 AdListener adListener) {
            try {
                this.b.K3(new com.google.android.gms.ads.internal.client.zzg(adListener));
                return this;
            } catch (RemoteException e) {
                zzo.h("Failed to set AdListener.", e);
                return this;
            }
        }

        @InterfaceC5670cr1
        public Builder f(@InterfaceC5670cr1 AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.b.N7(adManagerAdViewOptions);
                return this;
            } catch (RemoteException e) {
                zzo.h("Failed to specify Ad Manager banner ad options", e);
                return this;
            }
        }

        @InterfaceC5670cr1
        public Builder g(@InterfaceC5670cr1 NativeAdOptions nativeAdOptions) {
            zzfw zzfwVar;
            try {
                zzbt zzbtVar = this.b;
                boolean e = nativeAdOptions.e();
                boolean d = nativeAdOptions.d();
                int a = nativeAdOptions.a();
                if (nativeAdOptions.c() != null) {
                    zzfwVar = new zzfw(nativeAdOptions.c());
                } else {
                    zzfwVar = null;
                }
                zzbtVar.M2(new zzbfv(4, e, -1, d, a, zzfwVar, nativeAdOptions.h(), nativeAdOptions.b(), nativeAdOptions.f(), nativeAdOptions.g(), nativeAdOptions.i() - 1));
                return this;
            } catch (RemoteException e2) {
                zzo.h("Failed to specify native ad options", e2);
                return this;
            }
        }

        @Deprecated
        public final Builder h(String str, com.google.android.gms.ads.formats.zzg zzgVar, @InterfaceC11300zs1 com.google.android.gms.ads.formats.zzf zzfVar) {
            zzbih zzbihVar = new zzbih(zzgVar, zzfVar);
            try {
                this.b.Y3(str, zzbihVar.d(), zzbihVar.c());
                return this;
            } catch (RemoteException e) {
                zzo.h("Failed to add custom template ad listener", e);
                return this;
            }
        }

        @Deprecated
        public final Builder i(com.google.android.gms.ads.formats.zzi zziVar) {
            try {
                this.b.q7(new zzbik(zziVar));
                return this;
            } catch (RemoteException e) {
                zzo.h("Failed to add google native ad listener", e);
                return this;
            }
        }

        @InterfaceC5670cr1
        @Deprecated
        public final Builder j(@InterfaceC5670cr1 com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.b.M2(new zzbfv(nativeAdOptions));
                return this;
            } catch (RemoteException e) {
                zzo.h("Failed to specify native ad options", e);
                return this;
            }
        }
    }

    public AdLoader(Context context, zzbq zzbqVar, zzq zzqVar) {
        this.b = context;
        this.c = zzbqVar;
        this.a = zzqVar;
    }

    public static /* synthetic */ void e(AdLoader adLoader, zzeh zzehVar) {
        try {
            adLoader.c.U4(adLoader.a.a(adLoader.b, zzehVar));
        } catch (RemoteException e) {
            zzo.e("Failed to load ad.", e);
        }
    }

    public boolean a() {
        try {
            return this.c.i();
        } catch (RemoteException e) {
            zzo.h("Failed to check if ad is loading.", e);
            return false;
        }
    }

    @KS1("android.permission.INTERNET")
    public void b(@InterfaceC5670cr1 AdRequest adRequest) {
        f(adRequest.a);
    }

    public void c(@InterfaceC5670cr1 AdManagerAdRequest adManagerAdRequest) {
        f(adManagerAdRequest.a);
    }

    @KS1("android.permission.INTERNET")
    public void d(@InterfaceC5670cr1 AdRequest adRequest, int i) {
        try {
            this.c.Q4(this.a.a(this.b, adRequest.a), i);
        } catch (RemoteException e) {
            zzo.e("Failed to load ads.", e);
        }
    }

    public final void f(final zzeh zzehVar) {
        Context context = this.b;
        zzbcv.a(context);
        if (((Boolean) zzbet.c.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.e(AdLoader.this, zzehVar);
                    }
                });
                return;
            }
        }
        try {
            this.c.U4(this.a.a(context, zzehVar));
        } catch (RemoteException e) {
            zzo.e("Failed to load ad.", e);
        }
    }
}
