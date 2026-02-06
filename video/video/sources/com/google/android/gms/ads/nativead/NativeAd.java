package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class NativeAd {

    /* loaded from: classes2.dex */
    public static abstract class AdChoicesInfo {
        @InterfaceC5670cr1
        public abstract List<Image> a();

        @InterfaceC5670cr1
        public abstract CharSequence b();
    }

    /* loaded from: classes2.dex */
    public static abstract class Image {
        @InterfaceC11300zs1
        public abstract Drawable a();

        public abstract double b();

        @InterfaceC11300zs1
        public abstract Uri c();

        public int d() {
            return -1;
        }

        public int e() {
            return -1;
        }
    }

    /* loaded from: classes2.dex */
    public interface OnNativeAdLoadedListener {
        void a(@InterfaceC5670cr1 NativeAd nativeAd);
    }

    /* loaded from: classes2.dex */
    public interface UnconfirmedClickListener {
        void a(@InterfaceC5670cr1 String str);

        void b();
    }

    public abstract void A(@InterfaceC5670cr1 UnconfirmedClickListener unconfirmedClickListener);

    @InterfaceC11300zs1
    public abstract Object B();

    public abstract void a();

    public abstract void b();

    @Deprecated
    public abstract void c();

    @InterfaceC11300zs1
    public abstract AdChoicesInfo d();

    @InterfaceC11300zs1
    public abstract String e();

    @InterfaceC11300zs1
    public abstract String f();

    @InterfaceC11300zs1
    public abstract String g();

    @InterfaceC5670cr1
    public abstract Bundle h();

    @InterfaceC11300zs1
    public abstract String i();

    @InterfaceC11300zs1
    public abstract Image j();

    @InterfaceC5670cr1
    public abstract List<Image> k();

    @InterfaceC11300zs1
    public abstract MediaContent l();

    @InterfaceC5670cr1
    public abstract List<MuteThisAdReason> m();

    @InterfaceC11300zs1
    public abstract String n();

    @InterfaceC11300zs1
    public abstract ResponseInfo o();

    @InterfaceC11300zs1
    public abstract Double p();

    @InterfaceC11300zs1
    public abstract String q();

    @Deprecated
    public abstract boolean r();

    @KeepForSdk
    public abstract void recordEvent(@InterfaceC5670cr1 Bundle bundle);

    public abstract boolean s();

    public abstract void t(@InterfaceC5670cr1 MuteThisAdReason muteThisAdReason);

    public abstract void u(@InterfaceC5670cr1 Bundle bundle);

    @Deprecated
    public abstract void v();

    public abstract boolean w(@InterfaceC5670cr1 Bundle bundle);

    public abstract void x(@InterfaceC5670cr1 Bundle bundle);

    public abstract void y(@InterfaceC5670cr1 MuteThisAdListener muteThisAdListener);

    public abstract void z(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener);
}
