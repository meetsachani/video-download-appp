package com.google.firebase.analytics.connector;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.annotations.DeferredApi;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.M82;

/* loaded from: classes3.dex */
public interface AnalyticsConnector {

    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface AnalyticsConnectorHandle {
        @KeepForSdk
        void a();

        @KeepForSdk
        void b();

        @KeepForSdk
        void c(@InterfaceC5670cr1 Set<String> set);
    }

    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface AnalyticsConnectorListener {
        @KeepForSdk
        void a(int i, @InterfaceC11300zs1 Bundle bundle);
    }

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class ConditionalUserProperty {
        @InterfaceC5670cr1
        @KeepForSdk
        public String a;
        @InterfaceC5670cr1
        @KeepForSdk
        public String b;
        @InterfaceC11300zs1
        @KeepForSdk
        public Object c;
        @InterfaceC11300zs1
        @KeepForSdk
        public String d;
        @KeepForSdk
        public long e;
        @InterfaceC11300zs1
        @KeepForSdk
        public String f;
        @InterfaceC11300zs1
        @KeepForSdk
        public Bundle g;
        @InterfaceC11300zs1
        @KeepForSdk
        public String h;
        @InterfaceC11300zs1
        @KeepForSdk
        public Bundle i;
        @KeepForSdk
        public long j;
        @InterfaceC11300zs1
        @KeepForSdk
        public String k;
        @InterfaceC11300zs1
        @KeepForSdk
        public Bundle l;
        @KeepForSdk
        public long m;
        @KeepForSdk
        public boolean n;
        @KeepForSdk

        /* renamed from: o  reason: collision with root package name */
        public long f336o;
    }

    @KeepForSdk
    void a(@InterfaceC5670cr1 ConditionalUserProperty conditionalUserProperty);

    @KeepForSdk
    void b(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC11300zs1 Bundle bundle);

    @KeepForSdk
    void c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Object obj);

    @KeepForSdk
    void clearConditionalUserProperty(@M82(max = 24, min = 1) @InterfaceC5670cr1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 Bundle bundle);

    @InterfaceC5670cr1
    @KeepForSdk
    @InterfaceC10697xN2
    Map<String, Object> d(boolean z);

    @KeepForSdk
    @InterfaceC10697xN2
    int e(@M82(min = 1) @InterfaceC5670cr1 String str);

    @InterfaceC5670cr1
    @KeepForSdk
    @InterfaceC10697xN2
    List<ConditionalUserProperty> f(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 @M82(max = 23, min = 1) String str2);

    @InterfaceC11300zs1
    @KeepForSdk
    @DeferredApi
    AnalyticsConnectorHandle g(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 AnalyticsConnectorListener analyticsConnectorListener);
}
