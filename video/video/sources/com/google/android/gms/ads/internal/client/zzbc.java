package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes2.dex */
public class zzbc extends AdListener {
    public final Object X = new Object();
    public AdListener Y;

    @Override // com.google.android.gms.ads.AdListener
    public final void e() {
        synchronized (this.X) {
            try {
                AdListener adListener = this.Y;
                if (adListener != null) {
                    adListener.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void g(LoadAdError loadAdError) {
        synchronized (this.X) {
            try {
                AdListener adListener = this.Y;
                if (adListener != null) {
                    adListener.g(loadAdError);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void h() {
        synchronized (this.X) {
            try {
                AdListener adListener = this.Y;
                if (adListener != null) {
                    adListener.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void k() {
        synchronized (this.X) {
            try {
                AdListener adListener = this.Y;
                if (adListener != null) {
                    adListener.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void n() {
        synchronized (this.X) {
            try {
                AdListener adListener = this.Y;
                if (adListener != null) {
                    adListener.n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(AdListener adListener) {
        synchronized (this.X) {
            this.Y = adListener;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void y() {
        synchronized (this.X) {
            try {
                AdListener adListener = this.Y;
                if (adListener != null) {
                    adListener.y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
