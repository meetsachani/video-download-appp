package o;

import java.nio.ByteBuffer;

@Deprecated
/* renamed from: o.a82  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5012a82 extends N72<C4508Vg2, AbstractC4605Wg2, C4217Sg2> implements InterfaceC4117Rg2 {
    public final String n;

    /* renamed from: o.a82$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC4605Wg2 {
        public a() {
        }

        @Override // o.AbstractC9510sW
        public void v() {
            AbstractC5012a82.this.s(this);
        }
    }

    public AbstractC5012a82(String str) {
        super(new C4508Vg2[2], new AbstractC4605Wg2[2]);
        this.n = str;
        v(1024);
    }

    public abstract InterfaceC4020Qg2 A(byte[] bArr, int i, boolean z) throws C4217Sg2;

    @Override // o.N72
    @InterfaceC11300zs1
    /* renamed from: B */
    public final C4217Sg2 k(C4508Vg2 c4508Vg2, AbstractC4605Wg2 abstractC4605Wg2, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C9542sf.g(c4508Vg2.Y0);
            abstractC4605Wg2.w(c4508Vg2.a1, A(byteBuffer.array(), byteBuffer.limit(), z), c4508Vg2.h1);
            abstractC4605Wg2.m(Integer.MIN_VALUE);
            return null;
        } catch (C4217Sg2 e) {
            return e;
        }
    }

    @Override // o.InterfaceC8288nW
    public final String getName() {
        return this.n;
    }

    @Override // o.N72
    /* renamed from: x */
    public final C4508Vg2 h() {
        return new C4508Vg2();
    }

    @Override // o.N72
    /* renamed from: y */
    public final AbstractC4605Wg2 i() {
        return new a();
    }

    @Override // o.N72
    /* renamed from: z */
    public final C4217Sg2 j(Throwable th) {
        return new C4217Sg2("Unexpected decode error", th);
    }

    @Override // o.InterfaceC4117Rg2
    public void a(long j) {
    }
}
