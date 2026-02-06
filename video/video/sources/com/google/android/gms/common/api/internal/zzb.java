package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import o.C2531Be;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzb extends Fragment implements LifecycleFragment {
    public static final WeakHashMap Y0 = new WeakHashMap();
    public final Map X = Collections.synchronizedMap(new C2531Be());
    public int Y = 0;
    @InterfaceC11300zs1
    public Bundle Z;

    public static zzb h(Activity activity) {
        zzb zzbVar;
        WeakHashMap weakHashMap = Y0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzbVar = (zzb) weakReference.get()) != null) {
            return zzbVar;
        }
        try {
            zzb zzbVar2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzbVar2 == null || zzbVar2.isRemoving()) {
                zzbVar2 = new zzb();
                activity.getFragmentManager().beginTransaction().add(zzbVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzbVar2));
            return zzbVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void a(String str, @InterfaceC5670cr1 LifecycleCallback lifecycleCallback) {
        if (!this.X.containsKey(str)) {
            this.X.put(str, lifecycleCallback);
            if (this.Y > 0) {
                new zzi(Looper.getMainLooper()).post(new zza(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    @InterfaceC11300zs1
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.X.get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, @InterfaceC11300zs1 FileDescriptor fileDescriptor, PrintWriter printWriter, @InterfaceC11300zs1 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean e() {
        return this.Y >= 2;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean f() {
        return this.Y > 0;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    @InterfaceC11300zs1
    public final Activity g() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, @InterfaceC11300zs1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.f(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(@InterfaceC11300zs1 Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.Y = 1;
        this.Z = bundle;
        for (Map.Entry entry : this.X.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.g(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.Y = 5;
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.Y = 3;
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.i();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.X.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).j(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.Y = 2;
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.k();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.Y = 4;
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.l();
        }
    }
}
