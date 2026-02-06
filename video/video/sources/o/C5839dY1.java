package o;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C10898yD0;

@Deprecated
/* renamed from: o.dY1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5839dY1 implements InterfaceC5529cG2, InterfaceC9857tx {
    public static final String i1 = "SceneRenderer";
    public int d1;
    public SurfaceTexture e1;
    @InterfaceC11300zs1
    public byte[] h1;
    public final AtomicBoolean X = new AtomicBoolean();
    public final AtomicBoolean Y = new AtomicBoolean(true);
    public final C10191vJ1 Z = new C10191vJ1();
    public final C4285Sz0 Y0 = new C4285Sz0();
    public final C6889hp2<Long> Z0 = new C6889hp2<>();
    public final C6889hp2<C9705tJ1> a1 = new C6889hp2<>();
    public final float[] b1 = new float[16];
    public final float[] c1 = new float[16];
    public volatile int f1 = 0;
    public int g1 = -1;

    @Override // o.InterfaceC9857tx
    public void a(long j, float[] fArr) {
        this.Y0.e(j, fArr);
    }

    public void c(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        try {
            C10898yD0.e();
        } catch (C10898yD0.b e) {
            I31.e(i1, "Failed to draw a frame", e);
        }
        if (this.X.compareAndSet(true, false)) {
            ((SurfaceTexture) C9542sf.g(this.e1)).updateTexImage();
            try {
                C10898yD0.e();
            } catch (C10898yD0.b e2) {
                I31.e(i1, "Failed to draw a frame", e2);
            }
            if (this.Y.compareAndSet(true, false)) {
                C10898yD0.M(this.b1);
            }
            long timestamp = this.e1.getTimestamp();
            Long g = this.Z0.g(timestamp);
            if (g != null) {
                this.Y0.c(this.b1, g.longValue());
            }
            C9705tJ1 j = this.a1.j(timestamp);
            if (j != null) {
                this.Z.d(j);
            }
        }
        Matrix.multiplyMM(this.c1, 0, fArr, 0, this.b1, 0);
        this.Z.a(this.d1, this.c1, z);
    }

    public SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C10898yD0.e();
            this.Z.b();
            C10898yD0.e();
            this.d1 = C10898yD0.o();
        } catch (C10898yD0.b e) {
            I31.e(i1, "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.d1);
        this.e1 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: o.cY1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C5839dY1.this.X.set(true);
            }
        });
        return this.e1;
    }

    public void e(int i) {
        this.f1 = i;
    }

    @Override // o.InterfaceC9857tx
    public void f() {
        this.Z0.c();
        this.Y0.d();
        this.Y.set(true);
    }

    public final void g(@InterfaceC11300zs1 byte[] bArr, int i, long j) {
        C9705tJ1 c9705tJ1;
        byte[] bArr2 = this.h1;
        int i2 = this.g1;
        this.h1 = bArr;
        if (i == -1) {
            i = this.f1;
        }
        this.g1 = i;
        if (i2 == i && Arrays.equals(bArr2, this.h1)) {
            return;
        }
        byte[] bArr3 = this.h1;
        if (bArr3 != null) {
            c9705tJ1 = C9948uJ1.a(bArr3, this.g1);
        } else {
            c9705tJ1 = null;
        }
        if (c9705tJ1 == null || !C10191vJ1.c(c9705tJ1)) {
            c9705tJ1 = C9705tJ1.b(this.g1);
        }
        this.a1.a(j, c9705tJ1);
    }

    @Override // o.InterfaceC5529cG2
    public void h(long j, long j2, C10833xx0 c10833xx0, @InterfaceC11300zs1 MediaFormat mediaFormat) {
        this.Z0.a(j2, Long.valueOf(j));
        g(c10833xx0.q1, c10833xx0.r1, j2);
    }

    public void i() {
        this.Z.e();
    }
}
