package o;

import androidx.camera.core.m;
import java.util.UUID;
import o.C3597Ly;
import o.InterfaceC6743hD2;
import o.InterfaceC6986iD2;
import o.T12;

/* renamed from: o.Od2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3814Od2 implements InterfaceC6743hD2.a<C3716Nd2, C3911Pd2, C3814Od2> {
    public static final String b = "Operation not supported by StreamSharingBuilder.";
    public final C2569Bn1 a;

    public C3814Od2() {
        this(C2569Bn1.u0());
    }

    @Override // o.InterfaceC7470kD2.a
    /* renamed from: A */
    public C3814Od2 c(m.b bVar) {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC6743hD2.a
    /* renamed from: B */
    public C3814Od2 a(boolean z) {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC10288vj0
    public InterfaceC3849Om1 e() {
        return this.a;
    }

    @Override // o.InterfaceC10288vj0
    /* renamed from: f */
    public C3716Nd2 build() {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC6743hD2.a
    /* renamed from: g */
    public C3911Pd2 t() {
        return new C3911Pd2(C5932dw1.t0(this.a));
    }

    @Override // o.InterfaceC6743hD2.a
    /* renamed from: h */
    public C3814Od2 b(C2898Ex c2898Ex) {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC6743hD2.a
    /* renamed from: l */
    public C3814Od2 i(C3597Ly.b bVar) {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC6743hD2.a
    /* renamed from: m */
    public C3814Od2 x(InterfaceC6986iD2.b bVar) {
        e().h0(InterfaceC6743hD2.I, bVar);
        return this;
    }

    @Override // o.InterfaceC6743hD2.a
    /* renamed from: o */
    public C3814Od2 v(C3597Ly c3597Ly) {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC6743hD2.a
    /* renamed from: p */
    public C3814Od2 j(T12 t12) {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC6743hD2.a
    /* renamed from: r */
    public C3814Od2 n(boolean z) {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC6743hD2.a
    /* renamed from: s */
    public C3814Od2 d(T12.d dVar) {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC6743hD2.a
    /* renamed from: u */
    public C3814Od2 y(int i) {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC3063Gl2.a
    /* renamed from: w */
    public C3814Od2 q(Class<C3716Nd2> cls) {
        e().h0(InterfaceC3063Gl2.x, cls);
        if (e().h(InterfaceC3063Gl2.w, null) == null) {
            k(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    @Override // o.InterfaceC3063Gl2.a
    /* renamed from: z */
    public C3814Od2 k(String str) {
        e().h0(InterfaceC3063Gl2.w, str);
        return this;
    }

    public C3814Od2(C2569Bn1 c2569Bn1) {
        this.a = c2569Bn1;
        Class cls = (Class) c2569Bn1.h(InterfaceC3063Gl2.x, null);
        if (cls != null && !cls.equals(C3716Nd2.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        q(C3716Nd2.class);
    }
}
