package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public final class FragmentWrapper extends IFragmentWrapper.Stub {
    public final Fragment X;

    public FragmentWrapper(Fragment fragment) {
        this.X = fragment;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static FragmentWrapper o1(@InterfaceC11300zs1 Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean B() {
        return this.X.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean C() {
        return this.X.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean L() {
        return this.X.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void M5(@InterfaceC5670cr1 Intent intent) {
        this.X.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void O(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.o1(iObjectWrapper);
        Preconditions.r(view);
        this.X.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void Q0(boolean z) {
        this.X.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void R4(boolean z) {
        this.X.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void U5(@InterfaceC5670cr1 Intent intent, int i) {
        this.X.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void a0(boolean z) {
        this.X.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int b() {
        return this.X.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void b0(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.o1(iObjectWrapper);
        Preconditions.r(view);
        this.X.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int c() {
        return this.X.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC11300zs1
    public final IFragmentWrapper d() {
        return o1(this.X.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC11300zs1
    public final IFragmentWrapper e() {
        return o1(this.X.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC11300zs1
    public final Bundle f() {
        return this.X.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC5670cr1
    public final IObjectWrapper g() {
        return ObjectWrapper.V3(this.X.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC5670cr1
    public final IObjectWrapper h() {
        return ObjectWrapper.V3(this.X.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC5670cr1
    public final IObjectWrapper i() {
        return ObjectWrapper.V3(this.X.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @InterfaceC11300zs1
    public final String j() {
        return this.X.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean q() {
        return this.X.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void q1(boolean z) {
        this.X.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean s() {
        return this.X.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean t() {
        return this.X.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean v() {
        return this.X.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean w() {
        return this.X.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean y() {
        return this.X.isInLayout();
    }
}
