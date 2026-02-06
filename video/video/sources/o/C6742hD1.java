package o;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import o.C10898yD0;

@ES1(17)
@Deprecated
/* renamed from: o.hD1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6742hD1 extends Surface {
    public static final String Y0 = "PlaceholderSurface";
    public static int Z0;
    public static boolean a1;
    public final boolean X;
    public final b Y;
    public boolean Z;

    /* renamed from: o.hD1$b */
    /* loaded from: classes2.dex */
    public static class b extends HandlerThread implements Handler.Callback {
        public static final int a1 = 1;
        public static final int b1 = 2;
        public RunnableC6482g90 X;
        public Handler Y;
        @InterfaceC11300zs1
        public RuntimeException Y0;
        @InterfaceC11300zs1
        public Error Z;
        @InterfaceC11300zs1
        public C6742hD1 Z0;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public C6742hD1 a(int i) {
            boolean z;
            start();
            this.Y = new Handler(getLooper(), this);
            this.X = new RunnableC6482g90(this.Y);
            synchronized (this) {
                z = false;
                this.Y.obtainMessage(1, i, 0).sendToTarget();
                while (this.Z0 == null && this.Y0 == null && this.Z == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.Y0;
            if (runtimeException == null) {
                Error error = this.Z;
                if (error == null) {
                    return (C6742hD1) C9542sf.g(this.Z0);
                }
                throw error;
            }
            throw runtimeException;
        }

        public final void b(int i) throws C10898yD0.b {
            boolean z;
            C9542sf.g(this.X);
            this.X.h(i);
            SurfaceTexture g = this.X.g();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.Z0 = new C6742hD1(this, g, z);
        }

        public void c() {
            C9542sf.g(this.Y);
            this.Y.sendEmptyMessage(2);
        }

        public final void d() {
            C9542sf.g(this.X);
            this.X.i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    try {
                        b(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e) {
                        I31.e(C6742hD1.Y0, "Failed to initialize placeholder surface", e);
                        this.Z = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        I31.e(C6742hD1.Y0, "Failed to initialize placeholder surface", e2);
                        this.Y0 = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (C10898yD0.b e3) {
                    I31.e(C6742hD1.Y0, "Failed to initialize placeholder surface", e3);
                    this.Y0 = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public static int a(Context context) {
        if (C10898yD0.J(context)) {
            if (C10898yD0.K()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (C6742hD1.class) {
            try {
                z = true;
                if (!a1) {
                    Z0 = a(context);
                    a1 = true;
                }
                if (Z0 == 0) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static C6742hD1 c(Context context, boolean z) {
        boolean z2;
        int i = 0;
        if (z && !b(context)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C9542sf.i(z2);
        b bVar = new b();
        if (z) {
            i = Z0;
        }
        return bVar.a(i);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.Y) {
            try {
                if (!this.Z) {
                    this.Y.c();
                    this.Z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C6742hD1(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.Y = bVar;
        this.X = z;
    }
}
