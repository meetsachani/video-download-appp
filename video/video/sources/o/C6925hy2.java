package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.C6436g02;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1863#2,2:66\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n60#1:66,2\n*E\n"})
@HK1
/* renamed from: o.hy2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6925hy2<R> extends C6436g02<R> {
    @NotNull
    public final List<C6436g02<R>.a> b1;

    public C6925hy2(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        super(interfaceC5809dQ);
        this.b1 = new ArrayList();
    }

    @HK1
    public static /* synthetic */ <R> Object P(C6925hy2<R> c6925hy2, HM<? super R> hm) {
        c6925hy2.Q();
        return super.w(hm);
    }

    public final void Q() {
        try {
            Collections.shuffle(this.b1);
            Iterator<T> it = this.b1.iterator();
            while (it.hasNext()) {
                C6436g02.I(this, (C6436g02.a) it.next(), false, 1, null);
            }
        } finally {
            this.b1.clear();
        }
    }

    @Override // o.C6436g02, o.XZ1
    public <P, Q> void c(@NotNull InterfaceC5708d02<? super P, ? extends Q> interfaceC5708d02, P p, @NotNull VA0<? super Q, ? super HM<? super R>, ? extends Object> va0) {
        this.b1.add(new C6436g02.a(interfaceC5708d02.d(), interfaceC5708d02.a(), interfaceC5708d02.c(), p, va0, interfaceC5708d02.b()));
    }

    @Override // o.C6436g02, o.XZ1
    public void g(@NotNull ZZ1 zz1, @NotNull HA0<? super HM<? super R>, ? extends Object> ha0) {
        this.b1.add(new C6436g02.a(zz1.d(), zz1.a(), zz1.c(), C7175j02.l(), ha0, zz1.b()));
    }

    @Override // o.C6436g02, o.XZ1
    public <Q> void j(@NotNull InterfaceC5223b02<? extends Q> interfaceC5223b02, @NotNull VA0<? super Q, ? super HM<? super R>, ? extends Object> va0) {
        this.b1.add(new C6436g02.a(interfaceC5223b02.d(), interfaceC5223b02.a(), interfaceC5223b02.c(), null, va0, interfaceC5223b02.b()));
    }

    @Override // o.C6436g02
    @HK1
    @Nullable
    public Object w(@NotNull HM<? super R> hm) {
        return P(this, hm);
    }
}
