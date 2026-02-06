package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjx implements zzle {
    public static final zzkk b = new zzka();
    public final zzkk a;

    public zzjx() {
        this(new zzkc(zziy.c(), b()));
    }

    public static zzkk b() {
        try {
            return (zzkk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return b;
        }
    }

    public static boolean c(zzkh zzkhVar) {
        if (zzjz.a[zzkhVar.b().ordinal()] != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final <T> zzlb<T> a(Class<T> cls) {
        zzld.o(cls);
        zzkh a = this.a.a(cls);
        if (a.c()) {
            if (zzix.class.isAssignableFrom(cls)) {
                return zzkp.k(zzld.u(), zzin.b(), a.a());
            }
            return zzkp.k(zzld.f(), zzin.a(), a.a());
        } else if (zzix.class.isAssignableFrom(cls)) {
            if (c(a)) {
                return zzkn.p(cls, a, zzkt.b(), zzjs.d(), zzld.u(), zzin.b(), zzki.b());
            }
            return zzkn.p(cls, a, zzkt.b(), zzjs.d(), zzld.u(), null, zzki.b());
        } else if (c(a)) {
            return zzkn.p(cls, a, zzkt.a(), zzjs.a(), zzld.f(), zzin.a(), zzki.a());
        } else {
            return zzkn.p(cls, a, zzkt.a(), zzjs.a(), zzld.f(), null, zzki.a());
        }
    }

    public zzjx(zzkk zzkkVar) {
        this.a = (zzkk) zziz.f(zzkkVar, "messageInfoFactory");
    }
}
