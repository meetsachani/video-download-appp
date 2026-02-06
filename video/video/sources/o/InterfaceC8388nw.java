package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.HJ;

/* renamed from: o.nw */
/* loaded from: classes.dex */
public interface InterfaceC8388nw extends CO1 {
    public static final HJ.a<InterfaceC6986iD2> a = HJ.a.a("camerax.core.camera.useCaseConfigFactory", InterfaceC6986iD2.class);
    public static final HJ.a<SL0> b = HJ.a.a("camerax.core.camera.compatibilityId", SL0.class);
    public static final HJ.a<Integer> c = HJ.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);
    public static final HJ.a<InterfaceC4988a22> d = HJ.a.a("camerax.core.camera.SessionProcessor", InterfaceC4988a22.class);
    public static final HJ.a<Boolean> e = HJ.a.a("camerax.core.camera.isZslDisabled", Boolean.class);
    public static final int f = 0;
    public static final int g = 1;

    /* renamed from: o.nw$a */
    /* loaded from: classes.dex */
    public interface a<B> {
        B a(boolean z);

        B b(SL0 sl0);

        B c(InterfaceC6986iD2 interfaceC6986iD2);

        B d(int i);

        B e(InterfaceC4988a22 interfaceC4988a22);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.nw$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    default InterfaceC4988a22 C() {
        return (InterfaceC4988a22) j(d);
    }

    default InterfaceC4988a22 D(InterfaceC4988a22 interfaceC4988a22) {
        return (InterfaceC4988a22) h(d, interfaceC4988a22);
    }

    SL0 l0();

    default InterfaceC6986iD2 o() {
        return (InterfaceC6986iD2) h(a, InterfaceC6986iD2.a);
    }

    default int x() {
        return ((Integer) h(c, 0)).intValue();
    }
}
