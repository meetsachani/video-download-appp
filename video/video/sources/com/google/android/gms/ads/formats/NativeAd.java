package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes2.dex */
public abstract class NativeAd {
    @InterfaceC5670cr1
    public static final String a = "1098";

    @Deprecated
    /* loaded from: classes2.dex */
    public static abstract class AdChoicesInfo {
        @InterfaceC5670cr1
        public abstract List<Image> a();

        @InterfaceC5670cr1
        public abstract CharSequence b();
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public static abstract class Image {
        @InterfaceC5670cr1
        public abstract Drawable a();

        public abstract double b();

        @InterfaceC5670cr1
        public abstract Uri c();

        public int d() {
            return -1;
        }

        public int e() {
            return -1;
        }
    }

    @Deprecated
    public abstract void a(@InterfaceC5670cr1 Bundle bundle);

    @Deprecated
    public abstract boolean b(@InterfaceC5670cr1 Bundle bundle);

    @Deprecated
    public abstract void c(@InterfaceC5670cr1 Bundle bundle);
}
