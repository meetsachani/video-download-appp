package o;

import java.util.UUID;
import o.InterfaceC3628Mg0;

@Deprecated
/* renamed from: o.i21  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6941i21 implements InterfaceC7090if1 {
    public final byte[] a;

    public C6941i21(byte[] bArr) {
        this.a = (byte[]) C9542sf.g(bArr);
    }

    @Override // o.InterfaceC7090if1
    public byte[] a(UUID uuid, InterfaceC3628Mg0.b bVar) {
        return this.a;
    }

    @Override // o.InterfaceC7090if1
    public byte[] b(UUID uuid, InterfaceC3628Mg0.h hVar) {
        throw new UnsupportedOperationException();
    }
}
