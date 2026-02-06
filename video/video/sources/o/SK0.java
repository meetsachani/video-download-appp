package o;

import java.util.stream.Stream;

/* loaded from: classes4.dex */
public final class SK0<T> extends AbstractC7008iJ0<T, RK0<T>, Stream<T>> implements RK0<T> {
    public SK0(Stream<T> stream) {
        super(stream);
    }

    public static <T> RK0<T> u5(Stream<T> stream) {
        if (stream != null) {
            return new SK0(stream);
        }
        return RK0.empty();
    }

    @Override // o.InterfaceC6765hJ0
    /* renamed from: a */
    public RK0<T> R1(Stream<T> stream) {
        if (e() == stream) {
            return this;
        }
        return u5(stream);
    }
}
