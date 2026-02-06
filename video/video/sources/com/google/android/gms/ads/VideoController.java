package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class VideoController {
    @KeepForSdk
    public static final int d = 0;
    @KeepForSdk
    public static final int e = 1;
    @KeepForSdk
    public static final int f = 2;
    @KeepForSdk
    public static final int g = 3;
    @KeepForSdk
    public static final int h = 5;
    public final Object a = new Object();
    @InterfaceC11300zs1
    public zzea b;
    @InterfaceC11300zs1
    public VideoLifecycleCallbacks c;

    /* loaded from: classes2.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void a() {
        }

        public void b(boolean z) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    @KeepForSdk
    public int a() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return 0;
            }
            try {
                return zzeaVar.h();
            } catch (RemoteException e2) {
                zzo.e("Unable to call getPlaybackState on video controller.", e2);
                return 0;
            }
        }
    }

    @InterfaceC11300zs1
    public VideoLifecycleCallbacks b() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.a) {
            videoLifecycleCallbacks = this.c;
        }
        return videoLifecycleCallbacks;
    }

    public boolean c() {
        boolean z;
        synchronized (this.a) {
            if (this.b != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean d() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.p();
            } catch (RemoteException e2) {
                zzo.e("Unable to call isClickToExpandEnabled.", e2);
                return false;
            }
        }
    }

    public boolean e() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.o();
            } catch (RemoteException e2) {
                zzo.e("Unable to call isUsingCustomPlayerControls.", e2);
                return false;
            }
        }
    }

    public boolean f() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return true;
            }
            try {
                return zzeaVar.r();
            } catch (RemoteException e2) {
                zzo.e("Unable to call isMuted on video controller.", e2);
                return true;
            }
        }
    }

    public void g(boolean z) {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.n0(z);
            } catch (RemoteException e2) {
                zzo.e("Unable to call mute on video controller.", e2);
            }
        }
    }

    public void h() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.k();
            } catch (RemoteException e2) {
                zzo.e("Unable to call pause on video controller.", e2);
            }
        }
    }

    public void i() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.l();
            } catch (RemoteException e2) {
                zzo.e("Unable to call play on video controller.", e2);
            }
        }
    }

    public void j(@InterfaceC11300zs1 VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfv zzfvVar;
        synchronized (this.a) {
            this.c = videoLifecycleCallbacks;
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfvVar = null;
            } else {
                try {
                    zzfvVar = new zzfv(videoLifecycleCallbacks);
                } catch (RemoteException e2) {
                    zzo.e("Unable to call setVideoLifecycleCallbacks on video controller.", e2);
                }
            }
            zzeaVar.n2(zzfvVar);
        }
    }

    public void k() {
        synchronized (this.a) {
            zzea zzeaVar = this.b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.n();
            } catch (RemoteException e2) {
                zzo.e("Unable to call stop on video controller.", e2);
            }
        }
    }

    @InterfaceC11300zs1
    public final zzea l() {
        zzea zzeaVar;
        synchronized (this.a) {
            zzeaVar = this.b;
        }
        return zzeaVar;
    }

    public final void m(@InterfaceC11300zs1 zzea zzeaVar) {
        synchronized (this.a) {
            try {
                this.b = zzeaVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.c;
                if (videoLifecycleCallbacks != null) {
                    j(videoLifecycleCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
