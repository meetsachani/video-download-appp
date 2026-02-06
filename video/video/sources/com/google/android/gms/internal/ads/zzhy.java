package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import o.C4505Vg;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhy {
    public final zzfvu a;
    public final Handler b;
    @InterfaceC11300zs1
    public zzhx c;
    @InterfaceC11300zs1
    public zze d;
    public int f;
    public zzch h;
    public float g = 1.0f;
    public int e = 0;

    public zzhy(final Context context, Looper looper, zzhx zzhxVar) {
        this.a = zzfvy.a(new zzfvu() { // from class: com.google.android.gms.internal.ads.zzhw
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzcj.c(context);
            }
        });
        this.c = zzhxVar;
        this.b = new Handler(looper);
    }

    public static /* synthetic */ void c(zzhy zzhyVar, int i) {
        if (i != -3 && i != -2) {
            if (i != -1) {
                if (i != 1) {
                    zzdx.f(C4505Vg.v, "Unknown focus change type: " + i);
                    return;
                }
                zzhyVar.h(2);
                zzhyVar.g(1);
                return;
            }
            zzhyVar.g(-1);
            zzhyVar.f();
            zzhyVar.h(1);
        } else if (i != -2) {
            zzhyVar.h(4);
        } else {
            zzhyVar.g(0);
            zzhyVar.h(3);
        }
    }

    public final float a() {
        return this.g;
    }

    public final int b(boolean z, int i) {
        if (i != 1 && this.f == 1) {
            if (z) {
                if (this.e == 2) {
                    return 1;
                }
                if (this.h == null) {
                    zzce zzceVar = new zzce(1);
                    zze zzeVar = this.d;
                    zzeVar.getClass();
                    zzceVar.a(zzeVar);
                    zzceVar.b(new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.zzhv
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i2) {
                            zzhy.c(zzhy.this, i2);
                        }
                    }, this.b);
                    this.h = zzceVar.c();
                }
                if (zzcj.b((AudioManager) this.a.a(), this.h) == 1) {
                    h(2);
                    return 1;
                }
                h(1);
                return -1;
            }
            int i2 = this.e;
            if (i2 == 1) {
                return -1;
            }
            if (i2 == 3) {
                return 0;
            }
            return 1;
        }
        f();
        h(0);
        return 1;
    }

    public final void d() {
        this.c = null;
        f();
        h(0);
    }

    public final void e(@InterfaceC11300zs1 zze zzeVar) {
        int i;
        if (!Objects.equals(this.d, zzeVar)) {
            this.d = zzeVar;
            if (zzeVar == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f = i;
        }
    }

    public final void f() {
        int i = this.e;
        if (i != 1 && i != 0 && this.h != null) {
            zzcj.a((AudioManager) this.a.a(), this.h);
        }
    }

    public final void g(int i) {
        zzhx zzhxVar = this.c;
        if (zzhxVar != null) {
            zzhxVar.u(i);
        }
    }

    public final void h(int i) {
        float f;
        if (this.e != i) {
            this.e = i;
            if (i == 4) {
                f = 0.2f;
            } else {
                f = 1.0f;
            }
            if (this.g != f) {
                this.g = f;
                zzhx zzhxVar = this.c;
                if (zzhxVar != null) {
                    zzhxVar.a(f);
                }
            }
        }
    }
}
