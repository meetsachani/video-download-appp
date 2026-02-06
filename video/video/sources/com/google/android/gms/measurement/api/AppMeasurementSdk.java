package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import java.util.List;
import java.util.Map;
import o.C9273rY;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.KS1;
import o.M82;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class AppMeasurementSdk {
    public final zzdf a;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static final class ConditionalUserProperty {
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String a = "origin";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String b = "name";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String c = "value";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String d = "trigger_event_name";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String e = "trigger_timeout";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String f = "timed_out_event_name";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String g = "timed_out_event_params";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String h = "triggered_event_name";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String i = "triggered_event_params";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String j = "time_to_live";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String k = "expired_event_name";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String l = "expired_event_params";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String m = "creation_timestamp";
        @InterfaceC5670cr1
        @KeepForSdk
        public static final String n = "active";
        @InterfaceC5670cr1
        @KeepForSdk

        /* renamed from: o  reason: collision with root package name */
        public static final String f309o = "triggered_timestamp";

        private ConditionalUserProperty() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface EventInterceptor extends zzim {
        @Override // com.google.android.gms.measurement.internal.zzim
        @ShowFirstParty
        @KeepForSdk
        @InterfaceC10697xN2
        void a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle, long j);
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface OnEventListener extends zzil {
        @Override // com.google.android.gms.measurement.internal.zzil
        @ShowFirstParty
        @KeepForSdk
        @InterfaceC10697xN2
        void a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Bundle bundle, long j);
    }

    public AppMeasurementSdk(zzdf zzdfVar) {
        this.a = zzdfVar;
    }

    @KS1(allOf = {"android.permission.INTERNET", C9273rY.b, "android.permission.WAKE_LOCK"})
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static AppMeasurementSdk k(@InterfaceC5670cr1 Context context) {
        return zzdf.f(context).D();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @KS1(allOf = {"android.permission.INTERNET", C9273rY.b, "android.permission.WAKE_LOCK"})
    public static AppMeasurementSdk l(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC5670cr1 Bundle bundle) {
        return zzdf.g(context, str, str2, str3, bundle).D();
    }

    @ShowFirstParty
    @KeepForSdk
    public void A(@InterfaceC5670cr1 OnEventListener onEventListener) {
        this.a.G(onEventListener);
    }

    public final void B(boolean z) {
        this.a.B(z);
    }

    @KeepForSdk
    public void a(@M82(min = 1) @InterfaceC5670cr1 String str) {
        this.a.H(str);
    }

    @KeepForSdk
    public void b(@M82(max = 24, min = 1) @InterfaceC5670cr1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 Bundle bundle) {
        this.a.x(str, str2, bundle);
    }

    @KeepForSdk
    public void c(@M82(min = 1) @InterfaceC5670cr1 String str) {
        this.a.N(str);
    }

    @KeepForSdk
    public long d() {
        return this.a.b();
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String e() {
        return this.a.Q();
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String f() {
        return this.a.U();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @InterfaceC10697xN2
    public List<Bundle> g(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 @M82(max = 23, min = 1) String str2) {
        return this.a.i(str, str2);
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String h() {
        return this.a.V();
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String i() {
        return this.a.W();
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String j() {
        return this.a.X();
    }

    @KeepForSdk
    @InterfaceC10697xN2
    public int m(@M82(min = 1) @InterfaceC5670cr1 String str) {
        return this.a.a(str);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @InterfaceC10697xN2
    public Map<String, Object> n(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 @M82(max = 24, min = 1) String str2, boolean z) {
        return this.a.j(str, str2, z);
    }

    @KeepForSdk
    public void o(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC11300zs1 Bundle bundle) {
        this.a.J(str, str2, bundle);
    }

    @KeepForSdk
    public void p(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC11300zs1 Bundle bundle, long j) {
        this.a.y(str, str2, bundle, j);
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public void q(@InterfaceC5670cr1 Bundle bundle) {
        this.a.c(bundle, false);
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Bundle r(@InterfaceC5670cr1 Bundle bundle) {
        return this.a.c(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void s(@InterfaceC5670cr1 OnEventListener onEventListener) {
        this.a.s(onEventListener);
    }

    @KeepForSdk
    public void t(@InterfaceC5670cr1 Bundle bundle) {
        this.a.n(bundle);
    }

    @KeepForSdk
    public void u(@InterfaceC5670cr1 Bundle bundle) {
        this.a.F(bundle);
    }

    @KeepForSdk
    public void v(@InterfaceC5670cr1 Activity activity, @InterfaceC11300zs1 @M82(max = 36, min = 1) String str, @InterfaceC11300zs1 @M82(max = 36, min = 1) String str2) {
        this.a.m(activity, str, str2);
    }

    @ShowFirstParty
    @KeepForSdk
    @InterfaceC10697xN2
    public void w(@InterfaceC5670cr1 EventInterceptor eventInterceptor) {
        this.a.t(eventInterceptor);
    }

    @KeepForSdk
    public void x(@InterfaceC11300zs1 Boolean bool) {
        this.a.u(bool);
    }

    @KeepForSdk
    public void y(boolean z) {
        this.a.u(Boolean.valueOf(z));
    }

    @KeepForSdk
    public void z(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Object obj) {
        this.a.A(str, str2, obj, true);
    }
}
