package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class UnifiedNativeAdMapper {
    public String a;
    public List b;
    public String c;
    public NativeAd.Image d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public String i;
    public VideoController j;
    public boolean k;
    public View l;
    public View m;
    public Object n;

    /* renamed from: o  reason: collision with root package name */
    public Bundle f183o = new Bundle();
    public boolean p;
    public boolean q;
    public float r;

    public final void A(@InterfaceC5670cr1 NativeAd.Image image) {
        this.d = image;
    }

    public final void B(@InterfaceC5670cr1 List<NativeAd.Image> list) {
        this.b = list;
    }

    public void C(float f) {
        this.r = f;
    }

    public void D(@InterfaceC5670cr1 View view) {
        this.m = view;
    }

    public final void E(boolean z) {
        this.q = z;
    }

    public final void F(boolean z) {
        this.p = z;
    }

    public final void G(@InterfaceC5670cr1 String str) {
        this.i = str;
    }

    public final void H(@InterfaceC5670cr1 Double d) {
        this.g = d;
    }

    public final void I(@InterfaceC5670cr1 String str) {
        this.h = str;
    }

    public void J(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 Map<String, View> map, @InterfaceC5670cr1 Map<String, View> map2) {
    }

    public void K(@InterfaceC5670cr1 View view) {
    }

    @InterfaceC5670cr1
    public final View L() {
        return this.m;
    }

    @InterfaceC5670cr1
    public final VideoController M() {
        return this.j;
    }

    @InterfaceC5670cr1
    public final Object N() {
        return this.n;
    }

    public final void O(@InterfaceC5670cr1 Object obj) {
        this.n = obj;
    }

    public final void P(@InterfaceC5670cr1 VideoController videoController) {
        this.j = videoController;
    }

    @InterfaceC5670cr1
    public View a() {
        return this.l;
    }

    @InterfaceC5670cr1
    public final String b() {
        return this.f;
    }

    @InterfaceC5670cr1
    public final String c() {
        return this.c;
    }

    @InterfaceC5670cr1
    public final String d() {
        return this.e;
    }

    public float e() {
        return 0.0f;
    }

    public float f() {
        return 0.0f;
    }

    @InterfaceC5670cr1
    public final Bundle g() {
        return this.f183o;
    }

    @InterfaceC5670cr1
    public final String h() {
        return this.a;
    }

    @InterfaceC5670cr1
    public final NativeAd.Image i() {
        return this.d;
    }

    @InterfaceC5670cr1
    public final List<NativeAd.Image> j() {
        return this.b;
    }

    public float k() {
        return this.r;
    }

    public final boolean l() {
        return this.q;
    }

    public final boolean m() {
        return this.p;
    }

    @InterfaceC5670cr1
    public final String n() {
        return this.i;
    }

    @InterfaceC5670cr1
    public final Double o() {
        return this.g;
    }

    @InterfaceC5670cr1
    public final String p() {
        return this.h;
    }

    public void q(@InterfaceC5670cr1 View view) {
    }

    public boolean r() {
        return this.k;
    }

    public void s() {
    }

    public void t(@InterfaceC5670cr1 View view) {
        this.l = view;
    }

    public final void u(@InterfaceC5670cr1 String str) {
        this.f = str;
    }

    public final void v(@InterfaceC5670cr1 String str) {
        this.c = str;
    }

    public final void w(@InterfaceC5670cr1 String str) {
        this.e = str;
    }

    public final void x(@InterfaceC5670cr1 Bundle bundle) {
        this.f183o = bundle;
    }

    public void y(boolean z) {
        this.k = z;
    }

    public final void z(@InterfaceC5670cr1 String str) {
        this.a = str;
    }
}
