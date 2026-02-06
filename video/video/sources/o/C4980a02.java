package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.a02  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4980a02 implements ZZ1 {
    @NotNull
    public final Object a;
    @NotNull
    public final XA0<Object, InterfaceC6691h02<?>, Object, C7458kA2> b;
    @Nullable
    public final XA0<InterfaceC6691h02<?>, Object, Object, XA0<Throwable, Object, InterfaceC5809dQ, C7458kA2>> c;
    @NotNull
    public final XA0<Object, Object, Object, Object> d;

    /* JADX WARN: Multi-variable type inference failed */
    public C4980a02(@NotNull Object obj, @NotNull XA0<Object, ? super InterfaceC6691h02<?>, Object, C7458kA2> xa0, @Nullable XA0<? super InterfaceC6691h02<?>, Object, Object, ? extends XA0<? super Throwable, Object, ? super InterfaceC5809dQ, C7458kA2>> xa02) {
        XA0<Object, Object, Object, Object> xa03;
        this.a = obj;
        this.b = xa0;
        this.c = xa02;
        xa03 = C7175j02.a;
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
        return this.c;
    }

    @Override // o.InterfaceC6193f02
    @NotNull
    public XA0<Object, Object, Object, Object> c() {
        return this.d;
    }

    @Override // o.InterfaceC6193f02
    @NotNull
    public Object d() {
        return this.a;
    }

    public /* synthetic */ C4980a02(Object obj, XA0 xa0, XA0 xa02, int i, C9516sY c9516sY) {
        this(obj, xa0, (i & 4) != 0 ? null : xa02);
    }
}
