package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.os.Build;
import java.util.Objects;
import java.util.Set;
import o.C11007yg;
import o.C6566gU0;
import o.ES1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzpd {
    public static final zzpd d;
    public final int a;
    public final int b;
    @InterfaceC11300zs1
    public final zzfyh c;

    static {
        zzpd zzpdVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzfyg zzfygVar = new zzfyg();
            for (int i = 1; i <= 10; i++) {
                zzfygVar.g(Integer.valueOf(zzeu.D(i)));
            }
            zzpdVar = new zzpd(2, zzfygVar.j());
        } else {
            zzpdVar = new zzpd(2, 10);
        }
        d = zzpdVar;
    }

    public zzpd(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final int a(int i, zze zzeVar) {
        if (this.c != null) {
            return this.b;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = this.a;
            for (int i3 = 10; i3 > 0; i3--) {
                int D = zzeu.D(i3);
                if (D != 0 && C11007yg.a(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(D).build(), zzeVar.a().a)) {
                    return i3;
                }
            }
            return 0;
        }
        Integer num = (Integer) zzpe.e.getOrDefault(Integer.valueOf(this.a), 0);
        num.getClass();
        return num.intValue();
    }

    public final boolean b(int i) {
        zzfyh zzfyhVar = this.c;
        if (zzfyhVar == null) {
            if (i > this.b) {
                return false;
            }
            return true;
        }
        int D = zzeu.D(i);
        if (D == 0) {
            return false;
        }
        return zzfyhVar.contains(Integer.valueOf(D));
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpd)) {
            return false;
        }
        zzpd zzpdVar = (zzpd) obj;
        if (this.a == zzpdVar.a && this.b == zzpdVar.b && Objects.equals(this.c, zzpdVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        zzfyh zzfyhVar = this.c;
        if (zzfyhVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzfyhVar.hashCode();
        }
        return (((this.a * 31) + this.b) * 31) + hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + valueOf + C6566gU0.g;
    }

    @ES1(33)
    public zzpd(int i, Set set) {
        this.a = i;
        zzfyh B = zzfyh.B(set);
        this.c = B;
        zzgai it = B.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = i2;
    }
}
