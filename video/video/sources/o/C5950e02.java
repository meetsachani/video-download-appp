package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.e02  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5950e02<P, Q> implements InterfaceC5708d02<P, Q> {
    @NotNull
    public final Object a;
    @NotNull
    public final XA0<Object, InterfaceC6691h02<?>, Object, C7458kA2> b;
    @NotNull
    public final XA0<Object, Object, Object, Object> c;
    @Nullable
    public final XA0<InterfaceC6691h02<?>, Object, Object, XA0<Throwable, Object, InterfaceC5809dQ, C7458kA2>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public C5950e02(@NotNull Object obj, @NotNull XA0<Object, ? super InterfaceC6691h02<?>, Object, C7458kA2> xa0, @NotNull XA0<Object, Object, Object, ? extends Object> xa02, @Nullable XA0<? super InterfaceC6691h02<?>, Object, Object, ? extends XA0<? super Throwable, Object, ? super InterfaceC5809dQ, C7458kA2>> xa03) {
        this.a = obj;
        this.b = xa0;
        this.c = xa02;
        this.d = xa03;
    }

    @Override // o.InterfaceC6193f02
    @NotNull
    public XA0<Object, InterfaceC6691h02<?>, Object, C7458kA2> a() {
        return this.b;
    }

    @Override // o.InterfaceC6193f02
    @Nullable
    public XA0<InterfaceC6691h02<?>, Object, Object, XA0<Throwable, Object, InterfaceC5809dQ, C7458kA2>> b() {
        return this.d;
    }

    @Override // o.InterfaceC6193f02
    @NotNull
    public XA0<Object, Object, Object, Object> c() {
        return this.c;
    }

    @Override // o.InterfaceC6193f02
    @NotNull
    public Object d() {
        return this.a;
    }

    public /* synthetic */ C5950e02(Object obj, XA0 xa0, XA0 xa02, XA0 xa03, int i, C9516sY c9516sY) {
        this(obj, xa0, xa02, (i & 8) != 0 ? null : xa03);
    }
}
