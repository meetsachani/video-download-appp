package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzik {
    public static volatile boolean b = false;
    public static boolean c = true;
    public static volatile zzik d;
    public static final zzik e = new zzik(true);
    public final Map<zza, zzix.zzf<?, ?>> a;

    /* loaded from: classes3.dex */
    public static final class zza {
        public final Object a;
        public final int b;

        public zza(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            if (this.a != zzaVar.a || this.b != zzaVar.b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public zzik() {
        this.a = new HashMap();
    }

    public static zzik a() {
        zzik zzikVar = d;
        if (zzikVar != null) {
            return zzikVar;
        }
        synchronized (zzik.class) {
            try {
                zzik zzikVar2 = d;
                if (zzikVar2 != null) {
                    return zzikVar2;
                }
                zzik b2 = zziv.b(zzik.class);
                d = b2;
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <ContainingType extends zzkj> zzix.zzf<ContainingType, ?> b(ContainingType containingtype, int i) {
        return (zzix.zzf<ContainingType, ?>) this.a.get(new zza(containingtype, i));
    }

    public zzik(boolean z) {
        this.a = Collections.EMPTY_MAP;
    }
}
