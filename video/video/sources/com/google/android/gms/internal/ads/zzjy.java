package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzjy implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzacc, zzqb, zzxh, zztz, zzht {
    public static final /* synthetic */ int Y = 0;
    public final /* synthetic */ zzkc X;

    public /* synthetic */ zzjy(zzkc zzkcVar, zzkb zzkbVar) {
        this.X = zzkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void M0(String str) {
        zzkc.D(this.X).j(str);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void N0(long j, int i) {
        zzkc.D(this.X).c(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void O0(final zzcd zzcdVar) {
        zzdw A = zzkc.A(this.X);
        A.d(25, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjw
            @Override // com.google.android.gms.internal.ads.zzdt
            public final void b(Object obj) {
                ((zzbe) obj).p0(zzcd.this);
            }
        });
        A.c();
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void P0(zzia zziaVar) {
        zzkc.D(this.X).G(zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void Q(String str) {
        zzkc.D(this.X).V(str);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void Q0(zzz zzzVar, @InterfaceC11300zs1 zzib zzibVar) {
        zzkc.D(this.X).p(zzzVar, zzibVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void R0(String str, long j, long j2) {
        zzkc.D(this.X).C(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void S0(Object obj, long j) {
        zzkc zzkcVar = this.X;
        zzkc.D(zzkcVar).E(obj, j);
        if (zzkc.E(zzkcVar) == obj) {
            zzdw A = zzkc.A(zzkcVar);
            A.d(26, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjx
                @Override // com.google.android.gms.internal.ads.zzdt
                public final void b(Object obj2) {
                    zzbe zzbeVar = (zzbe) obj2;
                }
            });
            A.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void T0(Exception exc) {
        zzkc.D(this.X).b(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void U0(int i, long j) {
        zzkc.D(this.X).s(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void V0(zzia zziaVar) {
        zzkc.D(this.X).A(zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void a(Exception exc) {
        zzkc.D(this.X).o(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void a0(final boolean z) {
        zzkc zzkcVar = this.X;
        if (zzkc.P(zzkcVar) == z) {
            return;
        }
        zzkc.K(zzkcVar, z);
        zzdw A = zzkc.A(zzkcVar);
        A.d(23, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjv
            @Override // com.google.android.gms.internal.ads.zzdt
            public final void b(Object obj) {
                ((zzbe) obj).q1(z);
            }
        });
        A.c();
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void b(int i, long j, long j2) {
        zzkc.D(this.X).B(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void c(Exception exc) {
        zzkc.D(this.X).n(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void d(zzqc zzqcVar) {
        zzkc.D(this.X).D(zzqcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void e(zzia zziaVar) {
        zzkc.D(this.X).v(zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void f(zzia zziaVar) {
        zzkc.D(this.X).m(zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void g(String str, long j, long j2) {
        zzkc.D(this.X).r(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void h(zzz zzzVar, @InterfaceC11300zs1 zzib zzibVar) {
        zzkc.D(this.X).x(zzzVar, zzibVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void i(zzqc zzqcVar) {
        zzkc.D(this.X).w(zzqcVar);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzkc zzkcVar = this.X;
        zzkc.N(zzkcVar, surfaceTexture);
        zzkc.M(zzkcVar, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzkc zzkcVar = this.X;
        zzkc.O(zzkcVar, null);
        zzkc.M(zzkcVar, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzkc.M(this.X, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        zzkc.M(this.X, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzkc.M(this.X, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void t(long j) {
        zzkc.D(this.X).d(j);
    }
}
