package o;

import java.util.Map;

@InterfaceC5359ba0
@L40("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
/* loaded from: classes3.dex */
public interface Ov2<B> extends Map<Pv2<? extends B>, B> {
    @InterfaceC6181ey
    @MB
    <T extends B> T M(Class<T> cls, T t);

    @MB
    <T extends B> T U3(Pv2<T> pv2);

    @InterfaceC6181ey
    @MB
    <T extends B> T h5(Pv2<T> pv2, T t);

    @MB
    <T extends B> T k0(Class<T> cls);
}
