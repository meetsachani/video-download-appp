package o;

import java.util.Objects;
import java.util.stream.BaseStream;
import o.InterfaceC6765hJ0;

/* renamed from: o.iJ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7008iJ0<T, S extends InterfaceC6765hJ0<T, S, B>, B extends BaseStream<T, B>> implements InterfaceC6765hJ0<T, S, B> {
    public final B X;

    public AbstractC7008iJ0(B b) {
        Objects.requireNonNull(b, "delegate");
        this.X = b;
    }

    @Override // o.InterfaceC6765hJ0
    public B e() {
        return this.X;
    }
}
