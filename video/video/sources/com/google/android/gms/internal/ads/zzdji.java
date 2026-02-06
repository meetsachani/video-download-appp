package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzdji extends zzbgp implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkm {
    public final WeakReference X;
    public zzdij Z0;
    public zzayv a1;
    public final Map Y = new HashMap();
    public final Map Z = new HashMap();
    public final Map Y0 = new HashMap();

    public zzdji(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzv.D();
        zzcan.a(view, this);
        com.google.android.gms.ads.internal.zzv.D();
        zzcan.b(view, this);
        this.X = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.Y.put(str, new WeakReference(view2));
                if (!NativeAd.a.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.Y0.putAll(this.Y);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.Z.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.Y0.putAll(this.Z);
        this.a1 = new zzayv(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized void B5(String str, View view, boolean z) {
        this.Y0.put(str, new WeakReference(view));
        if (!NativeAd.a.equals(str) && !"3011".equals(str)) {
            this.Y.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final synchronized void c3(IObjectWrapper iObjectWrapper) {
        try {
            if (this.Z0 != null) {
                Object o1 = ObjectWrapper.o1(iObjectWrapper);
                if (!(o1 instanceof View)) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.Z0.w((View) o1);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final View e() {
        return (View) this.X.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final synchronized void f() {
        zzdij zzdijVar = this.Z0;
        if (zzdijVar != null) {
            zzdijVar.C(this);
            this.Z0 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final synchronized View f0(String str) {
        WeakReference weakReference = (WeakReference) this.Y0.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final FrameLayout h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final zzayv i() {
        return this.a1;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final synchronized IObjectWrapper j() {
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:6:0x0005
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized java.lang.String k() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "1007"
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdji.k():java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized Map l() {
        return this.Y0;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized Map m() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final synchronized Map n() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final synchronized JSONObject o() {
        zzdij zzdijVar = this.Z0;
        if (zzdijVar != null) {
            return zzdijVar.Z(e(), l(), m());
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdij zzdijVar = this.Z0;
        if (zzdijVar != null) {
            zzdijVar.l(view, e(), l(), m(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdij zzdijVar = this.Z0;
        if (zzdijVar != null) {
            zzdijVar.j(e(), l(), m(), zzdij.H(e()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdij zzdijVar = this.Z0;
        if (zzdijVar != null) {
            zzdijVar.j(e(), l(), m(), zzdij.H(e()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdij zzdijVar = this.Z0;
        if (zzdijVar != null) {
            zzdijVar.u(view, motionEvent, e());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    @InterfaceC11300zs1
    public final synchronized JSONObject p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final synchronized void p4(IObjectWrapper iObjectWrapper) {
        Object o1 = ObjectWrapper.o1(iObjectWrapper);
        if (!(o1 instanceof zzdij)) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdij zzdijVar = this.Z0;
        if (zzdijVar != null) {
            zzdijVar.C(this);
        }
        zzdij zzdijVar2 = (zzdij) o1;
        if (zzdijVar2.D()) {
            this.Z0 = zzdijVar2;
            zzdijVar2.B(this);
            this.Z0.t(e());
            return;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }
}
