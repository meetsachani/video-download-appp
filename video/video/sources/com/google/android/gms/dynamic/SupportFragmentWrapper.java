package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {
    public final Fragment X;

    public SupportFragmentWrapper(Fragment fragment) {
        this.X = fragment;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static SupportFragmentWrapper o1(@InterfaceC11300zs1 Fragment fragment) {
        if (fragment != null) {
            return new SupportFragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean B() {
        return this.X.x0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean C() {
        return this.X.D0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean L() {
        return this.X.F0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void M5(@InterfaceC5670cr1 Intent intent) {
        this.X.A2(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void O(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.o1(iObjectWrapper);
        Preconditions.r(view);
        this.X.F2(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void Q0(boolean z) {
        this.X.l2(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void R4(boolean z) {
        this.X.n2(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void U5(@InterfaceC5670cr1 Intent intent, int i) {
        this.X.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void a0(boolean z) {
        this.X.s2(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int b() {
        return this.X.H();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void b0(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.o1(iObjectWrapper);
        Preconditions.r(view);
        this.X.P1(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int c() {
        return this.X.k0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC11300zs1
    public final IFragmentWrapper d() {
        return o1(this.X.N());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC11300zs1
    public final IFragmentWrapper e() {
        return o1(this.X.i0());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC11300zs1
    public final Bundle f() {
        return this.X.s();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC5670cr1
    public final IObjectWrapper g() {
        return ObjectWrapper.V3(this.X.o());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC5670cr1
    public final IObjectWrapper h() {
        return ObjectWrapper.V3(this.X.Y());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC5670cr1
    public final IObjectWrapper i() {
        return ObjectWrapper.V3(this.X.n0());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC11300zs1
    public final String j() {
        return this.X.h0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean q() {
        return this.X.w0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void q1(boolean z) {
        this.X.y2(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean s() {
        return this.X.Z();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean t() {
        return this.X.v0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean v() {
        return this.X.m0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean w() {
        return this.X.C0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean y() {
        return this.X.z0();
    }
}
