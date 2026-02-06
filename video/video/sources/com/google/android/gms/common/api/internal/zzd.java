package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import o.ActivityC4864Yy0;
import o.C2531Be;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzd extends Fragment implements LifecycleFragment {
    public static final WeakHashMap k2 = new WeakHashMap();
    public final Map h2 = Collections.synchronizedMap(new C2531Be());
    public int i2 = 0;
    @InterfaceC11300zs1
    public Bundle j2;

    public static zzd I2(ActivityC4864Yy0 activityC4864Yy0) {
        zzd zzdVar;
        WeakHashMap weakHashMap = k2;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC4864Yy0);
        if (weakReference != null && (zzdVar = (zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) activityC4864Yy0.W0().s0("SupportLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.C0()) {
                zzdVar2 = new zzd();
                activityC4864Yy0.W0().u().g(zzdVar2, "SupportLifecycleFragmentImpl").n();
            }
            weakHashMap.put(activityC4864Yy0, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void I0(int i, int i2, @InterfaceC11300zs1 Intent intent) {
        super.I0(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.h2.values()) {
            lifecycleCallback.f(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void N0(@InterfaceC11300zs1 Bundle bundle) {
        Bundle bundle2;
        super.N0(bundle);
        this.i2 = 1;
        this.j2 = bundle;
        for (Map.Entry entry : this.h2.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.g(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void S0() {
        super.S0();
        this.i2 = 5;
        for (LifecycleCallback lifecycleCallback : this.h2.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void a(String str, @InterfaceC5670cr1 LifecycleCallback lifecycleCallback) {
        if (!this.h2.containsKey(str)) {
            this.h2.put(str, lifecycleCallback);
            if (this.i2 > 0) {
                new zzi(Looper.getMainLooper()).post(new zzc(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    @InterfaceC11300zs1
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.h2.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean e() {
        return this.i2 >= 2;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean f() {
        return this.i2 > 0;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    @InterfaceC11300zs1
    public final /* synthetic */ Activity g() {
        return o();
    }

    @Override // androidx.fragment.app.Fragment
    public final void i1() {
        super.i1();
        this.i2 = 3;
        for (LifecycleCallback lifecycleCallback : this.h2.values()) {
            lifecycleCallback.i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void j1(Bundle bundle) {
        super.j1(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.h2.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).j(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void k(String str, @InterfaceC11300zs1 FileDescriptor fileDescriptor, PrintWriter printWriter, @InterfaceC11300zs1 String[] strArr) {
        super.k(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.h2.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void k1() {
        super.k1();
        this.i2 = 2;
        for (LifecycleCallback lifecycleCallback : this.h2.values()) {
            lifecycleCallback.k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void l1() {
        super.l1();
        this.i2 = 4;
        for (LifecycleCallback lifecycleCallback : this.h2.values()) {
            lifecycleCallback.l();
        }
    }
}
