package o;

import androidx.camera.core.m;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: o.jx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7402jx extends InterfaceC3099Gv, m.d {

    /* renamed from: o.jx$a */
    /* loaded from: classes.dex */
    public enum a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        
        public final boolean X;

        a(boolean z) {
            this.X = z;
        }

        public boolean g() {
            return this.X;
        }
    }

    @Override // o.InterfaceC3099Gv
    default InterfaceC9367rw a() {
        return j();
    }

    @Override // o.InterfaceC3099Gv
    default InterfaceC8388nw b() {
        return C9125qw.a();
    }

    @Override // o.InterfaceC3099Gv
    default InterfaceC6420fx c() {
        return n();
    }

    void close();

    InterfaceC2789Dt1<a> e();

    @Override // o.InterfaceC3099Gv
    default LinkedHashSet<InterfaceC7402jx> f() {
        return new LinkedHashSet<>(Collections.singleton(this));
    }

    InterfaceFutureC8411o11<Void> g();

    InterfaceC9610sw j();

    void l(Collection<androidx.camera.core.m> collection);

    void m(Collection<androidx.camera.core.m> collection);

    InterfaceC6918hx n();

    default boolean o() {
        if (c().g() == 0) {
            return true;
        }
        return false;
    }

    void open();

    default boolean r() {
        return true;
    }

    @Override // o.InterfaceC3099Gv
    default void d(InterfaceC8388nw interfaceC8388nw) {
    }

    default void k(boolean z) {
    }
}
